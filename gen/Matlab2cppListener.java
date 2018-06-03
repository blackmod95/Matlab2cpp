// Generated from /Users/sanekreunov/IdeaProjects/Matlab2cpp/src/Matlab2cpp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Matlab2cppParser}.
 */
public interface Matlab2cppListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Matlab2cppParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Matlab2cppParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(Matlab2cppParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(Matlab2cppParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#math}.
	 * @param ctx the parse tree
	 */
	void enterMath(Matlab2cppParser.MathContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#math}.
	 * @param ctx the parse tree
	 */
	void exitMath(Matlab2cppParser.MathContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#init_var}.
	 * @param ctx the parse tree
	 */
	void enterInit_var(Matlab2cppParser.Init_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#init_var}.
	 * @param ctx the parse tree
	 */
	void exitInit_var(Matlab2cppParser.Init_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#init_matrix}.
	 * @param ctx the parse tree
	 */
	void enterInit_matrix(Matlab2cppParser.Init_matrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#init_matrix}.
	 * @param ctx the parse tree
	 */
	void exitInit_matrix(Matlab2cppParser.Init_matrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#unary_operation}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operation(Matlab2cppParser.Unary_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#unary_operation}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operation(Matlab2cppParser.Unary_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#binary_operation}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operation(Matlab2cppParser.Binary_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#binary_operation}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operation(Matlab2cppParser.Binary_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#matrix}.
	 * @param ctx the parse tree
	 */
	void enterMatrix(Matlab2cppParser.MatrixContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#matrix}.
	 * @param ctx the parse tree
	 */
	void exitMatrix(Matlab2cppParser.MatrixContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(Matlab2cppParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(Matlab2cppParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#zeros}.
	 * @param ctx the parse tree
	 */
	void enterZeros(Matlab2cppParser.ZerosContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#zeros}.
	 * @param ctx the parse tree
	 */
	void exitZeros(Matlab2cppParser.ZerosContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#ones}.
	 * @param ctx the parse tree
	 */
	void enterOnes(Matlab2cppParser.OnesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#ones}.
	 * @param ctx the parse tree
	 */
	void exitOnes(Matlab2cppParser.OnesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#eye}.
	 * @param ctx the parse tree
	 */
	void enterEye(Matlab2cppParser.EyeContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#eye}.
	 * @param ctx the parse tree
	 */
	void exitEye(Matlab2cppParser.EyeContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(Matlab2cppParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(Matlab2cppParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(Matlab2cppParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(Matlab2cppParser.NumberContext ctx);
}