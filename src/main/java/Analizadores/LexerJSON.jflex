/*Seccion codigo de usuario*/
package com.mycompany.Analizadores;
import com.mycompany.Analizadores.sym;
import java.util.ArrayList;
import java_cup.runtime.*;
%%

/*Seccion configuracion*/
%class lexerJSON
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
VARIABLES = ("Variables")
METODOS = ( "Metodos" )
COMENTARIO = ( "Comentarios" )
CLASES = ( "Clases")
SCORE = ("Score" ) 
NOMBRE = ( "Nombre")
FUNCION = ( "Funcion" )
PARAMETROS = ( "Parametros" )
TEXTO = ( "Texto" )
IGUAL = ( "=" )
Op_MATEMATICO = ("+", "-", "-", "/")
MULTIPLICACION = ( "*" )
PARENTESIS_A = ( "(" )
PARENTESIS_C = ( ")" )
LLAVE_A = ( "{" )
LLAVE_C = ( "}" ) 
CORCHETE_A = ( "[" )
CORCHETE_C = ( "]" )
P_COMA = ( ";" )
COMA = ( "," )
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

{VARIABLES} {return new Symbol(sym.VARIABLES, yyline + 1, yycolumn + 1, yytext());}

{METODOS} {return new Symbol(sym.METODOS, yyline + 1, yycolumn + 1, yytext());}

{COMENTARIO} {return new Symbol(sym.COMENTARIO, yyline + 1, yycolumn + 1, yytext());}
 
{CLASES} {return new Symbol(sym.CLASES, yyline + 1, yycolumn + 1, yytext());}

{SCORE} {return new Symbol(sym.SCORE, yyline + 1, yycolumn + 1, yytext());}

{NOMBRE} {return new Symbol(sym.NOMBRE, yyline + 1, yycolumn + 1, yytext());}

{FUNCION} {return new Symbol(sym.FUNCION, yyline + 1, yycolumn + 1, yytext());}

{PARAMETROS} {return new Symbol(sym.PARAMETROS, yyline + 1, yycolumn + 1, yytext());}

{TEXTO} {return new Symbol(sym.TEXTO, yyline + 1, yycolumn + 1, yytext());}

/* Operador Igual */
 {IGUAL} {return new Symbol(sym.IGUAL, yyline + 1, yycolumn + 1, yytext());}

/* Operador Suma */
{Op_MATEMATICO} {return new Symbol(sym.Op_MATEMATICO, yyline + 1, yycolumn + 1, yytext());}

/* Operador Multiplicacion */
{MULTIPLICACION} {return new Symbol(sym.MULTIPLICACION, yyline + 1, yycolumn + 1, yytext());}


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

/* Coma */
{COMA} {return new Symbol(sym.COMA, yyline + 1, yycolumn + 1, yytext());}


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

