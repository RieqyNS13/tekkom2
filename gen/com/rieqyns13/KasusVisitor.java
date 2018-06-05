// Generated from D:/gay/Java/tekkom2/grammar\Kasus.g4 by ANTLR 4.7
package com.rieqyns13;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link KasusParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface KasusVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link KasusParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(KasusParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link KasusParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(KasusParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link KasusParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(KasusParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link KasusParser#ifstat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfstat(KasusParser.IfstatContext ctx);
	/**
	 * Visit a parse tree produced by {@link KasusParser#whilestat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhilestat(KasusParser.WhilestatContext ctx);
	/**
	 * Visit a parse tree produced by {@link KasusParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(KasusParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link KasusParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(KasusParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link KasusParser#input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(KasusParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by {@link KasusParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(KasusParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link KasusParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(KasusParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KasusParser#condExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExpr(KasusParser.CondExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KasusParser#aexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAexpr(KasusParser.AexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KasusParser#multExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultExpr(KasusParser.MultExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KasusParser#relationalOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalOp(KasusParser.RelationalOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link KasusParser#unaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(KasusParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link KasusParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(KasusParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link KasusParser#unary_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_op(KasusParser.Unary_opContext ctx);
}