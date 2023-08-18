/*------------------ 1ra Area: Codigo de Usuario         ------------------*/

//----------> Paquetes, importaciones
package Analizadores;
//import java_cup.runtime.*;
import java.util.LinkedList;


/*------------------ 2da Area: Opciiones y Declaraciones ------------------*/
%%
%{
    //---> Codigo de usuario en sintaxis java
    public static LinkedList<TError> TablaEL = new LinkedList<TError>();
    public static LinkedList<Tokens> tabla_tokens = new LinkedList<Tokens>();
    
%}

%eof{
    System.out.println("Llegamos al final de esta mierda");
    //System.out.println(TablaEL.toString());
%eof}




//---> Directivas

%public
%class Analizador_Lexico
//%cupsym Simbolos
//%cup
//%char
%column
//%full
%ignorecase
%line
%unicode
%standalone

//---> Expresiones Regulares
numero = [0-9]+

//---> Estados
%%

/*------------------ 3ra Area: Reglas Lexicas            ------------------*/
//---> Simbolos

"+"                     {System.out.println("Reconocido " + yytext()+" mas");  tabla_tokens.add(new Tokens(yytext() ," Simbolo_mas " ,yyline ,yycolumn));}
"-"                     {System.out.println("Reconocido " + yytext()+" men"); }
"*"                     {System.out.println("Reconocido " + yytext()+" por"); }
"/"                     {System.out.println("Reconocido " + yytext()+" div"); }

//---> Simbolos ER
{numero}                {System.out.println("Reconocido " + yytext()+" numero"); }

//---> Espacios 
[\t\r\n\f\s]                          {/* White spaces */}

//---> Errores Lexicos

.            {
                System.out.println(" Error Lexico " + yytext() + " Linea " + yyline + " Columna " + yycolumn); 
                TError datos = new TError(yytext() ,"Error Lexico" ,yyline ,yycolumn);
                TablaEL.add(datos);
             }
