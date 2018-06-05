package com.rieqyns13;
import java.util.Hashtable;
import java.util.Scanner;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Kelompok2 {
    CommonTree root;
    Hashtable<String, Integer> variables = new Hashtable<String, Integer>();
    Scanner scanner;

    Kelompok2(CommonTree root) {
        this.root = root;
        scanner = new Scanner(System.in);
    }

    void checkVar(String var) throws Exception {
        if (!variables.containsKey(var)) {
            throw new Exception("Variable '"+var+"' not declared");
        }
    }

    int evaluateExpr(CommonTree expr) throws Exception{
        CommonTree left = (CommonTree)expr.getChild(0);
        CommonTree  right = null;
        if (expr.getChildCount()==2) {
            right = (CommonTree)expr.getChild(1);
        }
        if (expr.getType()==KasusLexer.INT) {
            return Integer.parseInt(expr.getText());
        }
        if (expr.getType()==KasusLexer.ID) {
            checkVar(expr.getText());
            return variables.get(expr.getText());
        }
        if (expr.getText().equals("<")) {
            return (evaluateExpr(left)<evaluateExpr(right))?1:0;
        }
        if (expr.getText().equals(">")) {
            return (evaluateExpr(left)>evaluateExpr(right))?1:0;
        }
        if (expr.getText().equals(">=")) {
            return (evaluateExpr(left)>=evaluateExpr(right))?1:0;
        }
        if (expr.getText().equals("<=")) {
            return (evaluateExpr(left)<=evaluateExpr(right))?1:0;
        }
        if (expr.getText().equals("==")) {
            return (evaluateExpr(left)==evaluateExpr(right))?1:0;
        }
        if (expr.getText().equals("!=")) {
            return (evaluateExpr(left)!=evaluateExpr(right))?1:0;
        }
        if (expr.getText().equals("+")) {
            if (expr.getChildCount()==1) {
                return evaluateExpr(left);
            } else {
                return evaluateExpr(left) +
                        evaluateExpr(right);
            }
        }
        if (expr.getText().equals("-")) {
            if (expr.getChildCount()==1) {
                return -evaluateExpr(left);
            } else {
                return evaluateExpr(left) -
                        evaluateExpr(right);
            }
        }
        if (expr.getText().equals("*")) {
            return evaluateExpr(left) *
                    evaluateExpr(right);
        }
        if (expr.getText().equals("%")) {
            return evaluateExpr(left) %
                    evaluateExpr(right);
        }
        if (expr.getText().equals("/")) {
            return evaluateExpr(left) /
                    evaluateExpr(right);
        }

        return 0; /*fallback, should not happen*/
    }

    void evaluateDeclaration(CommonTree  decl) {
        for (Object e: decl.getChildren()) {
            CommonTree et = (CommonTree)e;
            variables.put(et.getText(), 0);
        }
    }

    void evaluateInput(CommonTree expr) throws Exception {
        String var = expr.getText();
        checkVar(var);
        int i = scanner.nextInt();
        variables.put(var, i);
    }

    void evaluatePrint(int type, CommonTree expr) throws Exception {
        if (expr.getType()==KasusLexer.STRING) {
            String s = expr.getText();
            /*remove first ' and last ' from string*/
            s = s.replaceAll("^'", "");
            s = s.replaceAll("'$", "");
            if (type==KasusLexer.PRINTLN) {
                System.out.println(s);
            } else {
                System.out.print(s);
            }
        } else {
            String var = expr.getText();
            checkVar(var);
            if (type==KasusLexer.PRINTLN) {
                System.out.println(variables.get(var));
            } else {
                System.out.print(variables.get(var));
            }
        }
    }

    void evaluateAssignment(CommonTree astmt) throws Exception {
        CommonTree var = (CommonTree)astmt.getChild(0);
        checkVar(var.getText());
        CommonTree expr = (CommonTree)astmt.getChild(1);
        int res = evaluateExpr(expr);
        variables.put(var.getText(), res);
    }

    void evaluateIf(CommonTree astmt) throws Exception {
        CommonTree expr = (CommonTree)astmt.getChild(0);
        CommonTree ifpart = (CommonTree)astmt.getChild(1);
        int res = evaluateExpr(expr);
        if (res!=0) {
            evaluateStatementList(ifpart);
            return;
        }
        if (astmt.getChildCount()==3) { /*else part*/
            CommonTree elsepart = (CommonTree)astmt.getChild(2);
            evaluateStatementList(elsepart);
        }
    }

    void evaluateWhile(CommonTree astmt) throws Exception {
        CommonTree expr = (CommonTree)astmt.getChild(0);
        CommonTree whileblock = (CommonTree)astmt.getChild(1);
        while (evaluateExpr(expr)!=0) {
            evaluateStatementList(whileblock);
        }
    }

    void evaluateStatement(CommonTree expr) throws Exception{
        switch (expr.getType()) {
            case KasusLexer.DECLARATION:
                evaluateDeclaration(expr);
                break;
            case KasusLexer.INPUT:
                evaluateInput((CommonTree)expr.getChild(0));
                break;
            case KasusLexer.PRINT:
            case KasusLexer.PRINTLN:
                evaluatePrint(expr.getType(), (CommonTree)expr.getChild(0));
                break;
            case KasusLexer.ASSIGNMENT:
                evaluateAssignment(expr);
                break;
            case KasusLexer.IF_STATEMENT:
                evaluateIf(expr);
                break;
            case KasusLexer.WHILE_STATEMENT:
                evaluateWhile(expr);
                break;
            case KasusLexer.STATEMENT_LIST:
                evaluateStatementList(expr);
                break;
        }
    }


    void evaluateStatementList(CommonTree exprlist) throws Exception{
        for (Object e: exprlist.getChildren()) {
            evaluateStatement((CommonTree)e);
        }
    }

    void evaluate() throws Exception {
        evaluateStatementList(root);
    }

    public static void main(String argv[]) throws Exception {
        if (argv.length!=1) {
            System.out.println("Usage: KasusLang <filename.e>");
            return;
        }
        KasusLexer lex = new KasusLexer(new ANTLRFileStream(argv[0]));
        CommonTokenStream tokens = new CommonTokenStream(lex);
        KasusParser g = new KasusParser(tokens);
        KasusParser.prog_return r = g.prog();
        CommonTree ct = (CommonTree)r.getTree();
        KasusLang el = new KasusLang(ct);
        el.evaluate();
    }

}
