// Generated from /Users/sanekreunov/IdeaProjects/Matlab2cpp/src/Matlab2cpp.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Matlab2cppLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SC=1, DP=2, CM=3, ENTER=4, NAME=5, LB=6, RB=7, LSQB=8, RSQB=9, DIGIT=10, 
		VAR=11, ASSIGN=12, PLUS=13, MINUS=14, PMUL=15, PDIV=16, TRANSPOSE=17, 
		WS=18, ZEROS=19, ONES=20, EYE=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SC", "DP", "CM", "ENTER", "NAME", "LB", "RB", "LSQB", "RSQB", "DIGIT", 
		"VAR", "ASSIGN", "PLUS", "MINUS", "PMUL", "PDIV", "TRANSPOSE", "WS", "ZEROS", 
		"ONES", "EYE"
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


	public Matlab2cppLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Matlab2cpp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\27{\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\3\2\3\2\3\3\3\3\3\4\3\4\3\5\6"+
		"\5\65\n\5\r\5\16\5\66\3\6\6\6:\n\6\r\6\16\6;\3\7\3\7\3\b\3\b\3\t\3\t\3"+
		"\n\3\n\3\13\5\13G\n\13\3\13\6\13J\n\13\r\13\16\13K\3\f\3\f\7\fP\n\f\f"+
		"\f\16\fS\13\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\5\22d\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\2\2"+
		"\27\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27\3\2\7\4\2C\\c|\4\2\60\60\62;\5\2C\\"+
		"aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0080\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\3-\3\2\2\2\5/\3\2\2\2\7\61\3\2\2\2\t\64\3\2"+
		"\2\2\139\3\2\2\2\r=\3\2\2\2\17?\3\2\2\2\21A\3\2\2\2\23C\3\2\2\2\25F\3"+
		"\2\2\2\27M\3\2\2\2\31T\3\2\2\2\33V\3\2\2\2\35X\3\2\2\2\37Z\3\2\2\2!]\3"+
		"\2\2\2#c\3\2\2\2%e\3\2\2\2\'i\3\2\2\2)p\3\2\2\2+v\3\2\2\2-.\7=\2\2.\4"+
		"\3\2\2\2/\60\7<\2\2\60\6\3\2\2\2\61\62\7.\2\2\62\b\3\2\2\2\63\65\7\f\2"+
		"\2\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\67\n\3\2\2"+
		"\28:\t\2\2\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\f\3\2\2\2=>\7*\2"+
		"\2>\16\3\2\2\2?@\7+\2\2@\20\3\2\2\2AB\7]\2\2B\22\3\2\2\2CD\7_\2\2D\24"+
		"\3\2\2\2EG\7/\2\2FE\3\2\2\2FG\3\2\2\2GI\3\2\2\2HJ\t\3\2\2IH\3\2\2\2JK"+
		"\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\26\3\2\2\2MQ\t\4\2\2NP\t\5\2\2ON\3\2\2\2"+
		"PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2R\30\3\2\2\2SQ\3\2\2\2TU\7?\2\2U\32\3\2"+
		"\2\2VW\7-\2\2W\34\3\2\2\2XY\7/\2\2Y\36\3\2\2\2Z[\7\60\2\2[\\\7,\2\2\\"+
		" \3\2\2\2]^\7\60\2\2^_\7\61\2\2_\"\3\2\2\2`d\7)\2\2ab\7\60\2\2bd\7)\2"+
		"\2c`\3\2\2\2ca\3\2\2\2d$\3\2\2\2ef\t\6\2\2fg\3\2\2\2gh\b\23\2\2h&\3\2"+
		"\2\2ij\7|\2\2jk\7g\2\2kl\7t\2\2lm\7q\2\2mn\7u\2\2no\7*\2\2o(\3\2\2\2p"+
		"q\7q\2\2qr\7p\2\2rs\7g\2\2st\7u\2\2tu\7*\2\2u*\3\2\2\2vw\7g\2\2wx\7{\2"+
		"\2xy\7g\2\2yz\7*\2\2z,\3\2\2\2\t\2\66;FKQc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}