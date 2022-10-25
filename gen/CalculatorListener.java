// Generated from C:/Users/chris/Documents/IntelliJ Projects/Interpreters/ANTLR4-Calculator/res\Calculator.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CalculatorParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CalculatorParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CalculatorParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative(CalculatorParser.MultiplicativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#multiplicative}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative(CalculatorParser.MultiplicativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#additive}.
	 * @param ctx the parse tree
	 */
	void enterAdditive(CalculatorParser.AdditiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#additive}.
	 * @param ctx the parse tree
	 */
	void exitAdditive(CalculatorParser.AdditiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#negate}.
	 * @param ctx the parse tree
	 */
	void enterNegate(CalculatorParser.NegateContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#negate}.
	 * @param ctx the parse tree
	 */
	void exitNegate(CalculatorParser.NegateContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(CalculatorParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(CalculatorParser.TerminalContext ctx);
}