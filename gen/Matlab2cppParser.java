// Generated from /Users/sanekreunov/IdeaProjects/Matlab2cpp/src/Matlab2cpp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Matlab2cppParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SC=1, DP=2, CM=3, ENTER=4, NAME=5, LB=6, RB=7, LSQB=8, RSQB=9, DIGIT=10, 
		VAR=11, ASSIGN=12, PLUS=13, MINUS=14, PMUL=15, PDIV=16, TRANSPOSE=17, 
		WS=18, ZEROS=19, ONES=20, EYE=21;
	public static final int
		RULE_start = 0, RULE_param = 1, RULE_math = 2, RULE_init_var = 3, RULE_init_matrix = 4, 
		RULE_matrices = 5, RULE_lvalue = 6, RULE_set_item = 7, RULE_item = 8, 
		RULE_section = 9, RULE_row = 10, RULE_column = 11, RULE_equation = 12, 
		RULE_rvalue = 13, RULE_term = 14, RULE_u_ops = 15, RULE_lb_ops = 16, RULE_hb_ops = 17, 
		RULE_matrix = 18, RULE_range = 19, RULE_zeros = 20, RULE_ones = 21, RULE_eye = 22, 
		RULE_line = 23, RULE_number = 24;
	public static final String[] ruleNames = {
		"start", "param", "math", "init_var", "init_matrix", "matrices", "lvalue", 
		"set_item", "item", "section", "row", "column", "equation", "rvalue", 
		"term", "u_ops", "lb_ops", "hb_ops", "matrix", "range", "zeros", "ones", 
		"eye", "line", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "','", null, null, "'('", "')'", "'['", "']'", null, 
		null, "'='", "'+'", "'-'", "'.*'", "'./'", null, null, "'zeros('", "'ones('", 
		"'eye('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SC", "DP", "CM", "ENTER", "NAME", "LB", "RB", "LSQB", "RSQB", "DIGIT", 
		"VAR", "ASSIGN", "PLUS", "MINUS", "PMUL", "PDIV", "TRANSPOSE", "WS", "ZEROS", 
		"ONES", "EYE"
	};
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
	public String getGrammarFileName() { return "Matlab2cpp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Matlab2cppParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> ENTER() { return getTokens(Matlab2cppParser.ENTER); }
		public TerminalNode ENTER(int i) {
			return getToken(Matlab2cppParser.ENTER, i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(50);
					param();
					setState(51);
					match(ENTER);
					}
					} 
				}
				setState(57);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(58);
				param();
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

	public static class ParamContext extends ParserRuleContext {
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			math();
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

	public static class MathContext extends ParserRuleContext {
		public Init_varContext init_var() {
			return getRuleContext(Init_varContext.class,0);
		}
		public Init_matrixContext init_matrix() {
			return getRuleContext(Init_matrixContext.class,0);
		}
		public EquationContext equation() {
			return getRuleContext(EquationContext.class,0);
		}
		public Set_itemContext set_item() {
			return getRuleContext(Set_itemContext.class,0);
		}
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitMath(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		MathContext _localctx = new MathContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_math);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				init_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				init_matrix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				equation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				set_item();
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

	public static class Init_varContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Matlab2cppParser.ASSIGN, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode SC() { return getToken(Matlab2cppParser.SC, 0); }
		public Init_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterInit_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitInit_var(this);
		}
	}

	public final Init_varContext init_var() throws RecognitionException {
		Init_varContext _localctx = new Init_varContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_init_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			lvalue();
			setState(70);
			match(ASSIGN);
			setState(71);
			number();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SC) {
				{
				setState(72);
				match(SC);
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

	public static class Init_matrixContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Matlab2cppParser.ASSIGN, 0); }
		public MatricesContext matrices() {
			return getRuleContext(MatricesContext.class,0);
		}
		public TerminalNode SC() { return getToken(Matlab2cppParser.SC, 0); }
		public Init_matrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init_matrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterInit_matrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitInit_matrix(this);
		}
	}

	public final Init_matrixContext init_matrix() throws RecognitionException {
		Init_matrixContext _localctx = new Init_matrixContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_init_matrix);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			lvalue();
			setState(76);
			match(ASSIGN);
			setState(77);
			matrices();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SC) {
				{
				setState(78);
				match(SC);
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

	public static class MatricesContext extends ParserRuleContext {
		public MatrixContext matrix() {
			return getRuleContext(MatrixContext.class,0);
		}
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public ZerosContext zeros() {
			return getRuleContext(ZerosContext.class,0);
		}
		public OnesContext ones() {
			return getRuleContext(OnesContext.class,0);
		}
		public EyeContext eye() {
			return getRuleContext(EyeContext.class,0);
		}
		public MatricesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrices; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterMatrices(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitMatrices(this);
		}
	}

	public final MatricesContext matrices() throws RecognitionException {
		MatricesContext _localctx = new MatricesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_matrices);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LSQB:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				matrix();
				}
				break;
			case DIGIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				range();
				}
				break;
			case ZEROS:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				zeros();
				}
				break;
			case ONES:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				ones();
				}
				break;
			case EYE:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				eye();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(Matlab2cppParser.NAME, 0); }
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitLvalue(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(NAME);
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

	public static class Set_itemContext extends ParserRuleContext {
		public List<ItemContext> item() {
			return getRuleContexts(ItemContext.class);
		}
		public ItemContext item(int i) {
			return getRuleContext(ItemContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(Matlab2cppParser.ASSIGN, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public Set_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterSet_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitSet_item(this);
		}
	}

	public final Set_itemContext set_item() throws RecognitionException {
		Set_itemContext _localctx = new Set_itemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_set_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			item();
			setState(91);
			match(ASSIGN);
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(92);
				number();
				}
				break;
			case NAME:
				{
				setState(93);
				item();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ItemContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode LB() { return getToken(Matlab2cppParser.LB, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode RB() { return getToken(Matlab2cppParser.RB, 0); }
		public TerminalNode CM() { return getToken(Matlab2cppParser.CM, 0); }
		public ItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitItem(this);
		}
	}

	public final ItemContext item() throws RecognitionException {
		ItemContext _localctx = new ItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			lvalue();
			setState(97);
			match(LB);
			setState(98);
			number();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CM) {
				{
				setState(99);
				match(CM);
				setState(100);
				number();
				}
			}

			setState(103);
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

	public static class SectionContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode LB() { return getToken(Matlab2cppParser.LB, 0); }
		public TerminalNode RB() { return getToken(Matlab2cppParser.RB, 0); }
		public RowContext row() {
			return getRuleContext(RowContext.class,0);
		}
		public ColumnContext column() {
			return getRuleContext(ColumnContext.class,0);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitSection(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_section);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			lvalue();
			setState(106);
			match(LB);
			setState(109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DIGIT:
				{
				setState(107);
				row();
				}
				break;
			case DP:
				{
				setState(108);
				column();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(111);
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

	public static class RowContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode CM() { return getToken(Matlab2cppParser.CM, 0); }
		public TerminalNode DP() { return getToken(Matlab2cppParser.DP, 0); }
		public RowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterRow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitRow(this);
		}
	}

	public final RowContext row() throws RecognitionException {
		RowContext _localctx = new RowContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_row);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			number();
			setState(114);
			match(CM);
			setState(115);
			match(DP);
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

	public static class ColumnContext extends ParserRuleContext {
		public TerminalNode DP() { return getToken(Matlab2cppParser.DP, 0); }
		public TerminalNode CM() { return getToken(Matlab2cppParser.CM, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public ColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitColumn(this);
		}
	}

	public final ColumnContext column() throws RecognitionException {
		ColumnContext _localctx = new ColumnContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			match(DP);
			setState(118);
			match(CM);
			setState(119);
			number();
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

	public static class EquationContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(Matlab2cppParser.ASSIGN, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public TerminalNode SC() { return getToken(Matlab2cppParser.SC, 0); }
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitEquation(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_equation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			lvalue();
			setState(122);
			match(ASSIGN);
			setState(123);
			rvalue(0);
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SC) {
				{
				setState(124);
				match(SC);
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

	public static class RvalueContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<RvalueContext> rvalue() {
			return getRuleContexts(RvalueContext.class);
		}
		public RvalueContext rvalue(int i) {
			return getRuleContext(RvalueContext.class,i);
		}
		public Lb_opsContext lb_ops() {
			return getRuleContext(Lb_opsContext.class,0);
		}
		public RvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterRvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitRvalue(this);
		}
	}

	public final RvalueContext rvalue() throws RecognitionException {
		return rvalue(0);
	}

	private RvalueContext rvalue(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RvalueContext _localctx = new RvalueContext(_ctx, _parentState);
		RvalueContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_rvalue, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(128);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(136);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new RvalueContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_rvalue);
					setState(130);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(131);
					lb_ops();
					setState(132);
					rvalue(3);
					}
					} 
				}
				setState(138);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public U_opsContext u_ops() {
			return getRuleContext(U_opsContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode LB() { return getToken(Matlab2cppParser.LB, 0); }
		public RvalueContext rvalue() {
			return getRuleContext(RvalueContext.class,0);
		}
		public TerminalNode RB() { return getToken(Matlab2cppParser.RB, 0); }
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public Hb_opsContext hb_ops() {
			return getRuleContext(Hb_opsContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
			case MINUS:
				{
				setState(140);
				u_ops();
				}
				break;
			case DIGIT:
				{
				setState(141);
				number();
				}
				break;
			case LB:
				{
				setState(142);
				match(LB);
				setState(143);
				rvalue(0);
				setState(144);
				match(RB);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(148);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(149);
					hb_ops();
					setState(150);
					term(2);
					}
					} 
				}
				setState(156);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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

	public static class U_opsContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(Matlab2cppParser.NAME, 0); }
		public TerminalNode MINUS() { return getToken(Matlab2cppParser.MINUS, 0); }
		public TerminalNode TRANSPOSE() { return getToken(Matlab2cppParser.TRANSPOSE, 0); }
		public U_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_u_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterU_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitU_ops(this);
		}
	}

	public final U_opsContext u_ops() throws RecognitionException {
		U_opsContext _localctx = new U_opsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_u_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(157);
				match(MINUS);
				}
			}

			setState(160);
			match(NAME);
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(161);
				match(TRANSPOSE);
				}
				break;
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

	public static class Lb_opsContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(Matlab2cppParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Matlab2cppParser.MINUS, 0); }
		public Lb_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lb_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterLb_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitLb_ops(this);
		}
	}

	public final Lb_opsContext lb_ops() throws RecognitionException {
		Lb_opsContext _localctx = new Lb_opsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lb_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class Hb_opsContext extends ParserRuleContext {
		public TerminalNode PDIV() { return getToken(Matlab2cppParser.PDIV, 0); }
		public TerminalNode PMUL() { return getToken(Matlab2cppParser.PMUL, 0); }
		public Hb_opsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hb_ops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterHb_ops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitHb_ops(this);
		}
	}

	public final Hb_opsContext hb_ops() throws RecognitionException {
		Hb_opsContext _localctx = new Hb_opsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_hb_ops);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !(_la==PMUL || _la==PDIV) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MatrixContext extends ParserRuleContext {
		public TerminalNode LSQB() { return getToken(Matlab2cppParser.LSQB, 0); }
		public TerminalNode RSQB() { return getToken(Matlab2cppParser.RSQB, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> SC() { return getTokens(Matlab2cppParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(Matlab2cppParser.SC, i);
		}
		public MatrixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matrix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterMatrix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitMatrix(this);
		}
	}

	public final MatrixContext matrix() throws RecognitionException {
		MatrixContext _localctx = new MatrixContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_matrix);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(LSQB);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGIT) {
				{
				setState(174);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(169);
						line();
						setState(170);
						match(SC);
						}
						} 
					}
					setState(176);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(177);
				line();
				}
			}

			setState(180);
			match(RSQB);
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

	public static class RangeContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public List<TerminalNode> DP() { return getTokens(Matlab2cppParser.DP); }
		public TerminalNode DP(int i) {
			return getToken(Matlab2cppParser.DP, i);
		}
		public RangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterRange(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitRange(this);
		}
	}

	public final RangeContext range() throws RecognitionException {
		RangeContext _localctx = new RangeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			number();
			setState(183);
			match(DP);
			setState(184);
			number();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DP) {
				{
				setState(185);
				match(DP);
				setState(186);
				number();
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

	public static class ZerosContext extends ParserRuleContext {
		public TerminalNode ZEROS() { return getToken(Matlab2cppParser.ZEROS, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode RB() { return getToken(Matlab2cppParser.RB, 0); }
		public List<TerminalNode> CM() { return getTokens(Matlab2cppParser.CM); }
		public TerminalNode CM(int i) {
			return getToken(Matlab2cppParser.CM, i);
		}
		public TerminalNode SC() { return getToken(Matlab2cppParser.SC, 0); }
		public ZerosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_zeros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterZeros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitZeros(this);
		}
	}

	public final ZerosContext zeros() throws RecognitionException {
		ZerosContext _localctx = new ZerosContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_zeros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(ZEROS);
			setState(190);
			number();
			setState(195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CM) {
				{
				{
				setState(191);
				match(CM);
				setState(192);
				number();
				}
				}
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(198);
			match(RB);
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(199);
				match(SC);
				}
				break;
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

	public static class OnesContext extends ParserRuleContext {
		public TerminalNode ONES() { return getToken(Matlab2cppParser.ONES, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode RB() { return getToken(Matlab2cppParser.RB, 0); }
		public List<TerminalNode> CM() { return getTokens(Matlab2cppParser.CM); }
		public TerminalNode CM(int i) {
			return getToken(Matlab2cppParser.CM, i);
		}
		public TerminalNode SC() { return getToken(Matlab2cppParser.SC, 0); }
		public OnesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterOnes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitOnes(this);
		}
	}

	public final OnesContext ones() throws RecognitionException {
		OnesContext _localctx = new OnesContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_ones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(ONES);
			setState(203);
			number();
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CM) {
				{
				{
				setState(204);
				match(CM);
				setState(205);
				number();
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211);
			match(RB);
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(212);
				match(SC);
				}
				break;
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

	public static class EyeContext extends ParserRuleContext {
		public TerminalNode EYE() { return getToken(Matlab2cppParser.EYE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode RB() { return getToken(Matlab2cppParser.RB, 0); }
		public TerminalNode SC() { return getToken(Matlab2cppParser.SC, 0); }
		public EyeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eye; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterEye(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitEye(this);
		}
	}

	public final EyeContext eye() throws RecognitionException {
		EyeContext _localctx = new EyeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_eye);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(EYE);
			setState(216);
			number();
			setState(217);
			match(RB);
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(218);
				match(SC);
				}
				break;
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

	public static class LineContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(221);
				number();
				}
				}
				setState(224); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(Matlab2cppParser.DIGIT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(DIGIT);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return rvalue_sempred((RvalueContext)_localctx, predIndex);
		case 14:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rvalue_sempred(RvalueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u00e7\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\7\28\n\2\f\2\16\2;\13\2\3\2\5\2>\n\2\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\5\4F\n\4\3\5\3\5\3\5\3\5\5\5L\n\5\3\6\3\6\3\6\3\6\5\6R"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\5\7Y\n\7\3\b\3\b\3\t\3\t\3\t\3\t\5\ta\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\5\nh\n\n\3\n\3\n\3\13\3\13\3\13\3\13\5\13p\n\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\5\16\u0080\n"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u0089\n\17\f\17\16\17\u008c"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0095\n\20\3\20\3\20\3"+
		"\20\3\20\7\20\u009b\n\20\f\20\16\20\u009e\13\20\3\21\5\21\u00a1\n\21\3"+
		"\21\3\21\5\21\u00a5\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\7\24"+
		"\u00af\n\24\f\24\16\24\u00b2\13\24\3\24\5\24\u00b5\n\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\5\25\u00be\n\25\3\26\3\26\3\26\3\26\7\26\u00c4\n"+
		"\26\f\26\16\26\u00c7\13\26\3\26\3\26\5\26\u00cb\n\26\3\27\3\27\3\27\3"+
		"\27\7\27\u00d1\n\27\f\27\16\27\u00d4\13\27\3\27\3\27\5\27\u00d8\n\27\3"+
		"\30\3\30\3\30\3\30\5\30\u00de\n\30\3\31\6\31\u00e1\n\31\r\31\16\31\u00e2"+
		"\3\32\3\32\3\32\2\4\34\36\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \""+
		"$&(*,.\60\62\2\4\3\2\17\20\3\2\21\22\2\u00eb\29\3\2\2\2\4?\3\2\2\2\6E"+
		"\3\2\2\2\bG\3\2\2\2\nM\3\2\2\2\fX\3\2\2\2\16Z\3\2\2\2\20\\\3\2\2\2\22"+
		"b\3\2\2\2\24k\3\2\2\2\26s\3\2\2\2\30w\3\2\2\2\32{\3\2\2\2\34\u0081\3\2"+
		"\2\2\36\u0094\3\2\2\2 \u00a0\3\2\2\2\"\u00a6\3\2\2\2$\u00a8\3\2\2\2&\u00aa"+
		"\3\2\2\2(\u00b8\3\2\2\2*\u00bf\3\2\2\2,\u00cc\3\2\2\2.\u00d9\3\2\2\2\60"+
		"\u00e0\3\2\2\2\62\u00e4\3\2\2\2\64\65\5\4\3\2\65\66\7\6\2\2\668\3\2\2"+
		"\2\67\64\3\2\2\28;\3\2\2\29\67\3\2\2\29:\3\2\2\2:=\3\2\2\2;9\3\2\2\2<"+
		">\5\4\3\2=<\3\2\2\2=>\3\2\2\2>\3\3\2\2\2?@\5\6\4\2@\5\3\2\2\2AF\5\b\5"+
		"\2BF\5\n\6\2CF\5\32\16\2DF\5\20\t\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3"+
		"\2\2\2F\7\3\2\2\2GH\5\16\b\2HI\7\16\2\2IK\5\62\32\2JL\7\3\2\2KJ\3\2\2"+
		"\2KL\3\2\2\2L\t\3\2\2\2MN\5\16\b\2NO\7\16\2\2OQ\5\f\7\2PR\7\3\2\2QP\3"+
		"\2\2\2QR\3\2\2\2R\13\3\2\2\2SY\5&\24\2TY\5(\25\2UY\5*\26\2VY\5,\27\2W"+
		"Y\5.\30\2XS\3\2\2\2XT\3\2\2\2XU\3\2\2\2XV\3\2\2\2XW\3\2\2\2Y\r\3\2\2\2"+
		"Z[\7\7\2\2[\17\3\2\2\2\\]\5\22\n\2]`\7\16\2\2^a\5\62\32\2_a\5\22\n\2`"+
		"^\3\2\2\2`_\3\2\2\2a\21\3\2\2\2bc\5\16\b\2cd\7\b\2\2dg\5\62\32\2ef\7\5"+
		"\2\2fh\5\62\32\2ge\3\2\2\2gh\3\2\2\2hi\3\2\2\2ij\7\t\2\2j\23\3\2\2\2k"+
		"l\5\16\b\2lo\7\b\2\2mp\5\26\f\2np\5\30\r\2om\3\2\2\2on\3\2\2\2pq\3\2\2"+
		"\2qr\7\t\2\2r\25\3\2\2\2st\5\62\32\2tu\7\5\2\2uv\7\4\2\2v\27\3\2\2\2w"+
		"x\7\4\2\2xy\7\5\2\2yz\5\62\32\2z\31\3\2\2\2{|\5\16\b\2|}\7\16\2\2}\177"+
		"\5\34\17\2~\u0080\7\3\2\2\177~\3\2\2\2\177\u0080\3\2\2\2\u0080\33\3\2"+
		"\2\2\u0081\u0082\b\17\1\2\u0082\u0083\5\36\20\2\u0083\u008a\3\2\2\2\u0084"+
		"\u0085\f\4\2\2\u0085\u0086\5\"\22\2\u0086\u0087\5\34\17\5\u0087\u0089"+
		"\3\2\2\2\u0088\u0084\3\2\2\2\u0089\u008c\3\2\2\2\u008a\u0088\3\2\2\2\u008a"+
		"\u008b\3\2\2\2\u008b\35\3\2\2\2\u008c\u008a\3\2\2\2\u008d\u008e\b\20\1"+
		"\2\u008e\u0095\5 \21\2\u008f\u0095\5\62\32\2\u0090\u0091\7\b\2\2\u0091"+
		"\u0092\5\34\17\2\u0092\u0093\7\t\2\2\u0093\u0095\3\2\2\2\u0094\u008d\3"+
		"\2\2\2\u0094\u008f\3\2\2\2\u0094\u0090\3\2\2\2\u0095\u009c\3\2\2\2\u0096"+
		"\u0097\f\3\2\2\u0097\u0098\5$\23\2\u0098\u0099\5\36\20\4\u0099\u009b\3"+
		"\2\2\2\u009a\u0096\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c"+
		"\u009d\3\2\2\2\u009d\37\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a1\7\20\2"+
		"\2\u00a0\u009f\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a4"+
		"\7\7\2\2\u00a3\u00a5\7\23\2\2\u00a4\u00a3\3\2\2\2\u00a4\u00a5\3\2\2\2"+
		"\u00a5!\3\2\2\2\u00a6\u00a7\t\2\2\2\u00a7#\3\2\2\2\u00a8\u00a9\t\3\2\2"+
		"\u00a9%\3\2\2\2\u00aa\u00b4\7\n\2\2\u00ab\u00ac\5\60\31\2\u00ac\u00ad"+
		"\7\3\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ab\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2"+
		"\2\2\u00b3\u00b5\5\60\31\2\u00b4\u00b0\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00b7\7\13\2\2\u00b7\'\3\2\2\2\u00b8\u00b9\5\62\32"+
		"\2\u00b9\u00ba\7\4\2\2\u00ba\u00bd\5\62\32\2\u00bb\u00bc\7\4\2\2\u00bc"+
		"\u00be\5\62\32\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be)\3\2\2"+
		"\2\u00bf\u00c0\7\25\2\2\u00c0\u00c5\5\62\32\2\u00c1\u00c2\7\5\2\2\u00c2"+
		"\u00c4\5\62\32\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3"+
		"\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8"+
		"\u00ca\7\t\2\2\u00c9\u00cb\7\3\2\2\u00ca\u00c9\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb+\3\2\2\2\u00cc\u00cd\7\26\2\2\u00cd\u00d2\5\62\32\2\u00ce\u00cf"+
		"\7\5\2\2\u00cf\u00d1\5\62\32\2\u00d0\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2"+
		"\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2"+
		"\3\2\2\2\u00d5\u00d7\7\t\2\2\u00d6\u00d8\7\3\2\2\u00d7\u00d6\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8-\3\2\2\2\u00d9\u00da\7\27\2\2\u00da\u00db\5\62\32"+
		"\2\u00db\u00dd\7\t\2\2\u00dc\u00de\7\3\2\2\u00dd\u00dc\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de/\3\2\2\2\u00df\u00e1\5\62\32\2\u00e0\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\61\3\2\2"+
		"\2\u00e4\u00e5\7\f\2\2\u00e5\63\3\2\2\2\329=EKQX`go\177\u008a\u0094\u009c"+
		"\u00a0\u00a4\u00b0\u00b4\u00bd\u00c5\u00ca\u00d2\u00d7\u00dd\u00e2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}