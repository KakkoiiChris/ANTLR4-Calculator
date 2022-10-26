// Generated from C:/Users/chris/Documents/IntelliJ Projects/Interpreters/ANTLR4-Calculator/res\Calculator.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		IDENTIFIER=10, NUMBER=11, NEWLINE=12, WHITESPACE=13, COMMENT=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"IDENTIFIER", "NUMBER", "NEWLINE", "WHITESPACE", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'^'", "'*'", "'/'", "'%'", "'+'", "'-'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, "IDENTIFIER", 
			"NUMBER", "NEWLINE", "WHITESPACE", "COMMENT"
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


	public CalculatorLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

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
		"\u0004\u0000\u000eb\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0005\t2\b\t\n\t\f"+
		"\t5\t\t\u0001\n\u0004\n8\b\n\u000b\n\f\n9\u0001\n\u0001\n\u0004\n>\b\n"+
		"\u000b\n\f\n?\u0003\nB\b\n\u0001\n\u0001\n\u0004\nF\b\n\u000b\n\f\nG\u0003"+
		"\nJ\b\n\u0001\u000b\u0003\u000bM\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0004\fR\b\f\u000b\f\f\fS\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\\\b\r\n\r\f\r_\t\r\u0001\r\u0001\r\u0000\u0000\u000e\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u0001"+
		"\u0000\u0006\u0002\u0000AZaz\u0004\u000009AZ__az\u0001\u000009\u0002\u0000"+
		"EEee\u0002\u0000\t\t  \u0002\u0000\n\n\r\rj\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000\u0000\u0000\u0003"+
		"\u001f\u0001\u0000\u0000\u0000\u0005!\u0001\u0000\u0000\u0000\u0007#\u0001"+
		"\u0000\u0000\u0000\t%\u0001\u0000\u0000\u0000\u000b\'\u0001\u0000\u0000"+
		"\u0000\r)\u0001\u0000\u0000\u0000\u000f+\u0001\u0000\u0000\u0000\u0011"+
		"-\u0001\u0000\u0000\u0000\u0013/\u0001\u0000\u0000\u0000\u00157\u0001"+
		"\u0000\u0000\u0000\u0017L\u0001\u0000\u0000\u0000\u0019Q\u0001\u0000\u0000"+
		"\u0000\u001bW\u0001\u0000\u0000\u0000\u001d\u001e\u0005=\u0000\u0000\u001e"+
		"\u0002\u0001\u0000\u0000\u0000\u001f \u0005^\u0000\u0000 \u0004\u0001"+
		"\u0000\u0000\u0000!\"\u0005*\u0000\u0000\"\u0006\u0001\u0000\u0000\u0000"+
		"#$\u0005/\u0000\u0000$\b\u0001\u0000\u0000\u0000%&\u0005%\u0000\u0000"+
		"&\n\u0001\u0000\u0000\u0000\'(\u0005+\u0000\u0000(\f\u0001\u0000\u0000"+
		"\u0000)*\u0005-\u0000\u0000*\u000e\u0001\u0000\u0000\u0000+,\u0005(\u0000"+
		"\u0000,\u0010\u0001\u0000\u0000\u0000-.\u0005)\u0000\u0000.\u0012\u0001"+
		"\u0000\u0000\u0000/3\u0007\u0000\u0000\u000002\u0007\u0001\u0000\u0000"+
		"10\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u00004\u0014\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000068\u0007\u0002\u0000\u000076\u0001\u0000\u0000\u0000"+
		"89\u0001\u0000\u0000\u000097\u0001\u0000\u0000\u00009:\u0001\u0000\u0000"+
		"\u0000:A\u0001\u0000\u0000\u0000;=\u0005.\u0000\u0000<>\u0007\u0002\u0000"+
		"\u0000=<\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0001\u0000\u0000\u0000A;\u0001"+
		"\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BI\u0001\u0000\u0000\u0000"+
		"CE\u0007\u0003\u0000\u0000DF\u0007\u0002\u0000\u0000ED\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000HJ\u0001\u0000\u0000\u0000IC\u0001\u0000\u0000\u0000IJ\u0001"+
		"\u0000\u0000\u0000J\u0016\u0001\u0000\u0000\u0000KM\u0005\r\u0000\u0000"+
		"LK\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MN\u0001\u0000\u0000"+
		"\u0000NO\u0005\n\u0000\u0000O\u0018\u0001\u0000\u0000\u0000PR\u0007\u0004"+
		"\u0000\u0000QP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"UV\u0006\f\u0000\u0000V\u001a\u0001\u0000\u0000\u0000WX\u0005/\u0000\u0000"+
		"XY\u0005/\u0000\u0000Y]\u0001\u0000\u0000\u0000Z\\\b\u0005\u0000\u0000"+
		"[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000`a\u0006\r\u0000\u0000a\u001c\u0001\u0000\u0000\u0000\n\u0000"+
		"39?AGILS]\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}