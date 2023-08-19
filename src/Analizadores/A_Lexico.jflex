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
numero      = [0-9]+(\.[0-9]+)?
tipo_dato  = "int" | "double" | "char" | "bool" | "string" 
 
//---> Estados
%%

/*------------------ 3ra Area: Reglas Lexicas            ------------------*/
//---> Simbolos
";"                     {System.out.println("Reconocido " + yytext()+" punto_coma");  tabla_tokens.add(new Tokens(yytext() ,"punto_coma" ,yyline ,yycolumn));}
":"                     {System.out.println("Reconocido " + yytext()+" dos_puntos");  tabla_tokens.add(new Tokens(yytext() ,"dos_puntos" ,yyline ,yycolumn));}
"("                     {System.out.println("Reconocido " + yytext()+" open_pare");   tabla_tokens.add(new Tokens(yytext() ,"open_pare" ,yyline ,yycolumn));}
")"                     {System.out.println("Reconocido " + yytext()+" close_pare");  tabla_tokens.add(new Tokens(yytext() ,"close_pare" ,yyline ,yycolumn));}
"{"                     {System.out.println("Reconocido " + yytext()+" open_brace");  tabla_tokens.add(new Tokens(yytext() ,"open_brace" ,yyline ,yycolumn));}
"}"                     {System.out.println("Reconocido " + yytext()+" close_brace"); tabla_tokens.add(new Tokens(yytext() ,"close_brace" ,yyline ,yycolumn));}
"="                     {System.out.println("Reconocido " + yytext()+" igual");       tabla_tokens.add(new Tokens(yytext() ,"igual" ,yyline ,yycolumn));}
"$"                     {System.out.println("Reconocido " + yytext()+" dollar");      tabla_tokens.add(new Tokens(yytext() ,"dollar" ,yyline ,yycolumn));}
"["                     {System.out.println("Reconocido " + yytext()+" open_square_brackets");  tabla_tokens.add(new Tokens(yytext() ,"open_square_brackets" ,yyline ,yycolumn));}
"]"                     {System.out.println("Reconocido " + yytext()+" close_square_brackets");  tabla_tokens.add(new Tokens(yytext() ,"close_square_brackets" ,yyline ,yycolumn));}
","                     {System.out.println("Reconocido " + yytext()+" coma");        tabla_tokens.add(new Tokens(yytext() ,"coma" ,yyline ,yycolumn));}


//---> Operadores aritmeticos
"+"                     {System.out.println("Reconocido " + yytext()+" mas");   tabla_tokens.add(new Tokens(yytext() ,"Simbolo_mas" ,yyline ,yycolumn));}
"-"                     {System.out.println("Reconocido " + yytext()+" menos"); tabla_tokens.add(new Tokens(yytext() ,"Simbolo_menos" ,yyline ,yycolumn));}
"*"                     {System.out.println("Reconocido " + yytext()+" multi"); tabla_tokens.add(new Tokens(yytext() ,"Simbolo_multi" ,yyline ,yycolumn));}
"/"                     {System.out.println("Reconocido " + yytext()+" divi");  tabla_tokens.add(new Tokens(yytext() ,"Simbolo_divi" ,yyline ,yycolumn));}

//---> Operadores relacionales
">"                     {System.out.println("Reconocido " + yytext()+" mayor");         tabla_tokens.add(new Tokens(yytext() ,"mayor" ,yyline ,yycolumn));}
"<"                     {System.out.println("Reconocido " + yytext()+" menor");         tabla_tokens.add(new Tokens(yytext() ,"menor" ,yyline ,yycolumn));}
">="                    {System.out.println("Reconocido " + yytext()+" mayor_igual");   tabla_tokens.add(new Tokens(yytext() ,"mayor_igual" ,yyline ,yycolumn));}
"<="                    {System.out.println("Reconocido " + yytext()+" menor_igual");   tabla_tokens.add(new Tokens(yytext() ,"menor_igual" ,yyline ,yycolumn));}
"=="                    {System.out.println("Reconocido " + yytext()+" igual_relacional");         tabla_tokens.add(new Tokens(yytext() ,"igual_relacional" ,yyline ,yycolumn));}
"!="                    {System.out.println("Reconocido " + yytext()+" distinto");      tabla_tokens.add(new Tokens(yytext() ,"distinto" ,yyline ,yycolumn));}

//---> Operadores logicos
"&&"                    {System.out.println("Reconocido " + yytext()+" and");           tabla_tokens.add(new Tokens(yytext() ,"and" ,yyline ,yycolumn));}
"||"                    {System.out.println("Reconocido " + yytext()+" or");            tabla_tokens.add(new Tokens(yytext() ,"or" ,yyline ,yycolumn));}
"!"                     {System.out.println("Reconocido " + yytext()+" not");           tabla_tokens.add(new Tokens(yytext() ,"not" ,yyline ,yycolumn));}

//---> Palabras reservadas
"tipodato"              {System.out.println("Reconocido " + yytext()+" reservada_tipodato");    tabla_tokens.add(new Tokens(yytext() ,"reservada_tipodato" ,yyline ,yycolumn));}
"void"                  {System.out.println("Reconocido " + yytext()+" reservada_void");        tabla_tokens.add(new Tokens(yytext() ,"reservada_void" ,yyline ,yycolumn));}
"main"                  {System.out.println("Reconocido " + yytext()+" reservada_main");        tabla_tokens.add(new Tokens(yytext() ,"reservada_main" ,yyline ,yycolumn));}
"if"                    {System.out.println("Reconocido " + yytext()+" reservada_if");          tabla_tokens.add(new Tokens(yytext() ,"reservada_if" ,yyline ,yycolumn));}
"console.write"         {System.out.println("Reconocido " + yytext()+" reservada_console");     tabla_tokens.add(new Tokens(yytext() ,"reservada_console" ,yyline ,yycolumn));}
"switch"                {System.out.println("Reconocido " + yytext()+" reservada_switch");      tabla_tokens.add(new Tokens(yytext() ,"reservada_switch" ,yyline ,yycolumn));}
"case"                  {System.out.println("Reconocido " + yytext()+" reservada_case");        tabla_tokens.add(new Tokens(yytext() ,"reservada_case" ,yyline ,yycolumn));}
"break"                 {System.out.println("Reconocido " + yytext()+" reservada_break");       tabla_tokens.add(new Tokens(yytext() ,"reservada_break" ,yyline ,yycolumn));}
"for"                   {System.out.println("Reconocido " + yytext()+" reservada_for");         tabla_tokens.add(new Tokens(yytext() ,"reservada_for" ,yyline ,yycolumn));}
"while"                 {System.out.println("Reconocido " + yytext()+" reservada_while");       tabla_tokens.add(new Tokens(yytext() ,"reservada_while" ,yyline ,yycolumn));}
"do"                    {System.out.println("Reconocido " + yytext()+" reservada_do");          tabla_tokens.add(new Tokens(yytext() ,"reservada_do" ,yyline ,yycolumn));}
"definirglobales"       {System.out.println("Reconocido " + yytext()+" reservada_definirglobales");     tabla_tokens.add(new Tokens(yytext() ,"reservada_definirglobales" ,yyline ,yycolumn));}
"string"                {System.out.println("Reconocido " + yytext()+" reservada_string");      tabla_tokens.add(new Tokens(yytext() ,"reservada_string" ,yyline ,yycolumn));}
"double"                {System.out.println("Reconocido " + yytext()+" reservada_double");      tabla_tokens.add(new Tokens(yytext() ,"reservada_double" ,yyline ,yycolumn));}
"graficabarras"         {System.out.println("Reconocido " + yytext()+" reservada_graficabarras");       tabla_tokens.add(new Tokens(yytext() ,"reservada_graficabarras" ,yyline ,yycolumn));}
"graficapie"            {System.out.println("Reconocido " + yytext()+" reservada_graficapie");          tabla_tokens.add(new Tokens(yytext() ,"reservada_graficapie" ,yyline ,yycolumn));}
"titulo"                {System.out.println("Reconocido " + yytext()+" reservada_titulo");      tabla_tokens.add(new Tokens(yytext() ,"reservada_titulo" ,yyline ,yycolumn));}
"ejex"                  {System.out.println("Reconocido " + yytext()+" reservada_ejex");        tabla_tokens.add(new Tokens(yytext() ,"reservada_ejex" ,yyline ,yycolumn));}
"valores"               {System.out.println("Reconocido " + yytext()+" reservada_valores");     tabla_tokens.add(new Tokens(yytext() ,"reservada_valores" ,yyline ,yycolumn));}
"titulox"               {System.out.println("Reconocido " + yytext()+" reservada_titulox");     tabla_tokens.add(new Tokens(yytext() ,"reservada_titulox" ,yyline ,yycolumn));}
"tituloy"               {System.out.println("Reconocido " + yytext()+" reservada_tituloy");     tabla_tokens.add(new Tokens(yytext() ,"reservada_tituloy" ,yyline ,yycolumn));}
"newvalor"              {System.out.println("Reconocido " + yytext()+" reservada_newvalor");    tabla_tokens.add(new Tokens(yytext() ,"reservada_newvalor" ,yyline ,yycolumn));}


//---> Simbolos ER
{numero}                {System.out.println("Reconocido " + yytext()+" numero"); tabla_tokens.add(new Tokens(yytext() , "numero" ,yyline ,yycolumn)); }
{tipo_dato}             {System.out.println("Reconocido " + yytext()+" numero"); tabla_tokens.add(new Tokens(yytext() , "tipo_dato" ,yyline ,yycolumn)); }


//---> Espacios 
[\t\r\n\f\s]                          {/* White spaces */}

//---> Errores Lexicos

.            {
                System.out.println(" Error Lexico " + yytext() + " Linea " + yyline + " Columna " + yycolumn); 
                TError datos = new TError(yytext() ,"Error Lexico" ,yyline ,yycolumn);
                TablaEL.add(datos);
             }
