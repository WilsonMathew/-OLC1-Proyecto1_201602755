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
%}

//---> Directivas

%public
%class Analizador_Lexico
%type Tokens
//%cupsym Simbolos
//%cup
%char
%column
%full
%ignorecase
%line
%unicode

//---> Expresiones Regulares
numero = [0-9]+

//---> Estados
%%

/*------------------ 3ra Area: Reglas Lexicas            ------------------*/
//---> Simbolos

"+"                     {System.out.println("Reconocido " + yytext()+" mas" ); }
"-"                     {System.out.println("Reconocido " + yytext()+" menos"); }
"*"                     {System.out.println("Reconocido " + yytext()+" por"); }
"/"                     {System.out.println("Reconocido " + yytext()+" div"); }
"("                     {System.out.println("Reconocido " + yytext()+" par a"); }
")"                     {System.out.println("Reconocido " + yytext()+" par c"); }




//---> Simbolos ER
//numero                {System.out.println("Reconocido " + yytext()+" numero");}



//---> Espacios 
//[\t\r\n\f\s]                          {/* White spaces */}

//---> Errores Lexicos

.            {
                System.out.println("Error Lexico    " + yytext()+ "     Linea " + yyline + " Columna " + yycolumn); 
                TError datos = new TError(yytext(), yyline, yycolumn, "Error Lexico", "Simbolo no existe en el lenguaje");
                TablaEL.add(datos);
             }
