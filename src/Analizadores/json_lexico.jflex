/*------------------ 1ra Area: Codigo de Usuario         ------------------*/

//----------> Paquetes, importaciones
package Analizadores;
import java_cup.runtime.*;
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
%class Analizador_json
%char
%column
%full
%ignorecase
%line
%unicode
%standalone

//---> Expresiones Regulares 
comentario              = "//"[^\n]*\n 
multi_comentario        = "/*"([^*]|("*"+[^*/]))*"*/"
DIGIT                   = [0-9]
numero                  = {DIGIT}+(\.{DIGIT}+)?([eE][+-]?{DIGIT}+)?
string_literal          = ("\""[^\n\"]*"\"")|(''[^\n\']*'')

 
//---> Estados
%%

/*------------------ 3ra Area: Reglas Lexicas            ------------------*/
//---> Simbolos
"{"         {System.out.println("Reconocido " + yytext()+" open_brace");  
            tabla_tokens.add(new Tokens(yytext() ,"open_brace" ,yyline ,yycolumn));
            }
"}"         {System.out.println("Reconocido " + yytext()+" close_brace"); 
            tabla_tokens.add(new Tokens(yytext() ,"close_brace" ,yyline ,yycolumn));
            }
","         {System.out.println("Reconocido " + yytext()+" coma");  
            tabla_tokens.add(new Tokens(yytext() ,"coma" ,yyline ,yycolumn));
            }
":"         {System.out.println("Reconocido " + yytext()+" dos_puntos");  
            tabla_tokens.add(new Tokens(yytext() ,"dos_puntos" ,yyline ,yycolumn));
            }

//---> Simbolos ER
{numero}                {System.out.println("Reconocido " + yytext()+" numero"); 
                        tabla_tokens.add(new Tokens(yytext() , "numero" ,yyline ,yycolumn)); 
                        }
{comentario}            {System.out.println("Reconocido " + yytext()+" comentario"); 
                        tabla_tokens.add(new Tokens(yytext() , "comentario" ,yyline ,yycolumn)); 
                        }
{multi_comentario}      {System.out.println("Reconocido " + yytext()+" multi_comentario"); 
                        tabla_tokens.add(new Tokens(yytext() , "multi_comentario" ,yyline ,yycolumn)); 
                        }
{string_literal}        {System.out.println("Reconocido " + yytext()+" string_literal"); 
                        tabla_tokens.add(new Tokens(yytext() , "string_literal" ,yyline ,yycolumn)); 
                        }


//---> Espacios 
[\t\r\n\f\s]                          {/* White spaces */}

//---> Errores Lexicos

.            {
                System.out.println(" Error Lexico " + yytext() + " Linea " + yyline + " Columna " + yycolumn); 
                TError datos = new TError(yytext() ,"Error Lexico" ,yyline ,yycolumn);
                TablaEL.add(datos);
             }