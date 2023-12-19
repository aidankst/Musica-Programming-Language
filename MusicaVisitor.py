# Generated from Musica.g by ANTLR 4.13.1
from antlr4 import *
if "." in __name__:
    from .MusicaParser import MusicaParser
else:
    from MusicaParser import MusicaParser

# This class defines a complete generic visitor for a parse tree produced by MusicaParser.

class MusicaVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by MusicaParser#root.
    def visitRoot(self, ctx:MusicaParser.RootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MusicaParser#inss.
    def visitInss(self, ctx:MusicaParser.InssContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MusicaParser#ins.
    def visitIns(self, ctx:MusicaParser.InsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MusicaParser#input_.
    def visitInput_(self, ctx:MusicaParser.Input_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MusicaParser#output_.
    def visitOutput_(self, ctx:MusicaParser.Output_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MusicaParser#condition.
    def visitCondition(self, ctx:MusicaParser.ConditionContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MusicaParser#while_.
    def visitWhile_(self, ctx:MusicaParser.While_Context):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MusicaParser#sizel.
    def visitSizel(self, ctx:MusicaParser.SizelContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MusicaParser#query.
    def visitQuery(self, ctx:MusicaParser.QueryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MusicaParser#assign.
    def visitAssign(self, ctx:MusicaParser.AssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MusicaParser#procDef.
    def visitProcDef(self, ctx:MusicaParser.ProcDefContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MusicaParser#proc.
    def visitProc(self, ctx:MusicaParser.ProcContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MusicaParser#paramsID.
    def visitParamsID(self, ctx:MusicaParser.ParamsIDContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MusicaParser#paramsExpr.
    def visitParamsExpr(self, ctx:MusicaParser.ParamsExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MusicaParser#reprod.
    def visitReprod(self, ctx:MusicaParser.ReprodContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MusicaParser#cut.
    def visitCut(self, ctx:MusicaParser.CutContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MusicaParser#addl.
    def visitAddl(self, ctx:MusicaParser.AddlContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MusicaParser#list.
    def visitList(self, ctx:MusicaParser.ListContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by MusicaParser#expr.
    def visitExpr(self, ctx:MusicaParser.ExprContext):
        return self.visitChildren(ctx)



del MusicaParser