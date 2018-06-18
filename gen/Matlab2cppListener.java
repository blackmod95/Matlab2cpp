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
	 * Enter a parse tree produced by {@link Matlab2cppParser#matrices}.
	 * @param ctx the parse tree
	 */
	void enterMatrices(Matlab2cppParser.MatricesContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#matrices}.
	 * @param ctx the parse tree
	 */
	void exitMatrices(Matlab2cppParser.MatricesContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void enterLvalue(Matlab2cppParser.LvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#lvalue}.
	 * @param ctx the parse tree
	 */
	void exitLvalue(Matlab2cppParser.LvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#set_item}.
	 * @param ctx the parse tree
	 */
	void enterSet_item(Matlab2cppParser.Set_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#set_item}.
	 * @param ctx the parse tree
	 */
	void exitSet_item(Matlab2cppParser.Set_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#item}.
	 * @param ctx the parse tree
	 */
	void enterItem(Matlab2cppParser.ItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#item}.
	 * @param ctx the parse tree
	 */
	void exitItem(Matlab2cppParser.ItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#section}.
	 * @param ctx the parse tree
	 */
	void enterSection(Matlab2cppParser.SectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#section}.
	 * @param ctx the parse tree
	 */
	void exitSection(Matlab2cppParser.SectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#row}.
	 * @param ctx the parse tree
	 */
	void enterRow(Matlab2cppParser.RowContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#row}.
	 * @param ctx the parse tree
	 */
	void exitRow(Matlab2cppParser.RowContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#column}.
	 * @param ctx the parse tree
	 */
	void enterColumn(Matlab2cppParser.ColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#column}.
	 * @param ctx the parse tree
	 */
	void exitColumn(Matlab2cppParser.ColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(Matlab2cppParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(Matlab2cppParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void enterRvalue(Matlab2cppParser.RvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#rvalue}.
	 * @param ctx the parse tree
	 */
	void exitRvalue(Matlab2cppParser.RvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Matlab2cppParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Matlab2cppParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#u_ops}.
	 * @param ctx the parse tree
	 */
	void enterU_ops(Matlab2cppParser.U_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#u_ops}.
	 * @param ctx the parse tree
	 */
	void exitU_ops(Matlab2cppParser.U_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#lb_ops}.
	 * @param ctx the parse tree
	 */
	void enterLb_ops(Matlab2cppParser.Lb_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#lb_ops}.
	 * @param ctx the parse tree
	 */
	void exitLb_ops(Matlab2cppParser.Lb_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link Matlab2cppParser#hb_ops}.
	 * @param ctx the parse tree
	 */
	void enterHb_ops(Matlab2cppParser.Hb_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link Matlab2cppParser#hb_ops}.
	 * @param ctx the parse tree
	 */
	void exitHb_ops(Matlab2cppParser.Hb_opsContext ctx);
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