/*Seccion codigo de usuario*/
package com.mycompany.Analizadores;
import com.mycompany.Analizadores.sym;
import java.util.ArrayList;
import java_cup.runtime.*;
%%

/*Seccion configuracion*/
%class lexerJava
%cup
%unicode
%line
%column
%public

//Metodos
%{
    public static ArrayList<String> ErroresLexicos=new ArrayList<String>();
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}



//Palabras reservadas y tokens validos
D = [0-9]+
espacio = [\t\r\n]+
COMENTARIOS = ("//"(.)*)
COMENTARIOMULTILINEA = "/*"(.)*["*/"]*
COMILLAS = ("\"")
DATOS = ("int" | "char" | "boolean" | "double" | "void")
OBJETOS = ("Object" ) 
STRING = ( "String" )
IF = ( "If" | "if" )
ELSE = ("else")
DO = ( "do" )
WHILE = ( "while" )
FOR = ( "for" )
IMPORT = ( "import" ) 
JAVA = ( "java" )
UTIL = ( "util" )
PRIVATE = ( "private" ) 
PUBLIC = ( "public" )
PROTECTED = ( "protected" )
SWITCH = ( "switch" )
FINAL = ( "final" ) 
CASE = ( "case" )
CLASS = ( "class" )
NUEVO = ( "new" )
IGUAL = ( "=" )
Op_MATEMATICO = ("+", "-", "-", "/")
MULTIPLICACION = ( "*" )
Op_LOGICO = ( "&&" | "||" | "!" | "&" | "|" )
Op_RELACIONAL = ( ">" | "<" | "==" | "!=" | ">=" | "<=" | "<<" | ">>" )
Op_ATRIBUCION = ( "+=" | "-="  | "*=" | "/=" | "%=" )
Op_INCREMENTO = ( "++" | "--" )
Op_BOOLEANO = ("true" | "false")   
Sn_SALIDA = ("break" | "return")
Sn_THIS = ("this" )
PARENTESIS_A = ( "(" )
PARENTESIS_C = ( ")" )
LLAVE_A = ( "{" )
LLAVE_C = ( "}" ) 
CORCHETE_A = ( "[" )
CORCHETE_C = ( "]" )
P_COMA = ( ";" )
PUNTO = ( "." )
D_PUNTOS = ( ":" ) 
IDENTIFICADOR = [a-zA-Z](_?[a-zA-Z0-9])*
%%


/*Seccion Reglas Lexicas*/

<YYINITIAL>{
/*espacios en blanco*/
{espacio}  {/*Ignore*/}

/*Comentarios*/
{COMENTARIOS} {/*Ignore*/}

/*comentarios multilinea*/
{COMENTARIOMULTILINEA} {/*No se procesa*/} 

/*comillas*/
{COMILLAS} {return new Symbol(sym.COMILLAS, yyline + 1, yycolumn + 1, yytext());}

/*tipos de datos*/ 
 {DATOS} {return new Symbol(sym.T_DATO, yyline + 1, yycolumn + 1, yytext());}

/*tipos de datos Objeto*/ 
 {OBJETOS} {return new Symbol(sym.OBJETOS, yyline + 1, yycolumn + 1, yytext());}

/* Tipo de dato String */
 {STRING} {return new Symbol(sym.CADENA, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada If */
 {IF} {return new Symbol(sym.IF, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada Else */
{ELSE} {return new Symbol(sym.ELSE, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada Do */
{DO} {return new Symbol(sym.DO, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada While */
{WHILE} {return new Symbol(sym.WHILE, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada For */
{FOR} {return new Symbol(sym.FOR, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada import*/
{IMPORT} {return new Symbol(sym.IMPORT, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada java */
 {JAVA} {return new Symbol(sym.JAVA, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada util */
{UTIL} {return new Symbol(sym.UTIL, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada Private */
{PRIVATE} {return new Symbol(sym.PRIVATE, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada Public */
{PUBLIC} {return new Symbol(sym.PUBLIC, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada Protected */
{PROTECTED} {return new Symbol(sym.PROTECTED, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada final */
{FINAL} {return new Symbol(sym.FINAL, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada switch */
{SWITCH} {return new Symbol(sym.SWITCH, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada case */
 {CASE} {return new Symbol(sym.CASE, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada Class */
 {CLASS} {return new Symbol(sym.CLASS, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada New */
 {NUEVO} {return new Symbol(sym.NUEVO, yyline + 1, yycolumn + 1, yytext());}

/* Operador Igual */
 {IGUAL} {return new Symbol(sym.IGUAL, yyline + 1, yycolumn + 1, yytext());}

/* Operador Suma */
{Op_MATEMATICO} {return new Symbol(sym.Op_MATEMATICO, yyline + 1, yycolumn + 1, yytext());}

/* Operador Multiplicacion */
{MULTIPLICACION} {return new Symbol(sym.MULTIPLICACION, yyline + 1, yycolumn + 1, yytext());}

/* Operadores logicos */
{Op_LOGICO} {return new Symbol(sym.Op_LOGICO, yyline + 1, yycolumn + 1, yytext());}

/*Operadores Relacionales */
 {Op_RELACIONAL} {return new Symbol(sym.Op_RELACIONAL, yyline + 1, yycolumn + 1, yytext());}

/* Operadores Atribucion */
 {Op_ATRIBUCION} {return new Symbol(sym.Op_ATRIBUCION, yyline + 1, yycolumn + 1, yytext());}

/* Operadores Incremento y decremento */
 {Op_INCREMENTO} {return new Symbol(sym.Op_INCREMENTO, yyline + 1, yycolumn + 1, yytext());}

/*Operadores Booleanos*/
  {Op_BOOLEANO} {return new Symbol(sym.Op_BOOLEANO, yyline + 1, yycolumn + 1, yytext());}

/*Sentencias de salida */
{Sn_SALIDA} {return new Symbol(sym.Sn_SALIDA, yyline + 1, yycolumn + 1, yytext());}

/*Sentencia this */
{Sn_THIS} {return new Symbol(sym.Sn_THIS, yyline + 1, yycolumn + 1, yytext());}

/* Parentesis de apertura */
{PARENTESIS_A} {return new Symbol(sym.PARENTESIS_A, yyline + 1, yycolumn + 1, yytext());}

/* Parentesis de cierre */
{PARENTESIS_C} {return new Symbol(sym.PARENTESIS_C, yyline + 1, yycolumn + 1, yytext());}

/* Llave de apertura */
{LLAVE_A} {return new Symbol(sym.LLAVE_A, yyline + 1, yycolumn + 1, yytext());}

/* Llave de cierre */
{LLAVE_C} {return new Symbol(sym.LLAVE_C, yyline + 1, yycolumn + 1, yytext());}

/* Corchete de apertura */
{CORCHETE_A} {return new Symbol(sym.CORCHETE_A, yyline + 1, yycolumn + 1, yytext());}

/* Corchete de cierre */
{CORCHETE_C} {return new Symbol(sym.CORCHETE_C, yyline + 1, yycolumn + 1, yytext());}

/* Punto y coma */
{P_COMA} {return new Symbol(sym.P_COMA, yyline + 1, yycolumn + 1, yytext());}

/* Punto */
{PUNTO} {return new Symbol(sym.PUNTO, yyline + 1, yycolumn + 1, yytext());}

/* Dos Puntos */
{D_PUNTOS} {return new Symbol(sym.D_PUNTOS, yyline + 1, yycolumn + 1, yytext());}

/* Identificador */
{IDENTIFICADOR} {return new Symbol(sym.IDENTIFICADOR, yyline + 1, yycolumn + 1, yytext());}

/* Numero */
{D} {return new Symbol(sym.NUMERO, yytext());}
}

/* Error de analisis */
[^] {}
