// Generated from /Users/sithukaung/Library/CloudStorage/GoogleDrive-aidan.kst@icloud.com/My Drive/AGH/5th Semester/Formal Languages and Compilers/Musica Programming Language/Musica.g by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MusicaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, SIZE=8, NOTE=9, 
		PROCNAME=10, ASSIGN=11, REPROD=12, CUTTING=13, ADDING=14, LB=15, RB=16, 
		LS=17, RS=18, LP=19, RP=20, MUL=21, DIV=22, MOD=23, SUM=24, MIN=25, EQ=26, 
		NEQ=27, GT=28, LT=29, GET=30, LET=31, VAR=32, NUM=33, STRING=34, COMMENT=35, 
		WS=36;
	public static final int
		RULE_root = 0, RULE_inss = 1, RULE_ins = 2, RULE_input_ = 3, RULE_output_ = 4, 
		RULE_condition = 5, RULE_while_ = 6, RULE_sizel = 7, RULE_query = 8, RULE_procDef = 9, 
		RULE_proc = 10, RULE_assign = 11, RULE_paramsId = 12, RULE_paramsExpr = 13, 
		RULE_reprod = 14, RULE_cut = 15, RULE_addl = 16, RULE_liste = 17, RULE_expr = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "inss", "ins", "input_", "output_", "condition", "while_", "sizel", 
			"query", "procDef", "proc", "assign", "paramsId", "paramsExpr", "reprod", 
			"cut", "addl", "liste", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<?>'", "'<w>'", "'if'", "'else'", "'while'", "'{'", "'}'", "'#'", 
			null, null, "'<-'", "'(:)'", "'8<'", "'<<'", "'|:'", "':|'", "'['", "']'", 
			"'('", "')'", "'*'", "'/'", "'%'", "'+'", "'-'", "'='", "'/='", "'>'", 
			"'<'", "'>='", "'<='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "SIZE", "NOTE", "PROCNAME", 
			"ASSIGN", "REPROD", "CUTTING", "ADDING", "LB", "RB", "LS", "RS", "LP", 
			"RP", "MUL", "DIV", "MOD", "SUM", "MIN", "EQ", "NEQ", "GT", "LT", "GET", 
			"LET", "VAR", "NUM", "STRING", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Musica.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MusicaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public List<ProcDefContext> procDef() {
			return getRuleContexts(ProcDefContext.class);
		}
		public ProcDefContext procDef(int i) {
			return getRuleContext(ProcDefContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PROCNAME) {
				{
				{
				setState(38);
				procDef();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InssContext extends ParserRuleContext {
		public List<InsContext> ins() {
			return getRuleContexts(InsContext.class);
		}
		public InsContext ins(int i) {
			return getRuleContext(InsContext.class,i);
		}
		public InssContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inss; }
	}

	public final InssContext inss() throws RecognitionException {
		InssContext _localctx = new InssContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_inss);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4294980654L) != 0)) {
				{
				{
				setState(44);
				ins();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public Input_Context input_() {
			return getRuleContext(Input_Context.class,0);
		}
		public Output_Context output_() {
			return getRuleContext(Output_Context.class,0);
		}
		public ReprodContext reprod() {
			return getRuleContext(ReprodContext.class,0);
		}
		public ProcContext proc() {
			return getRuleContext(ProcContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public AddlContext addl() {
			return getRuleContext(AddlContext.class,0);
		}
		public CutContext cut() {
			return getRuleContext(CutContext.class,0);
		}
		public InsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ins; }
	}

	public final InsContext ins() throws RecognitionException {
		InsContext _localctx = new InsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ins);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(50);
					assign();
					}
					break;
				case T__0:
					{
					setState(51);
					input_();
					}
					break;
				case T__1:
					{
					setState(52);
					output_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case REPROD:
					{
					setState(55);
					reprod();
					}
					break;
				case PROCNAME:
					{
					setState(56);
					proc();
					}
					break;
				case T__2:
					{
					setState(57);
					condition();
					}
					break;
				case T__4:
					{
					setState(58);
					while_();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VAR:
					{
					setState(61);
					addl();
					}
					break;
				case CUTTING:
					{
					setState(62);
					cut();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Input_Context extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MusicaParser.VAR, 0); }
		public Input_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_; }
	}

	public final Input_Context input_() throws RecognitionException {
		Input_Context _localctx = new Input_Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_input_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(T__0);
			setState(68);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Output_Context extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Output_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_; }
	}

	public final Output_Context output_() throws RecognitionException {
		Output_Context _localctx = new Output_Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_output_);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__1);
			setState(72); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(71);
					expr(0);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(74); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> LB() { return getTokens(MusicaParser.LB); }
		public TerminalNode LB(int i) {
			return getToken(MusicaParser.LB, i);
		}
		public List<InssContext> inss() {
			return getRuleContexts(InssContext.class);
		}
		public InssContext inss(int i) {
			return getRuleContext(InssContext.class,i);
		}
		public List<TerminalNode> RB() { return getTokens(MusicaParser.RB); }
		public TerminalNode RB(int i) {
			return getToken(MusicaParser.RB, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(T__2);
			setState(77);
			expr(0);
			setState(78);
			match(LB);
			setState(79);
			inss();
			setState(80);
			match(RB);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(81);
				match(T__3);
				setState(82);
				match(LB);
				setState(83);
				inss();
				setState(84);
				match(RB);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class While_Context extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LB() { return getToken(MusicaParser.LB, 0); }
		public InssContext inss() {
			return getRuleContext(InssContext.class,0);
		}
		public TerminalNode RB() { return getToken(MusicaParser.RB, 0); }
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_while_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(T__4);
			setState(89);
			expr(0);
			setState(90);
			match(LB);
			setState(91);
			inss();
			setState(92);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SizelContext extends ParserRuleContext {
		public TerminalNode SIZE() { return getToken(MusicaParser.SIZE, 0); }
		public TerminalNode VAR() { return getToken(MusicaParser.VAR, 0); }
		public SizelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizel; }
	}

	public final SizelContext sizel() throws RecognitionException {
		SizelContext _localctx = new SizelContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sizel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(SIZE);
			setState(95);
			match(VAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MusicaParser.VAR, 0); }
		public TerminalNode LS() { return getToken(MusicaParser.LS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RS() { return getToken(MusicaParser.RS, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(VAR);
			setState(98);
			match(LS);
			setState(99);
			expr(0);
			setState(100);
			match(RS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcDefContext extends ParserRuleContext {
		public TerminalNode PROCNAME() { return getToken(MusicaParser.PROCNAME, 0); }
		public ParamsIdContext paramsId() {
			return getRuleContext(ParamsIdContext.class,0);
		}
		public TerminalNode LB() { return getToken(MusicaParser.LB, 0); }
		public InssContext inss() {
			return getRuleContext(InssContext.class,0);
		}
		public TerminalNode RB() { return getToken(MusicaParser.RB, 0); }
		public ProcDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procDef; }
	}

	public final ProcDefContext procDef() throws RecognitionException {
		ProcDefContext _localctx = new ProcDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_procDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(PROCNAME);
			setState(103);
			paramsId();
			setState(104);
			match(LB);
			setState(105);
			inss();
			setState(106);
			match(RB);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcContext extends ParserRuleContext {
		public TerminalNode PROCNAME() { return getToken(MusicaParser.PROCNAME, 0); }
		public ParamsExprContext paramsExpr() {
			return getRuleContext(ParamsExprContext.class,0);
		}
		public ProcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_proc; }
	}

	public final ProcContext proc() throws RecognitionException {
		ProcContext _localctx = new ProcContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_proc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(PROCNAME);
			setState(109);
			paramsExpr();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MusicaParser.VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(MusicaParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(VAR);
			setState(112);
			match(ASSIGN);
			setState(113);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsIdContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(MusicaParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(MusicaParser.VAR, i);
		}
		public ParamsIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsId; }
	}

	public final ParamsIdContext paramsId() throws RecognitionException {
		ParamsIdContext _localctx = new ParamsIdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_paramsId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(115);
				match(VAR);
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ParamsExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramsExpr; }
	}

	public final ParamsExprContext paramsExpr() throws RecognitionException {
		ParamsExprContext _localctx = new ParamsExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_paramsExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(121);
					expr(0);
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReprodContext extends ParserRuleContext {
		public TerminalNode REPROD() { return getToken(MusicaParser.REPROD, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReprodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reprod; }
	}

	public final ReprodContext reprod() throws RecognitionException {
		ReprodContext _localctx = new ReprodContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_reprod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(REPROD);
			setState(128);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CutContext extends ParserRuleContext {
		public TerminalNode CUTTING() { return getToken(MusicaParser.CUTTING, 0); }
		public TerminalNode VAR() { return getToken(MusicaParser.VAR, 0); }
		public TerminalNode LS() { return getToken(MusicaParser.LS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RS() { return getToken(MusicaParser.RS, 0); }
		public CutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cut; }
	}

	public final CutContext cut() throws RecognitionException {
		CutContext _localctx = new CutContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(CUTTING);
			setState(131);
			match(VAR);
			setState(132);
			match(LS);
			setState(133);
			expr(0);
			setState(134);
			match(RS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddlContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MusicaParser.VAR, 0); }
		public TerminalNode ADDING() { return getToken(MusicaParser.ADDING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AddlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addl; }
	}

	public final AddlContext addl() throws RecognitionException {
		AddlContext _localctx = new AddlContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_addl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(VAR);
			setState(137);
			match(ADDING);
			setState(138);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListeContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ListeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_liste; }
	}

	public final ListeContext liste() throws RecognitionException {
		ListeContext _localctx = new ListeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_liste);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__5);
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30065296192L) != 0)) {
				{
				{
				setState(141);
				expr(0);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(147);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MusicaParser.VAR, 0); }
		public TerminalNode STRING() { return getToken(MusicaParser.STRING, 0); }
		public TerminalNode NUM() { return getToken(MusicaParser.NUM, 0); }
		public ListeContext liste() {
			return getRuleContext(ListeContext.class,0);
		}
		public SizelContext sizel() {
			return getRuleContext(SizelContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode NOTE() { return getToken(MusicaParser.NOTE, 0); }
		public TerminalNode LP() { return getToken(MusicaParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP() { return getToken(MusicaParser.RP, 0); }
		public TerminalNode MUL() { return getToken(MusicaParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MusicaParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MusicaParser.MOD, 0); }
		public TerminalNode SUM() { return getToken(MusicaParser.SUM, 0); }
		public TerminalNode MIN() { return getToken(MusicaParser.MIN, 0); }
		public TerminalNode GT() { return getToken(MusicaParser.GT, 0); }
		public TerminalNode LT() { return getToken(MusicaParser.LT, 0); }
		public TerminalNode GET() { return getToken(MusicaParser.GET, 0); }
		public TerminalNode LET() { return getToken(MusicaParser.LET, 0); }
		public TerminalNode EQ() { return getToken(MusicaParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MusicaParser.NEQ, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(150);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(151);
				match(STRING);
				}
				break;
			case 3:
				{
				setState(152);
				match(NUM);
				}
				break;
			case 4:
				{
				setState(153);
				liste();
				}
				break;
			case 5:
				{
				setState(154);
				sizel();
				}
				break;
			case 6:
				{
				setState(155);
				query();
				}
				break;
			case 7:
				{
				setState(156);
				match(NOTE);
				}
				break;
			case 8:
				{
				setState(157);
				match(LP);
				setState(158);
				expr(0);
				setState(159);
				match(RP);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(196);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(163);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(164);
						match(MUL);
						setState(165);
						expr(20);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(166);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(167);
						match(DIV);
						setState(168);
						expr(19);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(169);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(170);
						match(MOD);
						setState(171);
						expr(18);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(172);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(173);
						match(SUM);
						setState(174);
						expr(17);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(175);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(176);
						match(MIN);
						setState(177);
						expr(16);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(178);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(179);
						match(GT);
						setState(180);
						expr(15);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(181);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(182);
						match(LT);
						setState(183);
						expr(14);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(184);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(185);
						match(GET);
						setState(186);
						expr(13);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(187);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(188);
						match(LET);
						setState(189);
						expr(12);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(190);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(191);
						match(EQ);
						setState(192);
						expr(11);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(193);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(194);
						match(NEQ);
						setState(195);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 19);
		case 1:
			return precpred(_ctx, 18);
		case 2:
			return precpred(_ctx, 17);
		case 3:
			return precpred(_ctx, 16);
		case 4:
			return precpred(_ctx, 15);
		case 5:
			return precpred(_ctx, 14);
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		case 8:
			return precpred(_ctx, 11);
		case 9:
			return precpred(_ctx, 10);
		case 10:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u00ca\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0005\u0000(\b\u0000\n\u0000\f\u0000+\t\u0000\u0001\u0001"+
		"\u0005\u0001.\b\u0001\n\u0001\f\u00011\t\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u00026\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"@\b\u0002\u0003\u0002B\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0004\u0004I\b\u0004\u000b\u0004\f\u0004J\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005W\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0005\fu\b\f\n\f\f"+
		"\fx\t\f\u0001\r\u0005\r{\b\r\n\r\f\r~\t\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u008f\b\u0011\n\u0011\f\u0011\u0092\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00a2\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u00c5\b\u0012\n\u0012\f\u0012\u00c8\t\u0012\u0001\u0012\u0000"+
		"\u0001$\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$\u0000\u0000\u00d7\u0000)\u0001\u0000\u0000"+
		"\u0000\u0002/\u0001\u0000\u0000\u0000\u0004A\u0001\u0000\u0000\u0000\u0006"+
		"C\u0001\u0000\u0000\u0000\bF\u0001\u0000\u0000\u0000\nL\u0001\u0000\u0000"+
		"\u0000\fX\u0001\u0000\u0000\u0000\u000e^\u0001\u0000\u0000\u0000\u0010"+
		"a\u0001\u0000\u0000\u0000\u0012f\u0001\u0000\u0000\u0000\u0014l\u0001"+
		"\u0000\u0000\u0000\u0016o\u0001\u0000\u0000\u0000\u0018v\u0001\u0000\u0000"+
		"\u0000\u001a|\u0001\u0000\u0000\u0000\u001c\u007f\u0001\u0000\u0000\u0000"+
		"\u001e\u0082\u0001\u0000\u0000\u0000 \u0088\u0001\u0000\u0000\u0000\""+
		"\u008c\u0001\u0000\u0000\u0000$\u00a1\u0001\u0000\u0000\u0000&(\u0003"+
		"\u0012\t\u0000\'&\u0001\u0000\u0000\u0000(+\u0001\u0000\u0000\u0000)\'"+
		"\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*\u0001\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000,.\u0003\u0004\u0002\u0000-,\u0001"+
		"\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000"+
		"/0\u0001\u0000\u0000\u00000\u0003\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u000026\u0003\u0016\u000b\u000036\u0003\u0006\u0003\u000046\u0003"+
		"\b\u0004\u000052\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000054\u0001"+
		"\u0000\u0000\u00006B\u0001\u0000\u0000\u00007<\u0003\u001c\u000e\u0000"+
		"8<\u0003\u0014\n\u00009<\u0003\n\u0005\u0000:<\u0003\f\u0006\u0000;7\u0001"+
		"\u0000\u0000\u0000;8\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		";:\u0001\u0000\u0000\u0000<B\u0001\u0000\u0000\u0000=@\u0003 \u0010\u0000"+
		">@\u0003\u001e\u000f\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000\u0000"+
		"\u0000@B\u0001\u0000\u0000\u0000A5\u0001\u0000\u0000\u0000A;\u0001\u0000"+
		"\u0000\u0000A?\u0001\u0000\u0000\u0000B\u0005\u0001\u0000\u0000\u0000"+
		"CD\u0005\u0001\u0000\u0000DE\u0005 \u0000\u0000E\u0007\u0001\u0000\u0000"+
		"\u0000FH\u0005\u0002\u0000\u0000GI\u0003$\u0012\u0000HG\u0001\u0000\u0000"+
		"\u0000IJ\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000JK\u0001\u0000"+
		"\u0000\u0000K\t\u0001\u0000\u0000\u0000LM\u0005\u0003\u0000\u0000MN\u0003"+
		"$\u0012\u0000NO\u0005\u000f\u0000\u0000OP\u0003\u0002\u0001\u0000PV\u0005"+
		"\u0010\u0000\u0000QR\u0005\u0004\u0000\u0000RS\u0005\u000f\u0000\u0000"+
		"ST\u0003\u0002\u0001\u0000TU\u0005\u0010\u0000\u0000UW\u0001\u0000\u0000"+
		"\u0000VQ\u0001\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\u000b\u0001"+
		"\u0000\u0000\u0000XY\u0005\u0005\u0000\u0000YZ\u0003$\u0012\u0000Z[\u0005"+
		"\u000f\u0000\u0000[\\\u0003\u0002\u0001\u0000\\]\u0005\u0010\u0000\u0000"+
		"]\r\u0001\u0000\u0000\u0000^_\u0005\b\u0000\u0000_`\u0005 \u0000\u0000"+
		"`\u000f\u0001\u0000\u0000\u0000ab\u0005 \u0000\u0000bc\u0005\u0011\u0000"+
		"\u0000cd\u0003$\u0012\u0000de\u0005\u0012\u0000\u0000e\u0011\u0001\u0000"+
		"\u0000\u0000fg\u0005\n\u0000\u0000gh\u0003\u0018\f\u0000hi\u0005\u000f"+
		"\u0000\u0000ij\u0003\u0002\u0001\u0000jk\u0005\u0010\u0000\u0000k\u0013"+
		"\u0001\u0000\u0000\u0000lm\u0005\n\u0000\u0000mn\u0003\u001a\r\u0000n"+
		"\u0015\u0001\u0000\u0000\u0000op\u0005 \u0000\u0000pq\u0005\u000b\u0000"+
		"\u0000qr\u0003$\u0012\u0000r\u0017\u0001\u0000\u0000\u0000su\u0005 \u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000w\u0019\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000y{\u0003$\u0012\u0000zy\u0001\u0000\u0000\u0000"+
		"{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000"+
		"\u0000}\u001b\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0005\f\u0000\u0000\u0080\u0081\u0003$\u0012\u0000\u0081\u001d"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005\r\u0000\u0000\u0083\u0084\u0005"+
		" \u0000\u0000\u0084\u0085\u0005\u0011\u0000\u0000\u0085\u0086\u0003$\u0012"+
		"\u0000\u0086\u0087\u0005\u0012\u0000\u0000\u0087\u001f\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0005 \u0000\u0000\u0089\u008a\u0005\u000e\u0000\u0000"+
		"\u008a\u008b\u0003$\u0012\u0000\u008b!\u0001\u0000\u0000\u0000\u008c\u0090"+
		"\u0005\u0006\u0000\u0000\u008d\u008f\u0003$\u0012\u0000\u008e\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0093\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		"\u0007\u0000\u0000\u0094#\u0001\u0000\u0000\u0000\u0095\u0096\u0006\u0012"+
		"\uffff\uffff\u0000\u0096\u00a2\u0005 \u0000\u0000\u0097\u00a2\u0005\""+
		"\u0000\u0000\u0098\u00a2\u0005!\u0000\u0000\u0099\u00a2\u0003\"\u0011"+
		"\u0000\u009a\u00a2\u0003\u000e\u0007\u0000\u009b\u00a2\u0003\u0010\b\u0000"+
		"\u009c\u00a2\u0005\t\u0000\u0000\u009d\u009e\u0005\u0013\u0000\u0000\u009e"+
		"\u009f\u0003$\u0012\u0000\u009f\u00a0\u0005\u0014\u0000\u0000\u00a0\u00a2"+
		"\u0001\u0000\u0000\u0000\u00a1\u0095\u0001\u0000\u0000\u0000\u00a1\u0097"+
		"\u0001\u0000\u0000\u0000\u00a1\u0098\u0001\u0000\u0000\u0000\u00a1\u0099"+
		"\u0001\u0000\u0000\u0000\u00a1\u009a\u0001\u0000\u0000\u0000\u00a1\u009b"+
		"\u0001\u0000\u0000\u0000\u00a1\u009c\u0001\u0000\u0000\u0000\u00a1\u009d"+
		"\u0001\u0000\u0000\u0000\u00a2\u00c6\u0001\u0000\u0000\u0000\u00a3\u00a4"+
		"\n\u0013\u0000\u0000\u00a4\u00a5\u0005\u0015\u0000\u0000\u00a5\u00c5\u0003"+
		"$\u0012\u0014\u00a6\u00a7\n\u0012\u0000\u0000\u00a7\u00a8\u0005\u0016"+
		"\u0000\u0000\u00a8\u00c5\u0003$\u0012\u0013\u00a9\u00aa\n\u0011\u0000"+
		"\u0000\u00aa\u00ab\u0005\u0017\u0000\u0000\u00ab\u00c5\u0003$\u0012\u0012"+
		"\u00ac\u00ad\n\u0010\u0000\u0000\u00ad\u00ae\u0005\u0018\u0000\u0000\u00ae"+
		"\u00c5\u0003$\u0012\u0011\u00af\u00b0\n\u000f\u0000\u0000\u00b0\u00b1"+
		"\u0005\u0019\u0000\u0000\u00b1\u00c5\u0003$\u0012\u0010\u00b2\u00b3\n"+
		"\u000e\u0000\u0000\u00b3\u00b4\u0005\u001c\u0000\u0000\u00b4\u00c5\u0003"+
		"$\u0012\u000f\u00b5\u00b6\n\r\u0000\u0000\u00b6\u00b7\u0005\u001d\u0000"+
		"\u0000\u00b7\u00c5\u0003$\u0012\u000e\u00b8\u00b9\n\f\u0000\u0000\u00b9"+
		"\u00ba\u0005\u001e\u0000\u0000\u00ba\u00c5\u0003$\u0012\r\u00bb\u00bc"+
		"\n\u000b\u0000\u0000\u00bc\u00bd\u0005\u001f\u0000\u0000\u00bd\u00c5\u0003"+
		"$\u0012\f\u00be\u00bf\n\n\u0000\u0000\u00bf\u00c0\u0005\u001a\u0000\u0000"+
		"\u00c0\u00c5\u0003$\u0012\u000b\u00c1\u00c2\n\t\u0000\u0000\u00c2\u00c3"+
		"\u0005\u001b\u0000\u0000\u00c3\u00c5\u0003$\u0012\n\u00c4\u00a3\u0001"+
		"\u0000\u0000\u0000\u00c4\u00a6\u0001\u0000\u0000\u0000\u00c4\u00a9\u0001"+
		"\u0000\u0000\u0000\u00c4\u00ac\u0001\u0000\u0000\u0000\u00c4\u00af\u0001"+
		"\u0000\u0000\u0000\u00c4\u00b2\u0001\u0000\u0000\u0000\u00c4\u00b5\u0001"+
		"\u0000\u0000\u0000\u00c4\u00b8\u0001\u0000\u0000\u0000\u00c4\u00bb\u0001"+
		"\u0000\u0000\u0000\u00c4\u00be\u0001\u0000\u0000\u0000\u00c4\u00c1\u0001"+
		"\u0000\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7%\u0001\u0000"+
		"\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u000e)/5;?AJVv|\u0090"+
		"\u00a1\u00c4\u00c6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}