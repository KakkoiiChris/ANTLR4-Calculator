// Generated from C:/Users/chris/Documents/IntelliJ Projects/Interpreters/ANTLR4-Calculator/res\Calculator.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(CalculatorParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#multiplicative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative(CalculatorParser.MultiplicativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#additive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive(CalculatorParser.AdditiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#negate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegate(CalculatorParser.NegateContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal(CalculatorParser.TerminalContext ctx);
}