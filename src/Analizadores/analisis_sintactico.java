
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizadores;

import java_cup.runtime.Symbol;
import java.util.LinkedList;
import java.io.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class analisis_sintactico extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return Simbolos.class;
}

  /** Default constructor. */
  @Deprecated
  public analisis_sintactico() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public analisis_sintactico(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public analisis_sintactico(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\032\000\002\002\004\000\002\002\003\000\002\003" +
    "\003\000\002\003\003\000\002\003\003\000\002\004\004" +
    "\000\002\004\003\000\002\010\005\000\002\010\007\000" +
    "\002\006\004\000\002\006\003\000\002\005\005\000\002" +
    "\005\005\000\002\005\005\000\002\005\005\000\002\005" +
    "\003\000\002\012\007\000\002\013\004\000\002\013\003" +
    "\000\002\014\005\000\002\014\005\000\002\014\003\000" +
    "\002\014\003\000\002\015\003\000\002\015\005\000\002" +
    "\016\011" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\060\000\010\011\004\014\012\021\013\001\002\000" +
    "\004\012\043\001\002\000\014\002\ufffd\011\ufffd\014\ufffd" +
    "\021\ufffd\024\ufffd\001\002\000\016\002\uffea\011\uffea\014" +
    "\uffea\021\uffea\022\041\024\uffea\001\002\000\014\002\ufffb" +
    "\011\ufffb\014\ufffb\021\ufffb\024\ufffb\001\002\000\014\002" +
    "\uffff\011\uffff\014\uffff\021\uffff\024\uffff\001\002\000\004" +
    "\002\040\001\002\000\004\015\025\001\002\000\004\015" +
    "\017\001\002\000\012\002\000\011\004\014\012\021\013" +
    "\001\002\000\014\002\ufffe\011\ufffe\014\ufffe\021\ufffe\024" +
    "\ufffe\001\002\000\014\002\ufffc\011\ufffc\014\ufffc\021\ufffc" +
    "\024\ufffc\001\002\000\004\012\020\001\002\000\004\016" +
    "\021\001\002\000\004\023\022\001\002\000\010\011\004" +
    "\014\012\021\013\001\002\000\012\011\004\014\012\021" +
    "\013\024\024\001\002\000\016\002\uffe8\011\uffe8\014\uffe8" +
    "\021\uffe8\022\uffe8\024\uffe8\001\002\000\006\012\031\017" +
    "\026\001\002\000\012\005\uffeb\012\uffeb\016\uffeb\017\uffeb" +
    "\001\002\000\010\012\031\016\036\017\026\001\002\000" +
    "\012\005\032\012\uffef\016\uffef\017\uffef\001\002\000\012" +
    "\005\uffec\012\uffec\016\uffec\017\uffec\001\002\000\006\012" +
    "\034\017\033\001\002\000\012\005\uffed\012\uffed\016\uffed" +
    "\017\uffed\001\002\000\012\005\uffee\012\uffee\016\uffee\017" +
    "\uffee\001\002\000\012\005\032\012\ufff0\016\ufff0\017\ufff0" +
    "\001\002\000\004\004\037\001\002\000\014\002\ufff1\011" +
    "\ufff1\014\ufff1\021\ufff1\024\ufff1\001\002\000\004\002\001" +
    "\001\002\000\004\021\013\001\002\000\014\002\uffe9\011" +
    "\uffe9\014\uffe9\021\uffe9\024\uffe9\001\002\000\006\004\045" +
    "\013\044\001\002\000\004\020\046\001\002\000\014\002" +
    "\ufffa\011\ufffa\014\ufffa\021\ufffa\024\ufffa\001\002\000\016" +
    "\004\ufff2\005\ufff2\006\ufff2\007\ufff2\010\ufff2\020\ufff2\001" +
    "\002\000\006\004\061\020\046\001\002\000\016\004\ufff7" +
    "\005\054\006\052\007\053\010\051\020\ufff7\001\002\000" +
    "\004\020\046\001\002\000\004\020\046\001\002\000\004" +
    "\020\046\001\002\000\004\020\046\001\002\000\016\004" +
    "\ufff6\005\ufff6\006\ufff6\007\053\010\051\020\ufff6\001\002" +
    "\000\016\004\ufff4\005\ufff4\006\ufff4\007\ufff4\010\ufff4\020" +
    "\ufff4\001\002\000\016\004\ufff5\005\ufff5\006\ufff5\007\053" +
    "\010\051\020\ufff5\001\002\000\016\004\ufff3\005\ufff3\006" +
    "\ufff3\007\ufff3\010\ufff3\020\ufff3\001\002\000\014\002\ufff9" +
    "\011\ufff9\014\ufff9\021\ufff9\024\ufff9\001\002\000\016\004" +
    "\ufff8\005\054\006\052\007\053\010\051\020\ufff8\001\002" +
    "" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\060\000\020\002\010\003\006\004\013\010\014\012" +
    "\007\015\004\016\005\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\014\003\015\010\014\012\007\015\004\016\005\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\016\003\006\004" +
    "\022\010\014\012\007\015\004\016\005\001\001\000\014" +
    "\003\015\010\014\012\007\015\004\016\005\001\001\000" +
    "\002\001\001\000\006\013\026\014\027\001\001\000\002" +
    "\001\001\000\004\014\034\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\016\041\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\005\047\006\046\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\005\061" +
    "\001\001\000\002\001\001\000\004\005\057\001\001\000" +
    "\004\005\056\001\001\000\004\005\055\001\001\000\004" +
    "\005\054\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$analisis_sintactico$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$analisis_sintactico$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$analisis_sintactico$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


  
     public static LinkedList<TError> TablaES = new LinkedList<TError>();

    // Metodo al que se llama automaticamente ante algun error sintactico
    public void syntax_error(Symbol s){

        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;

        System.out.println("!!! Error Sintactico Recuperado");
        System.out.println("\t\tLexema: " + lexema);
        System.out.println("\t\tFila: " + fila);
        System.out.println("\t\tColumna: " + columna);

        TError datos = new TError(lexema ,"Error Sintactico" ,fila,columna);
        TablaES.add(datos);
    }

    // Metodo al que se llama en el momento en que ya no es posible una recuperacion de errores
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception
    {
        String lexema = s.value.toString();
        int fila = s.right;
        int columna = s.left;

        System.out.println("!!! Error Sintactico, Panic Mode");
        System.out.println("\t\tLexema: " + lexema);
        System.out.println("\t\tFila: " + fila);
        System.out.println("\t\tColumna: " + columna);

        TError datos = new TError(lexema ,"Error Sintactico" ,fila,columna);
        TablaES.add(datos);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$analisis_sintactico$actions {



  private final analisis_sintactico parser;

  /** Constructor */
  CUP$analisis_sintactico$actions(analisis_sintactico parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$analisis_sintactico$do_action_part00000000(
    int                        CUP$analisis_sintactico$act_num,
    java_cup.runtime.lr_parser CUP$analisis_sintactico$parser,
    java.util.Stack            CUP$analisis_sintactico$stack,
    int                        CUP$analisis_sintactico$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$analisis_sintactico$result;

      /* select the action based on the action number */
      switch (CUP$analisis_sintactico$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).right;
		String start_val = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).value;
		RESULT = start_val;
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$analisis_sintactico$parser.done_parsing();
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= STMSLIST 
            {
              String RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // STMS ::= PRINT_STMT 
            {
              String RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("STMS",1, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // STMS ::= DECLARATION_STMT 
            {
              String RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("STMS",1, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // STMS ::= IF_STM 
            {
              String RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("STMS",1, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // STMSLIST ::= STMSLIST STMS 
            {
              String RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("STMSLIST",2, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // STMSLIST ::= STMS 
            {
              String RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("STMSLIST",2, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // DECLARATION_STMT ::= reservada_int id punto_coma 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).value;
		 System.out.println("int " + a + " ; "); 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("DECLARATION_STMT",6, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // DECLARATION_STMT ::= reservada_int id igual ME punto_coma 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-3)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-3)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-3)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)).value;
		 System.out.println("int " + a + " = " + b + ";"); 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("DECLARATION_STMT",6, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // ME ::= ME E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = a; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("ME",4, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // ME ::= E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = a; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("ME",4, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // E ::= E Simbolo_mas E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = a + " + " + b; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // E ::= E Simbolo_menos E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = a + " - " + b; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // E ::= E Simbolo_multi E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = a + " * " + b; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // E ::= E Simbolo_divi E 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = a + " / " + b; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // E ::= numero 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = a; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("E",3, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // PRINT_STMT ::= reservada_console open_pare ARGS close_pare punto_coma 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		System.out.println("print(" + a + ")" ); 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("PRINT_STMT",8, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-4)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // ARGS ::= ARGS ARG 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = a; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("ARGS",9, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-1)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // ARGS ::= ARG 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = a; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("ARGS",9, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // ARG ::= ARG Simbolo_mas id 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = a + " , " + b; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("ARG",10, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // ARG ::= ARG Simbolo_mas string_literal 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int bright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = a + " , " + b; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("ARG",10, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // ARG ::= id 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = a; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("ARG",10, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // ARG ::= string_literal 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$analisis_sintactico$stack.peek()).value;
		 RESULT = a; 
              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("ARG",10, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // IF_STM ::= IF_S0 
            {
              String RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("IF_STM",11, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // IF_STM ::= IF_S0 reservada_else IF_S0 
            {
              String RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("IF_STM",11, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-2)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // IF_S0 ::= reservada_if open_pare id close_pare open_brace STMSLIST close_brace 
            {
              String RESULT =null;

              CUP$analisis_sintactico$result = parser.getSymbolFactory().newSymbol("IF_S0",12, ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.elementAt(CUP$analisis_sintactico$top-6)), ((java_cup.runtime.Symbol)CUP$analisis_sintactico$stack.peek()), RESULT);
            }
          return CUP$analisis_sintactico$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$analisis_sintactico$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$analisis_sintactico$do_action(
    int                        CUP$analisis_sintactico$act_num,
    java_cup.runtime.lr_parser CUP$analisis_sintactico$parser,
    java.util.Stack            CUP$analisis_sintactico$stack,
    int                        CUP$analisis_sintactico$top)
    throws java.lang.Exception
    {
              return CUP$analisis_sintactico$do_action_part00000000(
                               CUP$analisis_sintactico$act_num,
                               CUP$analisis_sintactico$parser,
                               CUP$analisis_sintactico$stack,
                               CUP$analisis_sintactico$top);
    }
}

}
