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
		RULE_unary_operation = 5, RULE_binary_operation = 6, RULE_matrix = 7, 
		RULE_range = 8, RULE_zeros = 9, RULE_ones = 10, RULE_eye = 11, RULE_line = 12, 
		RULE_number = 13;
	public static final String[] ruleNames = {
		"start", "param", "math", "init_var", "init_matrix", "unary_operation", 
		"binary_operation", "matrix", "range", "zeros", "ones", "eye", "line", 
		"number"
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
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(28);
					param();
					setState(29);
					match(ENTER);
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NAME) {
				{
				setState(36);
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
			setState(39);
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
		public Unary_operationContext unary_operation() {
			return getRuleContext(Unary_operationContext.class,0);
		}
		public Binary_operationContext binary_operation() {
			return getRuleContext(Binary_operationContext.class,0);
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
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				init_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				init_matrix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(43);
				unary_operation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(44);
				binary_operation();
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
		public TerminalNode NAME() { return getToken(Matlab2cppParser.NAME, 0); }
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
			setState(47);
			match(NAME);
			setState(48);
			match(ASSIGN);
			setState(49);
			number();
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SC) {
				{
				setState(50);
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
		public TerminalNode NAME() { return getToken(Matlab2cppParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(Matlab2cppParser.ASSIGN, 0); }
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
			setState(53);
			match(NAME);
			setState(54);
			match(ASSIGN);
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LSQB:
				{
				setState(55);
				matrix();
				}
				break;
			case DIGIT:
				{
				setState(56);
				range();
				}
				break;
			case ZEROS:
				{
				setState(57);
				zeros();
				}
				break;
			case ONES:
				{
				setState(58);
				ones();
				}
				break;
			case EYE:
				{
				setState(59);
				eye();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SC) {
				{
				setState(62);
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

	public static class Unary_operationContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(Matlab2cppParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(Matlab2cppParser.NAME, i);
		}
		public TerminalNode ASSIGN() { return getToken(Matlab2cppParser.ASSIGN, 0); }
		public TerminalNode TRANSPOSE() { return getToken(Matlab2cppParser.TRANSPOSE, 0); }
		public TerminalNode SC() { return getToken(Matlab2cppParser.SC, 0); }
		public Unary_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterUnary_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitUnary_operation(this);
		}
	}

	public final Unary_operationContext unary_operation() throws RecognitionException {
		Unary_operationContext _localctx = new Unary_operationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_unary_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(NAME);
			setState(66);
			match(ASSIGN);
			setState(67);
			match(NAME);
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TRANSPOSE) {
				{
				setState(68);
				match(TRANSPOSE);
				}
			}

			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SC) {
				{
				setState(71);
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

	public static class Binary_operationContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(Matlab2cppParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(Matlab2cppParser.NAME, i);
		}
		public TerminalNode ASSIGN() { return getToken(Matlab2cppParser.ASSIGN, 0); }
		public TerminalNode PLUS() { return getToken(Matlab2cppParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(Matlab2cppParser.MINUS, 0); }
		public TerminalNode PMUL() { return getToken(Matlab2cppParser.PMUL, 0); }
		public TerminalNode PDIV() { return getToken(Matlab2cppParser.PDIV, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode SC() { return getToken(Matlab2cppParser.SC, 0); }
		public Binary_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).enterBinary_operation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Matlab2cppListener ) ((Matlab2cppListener)listener).exitBinary_operation(this);
		}
	}

	public final Binary_operationContext binary_operation() throws RecognitionException {
		Binary_operationContext _localctx = new Binary_operationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_binary_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(NAME);
			setState(75);
			match(ASSIGN);
			setState(76);
			match(NAME);
			setState(77);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PLUS) | (1L << MINUS) | (1L << PMUL) | (1L << PDIV))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(78);
				match(NAME);
				}
				break;
			case DIGIT:
				{
				setState(79);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SC) {
				{
				setState(82);
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
		enterRule(_localctx, 14, RULE_matrix);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(LSQB);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGIT) {
				{
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(86);
						line();
						setState(87);
						match(SC);
						}
						} 
					}
					setState(93);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				setState(94);
				line();
				}
			}

			setState(97);
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
		enterRule(_localctx, 16, RULE_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			number();
			setState(100);
			match(DP);
			setState(101);
			number();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DP) {
				{
				setState(102);
				match(DP);
				setState(103);
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
		enterRule(_localctx, 18, RULE_zeros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ZEROS);
			setState(107);
			number();
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CM) {
				{
				{
				setState(108);
				match(CM);
				setState(109);
				number();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(RB);
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(116);
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
		enterRule(_localctx, 20, RULE_ones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(ONES);
			setState(120);
			number();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CM) {
				{
				{
				setState(121);
				match(CM);
				setState(122);
				number();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(RB);
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(129);
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
		enterRule(_localctx, 22, RULE_eye);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(EYE);
			setState(133);
			number();
			setState(134);
			match(RB);
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(135);
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
		enterRule(_localctx, 24, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(138);
				number();
				}
				}
				setState(141); 
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
		enterRule(_localctx, 26, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u0094\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\7\2\"\n\2\f\2\16"+
		"\2%\13\2\3\2\5\2(\n\2\3\3\3\3\3\4\3\4\3\4\3\4\5\4\60\n\4\3\5\3\5\3\5\3"+
		"\5\5\5\66\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6?\n\6\3\6\5\6B\n\6\3\7\3"+
		"\7\3\7\3\7\5\7H\n\7\3\7\5\7K\n\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bS\n\b\3\b"+
		"\5\bV\n\b\3\t\3\t\3\t\3\t\7\t\\\n\t\f\t\16\t_\13\t\3\t\5\tb\n\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\5\nk\n\n\3\13\3\13\3\13\3\13\7\13q\n\13\f\13\16"+
		"\13t\13\13\3\13\3\13\5\13x\n\13\3\f\3\f\3\f\3\f\7\f~\n\f\f\f\16\f\u0081"+
		"\13\f\3\f\3\f\5\f\u0085\n\f\3\r\3\r\3\r\3\r\5\r\u008b\n\r\3\16\6\16\u008e"+
		"\n\16\r\16\16\16\u008f\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\2\3\3\2\17\22\2\u009d\2#\3\2\2\2\4)\3\2\2\2\6/\3\2\2\2\b\61"+
		"\3\2\2\2\n\67\3\2\2\2\fC\3\2\2\2\16L\3\2\2\2\20W\3\2\2\2\22e\3\2\2\2\24"+
		"l\3\2\2\2\26y\3\2\2\2\30\u0086\3\2\2\2\32\u008d\3\2\2\2\34\u0091\3\2\2"+
		"\2\36\37\5\4\3\2\37 \7\6\2\2 \"\3\2\2\2!\36\3\2\2\2\"%\3\2\2\2#!\3\2\2"+
		"\2#$\3\2\2\2$\'\3\2\2\2%#\3\2\2\2&(\5\4\3\2\'&\3\2\2\2\'(\3\2\2\2(\3\3"+
		"\2\2\2)*\5\6\4\2*\5\3\2\2\2+\60\5\b\5\2,\60\5\n\6\2-\60\5\f\7\2.\60\5"+
		"\16\b\2/+\3\2\2\2/,\3\2\2\2/-\3\2\2\2/.\3\2\2\2\60\7\3\2\2\2\61\62\7\7"+
		"\2\2\62\63\7\16\2\2\63\65\5\34\17\2\64\66\7\3\2\2\65\64\3\2\2\2\65\66"+
		"\3\2\2\2\66\t\3\2\2\2\678\7\7\2\28>\7\16\2\29?\5\20\t\2:?\5\22\n\2;?\5"+
		"\24\13\2<?\5\26\f\2=?\5\30\r\2>9\3\2\2\2>:\3\2\2\2>;\3\2\2\2><\3\2\2\2"+
		">=\3\2\2\2?A\3\2\2\2@B\7\3\2\2A@\3\2\2\2AB\3\2\2\2B\13\3\2\2\2CD\7\7\2"+
		"\2DE\7\16\2\2EG\7\7\2\2FH\7\23\2\2GF\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IK\7\3"+
		"\2\2JI\3\2\2\2JK\3\2\2\2K\r\3\2\2\2LM\7\7\2\2MN\7\16\2\2NO\7\7\2\2OR\t"+
		"\2\2\2PS\7\7\2\2QS\5\34\17\2RP\3\2\2\2RQ\3\2\2\2SU\3\2\2\2TV\7\3\2\2U"+
		"T\3\2\2\2UV\3\2\2\2V\17\3\2\2\2Wa\7\n\2\2XY\5\32\16\2YZ\7\3\2\2Z\\\3\2"+
		"\2\2[X\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2\2\2`b\5"+
		"\32\16\2a]\3\2\2\2ab\3\2\2\2bc\3\2\2\2cd\7\13\2\2d\21\3\2\2\2ef\5\34\17"+
		"\2fg\7\4\2\2gj\5\34\17\2hi\7\4\2\2ik\5\34\17\2jh\3\2\2\2jk\3\2\2\2k\23"+
		"\3\2\2\2lm\7\25\2\2mr\5\34\17\2no\7\5\2\2oq\5\34\17\2pn\3\2\2\2qt\3\2"+
		"\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uw\7\t\2\2vx\7\3\2\2wv\3\2"+
		"\2\2wx\3\2\2\2x\25\3\2\2\2yz\7\26\2\2z\177\5\34\17\2{|\7\5\2\2|~\5\34"+
		"\17\2}{\3\2\2\2~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082"+
		"\3\2\2\2\u0081\177\3\2\2\2\u0082\u0084\7\t\2\2\u0083\u0085\7\3\2\2\u0084"+
		"\u0083\3\2\2\2\u0084\u0085\3\2\2\2\u0085\27\3\2\2\2\u0086\u0087\7\27\2"+
		"\2\u0087\u0088\5\34\17\2\u0088\u008a\7\t\2\2\u0089\u008b\7\3\2\2\u008a"+
		"\u0089\3\2\2\2\u008a\u008b\3\2\2\2\u008b\31\3\2\2\2\u008c\u008e\5\34\17"+
		"\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090"+
		"\3\2\2\2\u0090\33\3\2\2\2\u0091\u0092\7\f\2\2\u0092\35\3\2\2\2\25#\'/"+
		"\65>AGJRU]ajrw\177\u0084\u008a\u008f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}