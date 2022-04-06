// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: C:/Users/USUARIO/Desktop/Analizador_copias/src/main/java/Analizadores/LexerHTML.jflex

/*Seccion codigo de usuario*/
package com.mycompany.Analizadores.Html;
import com.mycompany.Analizadores.Html.sym;
import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.List;

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class lexerHTML implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\1\1\4\22\0\1\1"+
    "\1\0\1\5\1\0\1\6\3\0\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\1\16\1\17\2\20\7\17"+
    "\1\21\1\22\1\23\1\24\1\25\2\0\4\26\1\27"+
    "\3\26\1\30\2\26\1\31\5\26\1\32\1\33\1\34"+
    "\1\35\5\26\1\36\1\0\1\37\1\0\1\40\1\0"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\2\26\1\52\1\53\1\54\1\55\2\26\1\56"+
    "\1\57\1\60\6\26\1\61\1\0\1\62\7\0\1\3"+
    "\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\2\3\1\4\1\1\1\5\1\6"+
    "\1\1\1\7\1\10\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\4\17\1\20\1\21\2\17\1\22\1\23\1\24"+
    "\7\0\6\17\14\0\6\17\10\0\1\25\1\26\1\27"+
    "\2\0\1\30\1\31\1\32\6\17\2\0\1\33\2\0"+
    "\1\34\1\35\1\36\2\0\2\17\1\37\1\17\1\40"+
    "\1\17\1\0\1\41\2\0\1\42\1\0\1\17\1\43"+
    "\1\44\1\17\1\0\1\45\1\0\1\46\1\47\1\17"+
    "\1\0\1\50\1\51\1\52";

  private static int [] zzUnpackAction() {
    int [] result = new int[118];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\63\0\63\0\63\0\146\0\63\0\231\0\63"+
    "\0\63\0\314\0\63\0\63\0\377\0\63\0\63\0\u0132"+
    "\0\63\0\63\0\u0165\0\u0198\0\u01cb\0\u01fe\0\63\0\63"+
    "\0\u0231\0\u0264\0\63\0\63\0\63\0\u0297\0\u02ca\0\u02fd"+
    "\0\u0330\0\u0363\0\u0396\0\u03c9\0\u03fc\0\u042f\0\u0462\0\u0495"+
    "\0\u04c8\0\u04fb\0\u052e\0\u0561\0\u0594\0\u05c7\0\u05fa\0\u062d"+
    "\0\u0660\0\u0693\0\u06c6\0\u06f9\0\u072c\0\u075f\0\u0792\0\u07c5"+
    "\0\u07f8\0\u082b\0\u085e\0\u0891\0\u08c4\0\u08f7\0\u092a\0\u095d"+
    "\0\u0990\0\u09c3\0\u09f6\0\u0a29\0\63\0\63\0\63\0\u0a5c"+
    "\0\u0a8f\0\63\0\63\0\63\0\u0ac2\0\u0af5\0\u0b28\0\u0b5b"+
    "\0\u0b8e\0\u0bc1\0\u0bf4\0\u0c27\0\63\0\u0c5a\0\u0c8d\0\63"+
    "\0\63\0\63\0\u0cc0\0\u0cf3\0\u0d26\0\u0d59\0\u0165\0\u0d8c"+
    "\0\u0165\0\u0dbf\0\u0df2\0\63\0\u0e25\0\u0e58\0\63\0\u0e8b"+
    "\0\u0ebe\0\u0165\0\u0165\0\u0ef1\0\u0f24\0\63\0\u0f57\0\63"+
    "\0\u0165\0\u0f8a\0\u0fbd\0\63\0\u0165\0\63";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[118];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\0\1\5\1\6\1\7\1\10"+
    "\1\11\1\2\1\12\1\13\1\2\1\14\1\2\2\15"+
    "\1\16\1\17\1\20\1\21\1\22\2\23\1\24\1\23"+
    "\1\25\1\26\2\23\1\27\1\30\1\2\7\23\1\31"+
    "\1\32\7\23\1\33\1\34\65\0\1\4\66\0\1\35"+
    "\67\0\1\36\66\0\2\15\60\0\1\37\23\0\1\40"+
    "\3\0\1\41\1\0\1\42\7\0\1\43\21\0\2\23"+
    "\5\0\10\23\2\0\1\44\20\23\21\0\2\23\5\0"+
    "\10\23\2\0\1\44\13\23\1\45\4\23\21\0\2\23"+
    "\5\0\1\23\1\46\6\23\2\0\1\44\20\23\21\0"+
    "\2\23\5\0\10\23\2\0\1\44\2\23\1\47\14\23"+
    "\1\50\21\0\2\23\5\0\10\23\2\0\1\44\1\51"+
    "\17\23\21\0\2\23\5\0\10\23\2\0\1\44\17\23"+
    "\1\52\16\0\1\53\114\0\1\54\1\0\1\55\7\0"+
    "\1\56\60\0\1\57\61\0\1\60\25\0\1\61\37\0"+
    "\1\62\43\0\1\63\2\0\1\64\3\0\1\65\5\0"+
    "\1\66\23\0\2\23\5\0\10\23\3\0\20\23\21\0"+
    "\2\23\5\0\10\23\2\0\1\44\17\23\1\67\21\0"+
    "\2\23\5\0\5\23\1\70\2\23\2\0\1\44\20\23"+
    "\21\0\2\23\5\0\10\23\2\0\1\44\14\23\1\71"+
    "\3\23\21\0\2\23\5\0\10\23\2\0\1\44\15\23"+
    "\1\72\2\23\21\0\2\23\5\0\10\23\2\0\1\44"+
    "\16\23\1\73\1\23\21\0\2\23\5\0\10\23\2\0"+
    "\1\44\4\23\1\74\13\23\15\0\1\75\124\0\1\76"+
    "\25\0\1\77\37\0\1\100\43\0\1\101\2\0\1\102"+
    "\3\0\1\103\5\0\1\104\31\0\1\105\113\0\1\106"+
    "\31\0\1\107\110\0\1\110\51\0\1\111\45\0\1\112"+
    "\62\0\1\113\62\0\1\114\54\0\2\23\5\0\10\23"+
    "\2\0\1\44\4\23\1\115\13\23\21\0\2\23\5\0"+
    "\7\23\1\116\2\0\1\44\20\23\21\0\2\23\5\0"+
    "\10\23\2\0\1\44\15\23\1\117\2\23\21\0\2\23"+
    "\5\0\10\23\2\0\1\44\10\23\1\120\7\23\21\0"+
    "\2\23\5\0\10\23\2\0\1\44\17\23\1\121\21\0"+
    "\2\23\5\0\10\23\2\0\1\44\15\23\1\122\2\23"+
    "\16\0\1\123\124\0\1\124\31\0\1\125\110\0\1\126"+
    "\51\0\1\127\45\0\1\130\62\0\1\131\62\0\1\132"+
    "\107\0\1\133\62\0\1\134\27\0\2\23\5\0\10\23"+
    "\2\0\1\44\6\23\1\135\11\23\21\0\2\23\5\0"+
    "\3\23\1\136\4\23\2\0\1\44\20\23\21\0\2\23"+
    "\5\0\10\23\2\0\1\44\4\23\1\137\13\23\21\0"+
    "\2\23\5\0\10\23\2\0\1\44\13\23\1\140\4\23"+
    "\21\0\2\23\5\0\10\23\2\0\1\44\1\141\17\23"+
    "\21\0\2\23\5\0\10\23\2\0\1\44\1\142\17\23"+
    "\15\0\1\143\74\0\1\144\107\0\1\145\62\0\1\146"+
    "\35\0\1\147\102\0\1\150\34\0\2\23\5\0\10\23"+
    "\2\0\1\44\4\23\1\151\13\23\21\0\2\23\5\0"+
    "\6\23\1\152\1\23\2\0\1\44\20\23\21\0\2\23"+
    "\5\0\10\23\2\0\1\44\6\23\1\153\11\23\21\0"+
    "\2\23\5\0\10\23\2\0\1\44\3\23\1\154\14\23"+
    "\20\0\1\155\71\0\1\156\102\0\1\157\42\0\1\160"+
    "\54\0\2\23\5\0\10\23\2\0\1\44\15\23\1\161"+
    "\2\23\21\0\2\23\5\0\10\23\2\0\1\44\14\23"+
    "\1\162\3\23\15\0\1\163\74\0\1\164\54\0\2\23"+
    "\5\0\10\23\2\0\1\44\15\23\1\165\2\23\13\0"+
    "\1\166\51\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4080];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\3\11\1\1\1\11\1\1\2\11\1\1\2\11"+
    "\1\1\2\11\1\1\2\11\4\1\2\11\2\1\3\11"+
    "\7\0\6\1\14\0\6\1\10\0\3\11\2\0\3\11"+
    "\6\1\2\0\1\11\2\0\3\11\2\0\6\1\1\0"+
    "\1\11\2\0\1\11\1\0\4\1\1\0\1\11\1\0"+
    "\1\11\2\1\1\0\1\11\1\1\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[118];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    public static ArrayList<String> ErroresLexicos=new ArrayList<String>();
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public lexerHTML(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.println("Caracter Invalido1: "+yytext()+" Linea: "+ (int)(yyline+1)+"columna"+(yycolumn+1)+";");
ErroresLexicos.add("Caracter Invalido1: "+yytext()+" Linea: "+ (int)(yyline+1)+"columna"+(yycolumn+1)+";");
            }
            // fall through
          case 43: break;
          case 2:
            { /*Ignora el espacio*/
            }
            // fall through
          case 44: break;
          case 3:
            { /*Ignora el separador*/
            }
            // fall through
          case 45: break;
          case 4:
            { return new Symbol(sym.COMILLAS, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 46: break;
          case 5:
            { return new Symbol(sym.PARENTESIS_A, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 47: break;
          case 6:
            { return new Symbol(sym.PARENTESIS_C, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 48: break;
          case 7:
            { return new Symbol(sym.COMA, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 49: break;
          case 8:
            { return new Symbol(sym.PUNTO, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 50: break;
          case 9:
            { return new Symbol(sym.NUMERO, yytext());
            }
            // fall through
          case 51: break;
          case 10:
            { return new Symbol(sym.D_PUNTOS, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 52: break;
          case 11:
            { return new Symbol(sym.P_COMA, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 53: break;
          case 12:
            { return new Symbol(sym.MENORQ, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 54: break;
          case 13:
            { return new Symbol(sym.IGUAL, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 55: break;
          case 14:
            { return new Symbol(sym.MAYORQ, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 56: break;
          case 15:
            { return new Symbol(sym.IDENTIFICADOR, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 57: break;
          case 16:
            { return new Symbol(sym.CORCHETE_A, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 58: break;
          case 17:
            { return new Symbol(sym.CORCHETE_C, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 59: break;
          case 18:
            { return new Symbol(sym.LLAVE_A, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 60: break;
          case 19:
            { return new Symbol(sym.LLAVE_C, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 61: break;
          case 20:
            { return new Symbol(sym.DOBLEDOLAR, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 62: break;
          case 21:
            { return new Symbol(sym.SALTOLINEA, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 63: break;
          case 22:
            { return new Symbol(sym.FOR, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 64: break;
          case 23:
            { return new Symbol(sym.ETIQUETA1, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 65: break;
          case 24:
            { return new Symbol(sym.INCOLUMD, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 66: break;
          case 25:
            { return new Symbol(sym.INCOLUMT, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 67: break;
          case 26:
            { return new Symbol(sym.INIFILCOLUM, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 68: break;
          case 27:
            { return new Symbol(sym.FINETIQUETA, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 69: break;
          case 28:
            { return new Symbol(sym.FINCOLUMD, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 70: break;
          case 29:
            { return new Symbol(sym.FINCOLUMT, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 71: break;
          case 30:
            { return new Symbol(sym.FINFILCOLUM, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 72: break;
          case 31:
            { return new Symbol(sym.SCORE, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 73: break;
          case 32:
            { return new Symbol(sym.HASTA, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 74: break;
          case 33:
            { return new Symbol(sym.FINFOR, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 75: break;
          case 34:
            { return new Symbol(sym.INHTML, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 76: break;
          case 35:
            { return new Symbol(sym.RESULTADO, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 77: break;
          case 36:
            { return new Symbol(sym.CADENA, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 78: break;
          case 37:
            { return new Symbol(sym.FINHTML, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 79: break;
          case 38:
            { return new Symbol(sym.INTABLA, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 80: break;
          case 39:
            { return new Symbol(sym.T_DATO, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 81: break;
          case 40:
            { return new Symbol(sym.FINTABLA, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 82: break;
          case 41:
            { return new Symbol(sym.ITERADOR, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 83: break;
          case 42:
            { return new Symbol(sym.Op_MATEMATICO, yyline + 1, yycolumn + 1, yytext());
            }
            // fall through
          case 84: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
