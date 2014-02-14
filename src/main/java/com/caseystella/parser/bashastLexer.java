// $ANTLR 3.5.1 com/caseystella/parser/bashast.g 2014-02-13 21:24:41

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class bashastLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__137=137;
	public static final int T__138=138;
	public static final int ALPHANUM=4;
	public static final int AMP=5;
	public static final int ARG=6;
	public static final int ARITHMETIC_CONDITION=7;
	public static final int ARITH_ASSIGN=8;
	public static final int ARRAY=9;
	public static final int AT=10;
	public static final int BANG=11;
	public static final int BLANK=12;
	public static final int BOP=13;
	public static final int BRACE=14;
	public static final int BRACE_EXP=15;
	public static final int BUILTIN_TEST=16;
	public static final int CARET=17;
	public static final int CASE=18;
	public static final int CASE_PATTERN=19;
	public static final int CHARACTER_CLASS=20;
	public static final int COLLATING_SYMBOL=21;
	public static final int COLON=22;
	public static final int COMMA=23;
	public static final int COMMAND=24;
	public static final int COMMAND_SUB=25;
	public static final int COMMENT=26;
	public static final int COMPOUND_ARITH=27;
	public static final int COMPOUND_COND=28;
	public static final int CONTINUE_LINE=29;
	public static final int CURRSHELL=30;
	public static final int DEC=31;
	public static final int DIGIT=32;
	public static final int DO=33;
	public static final int DOLLAR=34;
	public static final int DONE=35;
	public static final int DOT=36;
	public static final int DOTDOT=37;
	public static final int DOUBLE_QUOTED_STRING=38;
	public static final int DOUBLE_SEMIC=39;
	public static final int ELIF=40;
	public static final int ELSE=41;
	public static final int EOL=42;
	public static final int EQUALS=43;
	public static final int EQUIVALENCE_CLASS=44;
	public static final int ESAC=45;
	public static final int ESC_CHAR=46;
	public static final int ESC_GT=47;
	public static final int ESC_LPAREN=48;
	public static final int ESC_LT=49;
	public static final int ESC_RPAREN=50;
	public static final int EXP=51;
	public static final int EXPORT=52;
	public static final int FI=53;
	public static final int FILE_DESCRIPTOR=54;
	public static final int FILE_DESCRIPTOR_MOVE=55;
	public static final int FNAME=56;
	public static final int FOR=57;
	public static final int FOR_COND=58;
	public static final int FOR_INIT=59;
	public static final int FOR_MOD=60;
	public static final int FUNCTION=61;
	public static final int GEQ=62;
	public static final int GT=63;
	public static final int HERE_STRING_OP=64;
	public static final int IF=65;
	public static final int IN=66;
	public static final int INC=67;
	public static final int KEYWORD_TEST=68;
	public static final int LBRACE=69;
	public static final int LEQ=70;
	public static final int LET=71;
	public static final int LETTER=72;
	public static final int LIST=73;
	public static final int LIST_EXPAND=74;
	public static final int LLPAREN=75;
	public static final int LOGICAND=76;
	public static final int LOGICOR=77;
	public static final int LPAREN=78;
	public static final int LSHIFT=79;
	public static final int LSQUARE=80;
	public static final int LT=81;
	public static final int MATCH_ANY=82;
	public static final int MATCH_ANY_EXCEPT=83;
	public static final int MATCH_AT_LEAST_ONE=84;
	public static final int MATCH_AT_MOST_ONE=85;
	public static final int MATCH_EXACTLY_ONE=86;
	public static final int MATCH_NONE=87;
	public static final int MATCH_PATTERN=88;
	public static final int MINUS=89;
	public static final int NAME=90;
	public static final int NEGATION=91;
	public static final int NQCHAR_NO_ALPHANUM=92;
	public static final int NQSTR=93;
	public static final int NUMBER=94;
	public static final int OFFSET=95;
	public static final int OP=96;
	public static final int PCT=97;
	public static final int PCTPCT=98;
	public static final int PIPE=99;
	public static final int PLUS=100;
	public static final int POST_DECR=101;
	public static final int POST_INCR=102;
	public static final int POUND=103;
	public static final int POUNDPOUND=104;
	public static final int PRE_DECR=105;
	public static final int PRE_INCR=106;
	public static final int PROC_SUB=107;
	public static final int QMARK=108;
	public static final int QUOTE=109;
	public static final int RBRACE=110;
	public static final int REDIR=111;
	public static final int REPLACE_ALL=112;
	public static final int REPLACE_FIRST=113;
	public static final int REPLACE_LAST=114;
	public static final int RPAREN=115;
	public static final int RRPAREN=116;
	public static final int RSHIFT=117;
	public static final int RSQUARE=118;
	public static final int SELECT=119;
	public static final int SEMIC=120;
	public static final int SINGLE_QUOTED_STRING=121;
	public static final int SLASH=122;
	public static final int SQUOTE=123;
	public static final int STRING=124;
	public static final int SUBSHELL=125;
	public static final int TEST=126;
	public static final int THEN=127;
	public static final int TICK=128;
	public static final int TILDE=129;
	public static final int TIME=130;
	public static final int TIMES=131;
	public static final int UNTIL=132;
	public static final int UOP=133;
	public static final int VAR_REF=134;
	public static final int WHILE=135;
	public static final int WORDOP=136;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public bashastLexer() {} 
	public bashastLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public bashastLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "com/caseystella/parser/bashast.g"; }

	// $ANTLR start "T__137"
	public final void mT__137() throws RecognitionException {
		try {
			int _type = T__137;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:7:8: ( '-p' )
			// com/caseystella/parser/bashast.g:7:10: '-p'
			{
			match("-p"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__137"

	// $ANTLR start "T__138"
	public final void mT__138() throws RecognitionException {
		try {
			int _type = T__138;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:8:8: ( '_' )
			// com/caseystella/parser/bashast.g:8:10: '_'
			{
			match('_'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__138"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:509:5: ( ( BLANK | EOL ) '#' (~ ( '\\n' | '\\r' ) )* )
			// com/caseystella/parser/bashast.g:509:8: ( BLANK | EOL ) '#' (~ ( '\\n' | '\\r' ) )*
			{
			// com/caseystella/parser/bashast.g:509:8: ( BLANK | EOL )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='\t'||LA1_0==' ') ) {
				alt1=1;
			}
			else if ( (LA1_0=='\n'||LA1_0=='\r') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// com/caseystella/parser/bashast.g:509:9: BLANK
					{
					mBLANK(); 

					}
					break;
				case 2 :
					// com/caseystella/parser/bashast.g:509:15: EOL
					{
					mEOL(); 

					}
					break;

			}

			match('#'); 
			// com/caseystella/parser/bashast.g:509:24: (~ ( '\\n' | '\\r' ) )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// com/caseystella/parser/bashast.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "BANG"
	public final void mBANG() throws RecognitionException {
		try {
			int _type = BANG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:512:6: ( '!' )
			// com/caseystella/parser/bashast.g:512:8: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BANG"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:513:6: ( 'case' )
			// com/caseystella/parser/bashast.g:513:8: 'case'
			{
			match("case"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:514:4: ( 'do' )
			// com/caseystella/parser/bashast.g:514:6: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "DONE"
	public final void mDONE() throws RecognitionException {
		try {
			int _type = DONE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:515:6: ( 'done' )
			// com/caseystella/parser/bashast.g:515:8: 'done'
			{
			match("done"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DONE"

	// $ANTLR start "ELIF"
	public final void mELIF() throws RecognitionException {
		try {
			int _type = ELIF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:516:6: ( 'elif' )
			// com/caseystella/parser/bashast.g:516:8: 'elif'
			{
			match("elif"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELIF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:517:6: ( 'else' )
			// com/caseystella/parser/bashast.g:517:8: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "ESAC"
	public final void mESAC() throws RecognitionException {
		try {
			int _type = ESAC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:518:6: ( 'esac' )
			// com/caseystella/parser/bashast.g:518:8: 'esac'
			{
			match("esac"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESAC"

	// $ANTLR start "FI"
	public final void mFI() throws RecognitionException {
		try {
			int _type = FI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:519:4: ( 'fi' )
			// com/caseystella/parser/bashast.g:519:6: 'fi'
			{
			match("fi"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FI"

	// $ANTLR start "FOR"
	public final void mFOR() throws RecognitionException {
		try {
			int _type = FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:520:5: ( 'for' )
			// com/caseystella/parser/bashast.g:520:7: 'for'
			{
			match("for"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FOR"

	// $ANTLR start "FUNCTION"
	public final void mFUNCTION() throws RecognitionException {
		try {
			int _type = FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:521:9: ( 'function' )
			// com/caseystella/parser/bashast.g:521:11: 'function'
			{
			match("function"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUNCTION"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:522:4: ( 'if' )
			// com/caseystella/parser/bashast.g:522:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:523:4: ( 'in' )
			// com/caseystella/parser/bashast.g:523:6: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:524:8: ( 'select' )
			// com/caseystella/parser/bashast.g:524:10: 'select'
			{
			match("select"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:525:6: ( 'then' )
			// com/caseystella/parser/bashast.g:525:8: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "UNTIL"
	public final void mUNTIL() throws RecognitionException {
		try {
			int _type = UNTIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:526:7: ( 'until' )
			// com/caseystella/parser/bashast.g:526:9: 'until'
			{
			match("until"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNTIL"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:527:7: ( 'while' )
			// com/caseystella/parser/bashast.g:527:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "LBRACE"
	public final void mLBRACE() throws RecognitionException {
		try {
			int _type = LBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:528:8: ( '{' )
			// com/caseystella/parser/bashast.g:528:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACE"

	// $ANTLR start "RBRACE"
	public final void mRBRACE() throws RecognitionException {
		try {
			int _type = RBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:529:8: ( '}' )
			// com/caseystella/parser/bashast.g:529:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACE"

	// $ANTLR start "TIME"
	public final void mTIME() throws RecognitionException {
		try {
			int _type = TIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:530:6: ( 'time' )
			// com/caseystella/parser/bashast.g:530:8: 'time'
			{
			match("time"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIME"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:533:8: ( ')' )
			// com/caseystella/parser/bashast.g:533:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:534:8: ( '(' )
			// com/caseystella/parser/bashast.g:534:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "LLPAREN"
	public final void mLLPAREN() throws RecognitionException {
		try {
			int _type = LLPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:535:9: ( '((' )
			// com/caseystella/parser/bashast.g:535:11: '(('
			{
			match("(("); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LLPAREN"

	// $ANTLR start "RRPAREN"
	public final void mRRPAREN() throws RecognitionException {
		try {
			int _type = RRPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:536:9: ( '))' )
			// com/caseystella/parser/bashast.g:536:11: '))'
			{
			match("))"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RRPAREN"

	// $ANTLR start "LSQUARE"
	public final void mLSQUARE() throws RecognitionException {
		try {
			int _type = LSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:537:9: ( '[' )
			// com/caseystella/parser/bashast.g:537:11: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSQUARE"

	// $ANTLR start "RSQUARE"
	public final void mRSQUARE() throws RecognitionException {
		try {
			int _type = RSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:538:9: ( ']' )
			// com/caseystella/parser/bashast.g:538:11: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSQUARE"

	// $ANTLR start "TICK"
	public final void mTICK() throws RecognitionException {
		try {
			int _type = TICK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:539:6: ( '`' )
			// com/caseystella/parser/bashast.g:539:8: '`'
			{
			match('`'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TICK"

	// $ANTLR start "DOLLAR"
	public final void mDOLLAR() throws RecognitionException {
		try {
			int _type = DOLLAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:540:8: ( '$' )
			// com/caseystella/parser/bashast.g:540:10: '$'
			{
			match('$'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOLLAR"

	// $ANTLR start "AT"
	public final void mAT() throws RecognitionException {
		try {
			int _type = AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:541:4: ( '@' )
			// com/caseystella/parser/bashast.g:541:6: '@'
			{
			match('@'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AT"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:542:5: ( '.' )
			// com/caseystella/parser/bashast.g:542:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "DOTDOT"
	public final void mDOTDOT() throws RecognitionException {
		try {
			int _type = DOTDOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:543:8: ( '..' )
			// com/caseystella/parser/bashast.g:543:10: '..'
			{
			match(".."); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOTDOT"

	// $ANTLR start "LET"
	public final void mLET() throws RecognitionException {
		try {
			int _type = LET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:545:5: ( 'let' )
			// com/caseystella/parser/bashast.g:545:7: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LET"

	// $ANTLR start "TIMES"
	public final void mTIMES() throws RecognitionException {
		try {
			int _type = TIMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:546:7: ( '*' )
			// com/caseystella/parser/bashast.g:546:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMES"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:547:8: ( '=' )
			// com/caseystella/parser/bashast.g:547:10: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUALS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:548:7: ( '-' )
			// com/caseystella/parser/bashast.g:548:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:549:6: ( '+' )
			// com/caseystella/parser/bashast.g:549:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "INC"
	public final void mINC() throws RecognitionException {
		try {
			int _type = INC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:550:5: ( '++' )
			// com/caseystella/parser/bashast.g:550:7: '++'
			{
			match("++"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INC"

	// $ANTLR start "DEC"
	public final void mDEC() throws RecognitionException {
		try {
			int _type = DEC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:551:5: ( '--' )
			// com/caseystella/parser/bashast.g:551:7: '--'
			{
			match("--"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DEC"

	// $ANTLR start "EXP"
	public final void mEXP() throws RecognitionException {
		try {
			int _type = EXP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:552:5: ( '**' )
			// com/caseystella/parser/bashast.g:552:7: '**'
			{
			match("**"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXP"

	// $ANTLR start "AMP"
	public final void mAMP() throws RecognitionException {
		try {
			int _type = AMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:553:5: ( '&' )
			// com/caseystella/parser/bashast.g:553:7: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AMP"

	// $ANTLR start "LEQ"
	public final void mLEQ() throws RecognitionException {
		try {
			int _type = LEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:554:5: ( '<=' )
			// com/caseystella/parser/bashast.g:554:7: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEQ"

	// $ANTLR start "GEQ"
	public final void mGEQ() throws RecognitionException {
		try {
			int _type = GEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:555:5: ( '>=' )
			// com/caseystella/parser/bashast.g:555:7: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GEQ"

	// $ANTLR start "CARET"
	public final void mCARET() throws RecognitionException {
		try {
			int _type = CARET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:556:7: ( '^' )
			// com/caseystella/parser/bashast.g:556:9: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CARET"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:557:4: ( '<' )
			// com/caseystella/parser/bashast.g:557:6: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:558:4: ( '>' )
			// com/caseystella/parser/bashast.g:558:6: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "LSHIFT"
	public final void mLSHIFT() throws RecognitionException {
		try {
			int _type = LSHIFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:559:8: ( '<<' )
			// com/caseystella/parser/bashast.g:559:10: '<<'
			{
			match("<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSHIFT"

	// $ANTLR start "RSHIFT"
	public final void mRSHIFT() throws RecognitionException {
		try {
			int _type = RSHIFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:560:8: ( '>>' )
			// com/caseystella/parser/bashast.g:560:10: '>>'
			{
			match(">>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSHIFT"

	// $ANTLR start "ARITH_ASSIGN"
	public final void mARITH_ASSIGN() throws RecognitionException {
		try {
			int _type = ARITH_ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:562:2: ( ( TIMES | SLASH | PCT | PLUS | MINUS | LSHIFT | RSHIFT | AMP | CARET | PIPE ) EQUALS )
			// com/caseystella/parser/bashast.g:562:4: ( TIMES | SLASH | PCT | PLUS | MINUS | LSHIFT | RSHIFT | AMP | CARET | PIPE ) EQUALS
			{
			// com/caseystella/parser/bashast.g:562:4: ( TIMES | SLASH | PCT | PLUS | MINUS | LSHIFT | RSHIFT | AMP | CARET | PIPE )
			int alt3=10;
			switch ( input.LA(1) ) {
			case '*':
				{
				alt3=1;
				}
				break;
			case '/':
				{
				alt3=2;
				}
				break;
			case '%':
				{
				alt3=3;
				}
				break;
			case '+':
				{
				alt3=4;
				}
				break;
			case '-':
				{
				alt3=5;
				}
				break;
			case '<':
				{
				alt3=6;
				}
				break;
			case '>':
				{
				alt3=7;
				}
				break;
			case '&':
				{
				alt3=8;
				}
				break;
			case '^':
				{
				alt3=9;
				}
				break;
			case '|':
				{
				alt3=10;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// com/caseystella/parser/bashast.g:562:5: TIMES
					{
					mTIMES(); 

					}
					break;
				case 2 :
					// com/caseystella/parser/bashast.g:562:11: SLASH
					{
					mSLASH(); 

					}
					break;
				case 3 :
					// com/caseystella/parser/bashast.g:562:17: PCT
					{
					mPCT(); 

					}
					break;
				case 4 :
					// com/caseystella/parser/bashast.g:562:21: PLUS
					{
					mPLUS(); 

					}
					break;
				case 5 :
					// com/caseystella/parser/bashast.g:562:26: MINUS
					{
					mMINUS(); 

					}
					break;
				case 6 :
					// com/caseystella/parser/bashast.g:562:32: LSHIFT
					{
					mLSHIFT(); 

					}
					break;
				case 7 :
					// com/caseystella/parser/bashast.g:562:39: RSHIFT
					{
					mRSHIFT(); 

					}
					break;
				case 8 :
					// com/caseystella/parser/bashast.g:562:46: AMP
					{
					mAMP(); 

					}
					break;
				case 9 :
					// com/caseystella/parser/bashast.g:562:50: CARET
					{
					mCARET(); 

					}
					break;
				case 10 :
					// com/caseystella/parser/bashast.g:562:56: PIPE
					{
					mPIPE(); 

					}
					break;

			}

			mEQUALS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARITH_ASSIGN"

	// $ANTLR start "SEMIC"
	public final void mSEMIC() throws RecognitionException {
		try {
			int _type = SEMIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:564:7: ( ';' )
			// com/caseystella/parser/bashast.g:564:9: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMIC"

	// $ANTLR start "DOUBLE_SEMIC"
	public final void mDOUBLE_SEMIC() throws RecognitionException {
		try {
			int _type = DOUBLE_SEMIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:566:2: ( ';;' )
			// com/caseystella/parser/bashast.g:566:4: ';;'
			{
			match(";;"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_SEMIC"

	// $ANTLR start "PIPE"
	public final void mPIPE() throws RecognitionException {
		try {
			int _type = PIPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:567:6: ( '|' )
			// com/caseystella/parser/bashast.g:567:8: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PIPE"

	// $ANTLR start "QUOTE"
	public final void mQUOTE() throws RecognitionException {
		try {
			int _type = QUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:568:7: ( '\"' )
			// com/caseystella/parser/bashast.g:568:9: '\"'
			{
			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUOTE"

	// $ANTLR start "SQUOTE"
	public final void mSQUOTE() throws RecognitionException {
		try {
			int _type = SQUOTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:569:8: ( '\\'' )
			// com/caseystella/parser/bashast.g:569:10: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SQUOTE"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:570:7: ( ',' )
			// com/caseystella/parser/bashast.g:570:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "BLANK"
	public final void mBLANK() throws RecognitionException {
		try {
			int _type = BLANK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:572:7: ( ( ' ' | '\\t' )+ )
			// com/caseystella/parser/bashast.g:572:9: ( ' ' | '\\t' )+
			{
			// com/caseystella/parser/bashast.g:572:9: ( ' ' | '\\t' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0=='\t'||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// com/caseystella/parser/bashast.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BLANK"

	// $ANTLR start "EOL"
	public final void mEOL() throws RecognitionException {
		try {
			int _type = EOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:573:5: ( ( ( '\\r' )? '\\n' )+ )
			// com/caseystella/parser/bashast.g:573:7: ( ( '\\r' )? '\\n' )+
			{
			// com/caseystella/parser/bashast.g:573:7: ( ( '\\r' )? '\\n' )+
			int cnt6=0;
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( (LA6_0=='\n'||LA6_0=='\r') ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// com/caseystella/parser/bashast.g:573:8: ( '\\r' )? '\\n'
					{
					// com/caseystella/parser/bashast.g:573:8: ( '\\r' )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0=='\r') ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// com/caseystella/parser/bashast.g:573:8: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					}
					break;

				default :
					if ( cnt6 >= 1 ) break loop6;
					EarlyExitException eee = new EarlyExitException(6, input);
					throw eee;
				}
				cnt6++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EOL"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			int _type = DIGIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:575:7: ( '0' .. '9' )
			// com/caseystella/parser/bashast.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:576:8: ( DIGIT ( DIGIT )+ )
			// com/caseystella/parser/bashast.g:576:10: DIGIT ( DIGIT )+
			{
			mDIGIT(); 

			// com/caseystella/parser/bashast.g:576:16: ( DIGIT )+
			int cnt7=0;
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// com/caseystella/parser/bashast.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt7 >= 1 ) break loop7;
					EarlyExitException eee = new EarlyExitException(7, input);
					throw eee;
				}
				cnt7++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUMBER"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			int _type = LETTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:577:8: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
			// com/caseystella/parser/bashast.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "ALPHANUM"
	public final void mALPHANUM() throws RecognitionException {
		try {
			// com/caseystella/parser/bashast.g:580:9: ( ( DIGIT | LETTER ) )
			// com/caseystella/parser/bashast.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALPHANUM"

	// $ANTLR start "TILDE"
	public final void mTILDE() throws RecognitionException {
		try {
			int _type = TILDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:581:7: ( '~' )
			// com/caseystella/parser/bashast.g:581:9: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TILDE"

	// $ANTLR start "HERE_STRING_OP"
	public final void mHERE_STRING_OP() throws RecognitionException {
		try {
			int _type = HERE_STRING_OP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:583:2: ( '<<<' )
			// com/caseystella/parser/bashast.g:583:4: '<<<'
			{
			match("<<<"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HERE_STRING_OP"

	// $ANTLR start "POUND"
	public final void mPOUND() throws RecognitionException {
		try {
			int _type = POUND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:585:7: ( '#' )
			// com/caseystella/parser/bashast.g:585:9: '#'
			{
			match('#'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POUND"

	// $ANTLR start "POUNDPOUND"
	public final void mPOUNDPOUND() throws RecognitionException {
		try {
			int _type = POUNDPOUND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:587:2: ( '##' )
			// com/caseystella/parser/bashast.g:587:4: '##'
			{
			match("##"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "POUNDPOUND"

	// $ANTLR start "PCT"
	public final void mPCT() throws RecognitionException {
		try {
			int _type = PCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:588:5: ( '%' )
			// com/caseystella/parser/bashast.g:588:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PCT"

	// $ANTLR start "PCTPCT"
	public final void mPCTPCT() throws RecognitionException {
		try {
			int _type = PCTPCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:589:8: ( '%%' )
			// com/caseystella/parser/bashast.g:589:10: '%%'
			{
			match("%%"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PCTPCT"

	// $ANTLR start "SLASH"
	public final void mSLASH() throws RecognitionException {
		try {
			int _type = SLASH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:590:7: ( '/' )
			// com/caseystella/parser/bashast.g:590:9: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SLASH"

	// $ANTLR start "WORDOP"
	public final void mWORDOP() throws RecognitionException {
		try {
			int _type = WORDOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:591:8: ( ( ':-' | ':=' | ':?' | ':+' ) )
			// com/caseystella/parser/bashast.g:591:10: ( ':-' | ':=' | ':?' | ':+' )
			{
			// com/caseystella/parser/bashast.g:591:10: ( ':-' | ':=' | ':?' | ':+' )
			int alt8=4;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==':') ) {
				switch ( input.LA(2) ) {
				case '-':
					{
					alt8=1;
					}
					break;
				case '=':
					{
					alt8=2;
					}
					break;
				case '?':
					{
					alt8=3;
					}
					break;
				case '+':
					{
					alt8=4;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// com/caseystella/parser/bashast.g:591:11: ':-'
					{
					match(":-"); 

					}
					break;
				case 2 :
					// com/caseystella/parser/bashast.g:591:16: ':='
					{
					match(":="); 

					}
					break;
				case 3 :
					// com/caseystella/parser/bashast.g:591:21: ':?'
					{
					match(":?"); 

					}
					break;
				case 4 :
					// com/caseystella/parser/bashast.g:591:26: ':+'
					{
					match(":+"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WORDOP"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:592:7: ( ':' )
			// com/caseystella/parser/bashast.g:592:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "QMARK"
	public final void mQMARK() throws RecognitionException {
		try {
			int _type = QMARK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:593:7: ( '?' )
			// com/caseystella/parser/bashast.g:593:9: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QMARK"

	// $ANTLR start "TEST"
	public final void mTEST() throws RecognitionException {
		try {
			int _type = TEST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:595:6: ( 'test' )
			// com/caseystella/parser/bashast.g:595:8: 'test'
			{
			match("test"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TEST"

	// $ANTLR start "LOGICAND"
	public final void mLOGICAND() throws RecognitionException {
		try {
			int _type = LOGICAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:597:2: ( '&&' )
			// com/caseystella/parser/bashast.g:597:4: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOGICAND"

	// $ANTLR start "LOGICOR"
	public final void mLOGICOR() throws RecognitionException {
		try {
			int _type = LOGICOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:598:9: ( '||' )
			// com/caseystella/parser/bashast.g:598:11: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LOGICOR"

	// $ANTLR start "BOP"
	public final void mBOP() throws RecognitionException {
		try {
			int _type = BOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:599:5: ( MINUS LETTER LETTER )
			// com/caseystella/parser/bashast.g:599:7: MINUS LETTER LETTER
			{
			mMINUS(); 

			mLETTER(); 

			mLETTER(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOP"

	// $ANTLR start "UOP"
	public final void mUOP() throws RecognitionException {
		try {
			int _type = UOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:600:5: ( MINUS LETTER )
			// com/caseystella/parser/bashast.g:600:7: MINUS LETTER
			{
			mMINUS(); 

			mLETTER(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UOP"

	// $ANTLR start "EXPORT"
	public final void mEXPORT() throws RecognitionException {
		try {
			int _type = EXPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:602:8: ( 'export' )
			// com/caseystella/parser/bashast.g:602:10: 'export'
			{
			match("export"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXPORT"

	// $ANTLR start "CONTINUE_LINE"
	public final void mCONTINUE_LINE() throws RecognitionException {
		try {
			int _type = CONTINUE_LINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:605:2: ( ( '\\\\' EOL )+ )
			// com/caseystella/parser/bashast.g:605:4: ( '\\\\' EOL )+
			{
			// com/caseystella/parser/bashast.g:605:4: ( '\\\\' EOL )+
			int cnt9=0;
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0=='\\') ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// com/caseystella/parser/bashast.g:605:5: '\\\\' EOL
					{
					match('\\'); 
					mEOL(); 

					}
					break;

				default :
					if ( cnt9 >= 1 ) break loop9;
					EarlyExitException eee = new EarlyExitException(9, input);
					throw eee;
				}
				cnt9++;
			}

			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTINUE_LINE"

	// $ANTLR start "ESC_RPAREN"
	public final void mESC_RPAREN() throws RecognitionException {
		try {
			int _type = ESC_RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:607:2: ( '\\\\' RPAREN )
			// com/caseystella/parser/bashast.g:607:4: '\\\\' RPAREN
			{
			match('\\'); 
			mRPAREN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_RPAREN"

	// $ANTLR start "ESC_LPAREN"
	public final void mESC_LPAREN() throws RecognitionException {
		try {
			int _type = ESC_LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:609:2: ( '\\\\' LPAREN )
			// com/caseystella/parser/bashast.g:609:4: '\\\\' LPAREN
			{
			match('\\'); 
			mLPAREN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_LPAREN"

	// $ANTLR start "ESC_LT"
	public final void mESC_LT() throws RecognitionException {
		try {
			int _type = ESC_LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:610:8: ( '\\\\' '<' )
			// com/caseystella/parser/bashast.g:610:10: '\\\\' '<'
			{
			match('\\'); 
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_LT"

	// $ANTLR start "ESC_GT"
	public final void mESC_GT() throws RecognitionException {
		try {
			int _type = ESC_GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:611:8: ( '\\\\' '>' )
			// com/caseystella/parser/bashast.g:611:10: '\\\\' '>'
			{
			match('\\'); 
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_GT"

	// $ANTLR start "ESC_CHAR"
	public final void mESC_CHAR() throws RecognitionException {
		try {
			int _type = ESC_CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:613:9: ( '\\\\' ( ( '0' .. '7' ) ( '0' .. '7' ) ( '0' .. '7' )? | 'x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )? | 'c' . | . ) )
			// com/caseystella/parser/bashast.g:613:11: '\\\\' ( ( '0' .. '7' ) ( '0' .. '7' ) ( '0' .. '7' )? | 'x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )? | 'c' . | . )
			{
			match('\\'); 
			// com/caseystella/parser/bashast.g:613:16: ( ( '0' .. '7' ) ( '0' .. '7' ) ( '0' .. '7' )? | 'x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )? | 'c' . | . )
			int alt12=4;
			int LA12_0 = input.LA(1);
			if ( ((LA12_0 >= '0' && LA12_0 <= '7')) ) {
				int LA12_1 = input.LA(2);
				if ( ((LA12_1 >= '0' && LA12_1 <= '7')) ) {
					alt12=1;
				}

				else {
					alt12=4;
				}

			}
			else if ( (LA12_0=='x') ) {
				int LA12_2 = input.LA(2);
				if ( ((LA12_2 >= '0' && LA12_2 <= '9')||(LA12_2 >= 'A' && LA12_2 <= 'F')||(LA12_2 >= 'a' && LA12_2 <= 'f')) ) {
					alt12=2;
				}

				else {
					alt12=4;
				}

			}
			else if ( (LA12_0=='c') ) {
				int LA12_3 = input.LA(2);
				if ( ((LA12_3 >= '\u0000' && LA12_3 <= '\uFFFF')) ) {
					alt12=3;
				}

				else {
					alt12=4;
				}

			}
			else if ( ((LA12_0 >= '\u0000' && LA12_0 <= '/')||(LA12_0 >= '8' && LA12_0 <= 'b')||(LA12_0 >= 'd' && LA12_0 <= 'w')||(LA12_0 >= 'y' && LA12_0 <= '\uFFFF')) ) {
				alt12=4;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// com/caseystella/parser/bashast.g:613:17: ( '0' .. '7' ) ( '0' .. '7' ) ( '0' .. '7' )?
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// com/caseystella/parser/bashast.g:613:37: ( '0' .. '7' )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( ((LA10_0 >= '0' && LA10_0 <= '7')) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// com/caseystella/parser/bashast.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 2 :
					// com/caseystella/parser/bashast.g:613:49: 'x' ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )?
					{
					match('x'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// com/caseystella/parser/bashast.g:613:80: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( ((LA11_0 >= '0' && LA11_0 <= '9')||(LA11_0 >= 'A' && LA11_0 <= 'F')||(LA11_0 >= 'a' && LA11_0 <= 'f')) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// com/caseystella/parser/bashast.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

					}

					}
					break;
				case 3 :
					// com/caseystella/parser/bashast.g:613:110: 'c' .
					{
					match('c'); 
					matchAny(); 
					}
					break;
				case 4 :
					// com/caseystella/parser/bashast.g:613:115: .
					{
					matchAny(); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_CHAR"

	// $ANTLR start "NAME"
	public final void mNAME() throws RecognitionException {
		try {
			int _type = NAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:614:6: ( ( LETTER | '_' ) ( ALPHANUM | '_' )+ )
			// com/caseystella/parser/bashast.g:614:8: ( LETTER | '_' ) ( ALPHANUM | '_' )+
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// com/caseystella/parser/bashast.g:614:20: ( ALPHANUM | '_' )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( ((LA13_0 >= '0' && LA13_0 <= '9')||(LA13_0 >= 'A' && LA13_0 <= 'Z')||LA13_0=='_'||(LA13_0 >= 'a' && LA13_0 <= 'z')) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// com/caseystella/parser/bashast.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NAME"

	// $ANTLR start "NQCHAR_NO_ALPHANUM"
	public final void mNQCHAR_NO_ALPHANUM() throws RecognitionException {
		try {
			int _type = NQCHAR_NO_ALPHANUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:616:2: ( (~ ( '\\n' | '\\r' | ' ' | '\\t' | '\\\\' | CARET | QMARK | COLON | AT | SEMIC | POUND | SLASH | BANG | TIMES | COMMA | PIPE | AMP | MINUS | PLUS | PCT | EQUALS | LSQUARE | RSQUARE | RPAREN | LPAREN | RBRACE | LBRACE | DOLLAR | TICK | DOT | LT | GT | SQUOTE | QUOTE | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )+ )
			// com/caseystella/parser/bashast.g:616:4: (~ ( '\\n' | '\\r' | ' ' | '\\t' | '\\\\' | CARET | QMARK | COLON | AT | SEMIC | POUND | SLASH | BANG | TIMES | COMMA | PIPE | AMP | MINUS | PLUS | PCT | EQUALS | LSQUARE | RSQUARE | RPAREN | LPAREN | RBRACE | LBRACE | DOLLAR | TICK | DOT | LT | GT | SQUOTE | QUOTE | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )+
			{
			// com/caseystella/parser/bashast.g:616:4: (~ ( '\\n' | '\\r' | ' ' | '\\t' | '\\\\' | CARET | QMARK | COLON | AT | SEMIC | POUND | SLASH | BANG | TIMES | COMMA | PIPE | AMP | MINUS | PLUS | PCT | EQUALS | LSQUARE | RSQUARE | RPAREN | LPAREN | RBRACE | LBRACE | DOLLAR | TICK | DOT | LT | GT | SQUOTE | QUOTE | 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' ) )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '\u0000' && LA14_0 <= '\b')||(LA14_0 >= '\u000B' && LA14_0 <= '\f')||(LA14_0 >= '\u000E' && LA14_0 <= '\u001F')||LA14_0=='_'||(LA14_0 >= '~' && LA14_0 <= '\uFFFF')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// com/caseystella/parser/bashast.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\b')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\u001F')||input.LA(1)=='_'||(input.LA(1) >= '~' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NQCHAR_NO_ALPHANUM"

	// $ANTLR start "NQSTR"
	public final void mNQSTR() throws RecognitionException {
		try {
			int _type = NQSTR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// com/caseystella/parser/bashast.g:617:7: ( ( NQCHAR_NO_ALPHANUM | ALPHANUM )+ )
			// com/caseystella/parser/bashast.g:617:9: ( NQCHAR_NO_ALPHANUM | ALPHANUM )+
			{
			// com/caseystella/parser/bashast.g:617:9: ( NQCHAR_NO_ALPHANUM | ALPHANUM )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=3;
				int LA15_0 = input.LA(1);
				if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\b')||(LA15_0 >= '\u000B' && LA15_0 <= '\f')||(LA15_0 >= '\u000E' && LA15_0 <= '\u001F')||LA15_0=='_'||(LA15_0 >= '~' && LA15_0 <= '\uFFFF')) ) {
					alt15=1;
				}
				else if ( ((LA15_0 >= '0' && LA15_0 <= '9')||(LA15_0 >= 'A' && LA15_0 <= 'Z')||(LA15_0 >= 'a' && LA15_0 <= 'z')) ) {
					alt15=2;
				}

				switch (alt15) {
				case 1 :
					// com/caseystella/parser/bashast.g:617:10: NQCHAR_NO_ALPHANUM
					{
					mNQCHAR_NO_ALPHANUM(); 

					}
					break;
				case 2 :
					// com/caseystella/parser/bashast.g:617:29: ALPHANUM
					{
					mALPHANUM(); 

					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NQSTR"

	@Override
	public void mTokens() throws RecognitionException {
		// com/caseystella/parser/bashast.g:1:8: ( T__137 | T__138 | COMMENT | BANG | CASE | DO | DONE | ELIF | ELSE | ESAC | FI | FOR | FUNCTION | IF | IN | SELECT | THEN | UNTIL | WHILE | LBRACE | RBRACE | TIME | RPAREN | LPAREN | LLPAREN | RRPAREN | LSQUARE | RSQUARE | TICK | DOLLAR | AT | DOT | DOTDOT | LET | TIMES | EQUALS | MINUS | PLUS | INC | DEC | EXP | AMP | LEQ | GEQ | CARET | LT | GT | LSHIFT | RSHIFT | ARITH_ASSIGN | SEMIC | DOUBLE_SEMIC | PIPE | QUOTE | SQUOTE | COMMA | BLANK | EOL | DIGIT | NUMBER | LETTER | TILDE | HERE_STRING_OP | POUND | POUNDPOUND | PCT | PCTPCT | SLASH | WORDOP | COLON | QMARK | TEST | LOGICAND | LOGICOR | BOP | UOP | EXPORT | CONTINUE_LINE | ESC_RPAREN | ESC_LPAREN | ESC_LT | ESC_GT | ESC_CHAR | NAME | NQCHAR_NO_ALPHANUM | NQSTR )
		int alt16=86;
		alt16 = dfa16.predict(input);
		switch (alt16) {
			case 1 :
				// com/caseystella/parser/bashast.g:1:10: T__137
				{
				mT__137(); 

				}
				break;
			case 2 :
				// com/caseystella/parser/bashast.g:1:17: T__138
				{
				mT__138(); 

				}
				break;
			case 3 :
				// com/caseystella/parser/bashast.g:1:24: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 4 :
				// com/caseystella/parser/bashast.g:1:32: BANG
				{
				mBANG(); 

				}
				break;
			case 5 :
				// com/caseystella/parser/bashast.g:1:37: CASE
				{
				mCASE(); 

				}
				break;
			case 6 :
				// com/caseystella/parser/bashast.g:1:42: DO
				{
				mDO(); 

				}
				break;
			case 7 :
				// com/caseystella/parser/bashast.g:1:45: DONE
				{
				mDONE(); 

				}
				break;
			case 8 :
				// com/caseystella/parser/bashast.g:1:50: ELIF
				{
				mELIF(); 

				}
				break;
			case 9 :
				// com/caseystella/parser/bashast.g:1:55: ELSE
				{
				mELSE(); 

				}
				break;
			case 10 :
				// com/caseystella/parser/bashast.g:1:60: ESAC
				{
				mESAC(); 

				}
				break;
			case 11 :
				// com/caseystella/parser/bashast.g:1:65: FI
				{
				mFI(); 

				}
				break;
			case 12 :
				// com/caseystella/parser/bashast.g:1:68: FOR
				{
				mFOR(); 

				}
				break;
			case 13 :
				// com/caseystella/parser/bashast.g:1:72: FUNCTION
				{
				mFUNCTION(); 

				}
				break;
			case 14 :
				// com/caseystella/parser/bashast.g:1:81: IF
				{
				mIF(); 

				}
				break;
			case 15 :
				// com/caseystella/parser/bashast.g:1:84: IN
				{
				mIN(); 

				}
				break;
			case 16 :
				// com/caseystella/parser/bashast.g:1:87: SELECT
				{
				mSELECT(); 

				}
				break;
			case 17 :
				// com/caseystella/parser/bashast.g:1:94: THEN
				{
				mTHEN(); 

				}
				break;
			case 18 :
				// com/caseystella/parser/bashast.g:1:99: UNTIL
				{
				mUNTIL(); 

				}
				break;
			case 19 :
				// com/caseystella/parser/bashast.g:1:105: WHILE
				{
				mWHILE(); 

				}
				break;
			case 20 :
				// com/caseystella/parser/bashast.g:1:111: LBRACE
				{
				mLBRACE(); 

				}
				break;
			case 21 :
				// com/caseystella/parser/bashast.g:1:118: RBRACE
				{
				mRBRACE(); 

				}
				break;
			case 22 :
				// com/caseystella/parser/bashast.g:1:125: TIME
				{
				mTIME(); 

				}
				break;
			case 23 :
				// com/caseystella/parser/bashast.g:1:130: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 24 :
				// com/caseystella/parser/bashast.g:1:137: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 25 :
				// com/caseystella/parser/bashast.g:1:144: LLPAREN
				{
				mLLPAREN(); 

				}
				break;
			case 26 :
				// com/caseystella/parser/bashast.g:1:152: RRPAREN
				{
				mRRPAREN(); 

				}
				break;
			case 27 :
				// com/caseystella/parser/bashast.g:1:160: LSQUARE
				{
				mLSQUARE(); 

				}
				break;
			case 28 :
				// com/caseystella/parser/bashast.g:1:168: RSQUARE
				{
				mRSQUARE(); 

				}
				break;
			case 29 :
				// com/caseystella/parser/bashast.g:1:176: TICK
				{
				mTICK(); 

				}
				break;
			case 30 :
				// com/caseystella/parser/bashast.g:1:181: DOLLAR
				{
				mDOLLAR(); 

				}
				break;
			case 31 :
				// com/caseystella/parser/bashast.g:1:188: AT
				{
				mAT(); 

				}
				break;
			case 32 :
				// com/caseystella/parser/bashast.g:1:191: DOT
				{
				mDOT(); 

				}
				break;
			case 33 :
				// com/caseystella/parser/bashast.g:1:195: DOTDOT
				{
				mDOTDOT(); 

				}
				break;
			case 34 :
				// com/caseystella/parser/bashast.g:1:202: LET
				{
				mLET(); 

				}
				break;
			case 35 :
				// com/caseystella/parser/bashast.g:1:206: TIMES
				{
				mTIMES(); 

				}
				break;
			case 36 :
				// com/caseystella/parser/bashast.g:1:212: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 37 :
				// com/caseystella/parser/bashast.g:1:219: MINUS
				{
				mMINUS(); 

				}
				break;
			case 38 :
				// com/caseystella/parser/bashast.g:1:225: PLUS
				{
				mPLUS(); 

				}
				break;
			case 39 :
				// com/caseystella/parser/bashast.g:1:230: INC
				{
				mINC(); 

				}
				break;
			case 40 :
				// com/caseystella/parser/bashast.g:1:234: DEC
				{
				mDEC(); 

				}
				break;
			case 41 :
				// com/caseystella/parser/bashast.g:1:238: EXP
				{
				mEXP(); 

				}
				break;
			case 42 :
				// com/caseystella/parser/bashast.g:1:242: AMP
				{
				mAMP(); 

				}
				break;
			case 43 :
				// com/caseystella/parser/bashast.g:1:246: LEQ
				{
				mLEQ(); 

				}
				break;
			case 44 :
				// com/caseystella/parser/bashast.g:1:250: GEQ
				{
				mGEQ(); 

				}
				break;
			case 45 :
				// com/caseystella/parser/bashast.g:1:254: CARET
				{
				mCARET(); 

				}
				break;
			case 46 :
				// com/caseystella/parser/bashast.g:1:260: LT
				{
				mLT(); 

				}
				break;
			case 47 :
				// com/caseystella/parser/bashast.g:1:263: GT
				{
				mGT(); 

				}
				break;
			case 48 :
				// com/caseystella/parser/bashast.g:1:266: LSHIFT
				{
				mLSHIFT(); 

				}
				break;
			case 49 :
				// com/caseystella/parser/bashast.g:1:273: RSHIFT
				{
				mRSHIFT(); 

				}
				break;
			case 50 :
				// com/caseystella/parser/bashast.g:1:280: ARITH_ASSIGN
				{
				mARITH_ASSIGN(); 

				}
				break;
			case 51 :
				// com/caseystella/parser/bashast.g:1:293: SEMIC
				{
				mSEMIC(); 

				}
				break;
			case 52 :
				// com/caseystella/parser/bashast.g:1:299: DOUBLE_SEMIC
				{
				mDOUBLE_SEMIC(); 

				}
				break;
			case 53 :
				// com/caseystella/parser/bashast.g:1:312: PIPE
				{
				mPIPE(); 

				}
				break;
			case 54 :
				// com/caseystella/parser/bashast.g:1:317: QUOTE
				{
				mQUOTE(); 

				}
				break;
			case 55 :
				// com/caseystella/parser/bashast.g:1:323: SQUOTE
				{
				mSQUOTE(); 

				}
				break;
			case 56 :
				// com/caseystella/parser/bashast.g:1:330: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 57 :
				// com/caseystella/parser/bashast.g:1:336: BLANK
				{
				mBLANK(); 

				}
				break;
			case 58 :
				// com/caseystella/parser/bashast.g:1:342: EOL
				{
				mEOL(); 

				}
				break;
			case 59 :
				// com/caseystella/parser/bashast.g:1:346: DIGIT
				{
				mDIGIT(); 

				}
				break;
			case 60 :
				// com/caseystella/parser/bashast.g:1:352: NUMBER
				{
				mNUMBER(); 

				}
				break;
			case 61 :
				// com/caseystella/parser/bashast.g:1:359: LETTER
				{
				mLETTER(); 

				}
				break;
			case 62 :
				// com/caseystella/parser/bashast.g:1:366: TILDE
				{
				mTILDE(); 

				}
				break;
			case 63 :
				// com/caseystella/parser/bashast.g:1:372: HERE_STRING_OP
				{
				mHERE_STRING_OP(); 

				}
				break;
			case 64 :
				// com/caseystella/parser/bashast.g:1:387: POUND
				{
				mPOUND(); 

				}
				break;
			case 65 :
				// com/caseystella/parser/bashast.g:1:393: POUNDPOUND
				{
				mPOUNDPOUND(); 

				}
				break;
			case 66 :
				// com/caseystella/parser/bashast.g:1:404: PCT
				{
				mPCT(); 

				}
				break;
			case 67 :
				// com/caseystella/parser/bashast.g:1:408: PCTPCT
				{
				mPCTPCT(); 

				}
				break;
			case 68 :
				// com/caseystella/parser/bashast.g:1:415: SLASH
				{
				mSLASH(); 

				}
				break;
			case 69 :
				// com/caseystella/parser/bashast.g:1:421: WORDOP
				{
				mWORDOP(); 

				}
				break;
			case 70 :
				// com/caseystella/parser/bashast.g:1:428: COLON
				{
				mCOLON(); 

				}
				break;
			case 71 :
				// com/caseystella/parser/bashast.g:1:434: QMARK
				{
				mQMARK(); 

				}
				break;
			case 72 :
				// com/caseystella/parser/bashast.g:1:440: TEST
				{
				mTEST(); 

				}
				break;
			case 73 :
				// com/caseystella/parser/bashast.g:1:445: LOGICAND
				{
				mLOGICAND(); 

				}
				break;
			case 74 :
				// com/caseystella/parser/bashast.g:1:454: LOGICOR
				{
				mLOGICOR(); 

				}
				break;
			case 75 :
				// com/caseystella/parser/bashast.g:1:462: BOP
				{
				mBOP(); 

				}
				break;
			case 76 :
				// com/caseystella/parser/bashast.g:1:466: UOP
				{
				mUOP(); 

				}
				break;
			case 77 :
				// com/caseystella/parser/bashast.g:1:470: EXPORT
				{
				mEXPORT(); 

				}
				break;
			case 78 :
				// com/caseystella/parser/bashast.g:1:477: CONTINUE_LINE
				{
				mCONTINUE_LINE(); 

				}
				break;
			case 79 :
				// com/caseystella/parser/bashast.g:1:491: ESC_RPAREN
				{
				mESC_RPAREN(); 

				}
				break;
			case 80 :
				// com/caseystella/parser/bashast.g:1:502: ESC_LPAREN
				{
				mESC_LPAREN(); 

				}
				break;
			case 81 :
				// com/caseystella/parser/bashast.g:1:513: ESC_LT
				{
				mESC_LT(); 

				}
				break;
			case 82 :
				// com/caseystella/parser/bashast.g:1:520: ESC_GT
				{
				mESC_GT(); 

				}
				break;
			case 83 :
				// com/caseystella/parser/bashast.g:1:527: ESC_CHAR
				{
				mESC_CHAR(); 

				}
				break;
			case 84 :
				// com/caseystella/parser/bashast.g:1:536: NAME
				{
				mNAME(); 

				}
				break;
			case 85 :
				// com/caseystella/parser/bashast.g:1:541: NQCHAR_NO_ALPHANUM
				{
				mNQCHAR_NO_ALPHANUM(); 

				}
				break;
			case 86 :
				// com/caseystella/parser/bashast.g:1:560: NQSTR
				{
				mNQSTR(); 

				}
				break;

		}
	}


	protected DFA16 dfa16 = new DFA16(this);
	static final String DFA16_eotS =
		"\1\uffff\1\63\1\66\1\71\1\uffff\1\73\1\uffff\11\75\2\uffff\1\120\1\122"+
		"\5\uffff\1\124\1\75\1\127\1\uffff\1\131\1\133\1\136\1\141\1\142\1\143"+
		"\1\145\1\147\1\151\3\uffff\1\152\1\75\1\154\1\156\1\160\2\uffff\1\170"+
		"\1\171\3\uffff\1\173\1\uffff\2\174\3\uffff\1\174\1\uffff\1\174\1\uffff"+
		"\1\177\3\174\1\u0084\2\174\1\u0087\1\u0088\6\174\6\uffff\1\174\7\uffff"+
		"\1\u0091\2\uffff\1\u0092\12\uffff\1\u0093\7\uffff\1\167\11\uffff\2\174"+
		"\1\uffff\4\174\1\uffff\1\u009f\1\174\2\uffff\6\174\1\u00a7\11\uffff\1"+
		"\u00a8\1\u00a9\1\u00aa\1\u00ab\1\u00ac\1\174\1\uffff\2\174\1\u00b0\1\u00b1"+
		"\1\u00b2\2\174\6\uffff\3\174\3\uffff\1\u00b8\1\u00b9\1\u00ba\1\174\1\u00bc"+
		"\3\uffff\1\174\1\uffff\1\u00be\1\uffff";
	static final String DFA16_eofS =
		"\u00bf\uffff";
	static final String DFA16_minS =
		"\1\0\1\55\1\0\1\11\2\12\1\uffff\11\0\2\uffff\1\51\1\50\5\uffff\1\56\1"+
		"\0\1\52\1\uffff\1\53\1\46\1\74\3\75\1\45\1\75\1\73\3\uffff\3\0\1\43\1"+
		"\53\1\uffff\2\0\1\101\3\uffff\1\101\1\uffff\2\0\3\uffff\1\0\1\uffff\1"+
		"\0\1\uffff\17\0\6\uffff\1\0\7\uffff\1\74\2\uffff\1\75\12\uffff\1\0\7\uffff"+
		"\1\12\11\uffff\2\0\1\uffff\4\0\1\uffff\2\0\2\uffff\7\0\11\uffff\6\0\1"+
		"\uffff\7\0\6\uffff\3\0\3\uffff\5\0\3\uffff\1\0\1\uffff\1\0\1\uffff";
	static final String DFA16_maxS =
		"\1\uffff\1\172\1\uffff\1\43\1\12\1\43\1\uffff\11\uffff\2\uffff\1\51\1"+
		"\50\5\uffff\1\56\1\uffff\1\75\1\uffff\3\75\1\76\3\75\1\174\1\73\3\uffff"+
		"\3\uffff\1\43\1\77\1\uffff\2\uffff\1\172\3\uffff\1\172\1\uffff\2\uffff"+
		"\3\uffff\1\uffff\1\uffff\1\uffff\1\uffff\17\uffff\6\uffff\1\uffff\7\uffff"+
		"\1\75\2\uffff\1\75\12\uffff\1\uffff\7\uffff\1\12\11\uffff\2\uffff\1\uffff"+
		"\4\uffff\1\uffff\2\uffff\2\uffff\7\uffff\11\uffff\6\uffff\1\uffff\7\uffff"+
		"\6\uffff\3\uffff\3\uffff\5\uffff\3\uffff\1\uffff\1\uffff\1\uffff\1\uffff";
	static final String DFA16_acceptS =
		"\6\uffff\1\4\11\uffff\1\24\1\25\2\uffff\1\33\1\34\1\35\1\36\1\37\3\uffff"+
		"\1\44\11\uffff\1\66\1\67\1\70\5\uffff\1\107\3\uffff\1\50\1\45\1\62\1\uffff"+
		"\1\2\2\uffff\1\71\1\3\1\72\1\uffff\1\75\1\uffff\1\126\17\uffff\1\32\1"+
		"\27\1\31\1\30\1\41\1\40\1\uffff\1\51\1\43\1\47\1\46\1\111\1\52\1\53\1"+
		"\uffff\1\56\1\54\1\uffff\1\57\1\55\1\104\1\103\1\102\1\112\1\65\1\64\1"+
		"\63\1\73\1\uffff\1\76\1\101\1\100\1\105\1\106\1\121\1\122\1\uffff\1\116"+
		"\1\117\1\120\1\123\1\125\1\1\1\113\1\114\1\124\2\uffff\1\6\4\uffff\1\13"+
		"\2\uffff\1\16\1\17\7\uffff\1\77\1\60\1\61\1\74\1\121\1\122\1\116\1\117"+
		"\1\120\6\uffff\1\14\7\uffff\1\42\1\5\1\7\1\10\1\11\1\12\3\uffff\1\21\1"+
		"\26\1\110\5\uffff\1\22\1\23\1\115\1\uffff\1\20\1\uffff\1\15";
	static final String DFA16_specialS =
		"\1\65\1\uffff\1\14\4\uffff\1\5\1\24\1\30\1\103\1\2\1\106\1\111\1\102\1"+
		"\77\12\uffff\1\56\16\uffff\1\71\1\4\1\74\3\uffff\1\12\1\37\6\uffff\1\70"+
		"\1\54\3\uffff\1\22\1\uffff\1\0\1\uffff\1\50\1\16\1\36\1\107\1\13\1\43"+
		"\1\31\1\101\1\104\1\57\1\51\1\62\1\100\1\45\1\72\6\uffff\1\105\25\uffff"+
		"\1\11\21\uffff\1\23\1\25\1\uffff\1\17\1\20\1\41\1\110\1\uffff\1\1\1\27"+
		"\2\uffff\1\55\1\47\1\63\1\76\1\46\1\67\1\6\11\uffff\1\35\1\40\1\15\1\21"+
		"\1\10\1\112\1\uffff\1\26\1\53\1\75\1\60\1\7\1\44\1\66\6\uffff\1\113\1"+
		"\34\1\52\3\uffff\1\61\1\64\1\42\1\33\1\73\3\uffff\1\32\1\uffff\1\3\1\uffff}>";
	static final String[] DFA16_transitionS = {
			"\11\60\1\3\1\5\2\60\1\4\22\60\1\3\1\6\1\46\1\54\1\27\1\43\1\36\1\47\1"+
			"\23\1\22\1\33\1\35\1\50\1\1\1\31\1\42\12\51\1\55\1\45\1\37\1\34\1\40"+
			"\1\56\1\30\32\52\1\24\1\57\1\25\1\41\1\2\1\26\2\52\1\7\1\10\1\11\1\12"+
			"\2\52\1\13\2\52\1\32\6\52\1\14\1\15\1\16\1\52\1\17\3\52\1\20\1\44\1\21"+
			"\1\53\uff81\60",
			"\1\62\17\uffff\1\64\3\uffff\32\65\6\uffff\17\65\1\61\12\65",
			"\11\60\2\uffff\2\60\1\uffff\22\60\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\67\1\uffff\32\70\3\uffff\uff82\60",
			"\1\3\26\uffff\1\3\2\uffff\1\72",
			"\1\5",
			"\1\5\2\uffff\1\4\25\uffff\1\72",
			"",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\1\74\31\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\16\70\1\100\13\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\13\70\1\101\6\70\1\102\4\70\1\103\2\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\10\70\1\104\5\70\1\105\5\70\1\106\5\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\5\70\1\107\7\70\1\110\14\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\4\70\1\111\25\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\4\70\1\114\2\70\1\112\1\113\21\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\15\70\1\115\14\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\7\70\1\116\22\70\3\uffff\uff82\77",
			"",
			"",
			"\1\117",
			"\1\121",
			"",
			"",
			"",
			"",
			"",
			"\1\123",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\4\70\1\125\25\70\3\uffff\uff82\77",
			"\1\126\22\uffff\1\64",
			"",
			"\1\130\21\uffff\1\64",
			"\1\132\26\uffff\1\64",
			"\1\135\1\134",
			"\1\137\1\140",
			"\1\64",
			"\1\64",
			"\1\144\27\uffff\1\64",
			"\1\64\76\uffff\1\146",
			"\1\150",
			"",
			"",
			"",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\153\7\uffff\32\77\4\uffff"+
			"\1\77\1\uffff\32\77\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"\11\60\2\uffff\2\60\1\uffff\22\60\20\uffff\12\77\7\uffff\32\77\4\uffff"+
			"\1\60\1\uffff\32\77\3\uffff\uff82\60",
			"\1\155",
			"\1\157\1\uffff\1\157\17\uffff\1\157\1\uffff\1\157",
			"",
			"\12\167\1\164\2\167\1\163\32\167\1\166\1\165\22\167\1\161\1\167\1\162"+
			"\uffc1\167",
			"\11\60\2\uffff\2\60\1\uffff\22\60\20\uffff\12\77\7\uffff\32\77\4\uffff"+
			"\1\60\1\uffff\32\77\3\uffff\uff82\60",
			"\32\172\6\uffff\32\172",
			"",
			"",
			"",
			"\32\172\6\uffff\32\172",
			"",
			"\11\60\2\uffff\2\60\1\uffff\22\60\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\67\1\uffff\32\70\3\uffff\uff82\60",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"",
			"",
			"",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\22\70\1\175\7\70\3\uffff\uff82\77",
			"",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\15\70\1\176\14\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\10\70\1\u0080\11\70\1\u0081\7\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\1\u0082\31\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\17\70\1\u0083\12\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\21\70\1\u0085\10\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\15\70\1\u0086\14\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\13\70\1\u0089\16\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\4\70\1\u008a\25\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\14\70\1\u008b\15\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\22\70\1\u008c\7\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\23\70\1\u008d\6\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\10\70\1\u008e\21\70\3\uffff\uff82\77",
			"",
			"",
			"",
			"",
			"",
			"",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\23\70\1\u008f\6\70\3\uffff\uff82\77",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0090\1\64",
			"",
			"",
			"\1\64",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\153\7\uffff\32\77\4\uffff"+
			"\1\77\1\uffff\32\77\3\uffff\uff82\77",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0096",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\4\70\1\u0099\25\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\4\70\1\u009a\25\70\3\uffff\uff82\77",
			"",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\5\70\1\u009b\24\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\4\70\1\u009c\25\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\2\70\1\u009d\27\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\16\70\1\u009e\13\70\3\uffff\uff82\77",
			"",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\2\70\1\u00a0\27\70\3\uffff\uff82\77",
			"",
			"",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\4\70\1\u00a1\25\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\15\70\1\u00a2\14\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\4\70\1\u00a3\25\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\23\70\1\u00a4\6\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\10\70\1\u00a5\21\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\13\70\1\u00a6\16\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\21\70\1\u00ad\10\70\3\uffff\uff82\77",
			"",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\23\70\1\u00ae\6\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\2\70\1\u00af\27\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\13\70\1\u00b3\16\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\4\70\1\u00b4\25\70\3\uffff\uff82\77",
			"",
			"",
			"",
			"",
			"",
			"",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\23\70\1\u00b5\6\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\10\70\1\u00b6\21\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\23\70\1\u00b7\6\70\3\uffff\uff82\77",
			"",
			"",
			"",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\16\70\1\u00bb\13\70\3\uffff\uff82\77",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			"",
			"",
			"",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\15\70\1\u00bd\14\70\3\uffff\uff82\77",
			"",
			"\11\77\2\uffff\2\77\1\uffff\22\77\20\uffff\12\70\7\uffff\32\70\4\uffff"+
			"\1\76\1\uffff\32\70\3\uffff\uff82\77",
			""
	};

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__137 | T__138 | COMMENT | BANG | CASE | DO | DONE | ELIF | ELSE | ESAC | FI | FOR | FUNCTION | IF | IN | SELECT | THEN | UNTIL | WHILE | LBRACE | RBRACE | TIME | RPAREN | LPAREN | LLPAREN | RRPAREN | LSQUARE | RSQUARE | TICK | DOLLAR | AT | DOT | DOTDOT | LET | TIMES | EQUALS | MINUS | PLUS | INC | DEC | EXP | AMP | LEQ | GEQ | CARET | LT | GT | LSHIFT | RSHIFT | ARITH_ASSIGN | SEMIC | DOUBLE_SEMIC | PIPE | QUOTE | SQUOTE | COMMA | BLANK | EOL | DIGIT | NUMBER | LETTER | TILDE | HERE_STRING_OP | POUND | POUNDPOUND | PCT | PCTPCT | SLASH | WORDOP | COLON | QMARK | TEST | LOGICAND | LOGICOR | BOP | UOP | EXPORT | CONTINUE_LINE | ESC_RPAREN | ESC_LPAREN | ESC_LT | ESC_GT | ESC_CHAR | NAME | NQCHAR_NO_ALPHANUM | NQSTR );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA16_62 = input.LA(1);
						s = -1;
						if ( (LA16_62=='_') ) {s = 62;}
						else if ( ((LA16_62 >= '0' && LA16_62 <= '9')||(LA16_62 >= 'A' && LA16_62 <= 'Z')||(LA16_62 >= 'a' && LA16_62 <= 'z')) ) {s = 56;}
						else if ( ((LA16_62 >= '\u0000' && LA16_62 <= '\b')||(LA16_62 >= '\u000B' && LA16_62 <= '\f')||(LA16_62 >= '\u000E' && LA16_62 <= '\u001F')||(LA16_62 >= '~' && LA16_62 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA16_133 = input.LA(1);
						s = -1;
						if ( (LA16_133=='_') ) {s = 62;}
						else if ( ((LA16_133 >= '0' && LA16_133 <= '9')||(LA16_133 >= 'A' && LA16_133 <= 'Z')||(LA16_133 >= 'a' && LA16_133 <= 'z')) ) {s = 56;}
						else if ( ((LA16_133 >= '\u0000' && LA16_133 <= '\b')||(LA16_133 >= '\u000B' && LA16_133 <= '\f')||(LA16_133 >= '\u000E' && LA16_133 <= '\u001F')||(LA16_133 >= '~' && LA16_133 <= '\uFFFF')) ) {s = 63;}
						else s = 159;
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA16_11 = input.LA(1);
						s = -1;
						if ( (LA16_11=='f') ) {s = 71;}
						else if ( (LA16_11=='n') ) {s = 72;}
						else if ( (LA16_11=='_') ) {s = 62;}
						else if ( ((LA16_11 >= '0' && LA16_11 <= '9')||(LA16_11 >= 'A' && LA16_11 <= 'Z')||(LA16_11 >= 'a' && LA16_11 <= 'e')||(LA16_11 >= 'g' && LA16_11 <= 'm')||(LA16_11 >= 'o' && LA16_11 <= 'z')) ) {s = 56;}
						else if ( ((LA16_11 >= '\u0000' && LA16_11 <= '\b')||(LA16_11 >= '\u000B' && LA16_11 <= '\f')||(LA16_11 >= '\u000E' && LA16_11 <= '\u001F')||(LA16_11 >= '~' && LA16_11 <= '\uFFFF')) ) {s = 63;}
						else s = 61;
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA16_189 = input.LA(1);
						s = -1;
						if ( (LA16_189=='_') ) {s = 62;}
						else if ( ((LA16_189 >= '0' && LA16_189 <= '9')||(LA16_189 >= 'A' && LA16_189 <= 'Z')||(LA16_189 >= 'a' && LA16_189 <= 'z')) ) {s = 56;}
						else if ( ((LA16_189 >= '\u0000' && LA16_189 <= '\b')||(LA16_189 >= '\u000B' && LA16_189 <= '\f')||(LA16_189 >= '\u000E' && LA16_189 <= '\u001F')||(LA16_189 >= '~' && LA16_189 <= '\uFFFF')) ) {s = 63;}
						else s = 190;
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA16_42 = input.LA(1);
						s = -1;
						if ( (LA16_42=='_') ) {s = 62;}
						else if ( ((LA16_42 >= '0' && LA16_42 <= '9')||(LA16_42 >= 'A' && LA16_42 <= 'Z')||(LA16_42 >= 'a' && LA16_42 <= 'z')) ) {s = 56;}
						else if ( ((LA16_42 >= '\u0000' && LA16_42 <= '\b')||(LA16_42 >= '\u000B' && LA16_42 <= '\f')||(LA16_42 >= '\u000E' && LA16_42 <= '\u001F')||(LA16_42 >= '~' && LA16_42 <= '\uFFFF')) ) {s = 63;}
						else s = 61;
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA16_7 = input.LA(1);
						s = -1;
						if ( (LA16_7=='a') ) {s = 60;}
						else if ( (LA16_7=='_') ) {s = 62;}
						else if ( ((LA16_7 >= '0' && LA16_7 <= '9')||(LA16_7 >= 'A' && LA16_7 <= 'Z')||(LA16_7 >= 'b' && LA16_7 <= 'z')) ) {s = 56;}
						else if ( ((LA16_7 >= '\u0000' && LA16_7 <= '\b')||(LA16_7 >= '\u000B' && LA16_7 <= '\f')||(LA16_7 >= '\u000E' && LA16_7 <= '\u001F')||(LA16_7 >= '~' && LA16_7 <= '\uFFFF')) ) {s = 63;}
						else s = 61;
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA16_143 = input.LA(1);
						s = -1;
						if ( (LA16_143=='_') ) {s = 62;}
						else if ( ((LA16_143 >= '0' && LA16_143 <= '9')||(LA16_143 >= 'A' && LA16_143 <= 'Z')||(LA16_143 >= 'a' && LA16_143 <= 'z')) ) {s = 56;}
						else if ( ((LA16_143 >= '\u0000' && LA16_143 <= '\b')||(LA16_143 >= '\u000B' && LA16_143 <= '\f')||(LA16_143 >= '\u000E' && LA16_143 <= '\u001F')||(LA16_143 >= '~' && LA16_143 <= '\uFFFF')) ) {s = 63;}
						else s = 167;
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA16_164 = input.LA(1);
						s = -1;
						if ( (LA16_164=='_') ) {s = 62;}
						else if ( ((LA16_164 >= '0' && LA16_164 <= '9')||(LA16_164 >= 'A' && LA16_164 <= 'Z')||(LA16_164 >= 'a' && LA16_164 <= 'z')) ) {s = 56;}
						else if ( ((LA16_164 >= '\u0000' && LA16_164 <= '\b')||(LA16_164 >= '\u000B' && LA16_164 <= '\f')||(LA16_164 >= '\u000E' && LA16_164 <= '\u001F')||(LA16_164 >= '~' && LA16_164 <= '\uFFFF')) ) {s = 63;}
						else s = 178;
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA16_157 = input.LA(1);
						s = -1;
						if ( (LA16_157=='_') ) {s = 62;}
						else if ( ((LA16_157 >= '0' && LA16_157 <= '9')||(LA16_157 >= 'A' && LA16_157 <= 'Z')||(LA16_157 >= 'a' && LA16_157 <= 'z')) ) {s = 56;}
						else if ( ((LA16_157 >= '\u0000' && LA16_157 <= '\b')||(LA16_157 >= '\u000B' && LA16_157 <= '\f')||(LA16_157 >= '\u000E' && LA16_157 <= '\u001F')||(LA16_157 >= '~' && LA16_157 <= '\uFFFF')) ) {s = 63;}
						else s = 172;
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA16_107 = input.LA(1);
						s = -1;
						if ( ((LA16_107 >= '0' && LA16_107 <= '9')) ) {s = 107;}
						else if ( ((LA16_107 >= '\u0000' && LA16_107 <= '\b')||(LA16_107 >= '\u000B' && LA16_107 <= '\f')||(LA16_107 >= '\u000E' && LA16_107 <= '\u001F')||(LA16_107 >= 'A' && LA16_107 <= 'Z')||LA16_107=='_'||(LA16_107 >= 'a' && LA16_107 <= 'z')||(LA16_107 >= '~' && LA16_107 <= '\uFFFF')) ) {s = 63;}
						else s = 147;
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA16_47 = input.LA(1);
						s = -1;
						if ( (LA16_47=='<') ) {s = 113;}
						else if ( (LA16_47=='>') ) {s = 114;}
						else if ( (LA16_47=='\r') ) {s = 115;}
						else if ( (LA16_47=='\n') ) {s = 116;}
						else if ( (LA16_47==')') ) {s = 117;}
						else if ( (LA16_47=='(') ) {s = 118;}
						else if ( ((LA16_47 >= '\u0000' && LA16_47 <= '\t')||(LA16_47 >= '\u000B' && LA16_47 <= '\f')||(LA16_47 >= '\u000E' && LA16_47 <= '\'')||(LA16_47 >= '*' && LA16_47 <= ';')||LA16_47=='='||(LA16_47 >= '?' && LA16_47 <= '\uFFFF')) ) {s = 119;}
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA16_68 = input.LA(1);
						s = -1;
						if ( (LA16_68=='_') ) {s = 62;}
						else if ( ((LA16_68 >= '0' && LA16_68 <= '9')||(LA16_68 >= 'A' && LA16_68 <= 'Z')||(LA16_68 >= 'a' && LA16_68 <= 'z')) ) {s = 56;}
						else if ( ((LA16_68 >= '\u0000' && LA16_68 <= '\b')||(LA16_68 >= '\u000B' && LA16_68 <= '\f')||(LA16_68 >= '\u000E' && LA16_68 <= '\u001F')||(LA16_68 >= '~' && LA16_68 <= '\uFFFF')) ) {s = 63;}
						else s = 132;
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA16_2 = input.LA(1);
						s = -1;
						if ( (LA16_2=='_') ) {s = 55;}
						else if ( ((LA16_2 >= '0' && LA16_2 <= '9')||(LA16_2 >= 'A' && LA16_2 <= 'Z')||(LA16_2 >= 'a' && LA16_2 <= 'z')) ) {s = 56;}
						else if ( ((LA16_2 >= '\u0000' && LA16_2 <= '\b')||(LA16_2 >= '\u000B' && LA16_2 <= '\f')||(LA16_2 >= '\u000E' && LA16_2 <= '\u001F')||(LA16_2 >= '~' && LA16_2 <= '\uFFFF')) ) {s = 48;}
						else s = 54;
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA16_155 = input.LA(1);
						s = -1;
						if ( (LA16_155=='_') ) {s = 62;}
						else if ( ((LA16_155 >= '0' && LA16_155 <= '9')||(LA16_155 >= 'A' && LA16_155 <= 'Z')||(LA16_155 >= 'a' && LA16_155 <= 'z')) ) {s = 56;}
						else if ( ((LA16_155 >= '\u0000' && LA16_155 <= '\b')||(LA16_155 >= '\u000B' && LA16_155 <= '\f')||(LA16_155 >= '\u000E' && LA16_155 <= '\u001F')||(LA16_155 >= '~' && LA16_155 <= '\uFFFF')) ) {s = 63;}
						else s = 170;
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA16_65 = input.LA(1);
						s = -1;
						if ( (LA16_65=='i') ) {s = 128;}
						else if ( (LA16_65=='s') ) {s = 129;}
						else if ( (LA16_65=='_') ) {s = 62;}
						else if ( ((LA16_65 >= '0' && LA16_65 <= '9')||(LA16_65 >= 'A' && LA16_65 <= 'Z')||(LA16_65 >= 'a' && LA16_65 <= 'h')||(LA16_65 >= 'j' && LA16_65 <= 'r')||(LA16_65 >= 't' && LA16_65 <= 'z')) ) {s = 56;}
						else if ( ((LA16_65 >= '\u0000' && LA16_65 <= '\b')||(LA16_65 >= '\u000B' && LA16_65 <= '\f')||(LA16_65 >= '\u000E' && LA16_65 <= '\u001F')||(LA16_65 >= '~' && LA16_65 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA16_128 = input.LA(1);
						s = -1;
						if ( (LA16_128=='f') ) {s = 155;}
						else if ( (LA16_128=='_') ) {s = 62;}
						else if ( ((LA16_128 >= '0' && LA16_128 <= '9')||(LA16_128 >= 'A' && LA16_128 <= 'Z')||(LA16_128 >= 'a' && LA16_128 <= 'e')||(LA16_128 >= 'g' && LA16_128 <= 'z')) ) {s = 56;}
						else if ( ((LA16_128 >= '\u0000' && LA16_128 <= '\b')||(LA16_128 >= '\u000B' && LA16_128 <= '\f')||(LA16_128 >= '\u000E' && LA16_128 <= '\u001F')||(LA16_128 >= '~' && LA16_128 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA16_129 = input.LA(1);
						s = -1;
						if ( (LA16_129=='e') ) {s = 156;}
						else if ( (LA16_129=='_') ) {s = 62;}
						else if ( ((LA16_129 >= '0' && LA16_129 <= '9')||(LA16_129 >= 'A' && LA16_129 <= 'Z')||(LA16_129 >= 'a' && LA16_129 <= 'd')||(LA16_129 >= 'f' && LA16_129 <= 'z')) ) {s = 56;}
						else if ( ((LA16_129 >= '\u0000' && LA16_129 <= '\b')||(LA16_129 >= '\u000B' && LA16_129 <= '\f')||(LA16_129 >= '\u000E' && LA16_129 <= '\u001F')||(LA16_129 >= '~' && LA16_129 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA16_156 = input.LA(1);
						s = -1;
						if ( (LA16_156=='_') ) {s = 62;}
						else if ( ((LA16_156 >= '0' && LA16_156 <= '9')||(LA16_156 >= 'A' && LA16_156 <= 'Z')||(LA16_156 >= 'a' && LA16_156 <= 'z')) ) {s = 56;}
						else if ( ((LA16_156 >= '\u0000' && LA16_156 <= '\b')||(LA16_156 >= '\u000B' && LA16_156 <= '\f')||(LA16_156 >= '\u000E' && LA16_156 <= '\u001F')||(LA16_156 >= '~' && LA16_156 <= '\uFFFF')) ) {s = 63;}
						else s = 171;
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA16_60 = input.LA(1);
						s = -1;
						if ( (LA16_60=='s') ) {s = 125;}
						else if ( (LA16_60=='_') ) {s = 62;}
						else if ( ((LA16_60 >= '0' && LA16_60 <= '9')||(LA16_60 >= 'A' && LA16_60 <= 'Z')||(LA16_60 >= 'a' && LA16_60 <= 'r')||(LA16_60 >= 't' && LA16_60 <= 'z')) ) {s = 56;}
						else if ( ((LA16_60 >= '\u0000' && LA16_60 <= '\b')||(LA16_60 >= '\u000B' && LA16_60 <= '\f')||(LA16_60 >= '\u000E' && LA16_60 <= '\u001F')||(LA16_60 >= '~' && LA16_60 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA16_125 = input.LA(1);
						s = -1;
						if ( (LA16_125=='e') ) {s = 153;}
						else if ( (LA16_125=='_') ) {s = 62;}
						else if ( ((LA16_125 >= '0' && LA16_125 <= '9')||(LA16_125 >= 'A' && LA16_125 <= 'Z')||(LA16_125 >= 'a' && LA16_125 <= 'd')||(LA16_125 >= 'f' && LA16_125 <= 'z')) ) {s = 56;}
						else if ( ((LA16_125 >= '\u0000' && LA16_125 <= '\b')||(LA16_125 >= '\u000B' && LA16_125 <= '\f')||(LA16_125 >= '\u000E' && LA16_125 <= '\u001F')||(LA16_125 >= '~' && LA16_125 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA16_8 = input.LA(1);
						s = -1;
						if ( (LA16_8=='o') ) {s = 64;}
						else if ( (LA16_8=='_') ) {s = 62;}
						else if ( ((LA16_8 >= '0' && LA16_8 <= '9')||(LA16_8 >= 'A' && LA16_8 <= 'Z')||(LA16_8 >= 'a' && LA16_8 <= 'n')||(LA16_8 >= 'p' && LA16_8 <= 'z')) ) {s = 56;}
						else if ( ((LA16_8 >= '\u0000' && LA16_8 <= '\b')||(LA16_8 >= '\u000B' && LA16_8 <= '\f')||(LA16_8 >= '\u000E' && LA16_8 <= '\u001F')||(LA16_8 >= '~' && LA16_8 <= '\uFFFF')) ) {s = 63;}
						else s = 61;
						if ( s>=0 ) return s;
						break;

					case 21 : 
						int LA16_126 = input.LA(1);
						s = -1;
						if ( (LA16_126=='e') ) {s = 154;}
						else if ( (LA16_126=='_') ) {s = 62;}
						else if ( ((LA16_126 >= '0' && LA16_126 <= '9')||(LA16_126 >= 'A' && LA16_126 <= 'Z')||(LA16_126 >= 'a' && LA16_126 <= 'd')||(LA16_126 >= 'f' && LA16_126 <= 'z')) ) {s = 56;}
						else if ( ((LA16_126 >= '\u0000' && LA16_126 <= '\b')||(LA16_126 >= '\u000B' && LA16_126 <= '\f')||(LA16_126 >= '\u000E' && LA16_126 <= '\u001F')||(LA16_126 >= '~' && LA16_126 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 22 : 
						int LA16_160 = input.LA(1);
						s = -1;
						if ( (LA16_160=='t') ) {s = 174;}
						else if ( (LA16_160=='_') ) {s = 62;}
						else if ( ((LA16_160 >= '0' && LA16_160 <= '9')||(LA16_160 >= 'A' && LA16_160 <= 'Z')||(LA16_160 >= 'a' && LA16_160 <= 's')||(LA16_160 >= 'u' && LA16_160 <= 'z')) ) {s = 56;}
						else if ( ((LA16_160 >= '\u0000' && LA16_160 <= '\b')||(LA16_160 >= '\u000B' && LA16_160 <= '\f')||(LA16_160 >= '\u000E' && LA16_160 <= '\u001F')||(LA16_160 >= '~' && LA16_160 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 23 : 
						int LA16_134 = input.LA(1);
						s = -1;
						if ( (LA16_134=='c') ) {s = 160;}
						else if ( (LA16_134=='_') ) {s = 62;}
						else if ( ((LA16_134 >= '0' && LA16_134 <= '9')||(LA16_134 >= 'A' && LA16_134 <= 'Z')||(LA16_134 >= 'a' && LA16_134 <= 'b')||(LA16_134 >= 'd' && LA16_134 <= 'z')) ) {s = 56;}
						else if ( ((LA16_134 >= '\u0000' && LA16_134 <= '\b')||(LA16_134 >= '\u000B' && LA16_134 <= '\f')||(LA16_134 >= '\u000E' && LA16_134 <= '\u001F')||(LA16_134 >= '~' && LA16_134 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 24 : 
						int LA16_9 = input.LA(1);
						s = -1;
						if ( (LA16_9=='l') ) {s = 65;}
						else if ( (LA16_9=='s') ) {s = 66;}
						else if ( (LA16_9=='x') ) {s = 67;}
						else if ( (LA16_9=='_') ) {s = 62;}
						else if ( ((LA16_9 >= '0' && LA16_9 <= '9')||(LA16_9 >= 'A' && LA16_9 <= 'Z')||(LA16_9 >= 'a' && LA16_9 <= 'k')||(LA16_9 >= 'm' && LA16_9 <= 'r')||(LA16_9 >= 't' && LA16_9 <= 'w')||(LA16_9 >= 'y' && LA16_9 <= 'z')) ) {s = 56;}
						else if ( ((LA16_9 >= '\u0000' && LA16_9 <= '\b')||(LA16_9 >= '\u000B' && LA16_9 <= '\f')||(LA16_9 >= '\u000E' && LA16_9 <= '\u001F')||(LA16_9 >= '~' && LA16_9 <= '\uFFFF')) ) {s = 63;}
						else s = 61;
						if ( s>=0 ) return s;
						break;

					case 25 : 
						int LA16_70 = input.LA(1);
						s = -1;
						if ( (LA16_70=='n') ) {s = 134;}
						else if ( (LA16_70=='_') ) {s = 62;}
						else if ( ((LA16_70 >= '0' && LA16_70 <= '9')||(LA16_70 >= 'A' && LA16_70 <= 'Z')||(LA16_70 >= 'a' && LA16_70 <= 'm')||(LA16_70 >= 'o' && LA16_70 <= 'z')) ) {s = 56;}
						else if ( ((LA16_70 >= '\u0000' && LA16_70 <= '\b')||(LA16_70 >= '\u000B' && LA16_70 <= '\f')||(LA16_70 >= '\u000E' && LA16_70 <= '\u001F')||(LA16_70 >= '~' && LA16_70 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 26 : 
						int LA16_187 = input.LA(1);
						s = -1;
						if ( (LA16_187=='n') ) {s = 189;}
						else if ( (LA16_187=='_') ) {s = 62;}
						else if ( ((LA16_187 >= '0' && LA16_187 <= '9')||(LA16_187 >= 'A' && LA16_187 <= 'Z')||(LA16_187 >= 'a' && LA16_187 <= 'm')||(LA16_187 >= 'o' && LA16_187 <= 'z')) ) {s = 56;}
						else if ( ((LA16_187 >= '\u0000' && LA16_187 <= '\b')||(LA16_187 >= '\u000B' && LA16_187 <= '\f')||(LA16_187 >= '\u000E' && LA16_187 <= '\u001F')||(LA16_187 >= '~' && LA16_187 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 27 : 
						int LA16_182 = input.LA(1);
						s = -1;
						if ( (LA16_182=='o') ) {s = 187;}
						else if ( (LA16_182=='_') ) {s = 62;}
						else if ( ((LA16_182 >= '0' && LA16_182 <= '9')||(LA16_182 >= 'A' && LA16_182 <= 'Z')||(LA16_182 >= 'a' && LA16_182 <= 'n')||(LA16_182 >= 'p' && LA16_182 <= 'z')) ) {s = 56;}
						else if ( ((LA16_182 >= '\u0000' && LA16_182 <= '\b')||(LA16_182 >= '\u000B' && LA16_182 <= '\f')||(LA16_182 >= '\u000E' && LA16_182 <= '\u001F')||(LA16_182 >= '~' && LA16_182 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 28 : 
						int LA16_174 = input.LA(1);
						s = -1;
						if ( (LA16_174=='i') ) {s = 182;}
						else if ( (LA16_174=='_') ) {s = 62;}
						else if ( ((LA16_174 >= '0' && LA16_174 <= '9')||(LA16_174 >= 'A' && LA16_174 <= 'Z')||(LA16_174 >= 'a' && LA16_174 <= 'h')||(LA16_174 >= 'j' && LA16_174 <= 'z')) ) {s = 56;}
						else if ( ((LA16_174 >= '\u0000' && LA16_174 <= '\b')||(LA16_174 >= '\u000B' && LA16_174 <= '\f')||(LA16_174 >= '\u000E' && LA16_174 <= '\u001F')||(LA16_174 >= '~' && LA16_174 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 29 : 
						int LA16_153 = input.LA(1);
						s = -1;
						if ( (LA16_153=='_') ) {s = 62;}
						else if ( ((LA16_153 >= '0' && LA16_153 <= '9')||(LA16_153 >= 'A' && LA16_153 <= 'Z')||(LA16_153 >= 'a' && LA16_153 <= 'z')) ) {s = 56;}
						else if ( ((LA16_153 >= '\u0000' && LA16_153 <= '\b')||(LA16_153 >= '\u000B' && LA16_153 <= '\f')||(LA16_153 >= '\u000E' && LA16_153 <= '\u001F')||(LA16_153 >= '~' && LA16_153 <= '\uFFFF')) ) {s = 63;}
						else s = 168;
						if ( s>=0 ) return s;
						break;

					case 30 : 
						int LA16_66 = input.LA(1);
						s = -1;
						if ( (LA16_66=='a') ) {s = 130;}
						else if ( (LA16_66=='_') ) {s = 62;}
						else if ( ((LA16_66 >= '0' && LA16_66 <= '9')||(LA16_66 >= 'A' && LA16_66 <= 'Z')||(LA16_66 >= 'b' && LA16_66 <= 'z')) ) {s = 56;}
						else if ( ((LA16_66 >= '\u0000' && LA16_66 <= '\b')||(LA16_66 >= '\u000B' && LA16_66 <= '\f')||(LA16_66 >= '\u000E' && LA16_66 <= '\u001F')||(LA16_66 >= '~' && LA16_66 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 31 : 
						int LA16_48 = input.LA(1);
						s = -1;
						if ( ((LA16_48 >= '\u0000' && LA16_48 <= '\b')||(LA16_48 >= '\u000B' && LA16_48 <= '\f')||(LA16_48 >= '\u000E' && LA16_48 <= '\u001F')||LA16_48=='_'||(LA16_48 >= '~' && LA16_48 <= '\uFFFF')) ) {s = 48;}
						else if ( ((LA16_48 >= '0' && LA16_48 <= '9')||(LA16_48 >= 'A' && LA16_48 <= 'Z')||(LA16_48 >= 'a' && LA16_48 <= 'z')) ) {s = 63;}
						else s = 120;
						if ( s>=0 ) return s;
						break;

					case 32 : 
						int LA16_154 = input.LA(1);
						s = -1;
						if ( (LA16_154=='_') ) {s = 62;}
						else if ( ((LA16_154 >= '0' && LA16_154 <= '9')||(LA16_154 >= 'A' && LA16_154 <= 'Z')||(LA16_154 >= 'a' && LA16_154 <= 'z')) ) {s = 56;}
						else if ( ((LA16_154 >= '\u0000' && LA16_154 <= '\b')||(LA16_154 >= '\u000B' && LA16_154 <= '\f')||(LA16_154 >= '\u000E' && LA16_154 <= '\u001F')||(LA16_154 >= '~' && LA16_154 <= '\uFFFF')) ) {s = 63;}
						else s = 169;
						if ( s>=0 ) return s;
						break;

					case 33 : 
						int LA16_130 = input.LA(1);
						s = -1;
						if ( (LA16_130=='c') ) {s = 157;}
						else if ( (LA16_130=='_') ) {s = 62;}
						else if ( ((LA16_130 >= '0' && LA16_130 <= '9')||(LA16_130 >= 'A' && LA16_130 <= 'Z')||(LA16_130 >= 'a' && LA16_130 <= 'b')||(LA16_130 >= 'd' && LA16_130 <= 'z')) ) {s = 56;}
						else if ( ((LA16_130 >= '\u0000' && LA16_130 <= '\b')||(LA16_130 >= '\u000B' && LA16_130 <= '\f')||(LA16_130 >= '\u000E' && LA16_130 <= '\u001F')||(LA16_130 >= '~' && LA16_130 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 34 : 
						int LA16_181 = input.LA(1);
						s = -1;
						if ( (LA16_181=='_') ) {s = 62;}
						else if ( ((LA16_181 >= '0' && LA16_181 <= '9')||(LA16_181 >= 'A' && LA16_181 <= 'Z')||(LA16_181 >= 'a' && LA16_181 <= 'z')) ) {s = 56;}
						else if ( ((LA16_181 >= '\u0000' && LA16_181 <= '\b')||(LA16_181 >= '\u000B' && LA16_181 <= '\f')||(LA16_181 >= '\u000E' && LA16_181 <= '\u001F')||(LA16_181 >= '~' && LA16_181 <= '\uFFFF')) ) {s = 63;}
						else s = 186;
						if ( s>=0 ) return s;
						break;

					case 35 : 
						int LA16_69 = input.LA(1);
						s = -1;
						if ( (LA16_69=='r') ) {s = 133;}
						else if ( (LA16_69=='_') ) {s = 62;}
						else if ( ((LA16_69 >= '0' && LA16_69 <= '9')||(LA16_69 >= 'A' && LA16_69 <= 'Z')||(LA16_69 >= 'a' && LA16_69 <= 'q')||(LA16_69 >= 's' && LA16_69 <= 'z')) ) {s = 56;}
						else if ( ((LA16_69 >= '\u0000' && LA16_69 <= '\b')||(LA16_69 >= '\u000B' && LA16_69 <= '\f')||(LA16_69 >= '\u000E' && LA16_69 <= '\u001F')||(LA16_69 >= '~' && LA16_69 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 36 : 
						int LA16_165 = input.LA(1);
						s = -1;
						if ( (LA16_165=='l') ) {s = 179;}
						else if ( (LA16_165=='_') ) {s = 62;}
						else if ( ((LA16_165 >= '0' && LA16_165 <= '9')||(LA16_165 >= 'A' && LA16_165 <= 'Z')||(LA16_165 >= 'a' && LA16_165 <= 'k')||(LA16_165 >= 'm' && LA16_165 <= 'z')) ) {s = 56;}
						else if ( ((LA16_165 >= '\u0000' && LA16_165 <= '\b')||(LA16_165 >= '\u000B' && LA16_165 <= '\f')||(LA16_165 >= '\u000E' && LA16_165 <= '\u001F')||(LA16_165 >= '~' && LA16_165 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 37 : 
						int LA16_77 = input.LA(1);
						s = -1;
						if ( (LA16_77=='t') ) {s = 141;}
						else if ( (LA16_77=='_') ) {s = 62;}
						else if ( ((LA16_77 >= '0' && LA16_77 <= '9')||(LA16_77 >= 'A' && LA16_77 <= 'Z')||(LA16_77 >= 'a' && LA16_77 <= 's')||(LA16_77 >= 'u' && LA16_77 <= 'z')) ) {s = 56;}
						else if ( ((LA16_77 >= '\u0000' && LA16_77 <= '\b')||(LA16_77 >= '\u000B' && LA16_77 <= '\f')||(LA16_77 >= '\u000E' && LA16_77 <= '\u001F')||(LA16_77 >= '~' && LA16_77 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 38 : 
						int LA16_141 = input.LA(1);
						s = -1;
						if ( (LA16_141=='i') ) {s = 165;}
						else if ( (LA16_141=='_') ) {s = 62;}
						else if ( ((LA16_141 >= '0' && LA16_141 <= '9')||(LA16_141 >= 'A' && LA16_141 <= 'Z')||(LA16_141 >= 'a' && LA16_141 <= 'h')||(LA16_141 >= 'j' && LA16_141 <= 'z')) ) {s = 56;}
						else if ( ((LA16_141 >= '\u0000' && LA16_141 <= '\b')||(LA16_141 >= '\u000B' && LA16_141 <= '\f')||(LA16_141 >= '\u000E' && LA16_141 <= '\u001F')||(LA16_141 >= '~' && LA16_141 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 39 : 
						int LA16_138 = input.LA(1);
						s = -1;
						if ( (LA16_138=='n') ) {s = 162;}
						else if ( (LA16_138=='_') ) {s = 62;}
						else if ( ((LA16_138 >= '0' && LA16_138 <= '9')||(LA16_138 >= 'A' && LA16_138 <= 'Z')||(LA16_138 >= 'a' && LA16_138 <= 'm')||(LA16_138 >= 'o' && LA16_138 <= 'z')) ) {s = 56;}
						else if ( ((LA16_138 >= '\u0000' && LA16_138 <= '\b')||(LA16_138 >= '\u000B' && LA16_138 <= '\f')||(LA16_138 >= '\u000E' && LA16_138 <= '\u001F')||(LA16_138 >= '~' && LA16_138 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 40 : 
						int LA16_64 = input.LA(1);
						s = -1;
						if ( (LA16_64=='n') ) {s = 126;}
						else if ( (LA16_64=='_') ) {s = 62;}
						else if ( ((LA16_64 >= '0' && LA16_64 <= '9')||(LA16_64 >= 'A' && LA16_64 <= 'Z')||(LA16_64 >= 'a' && LA16_64 <= 'm')||(LA16_64 >= 'o' && LA16_64 <= 'z')) ) {s = 56;}
						else if ( ((LA16_64 >= '\u0000' && LA16_64 <= '\b')||(LA16_64 >= '\u000B' && LA16_64 <= '\f')||(LA16_64 >= '\u000E' && LA16_64 <= '\u001F')||(LA16_64 >= '~' && LA16_64 <= '\uFFFF')) ) {s = 63;}
						else s = 127;
						if ( s>=0 ) return s;
						break;

					case 41 : 
						int LA16_74 = input.LA(1);
						s = -1;
						if ( (LA16_74=='e') ) {s = 138;}
						else if ( (LA16_74=='_') ) {s = 62;}
						else if ( ((LA16_74 >= '0' && LA16_74 <= '9')||(LA16_74 >= 'A' && LA16_74 <= 'Z')||(LA16_74 >= 'a' && LA16_74 <= 'd')||(LA16_74 >= 'f' && LA16_74 <= 'z')) ) {s = 56;}
						else if ( ((LA16_74 >= '\u0000' && LA16_74 <= '\b')||(LA16_74 >= '\u000B' && LA16_74 <= '\f')||(LA16_74 >= '\u000E' && LA16_74 <= '\u001F')||(LA16_74 >= '~' && LA16_74 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 42 : 
						int LA16_175 = input.LA(1);
						s = -1;
						if ( (LA16_175=='t') ) {s = 183;}
						else if ( (LA16_175=='_') ) {s = 62;}
						else if ( ((LA16_175 >= '0' && LA16_175 <= '9')||(LA16_175 >= 'A' && LA16_175 <= 'Z')||(LA16_175 >= 'a' && LA16_175 <= 's')||(LA16_175 >= 'u' && LA16_175 <= 'z')) ) {s = 56;}
						else if ( ((LA16_175 >= '\u0000' && LA16_175 <= '\b')||(LA16_175 >= '\u000B' && LA16_175 <= '\f')||(LA16_175 >= '\u000E' && LA16_175 <= '\u001F')||(LA16_175 >= '~' && LA16_175 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 43 : 
						int LA16_161 = input.LA(1);
						s = -1;
						if ( (LA16_161=='c') ) {s = 175;}
						else if ( (LA16_161=='_') ) {s = 62;}
						else if ( ((LA16_161 >= '0' && LA16_161 <= '9')||(LA16_161 >= 'A' && LA16_161 <= 'Z')||(LA16_161 >= 'a' && LA16_161 <= 'b')||(LA16_161 >= 'd' && LA16_161 <= 'z')) ) {s = 56;}
						else if ( ((LA16_161 >= '\u0000' && LA16_161 <= '\b')||(LA16_161 >= '\u000B' && LA16_161 <= '\f')||(LA16_161 >= '\u000E' && LA16_161 <= '\u001F')||(LA16_161 >= '~' && LA16_161 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 44 : 
						int LA16_56 = input.LA(1);
						s = -1;
						if ( (LA16_56=='_') ) {s = 62;}
						else if ( ((LA16_56 >= '0' && LA16_56 <= '9')||(LA16_56 >= 'A' && LA16_56 <= 'Z')||(LA16_56 >= 'a' && LA16_56 <= 'z')) ) {s = 56;}
						else if ( ((LA16_56 >= '\u0000' && LA16_56 <= '\b')||(LA16_56 >= '\u000B' && LA16_56 <= '\f')||(LA16_56 >= '\u000E' && LA16_56 <= '\u001F')||(LA16_56 >= '~' && LA16_56 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 45 : 
						int LA16_137 = input.LA(1);
						s = -1;
						if ( (LA16_137=='e') ) {s = 161;}
						else if ( (LA16_137=='_') ) {s = 62;}
						else if ( ((LA16_137 >= '0' && LA16_137 <= '9')||(LA16_137 >= 'A' && LA16_137 <= 'Z')||(LA16_137 >= 'a' && LA16_137 <= 'd')||(LA16_137 >= 'f' && LA16_137 <= 'z')) ) {s = 56;}
						else if ( ((LA16_137 >= '\u0000' && LA16_137 <= '\b')||(LA16_137 >= '\u000B' && LA16_137 <= '\f')||(LA16_137 >= '\u000E' && LA16_137 <= '\u001F')||(LA16_137 >= '~' && LA16_137 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 46 : 
						int LA16_26 = input.LA(1);
						s = -1;
						if ( (LA16_26=='e') ) {s = 85;}
						else if ( (LA16_26=='_') ) {s = 62;}
						else if ( ((LA16_26 >= '0' && LA16_26 <= '9')||(LA16_26 >= 'A' && LA16_26 <= 'Z')||(LA16_26 >= 'a' && LA16_26 <= 'd')||(LA16_26 >= 'f' && LA16_26 <= 'z')) ) {s = 56;}
						else if ( ((LA16_26 >= '\u0000' && LA16_26 <= '\b')||(LA16_26 >= '\u000B' && LA16_26 <= '\f')||(LA16_26 >= '\u000E' && LA16_26 <= '\u001F')||(LA16_26 >= '~' && LA16_26 <= '\uFFFF')) ) {s = 63;}
						else s = 61;
						if ( s>=0 ) return s;
						break;

					case 47 : 
						int LA16_73 = input.LA(1);
						s = -1;
						if ( (LA16_73=='l') ) {s = 137;}
						else if ( (LA16_73=='_') ) {s = 62;}
						else if ( ((LA16_73 >= '0' && LA16_73 <= '9')||(LA16_73 >= 'A' && LA16_73 <= 'Z')||(LA16_73 >= 'a' && LA16_73 <= 'k')||(LA16_73 >= 'm' && LA16_73 <= 'z')) ) {s = 56;}
						else if ( ((LA16_73 >= '\u0000' && LA16_73 <= '\b')||(LA16_73 >= '\u000B' && LA16_73 <= '\f')||(LA16_73 >= '\u000E' && LA16_73 <= '\u001F')||(LA16_73 >= '~' && LA16_73 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 48 : 
						int LA16_163 = input.LA(1);
						s = -1;
						if ( (LA16_163=='_') ) {s = 62;}
						else if ( ((LA16_163 >= '0' && LA16_163 <= '9')||(LA16_163 >= 'A' && LA16_163 <= 'Z')||(LA16_163 >= 'a' && LA16_163 <= 'z')) ) {s = 56;}
						else if ( ((LA16_163 >= '\u0000' && LA16_163 <= '\b')||(LA16_163 >= '\u000B' && LA16_163 <= '\f')||(LA16_163 >= '\u000E' && LA16_163 <= '\u001F')||(LA16_163 >= '~' && LA16_163 <= '\uFFFF')) ) {s = 63;}
						else s = 177;
						if ( s>=0 ) return s;
						break;

					case 49 : 
						int LA16_179 = input.LA(1);
						s = -1;
						if ( (LA16_179=='_') ) {s = 62;}
						else if ( ((LA16_179 >= '0' && LA16_179 <= '9')||(LA16_179 >= 'A' && LA16_179 <= 'Z')||(LA16_179 >= 'a' && LA16_179 <= 'z')) ) {s = 56;}
						else if ( ((LA16_179 >= '\u0000' && LA16_179 <= '\b')||(LA16_179 >= '\u000B' && LA16_179 <= '\f')||(LA16_179 >= '\u000E' && LA16_179 <= '\u001F')||(LA16_179 >= '~' && LA16_179 <= '\uFFFF')) ) {s = 63;}
						else s = 184;
						if ( s>=0 ) return s;
						break;

					case 50 : 
						int LA16_75 = input.LA(1);
						s = -1;
						if ( (LA16_75=='m') ) {s = 139;}
						else if ( (LA16_75=='_') ) {s = 62;}
						else if ( ((LA16_75 >= '0' && LA16_75 <= '9')||(LA16_75 >= 'A' && LA16_75 <= 'Z')||(LA16_75 >= 'a' && LA16_75 <= 'l')||(LA16_75 >= 'n' && LA16_75 <= 'z')) ) {s = 56;}
						else if ( ((LA16_75 >= '\u0000' && LA16_75 <= '\b')||(LA16_75 >= '\u000B' && LA16_75 <= '\f')||(LA16_75 >= '\u000E' && LA16_75 <= '\u001F')||(LA16_75 >= '~' && LA16_75 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 51 : 
						int LA16_139 = input.LA(1);
						s = -1;
						if ( (LA16_139=='e') ) {s = 163;}
						else if ( (LA16_139=='_') ) {s = 62;}
						else if ( ((LA16_139 >= '0' && LA16_139 <= '9')||(LA16_139 >= 'A' && LA16_139 <= 'Z')||(LA16_139 >= 'a' && LA16_139 <= 'd')||(LA16_139 >= 'f' && LA16_139 <= 'z')) ) {s = 56;}
						else if ( ((LA16_139 >= '\u0000' && LA16_139 <= '\b')||(LA16_139 >= '\u000B' && LA16_139 <= '\f')||(LA16_139 >= '\u000E' && LA16_139 <= '\u001F')||(LA16_139 >= '~' && LA16_139 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 52 : 
						int LA16_180 = input.LA(1);
						s = -1;
						if ( (LA16_180=='_') ) {s = 62;}
						else if ( ((LA16_180 >= '0' && LA16_180 <= '9')||(LA16_180 >= 'A' && LA16_180 <= 'Z')||(LA16_180 >= 'a' && LA16_180 <= 'z')) ) {s = 56;}
						else if ( ((LA16_180 >= '\u0000' && LA16_180 <= '\b')||(LA16_180 >= '\u000B' && LA16_180 <= '\f')||(LA16_180 >= '\u000E' && LA16_180 <= '\u001F')||(LA16_180 >= '~' && LA16_180 <= '\uFFFF')) ) {s = 63;}
						else s = 185;
						if ( s>=0 ) return s;
						break;

					case 53 : 
						int LA16_0 = input.LA(1);
						s = -1;
						if ( (LA16_0=='-') ) {s = 1;}
						else if ( (LA16_0=='_') ) {s = 2;}
						else if ( (LA16_0=='\t'||LA16_0==' ') ) {s = 3;}
						else if ( (LA16_0=='\r') ) {s = 4;}
						else if ( (LA16_0=='\n') ) {s = 5;}
						else if ( (LA16_0=='!') ) {s = 6;}
						else if ( (LA16_0=='c') ) {s = 7;}
						else if ( (LA16_0=='d') ) {s = 8;}
						else if ( (LA16_0=='e') ) {s = 9;}
						else if ( (LA16_0=='f') ) {s = 10;}
						else if ( (LA16_0=='i') ) {s = 11;}
						else if ( (LA16_0=='s') ) {s = 12;}
						else if ( (LA16_0=='t') ) {s = 13;}
						else if ( (LA16_0=='u') ) {s = 14;}
						else if ( (LA16_0=='w') ) {s = 15;}
						else if ( (LA16_0=='{') ) {s = 16;}
						else if ( (LA16_0=='}') ) {s = 17;}
						else if ( (LA16_0==')') ) {s = 18;}
						else if ( (LA16_0=='(') ) {s = 19;}
						else if ( (LA16_0=='[') ) {s = 20;}
						else if ( (LA16_0==']') ) {s = 21;}
						else if ( (LA16_0=='`') ) {s = 22;}
						else if ( (LA16_0=='$') ) {s = 23;}
						else if ( (LA16_0=='@') ) {s = 24;}
						else if ( (LA16_0=='.') ) {s = 25;}
						else if ( (LA16_0=='l') ) {s = 26;}
						else if ( (LA16_0=='*') ) {s = 27;}
						else if ( (LA16_0=='=') ) {s = 28;}
						else if ( (LA16_0=='+') ) {s = 29;}
						else if ( (LA16_0=='&') ) {s = 30;}
						else if ( (LA16_0=='<') ) {s = 31;}
						else if ( (LA16_0=='>') ) {s = 32;}
						else if ( (LA16_0=='^') ) {s = 33;}
						else if ( (LA16_0=='/') ) {s = 34;}
						else if ( (LA16_0=='%') ) {s = 35;}
						else if ( (LA16_0=='|') ) {s = 36;}
						else if ( (LA16_0==';') ) {s = 37;}
						else if ( (LA16_0=='\"') ) {s = 38;}
						else if ( (LA16_0=='\'') ) {s = 39;}
						else if ( (LA16_0==',') ) {s = 40;}
						else if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {s = 41;}
						else if ( ((LA16_0 >= 'A' && LA16_0 <= 'Z')||(LA16_0 >= 'a' && LA16_0 <= 'b')||(LA16_0 >= 'g' && LA16_0 <= 'h')||(LA16_0 >= 'j' && LA16_0 <= 'k')||(LA16_0 >= 'm' && LA16_0 <= 'r')||LA16_0=='v'||(LA16_0 >= 'x' && LA16_0 <= 'z')) ) {s = 42;}
						else if ( (LA16_0=='~') ) {s = 43;}
						else if ( (LA16_0=='#') ) {s = 44;}
						else if ( (LA16_0==':') ) {s = 45;}
						else if ( (LA16_0=='?') ) {s = 46;}
						else if ( (LA16_0=='\\') ) {s = 47;}
						else if ( ((LA16_0 >= '\u0000' && LA16_0 <= '\b')||(LA16_0 >= '\u000B' && LA16_0 <= '\f')||(LA16_0 >= '\u000E' && LA16_0 <= '\u001F')||(LA16_0 >= '\u007F' && LA16_0 <= '\uFFFF')) ) {s = 48;}
						if ( s>=0 ) return s;
						break;

					case 54 : 
						int LA16_166 = input.LA(1);
						s = -1;
						if ( (LA16_166=='e') ) {s = 180;}
						else if ( (LA16_166=='_') ) {s = 62;}
						else if ( ((LA16_166 >= '0' && LA16_166 <= '9')||(LA16_166 >= 'A' && LA16_166 <= 'Z')||(LA16_166 >= 'a' && LA16_166 <= 'd')||(LA16_166 >= 'f' && LA16_166 <= 'z')) ) {s = 56;}
						else if ( ((LA16_166 >= '\u0000' && LA16_166 <= '\b')||(LA16_166 >= '\u000B' && LA16_166 <= '\f')||(LA16_166 >= '\u000E' && LA16_166 <= '\u001F')||(LA16_166 >= '~' && LA16_166 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 55 : 
						int LA16_142 = input.LA(1);
						s = -1;
						if ( (LA16_142=='l') ) {s = 166;}
						else if ( (LA16_142=='_') ) {s = 62;}
						else if ( ((LA16_142 >= '0' && LA16_142 <= '9')||(LA16_142 >= 'A' && LA16_142 <= 'Z')||(LA16_142 >= 'a' && LA16_142 <= 'k')||(LA16_142 >= 'm' && LA16_142 <= 'z')) ) {s = 56;}
						else if ( ((LA16_142 >= '\u0000' && LA16_142 <= '\b')||(LA16_142 >= '\u000B' && LA16_142 <= '\f')||(LA16_142 >= '\u000E' && LA16_142 <= '\u001F')||(LA16_142 >= '~' && LA16_142 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 56 : 
						int LA16_55 = input.LA(1);
						s = -1;
						if ( (LA16_55=='_') ) {s = 55;}
						else if ( ((LA16_55 >= '0' && LA16_55 <= '9')||(LA16_55 >= 'A' && LA16_55 <= 'Z')||(LA16_55 >= 'a' && LA16_55 <= 'z')) ) {s = 56;}
						else if ( ((LA16_55 >= '\u0000' && LA16_55 <= '\b')||(LA16_55 >= '\u000B' && LA16_55 <= '\f')||(LA16_55 >= '\u000E' && LA16_55 <= '\u001F')||(LA16_55 >= '~' && LA16_55 <= '\uFFFF')) ) {s = 48;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 57 : 
						int LA16_41 = input.LA(1);
						s = -1;
						if ( ((LA16_41 >= '0' && LA16_41 <= '9')) ) {s = 107;}
						else if ( ((LA16_41 >= '\u0000' && LA16_41 <= '\b')||(LA16_41 >= '\u000B' && LA16_41 <= '\f')||(LA16_41 >= '\u000E' && LA16_41 <= '\u001F')||(LA16_41 >= 'A' && LA16_41 <= 'Z')||LA16_41=='_'||(LA16_41 >= 'a' && LA16_41 <= 'z')||(LA16_41 >= '~' && LA16_41 <= '\uFFFF')) ) {s = 63;}
						else s = 106;
						if ( s>=0 ) return s;
						break;

					case 58 : 
						int LA16_78 = input.LA(1);
						s = -1;
						if ( (LA16_78=='i') ) {s = 142;}
						else if ( (LA16_78=='_') ) {s = 62;}
						else if ( ((LA16_78 >= '0' && LA16_78 <= '9')||(LA16_78 >= 'A' && LA16_78 <= 'Z')||(LA16_78 >= 'a' && LA16_78 <= 'h')||(LA16_78 >= 'j' && LA16_78 <= 'z')) ) {s = 56;}
						else if ( ((LA16_78 >= '\u0000' && LA16_78 <= '\b')||(LA16_78 >= '\u000B' && LA16_78 <= '\f')||(LA16_78 >= '\u000E' && LA16_78 <= '\u001F')||(LA16_78 >= '~' && LA16_78 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 59 : 
						int LA16_183 = input.LA(1);
						s = -1;
						if ( (LA16_183=='_') ) {s = 62;}
						else if ( ((LA16_183 >= '0' && LA16_183 <= '9')||(LA16_183 >= 'A' && LA16_183 <= 'Z')||(LA16_183 >= 'a' && LA16_183 <= 'z')) ) {s = 56;}
						else if ( ((LA16_183 >= '\u0000' && LA16_183 <= '\b')||(LA16_183 >= '\u000B' && LA16_183 <= '\f')||(LA16_183 >= '\u000E' && LA16_183 <= '\u001F')||(LA16_183 >= '~' && LA16_183 <= '\uFFFF')) ) {s = 63;}
						else s = 188;
						if ( s>=0 ) return s;
						break;

					case 60 : 
						int LA16_43 = input.LA(1);
						s = -1;
						if ( ((LA16_43 >= '\u0000' && LA16_43 <= '\b')||(LA16_43 >= '\u000B' && LA16_43 <= '\f')||(LA16_43 >= '\u000E' && LA16_43 <= '\u001F')||LA16_43=='_'||(LA16_43 >= '~' && LA16_43 <= '\uFFFF')) ) {s = 48;}
						else if ( ((LA16_43 >= '0' && LA16_43 <= '9')||(LA16_43 >= 'A' && LA16_43 <= 'Z')||(LA16_43 >= 'a' && LA16_43 <= 'z')) ) {s = 63;}
						else s = 108;
						if ( s>=0 ) return s;
						break;

					case 61 : 
						int LA16_162 = input.LA(1);
						s = -1;
						if ( (LA16_162=='_') ) {s = 62;}
						else if ( ((LA16_162 >= '0' && LA16_162 <= '9')||(LA16_162 >= 'A' && LA16_162 <= 'Z')||(LA16_162 >= 'a' && LA16_162 <= 'z')) ) {s = 56;}
						else if ( ((LA16_162 >= '\u0000' && LA16_162 <= '\b')||(LA16_162 >= '\u000B' && LA16_162 <= '\f')||(LA16_162 >= '\u000E' && LA16_162 <= '\u001F')||(LA16_162 >= '~' && LA16_162 <= '\uFFFF')) ) {s = 63;}
						else s = 176;
						if ( s>=0 ) return s;
						break;

					case 62 : 
						int LA16_140 = input.LA(1);
						s = -1;
						if ( (LA16_140=='t') ) {s = 164;}
						else if ( (LA16_140=='_') ) {s = 62;}
						else if ( ((LA16_140 >= '0' && LA16_140 <= '9')||(LA16_140 >= 'A' && LA16_140 <= 'Z')||(LA16_140 >= 'a' && LA16_140 <= 's')||(LA16_140 >= 'u' && LA16_140 <= 'z')) ) {s = 56;}
						else if ( ((LA16_140 >= '\u0000' && LA16_140 <= '\b')||(LA16_140 >= '\u000B' && LA16_140 <= '\f')||(LA16_140 >= '\u000E' && LA16_140 <= '\u001F')||(LA16_140 >= '~' && LA16_140 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 63 : 
						int LA16_15 = input.LA(1);
						s = -1;
						if ( (LA16_15=='h') ) {s = 78;}
						else if ( (LA16_15=='_') ) {s = 62;}
						else if ( ((LA16_15 >= '0' && LA16_15 <= '9')||(LA16_15 >= 'A' && LA16_15 <= 'Z')||(LA16_15 >= 'a' && LA16_15 <= 'g')||(LA16_15 >= 'i' && LA16_15 <= 'z')) ) {s = 56;}
						else if ( ((LA16_15 >= '\u0000' && LA16_15 <= '\b')||(LA16_15 >= '\u000B' && LA16_15 <= '\f')||(LA16_15 >= '\u000E' && LA16_15 <= '\u001F')||(LA16_15 >= '~' && LA16_15 <= '\uFFFF')) ) {s = 63;}
						else s = 61;
						if ( s>=0 ) return s;
						break;

					case 64 : 
						int LA16_76 = input.LA(1);
						s = -1;
						if ( (LA16_76=='s') ) {s = 140;}
						else if ( (LA16_76=='_') ) {s = 62;}
						else if ( ((LA16_76 >= '0' && LA16_76 <= '9')||(LA16_76 >= 'A' && LA16_76 <= 'Z')||(LA16_76 >= 'a' && LA16_76 <= 'r')||(LA16_76 >= 't' && LA16_76 <= 'z')) ) {s = 56;}
						else if ( ((LA16_76 >= '\u0000' && LA16_76 <= '\b')||(LA16_76 >= '\u000B' && LA16_76 <= '\f')||(LA16_76 >= '\u000E' && LA16_76 <= '\u001F')||(LA16_76 >= '~' && LA16_76 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 65 : 
						int LA16_71 = input.LA(1);
						s = -1;
						if ( (LA16_71=='_') ) {s = 62;}
						else if ( ((LA16_71 >= '0' && LA16_71 <= '9')||(LA16_71 >= 'A' && LA16_71 <= 'Z')||(LA16_71 >= 'a' && LA16_71 <= 'z')) ) {s = 56;}
						else if ( ((LA16_71 >= '\u0000' && LA16_71 <= '\b')||(LA16_71 >= '\u000B' && LA16_71 <= '\f')||(LA16_71 >= '\u000E' && LA16_71 <= '\u001F')||(LA16_71 >= '~' && LA16_71 <= '\uFFFF')) ) {s = 63;}
						else s = 135;
						if ( s>=0 ) return s;
						break;

					case 66 : 
						int LA16_14 = input.LA(1);
						s = -1;
						if ( (LA16_14=='n') ) {s = 77;}
						else if ( (LA16_14=='_') ) {s = 62;}
						else if ( ((LA16_14 >= '0' && LA16_14 <= '9')||(LA16_14 >= 'A' && LA16_14 <= 'Z')||(LA16_14 >= 'a' && LA16_14 <= 'm')||(LA16_14 >= 'o' && LA16_14 <= 'z')) ) {s = 56;}
						else if ( ((LA16_14 >= '\u0000' && LA16_14 <= '\b')||(LA16_14 >= '\u000B' && LA16_14 <= '\f')||(LA16_14 >= '\u000E' && LA16_14 <= '\u001F')||(LA16_14 >= '~' && LA16_14 <= '\uFFFF')) ) {s = 63;}
						else s = 61;
						if ( s>=0 ) return s;
						break;

					case 67 : 
						int LA16_10 = input.LA(1);
						s = -1;
						if ( (LA16_10=='i') ) {s = 68;}
						else if ( (LA16_10=='o') ) {s = 69;}
						else if ( (LA16_10=='u') ) {s = 70;}
						else if ( (LA16_10=='_') ) {s = 62;}
						else if ( ((LA16_10 >= '0' && LA16_10 <= '9')||(LA16_10 >= 'A' && LA16_10 <= 'Z')||(LA16_10 >= 'a' && LA16_10 <= 'h')||(LA16_10 >= 'j' && LA16_10 <= 'n')||(LA16_10 >= 'p' && LA16_10 <= 't')||(LA16_10 >= 'v' && LA16_10 <= 'z')) ) {s = 56;}
						else if ( ((LA16_10 >= '\u0000' && LA16_10 <= '\b')||(LA16_10 >= '\u000B' && LA16_10 <= '\f')||(LA16_10 >= '\u000E' && LA16_10 <= '\u001F')||(LA16_10 >= '~' && LA16_10 <= '\uFFFF')) ) {s = 63;}
						else s = 61;
						if ( s>=0 ) return s;
						break;

					case 68 : 
						int LA16_72 = input.LA(1);
						s = -1;
						if ( (LA16_72=='_') ) {s = 62;}
						else if ( ((LA16_72 >= '0' && LA16_72 <= '9')||(LA16_72 >= 'A' && LA16_72 <= 'Z')||(LA16_72 >= 'a' && LA16_72 <= 'z')) ) {s = 56;}
						else if ( ((LA16_72 >= '\u0000' && LA16_72 <= '\b')||(LA16_72 >= '\u000B' && LA16_72 <= '\f')||(LA16_72 >= '\u000E' && LA16_72 <= '\u001F')||(LA16_72 >= '~' && LA16_72 <= '\uFFFF')) ) {s = 63;}
						else s = 136;
						if ( s>=0 ) return s;
						break;

					case 69 : 
						int LA16_85 = input.LA(1);
						s = -1;
						if ( (LA16_85=='t') ) {s = 143;}
						else if ( (LA16_85=='_') ) {s = 62;}
						else if ( ((LA16_85 >= '0' && LA16_85 <= '9')||(LA16_85 >= 'A' && LA16_85 <= 'Z')||(LA16_85 >= 'a' && LA16_85 <= 's')||(LA16_85 >= 'u' && LA16_85 <= 'z')) ) {s = 56;}
						else if ( ((LA16_85 >= '\u0000' && LA16_85 <= '\b')||(LA16_85 >= '\u000B' && LA16_85 <= '\f')||(LA16_85 >= '\u000E' && LA16_85 <= '\u001F')||(LA16_85 >= '~' && LA16_85 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 70 : 
						int LA16_12 = input.LA(1);
						s = -1;
						if ( (LA16_12=='e') ) {s = 73;}
						else if ( (LA16_12=='_') ) {s = 62;}
						else if ( ((LA16_12 >= '0' && LA16_12 <= '9')||(LA16_12 >= 'A' && LA16_12 <= 'Z')||(LA16_12 >= 'a' && LA16_12 <= 'd')||(LA16_12 >= 'f' && LA16_12 <= 'z')) ) {s = 56;}
						else if ( ((LA16_12 >= '\u0000' && LA16_12 <= '\b')||(LA16_12 >= '\u000B' && LA16_12 <= '\f')||(LA16_12 >= '\u000E' && LA16_12 <= '\u001F')||(LA16_12 >= '~' && LA16_12 <= '\uFFFF')) ) {s = 63;}
						else s = 61;
						if ( s>=0 ) return s;
						break;

					case 71 : 
						int LA16_67 = input.LA(1);
						s = -1;
						if ( (LA16_67=='p') ) {s = 131;}
						else if ( (LA16_67=='_') ) {s = 62;}
						else if ( ((LA16_67 >= '0' && LA16_67 <= '9')||(LA16_67 >= 'A' && LA16_67 <= 'Z')||(LA16_67 >= 'a' && LA16_67 <= 'o')||(LA16_67 >= 'q' && LA16_67 <= 'z')) ) {s = 56;}
						else if ( ((LA16_67 >= '\u0000' && LA16_67 <= '\b')||(LA16_67 >= '\u000B' && LA16_67 <= '\f')||(LA16_67 >= '\u000E' && LA16_67 <= '\u001F')||(LA16_67 >= '~' && LA16_67 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 72 : 
						int LA16_131 = input.LA(1);
						s = -1;
						if ( (LA16_131=='o') ) {s = 158;}
						else if ( (LA16_131=='_') ) {s = 62;}
						else if ( ((LA16_131 >= '0' && LA16_131 <= '9')||(LA16_131 >= 'A' && LA16_131 <= 'Z')||(LA16_131 >= 'a' && LA16_131 <= 'n')||(LA16_131 >= 'p' && LA16_131 <= 'z')) ) {s = 56;}
						else if ( ((LA16_131 >= '\u0000' && LA16_131 <= '\b')||(LA16_131 >= '\u000B' && LA16_131 <= '\f')||(LA16_131 >= '\u000E' && LA16_131 <= '\u001F')||(LA16_131 >= '~' && LA16_131 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 73 : 
						int LA16_13 = input.LA(1);
						s = -1;
						if ( (LA16_13=='h') ) {s = 74;}
						else if ( (LA16_13=='i') ) {s = 75;}
						else if ( (LA16_13=='e') ) {s = 76;}
						else if ( (LA16_13=='_') ) {s = 62;}
						else if ( ((LA16_13 >= '0' && LA16_13 <= '9')||(LA16_13 >= 'A' && LA16_13 <= 'Z')||(LA16_13 >= 'a' && LA16_13 <= 'd')||(LA16_13 >= 'f' && LA16_13 <= 'g')||(LA16_13 >= 'j' && LA16_13 <= 'z')) ) {s = 56;}
						else if ( ((LA16_13 >= '\u0000' && LA16_13 <= '\b')||(LA16_13 >= '\u000B' && LA16_13 <= '\f')||(LA16_13 >= '\u000E' && LA16_13 <= '\u001F')||(LA16_13 >= '~' && LA16_13 <= '\uFFFF')) ) {s = 63;}
						else s = 61;
						if ( s>=0 ) return s;
						break;

					case 74 : 
						int LA16_158 = input.LA(1);
						s = -1;
						if ( (LA16_158=='r') ) {s = 173;}
						else if ( (LA16_158=='_') ) {s = 62;}
						else if ( ((LA16_158 >= '0' && LA16_158 <= '9')||(LA16_158 >= 'A' && LA16_158 <= 'Z')||(LA16_158 >= 'a' && LA16_158 <= 'q')||(LA16_158 >= 's' && LA16_158 <= 'z')) ) {s = 56;}
						else if ( ((LA16_158 >= '\u0000' && LA16_158 <= '\b')||(LA16_158 >= '\u000B' && LA16_158 <= '\f')||(LA16_158 >= '\u000E' && LA16_158 <= '\u001F')||(LA16_158 >= '~' && LA16_158 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;

					case 75 : 
						int LA16_173 = input.LA(1);
						s = -1;
						if ( (LA16_173=='t') ) {s = 181;}
						else if ( (LA16_173=='_') ) {s = 62;}
						else if ( ((LA16_173 >= '0' && LA16_173 <= '9')||(LA16_173 >= 'A' && LA16_173 <= 'Z')||(LA16_173 >= 'a' && LA16_173 <= 's')||(LA16_173 >= 'u' && LA16_173 <= 'z')) ) {s = 56;}
						else if ( ((LA16_173 >= '\u0000' && LA16_173 <= '\b')||(LA16_173 >= '\u000B' && LA16_173 <= '\f')||(LA16_173 >= '\u000E' && LA16_173 <= '\u001F')||(LA16_173 >= '~' && LA16_173 <= '\uFFFF')) ) {s = 63;}
						else s = 124;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 16, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
