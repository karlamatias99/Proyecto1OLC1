/*Seccion codigo de usuario*/
package com.mycompany.Analizadores;
import com.mycompany.Analizadores.Html.sym;
import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.List;
%%

/*Seccion configuracion*/
%class lexerHTML
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
SEPARADOR = \r|\r\n|\n
ESPACIO = {SEPARADOR} | [ \t\f]
//COMENTARIOS = "</"(.)*["/>"]*
COMILLAS = ("\"")
MENORQ = ( "<" )
MAYORQ = ( ">" )
DATOS = ( "Integer" )
STRING = ( "String" )
INHTML = ( "<html>" )
FINHTML = ( "</html>" )
ETIQUETA1 = ( "<h1>" | "<h2>" )
FINETIQUETA = ( "</h1>" | "</h2>")
INTABLA = ( "<table>" )
FINTABLA = ( "</table>" )
FOR = ( "<for" )
ITERADOR = ( "iterador" )
HASTA = ( "hasta" )
DOBLEDOLAR = ( "$$" )
IGUAL = ( "=" )
Op_MATEMATICO = ( "+", "-", "-", "/","*" )
RESULTADO = ( "RESULT" )
SCORE = ( "Score" )
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
FINFOR = ( "</for>" )
INIFILCOLUM = ( "<tr>" )
FINFILCOLUM = ( "</tr>" )
INCOLUMT = ( "<th>" )
FINCOLUMT  = ( "</th>" )
INCOLUMD = ( "<td>" )
FINCOLUMD = ( "</td>" )
SALTOLINEA  = ( "<br>" )
%%


/*Seccion Reglas Lexicas*/

<YYINITIAL>{

{SEPARADOR} {/*Ignora el separador*/}
{ESPACIO} {/*Ignora el espacio*/}

/*Comentarios*/
//{COMENTARIOS} {/*Ignore*/}

/*comillas*/
{COMILLAS} {return new Symbol(sym.COMILLAS, yyline + 1, yycolumn + 1, yytext());}

/*tipos de datos*/ 
 {DATOS} {return new Symbol(sym.T_DATO, yyline + 1, yycolumn + 1, yytext());}

/* Tipo de dato String */
 {STRING} {return new Symbol(sym.CADENA, yyline + 1, yycolumn + 1, yytext());}

/* mayor que */
 {MAYORQ} {return new Symbol(sym.MAYORQ, yyline + 1, yycolumn + 1, yytext());}

/* menor que */
 {MENORQ} {return new Symbol(sym.MENORQ, yyline + 1, yycolumn + 1, yytext());}

/* Inicio etiqueta hmtl */
 {INHTML} {return new Symbol(sym.INHTML, yyline + 1, yycolumn + 1, yytext());}

/* final etiqueta hmtl */
 {FINHTML} {return new Symbol(sym.FINHTML, yyline + 1, yycolumn + 1, yytext());}

/* Inicio etiqueta */
 {ETIQUETA1} {return new Symbol(sym.ETIQUETA1, yyline + 1, yycolumn + 1, yytext());}

/* final etiqueta hmtl */
 {FINETIQUETA} {return new Symbol(sym.FINETIQUETA, yyline + 1, yycolumn + 1, yytext());}

/* Inicio etiqueta para tablas */
 {INTABLA} {return new Symbol(sym.INTABLA, yyline + 1, yycolumn + 1, yytext());}

/* final etiqueta para tablas */
 {FINTABLA} {return new Symbol(sym.FINTABLA, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada For */
{FOR} {return new Symbol(sym.FOR, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada iterador */
{ITERADOR} {return new Symbol(sym.ITERADOR, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada hasta */
{HASTA} {return new Symbol(sym.HASTA, yyline + 1, yycolumn + 1, yytext());}

/* Fin Palabra reservada For */
{FINFOR} {return new Symbol(sym.FINFOR, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada Columna Fila */
{INIFILCOLUM} {return new Symbol(sym.INIFILCOLUM, yyline + 1, yycolumn + 1, yytext());}

/* Fin Palabra reservada Columna Fila */
{FINFILCOLUM} {return new Symbol(sym.FINFILCOLUM, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada Columna Tipo */
{INCOLUMT} {return new Symbol(sym.INCOLUMT, yyline + 1, yycolumn + 1, yytext());}

/* Final Palabra reservada Columna Tipo */
{FINCOLUMT} {return new Symbol(sym.FINCOLUMT, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada Columna Dato */
{INCOLUMD} {return new Symbol(sym.INCOLUMD, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada Columna Dato */
{FINCOLUMD} {return new Symbol(sym.FINCOLUMD, yyline + 1, yycolumn + 1, yytext());}


/* Salto de linea */
{SALTOLINEA} {return new Symbol(sym.SALTOLINEA, yyline + 1, yycolumn + 1, yytext());}

{DOBLEDOLAR} {return new Symbol(sym.DOBLEDOLAR, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada result */
{RESULTADO} {return new Symbol(sym.RESULTADO, yyline + 1, yycolumn + 1, yytext());}

/* Palabra reservada Score */
{SCORE} {return new Symbol(sym.SCORE, yyline + 1, yycolumn + 1, yytext());}

/* Operador Igual */
 {IGUAL} {return new Symbol(sym.IGUAL, yyline + 1, yycolumn + 1, yytext());}

/* Operador Suma */
{Op_MATEMATICO} {return new Symbol(sym.Op_MATEMATICO, yyline + 1, yycolumn + 1, yytext());}

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

/* coma */
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
.   { 
System.out.println("Caracter Invalido1: "+yytext()+" Linea: "+ (int)(yyline+1)+"columna"+(yycolumn+1)+";");
ErroresLexicos.add("Caracter Invalido1: "+yytext()+" Linea: "+ (int)(yyline+1)+"columna"+(yycolumn+1)+";"); }