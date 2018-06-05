// Generated from D:/gay/Java/tekkom2/grammar\Kasus.g4 by ANTLR 4.7
package com.rieqyns13;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KasusParser}.
 */
public interface KasusListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KasusParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(KasusParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link KasusParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(KasusParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link KasusParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(KasusParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link KasusParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(KasusParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link KasusParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(KasusParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link KasusParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(KasusParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link KasusParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void enterIfstat(KasusParser.IfstatContext ctx);
	/**
	 * Exit a parse tree produced by {@link KasusParser#ifstat}.
	 * @param ctx the parse tree
	 */
	void exitIfstat(KasusParser.IfstatContext ctx);
	/**
	 * Enter a parse tree produced by {@link KasusParser#whilestat}.
	 * @param ctx the parse tree
	 */
	void enterWhilestat(KasusParser.WhilestatContext ctx);
	/**
	 * Exit a parse tree produced by {@link KasusParser#whilestat}.
	 * @param ctx the parse tree
	 */
	void exitWhilestat(KasusParser.WhilestatContext ctx);
	/**
	 * Enter a parse tree produced by {@link KasusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(KasusParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link KasusParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(KasusParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link KasusParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(KasusParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link KasusParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(KasusParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link KasusParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(KasusParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link KasusParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(KasusParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link KasusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(KasusParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link KasusParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(KasusParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link KasusParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(KasusParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KasusParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(KasusParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KasusParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void enterCondExpr(KasusParser.CondExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KasusParser#condExpr}.
	 * @param ctx the parse tree
	 */
	void exitCondExpr(KasusParser.CondExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KasusParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void enterAexpr(KasusParser.AexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KasusParser#aexpr}.
	 * @param ctx the parse tree
	 */
	void exitAexpr(KasusParser.AexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KasusParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultExpr(KasusParser.MultExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KasusParser#multExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultExpr(KasusParser.MultExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KasusParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void enterRelationalOp(KasusParser.RelationalOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link KasusParser#relationalOp}.
	 * @param ctx the parse tree
	 */
	void exitRelationalOp(KasusParser.RelationalOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link KasusParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(KasusParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link KasusParser#unaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(KasusParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link KasusParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(KasusParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link KasusParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(KasusParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link KasusParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void enterUnary_op(KasusParser.Unary_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link KasusParser#unary_op}.
	 * @param ctx the parse tree
	 */
	void exitUnary_op(KasusParser.Unary_opContext ctx);
}