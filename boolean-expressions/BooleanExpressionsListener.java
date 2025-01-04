// Generated from BooleanExpressions.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BooleanExpressionsParser}.
 */
public interface BooleanExpressionsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BooleanExpressionsParser#entryExpression}.
	 * @param ctx the parse tree
	 */
	void enterEntryExpression(BooleanExpressionsParser.EntryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanExpressionsParser#entryExpression}.
	 * @param ctx the parse tree
	 */
	void exitEntryExpression(BooleanExpressionsParser.EntryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BooleanExpressionsParser#singleEntryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleEntryExpression(BooleanExpressionsParser.SingleEntryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanExpressionsParser#singleEntryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleEntryExpression(BooleanExpressionsParser.SingleEntryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BooleanExpressionsParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(BooleanExpressionsParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link BooleanExpressionsParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(BooleanExpressionsParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link BooleanExpressionsParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(BooleanExpressionsParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesizedExpression}
	 * labeled alternative in {@link BooleanExpressionsParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(BooleanExpressionsParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link BooleanExpressionsParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterVariable(BooleanExpressionsParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link BooleanExpressionsParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitVariable(BooleanExpressionsParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link BooleanExpressionsParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(BooleanExpressionsParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpression}
	 * labeled alternative in {@link BooleanExpressionsParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(BooleanExpressionsParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanConstant}
	 * labeled alternative in {@link BooleanExpressionsParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanConstant(BooleanExpressionsParser.BooleanConstantContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanConstant}
	 * labeled alternative in {@link BooleanExpressionsParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanConstant(BooleanExpressionsParser.BooleanConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link BooleanExpressionsParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(BooleanExpressionsParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpression}
	 * labeled alternative in {@link BooleanExpressionsParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(BooleanExpressionsParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegationExpression}
	 * labeled alternative in {@link BooleanExpressionsParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterNegationExpression(BooleanExpressionsParser.NegationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegationExpression}
	 * labeled alternative in {@link BooleanExpressionsParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitNegationExpression(BooleanExpressionsParser.NegationExpressionContext ctx);
}