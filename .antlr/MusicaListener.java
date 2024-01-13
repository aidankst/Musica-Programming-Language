// Generated from /Users/sithukaung/Library/CloudStorage/GoogleDrive-aidan.kst@icloud.com/My Drive/AGH/5th Semester/Formal Languages and Compilers/Musica Programming Language/Musica.g by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MusicaParser}.
 */
public interface MusicaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MusicaParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(MusicaParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicaParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(MusicaParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicaParser#inss}.
	 * @param ctx the parse tree
	 */
	void enterInss(MusicaParser.InssContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicaParser#inss}.
	 * @param ctx the parse tree
	 */
	void exitInss(MusicaParser.InssContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicaParser#ins}.
	 * @param ctx the parse tree
	 */
	void enterIns(MusicaParser.InsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicaParser#ins}.
	 * @param ctx the parse tree
	 */
	void exitIns(MusicaParser.InsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicaParser#input_}.
	 * @param ctx the parse tree
	 */
	void enterInput_(MusicaParser.Input_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MusicaParser#input_}.
	 * @param ctx the parse tree
	 */
	void exitInput_(MusicaParser.Input_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MusicaParser#output_}.
	 * @param ctx the parse tree
	 */
	void enterOutput_(MusicaParser.Output_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MusicaParser#output_}.
	 * @param ctx the parse tree
	 */
	void exitOutput_(MusicaParser.Output_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MusicaParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(MusicaParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicaParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(MusicaParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicaParser#while_}.
	 * @param ctx the parse tree
	 */
	void enterWhile_(MusicaParser.While_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MusicaParser#while_}.
	 * @param ctx the parse tree
	 */
	void exitWhile_(MusicaParser.While_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MusicaParser#sizel}.
	 * @param ctx the parse tree
	 */
	void enterSizel(MusicaParser.SizelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicaParser#sizel}.
	 * @param ctx the parse tree
	 */
	void exitSizel(MusicaParser.SizelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicaParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(MusicaParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicaParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(MusicaParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicaParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(MusicaParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicaParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(MusicaParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicaParser#procDef}.
	 * @param ctx the parse tree
	 */
	void enterProcDef(MusicaParser.ProcDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicaParser#procDef}.
	 * @param ctx the parse tree
	 */
	void exitProcDef(MusicaParser.ProcDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicaParser#proc}.
	 * @param ctx the parse tree
	 */
	void enterProc(MusicaParser.ProcContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicaParser#proc}.
	 * @param ctx the parse tree
	 */
	void exitProc(MusicaParser.ProcContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicaParser#paramsID}.
	 * @param ctx the parse tree
	 */
	void enterParamsID(MusicaParser.ParamsIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicaParser#paramsID}.
	 * @param ctx the parse tree
	 */
	void exitParamsID(MusicaParser.ParamsIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicaParser#paramsExpr}.
	 * @param ctx the parse tree
	 */
	void enterParamsExpr(MusicaParser.ParamsExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicaParser#paramsExpr}.
	 * @param ctx the parse tree
	 */
	void exitParamsExpr(MusicaParser.ParamsExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicaParser#reprod}.
	 * @param ctx the parse tree
	 */
	void enterReprod(MusicaParser.ReprodContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicaParser#reprod}.
	 * @param ctx the parse tree
	 */
	void exitReprod(MusicaParser.ReprodContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicaParser#cut}.
	 * @param ctx the parse tree
	 */
	void enterCut(MusicaParser.CutContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicaParser#cut}.
	 * @param ctx the parse tree
	 */
	void exitCut(MusicaParser.CutContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicaParser#addl}.
	 * @param ctx the parse tree
	 */
	void enterAddl(MusicaParser.AddlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicaParser#addl}.
	 * @param ctx the parse tree
	 */
	void exitAddl(MusicaParser.AddlContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicaParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(MusicaParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicaParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(MusicaParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MusicaParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MusicaParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MusicaParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MusicaParser.ExprContext ctx);
}