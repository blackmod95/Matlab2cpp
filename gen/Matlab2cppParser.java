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
		VAR=11, ASSIGN=12, PLUS=13, MINUS=14, TRANSPOSE=15, WS=16, ZEROS=17, ONES=18;
	public static final int
		RULE_start = 0, RULE_param = 1, RULE_math = 2, RULE_init_var = 3, RULE_init_matrix = 4, 
		RULE_unary_operation = 5, RULE_binary_operation = 6, RULE_matrix = 7, 
		RULE_range = 8, RULE_zeros = 9, RULE_ones = 10, RULE_line = 11, RULE_number = 12;
	public static final String[] ruleNames = {
		"start", "param", "math", "init_var", "init_matrix", "unary_operation", 
		"binary_operation", "matrix", "range", "zeros", "ones", "line", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "','", null, null, "'('", "')'", "'['", "']'", null, 
		null, "'='", "'+'", "'-'", null, null, "'zeros'", "'ones'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SC", "DP", "CM", "ENTER", "NAME", "LB", "RB", "LSQB", "RSQB", "DIGIT", 
		"VAR", "ASSIGN", "PLUS", "MINUS", "TRANSPOSE", "WS", "ZEROS", "ONES"
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
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NAME) {
				{
				{
				setState(26);
				param();
				setState(27);
				match(ENTER);
				}
				}
				setState(33);
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
			setState(34);
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
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				init_var();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				init_matrix();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				unary_operation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
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
		public RangeContext range() {
			return getRuleContext(RangeContext.class,0);
		}
		public ZerosContext zeros() {
			return getRuleContext(ZerosContext.class,0);
		}
		public OnesContext ones() {
			return getRuleContext(OnesContext.class,0);
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
			setState(42);
			match(NAME);
			setState(43);
			match(ASSIGN);
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(44);
				number();
				}
				break;
			case 2:
				{
				setState(45);
				range();
				}
				break;
			case 3:
				{
				setState(46);
				zeros();
				}
				break;
			case 4:
				{
				setState(47);
				ones();
				}
				break;
			}
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
			setState(55);
			matrix();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SC) {
				{
				setState(56);
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
			setState(59);
			match(NAME);
			setState(60);
			match(ASSIGN);
			setState(61);
			match(NAME);
			{
			setState(62);
			match(TRANSPOSE);
			}
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SC) {
				{
				setState(63);
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
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
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
			setState(66);
			match(NAME);
			setState(67);
			match(ASSIGN);
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(68);
				match(NAME);
				}
				break;
			case DIGIT:
				{
				setState(69);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(72);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(73);
				match(NAME);
				}
				break;
			case DIGIT:
				{
				setState(74);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SC) {
				{
				setState(77);
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
			setState(80);
			match(LSQB);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DIGIT) {
				{
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(81);
						line();
						setState(82);
						match(SC);
						}
						} 
					}
					setState(88);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(89);
				line();
				}
			}

			setState(92);
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
			setState(94);
			number();
			setState(95);
			match(DP);
			setState(96);
			number();
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DP) {
				{
				setState(97);
				match(DP);
				setState(98);
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
		public TerminalNode LB() { return getToken(Matlab2cppParser.LB, 0); }
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
			setState(101);
			match(ZEROS);
			setState(102);
			match(LB);
			setState(103);
			number();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CM) {
				{
				{
				setState(104);
				match(CM);
				setState(105);
				number();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(RB);
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(112);
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
		public TerminalNode LB() { return getToken(Matlab2cppParser.LB, 0); }
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
			setState(115);
			match(ONES);
			setState(116);
			match(LB);
			setState(117);
			number();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CM) {
				{
				{
				setState(118);
				match(CM);
				setState(119);
				number();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			match(RB);
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(126);
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
		enterRule(_localctx, 22, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(129);
				number();
				}
				}
				setState(132); 
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
		enterRule(_localctx, 24, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24\u008b\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\2\7\2 \n\2\f\2\16\2#\13\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\5\4+\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\63\n\5\3\5"+
		"\5\5\66\n\5\3\6\3\6\3\6\3\6\5\6<\n\6\3\7\3\7\3\7\3\7\3\7\5\7C\n\7\3\b"+
		"\3\b\3\b\3\b\5\bI\n\b\3\b\3\b\3\b\5\bN\n\b\3\b\5\bQ\n\b\3\t\3\t\3\t\3"+
		"\t\7\tW\n\t\f\t\16\tZ\13\t\3\t\5\t]\n\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5"+
		"\nf\n\n\3\13\3\13\3\13\3\13\3\13\7\13m\n\13\f\13\16\13p\13\13\3\13\3\13"+
		"\5\13t\n\13\3\f\3\f\3\f\3\f\3\f\7\f{\n\f\f\f\16\f~\13\f\3\f\3\f\5\f\u0082"+
		"\n\f\3\r\6\r\u0085\n\r\r\r\16\r\u0086\3\16\3\16\3\16\2\2\17\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\2\3\3\2\17\20\2\u0092\2!\3\2\2\2\4$\3\2\2\2\6"+
		"*\3\2\2\2\b,\3\2\2\2\n\67\3\2\2\2\f=\3\2\2\2\16D\3\2\2\2\20R\3\2\2\2\22"+
		"`\3\2\2\2\24g\3\2\2\2\26u\3\2\2\2\30\u0084\3\2\2\2\32\u0088\3\2\2\2\34"+
		"\35\5\4\3\2\35\36\7\6\2\2\36 \3\2\2\2\37\34\3\2\2\2 #\3\2\2\2!\37\3\2"+
		"\2\2!\"\3\2\2\2\"\3\3\2\2\2#!\3\2\2\2$%\5\6\4\2%\5\3\2\2\2&+\5\b\5\2\'"+
		"+\5\n\6\2(+\5\f\7\2)+\5\16\b\2*&\3\2\2\2*\'\3\2\2\2*(\3\2\2\2*)\3\2\2"+
		"\2+\7\3\2\2\2,-\7\7\2\2-\62\7\16\2\2.\63\5\32\16\2/\63\5\22\n\2\60\63"+
		"\5\24\13\2\61\63\5\26\f\2\62.\3\2\2\2\62/\3\2\2\2\62\60\3\2\2\2\62\61"+
		"\3\2\2\2\63\65\3\2\2\2\64\66\7\3\2\2\65\64\3\2\2\2\65\66\3\2\2\2\66\t"+
		"\3\2\2\2\678\7\7\2\289\7\16\2\29;\5\20\t\2:<\7\3\2\2;:\3\2\2\2;<\3\2\2"+
		"\2<\13\3\2\2\2=>\7\7\2\2>?\7\16\2\2?@\7\7\2\2@B\7\21\2\2AC\7\3\2\2BA\3"+
		"\2\2\2BC\3\2\2\2C\r\3\2\2\2DE\7\7\2\2EH\7\16\2\2FI\7\7\2\2GI\5\32\16\2"+
		"HF\3\2\2\2HG\3\2\2\2IJ\3\2\2\2JM\t\2\2\2KN\7\7\2\2LN\5\32\16\2MK\3\2\2"+
		"\2ML\3\2\2\2NP\3\2\2\2OQ\7\3\2\2PO\3\2\2\2PQ\3\2\2\2Q\17\3\2\2\2R\\\7"+
		"\n\2\2ST\5\30\r\2TU\7\3\2\2UW\3\2\2\2VS\3\2\2\2WZ\3\2\2\2XV\3\2\2\2XY"+
		"\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[]\5\30\r\2\\X\3\2\2\2\\]\3\2\2\2]^\3\2\2"+
		"\2^_\7\13\2\2_\21\3\2\2\2`a\5\32\16\2ab\7\4\2\2be\5\32\16\2cd\7\4\2\2"+
		"df\5\32\16\2ec\3\2\2\2ef\3\2\2\2f\23\3\2\2\2gh\7\23\2\2hi\7\b\2\2in\5"+
		"\32\16\2jk\7\5\2\2km\5\32\16\2lj\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2"+
		"oq\3\2\2\2pn\3\2\2\2qs\7\t\2\2rt\7\3\2\2sr\3\2\2\2st\3\2\2\2t\25\3\2\2"+
		"\2uv\7\24\2\2vw\7\b\2\2w|\5\32\16\2xy\7\5\2\2y{\5\32\16\2zx\3\2\2\2{~"+
		"\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0081\7\t\2\2"+
		"\u0080\u0082\7\3\2\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\27"+
		"\3\2\2\2\u0083\u0085\5\32\16\2\u0084\u0083\3\2\2\2\u0085\u0086\3\2\2\2"+
		"\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\31\3\2\2\2\u0088\u0089"+
		"\7\f\2\2\u0089\33\3\2\2\2\23!*\62\65;BHMPX\\ens|\u0081\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}