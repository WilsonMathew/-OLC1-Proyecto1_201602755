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
%class Analizador_Lexico
%cupsym Simbolos
%cup
%char
%column
%full
%ignorecase
%line
%unicode
//%standalone

//---> Expresiones Regulares 
comentario              = "//"[^\n]*\n 
multi_comentario        = "/*"([^*]|("*"+[^*/]))*"*/"
DIGIT                   = [0-9]
numero                  = {DIGIT}+(\.{DIGIT}+)?([eE][+-]?{DIGIT}+)?
id                      = [a-zA-Z_][a-zA-Z0-9_]*
string_literal          = ("\""[^\n\"]*"\"")|(''[^\n\']*'')

 
//---> Estados
%%

/*------------------ 3ra Area: Reglas Lexicas            ------------------*/
//---> Simbolos
<YYINITIAL> ";"         {System.out.println("Reconocido " + yytext()+" punto_coma");  
                        tabla_tokens.add(new Tokens(yytext() ,"punto_coma" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.punto_coma, yycolumn, yyline, yytext()); 
                        }
<YYINITIAL> ":"         {System.out.println("Reconocido " + yytext()+" dos_puntos");  
                        tabla_tokens.add(new Tokens(yytext() ,"dos_puntos" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.dos_puntos, yycolumn, yyline, yytext()); 
                        }

<YYINITIAL> "("         {System.out.println("Reconocido " + yytext()+" open_pare");   
                        tabla_tokens.add(new Tokens(yytext() ,"open_pare" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.open_pare, yycolumn, yyline, yytext());
                        }
<YYINITIAL> ")"         {System.out.println("Reconocido " + yytext()+" close_pare");  
                        tabla_tokens.add(new Tokens(yytext() ,"close_pare" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.close_pare, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "{"         {System.out.println("Reconocido " + yytext()+" open_brace");  
                        tabla_tokens.add(new Tokens(yytext() ,"open_brace" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.open_brace, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "}"         {System.out.println("Reconocido " + yytext()+" close_brace"); 
                        tabla_tokens.add(new Tokens(yytext() ,"close_brace" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.close_brace, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "="         {System.out.println("Reconocido " + yytext()+" igual");       
                        tabla_tokens.add(new Tokens(yytext() ,"igual" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.igual, yycolumn, yyline, yytext());
                        }
"$"                     {System.out.println("Reconocido " + yytext()+" dollar");      tabla_tokens.add(new Tokens(yytext() ,"dollar" ,yyline ,yycolumn));}

<YYINITIAL> "["         {System.out.println("Reconocido " + yytext()+" open_square_brackets");  
                        tabla_tokens.add(new Tokens(yytext() ,"open_square_brackets" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.open_square_brackets, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "]"         {System.out.println("Reconocido " + yytext()+" close_square_brackets");  
                        tabla_tokens.add(new Tokens(yytext() ,"close_square_brackets" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.close_square_brackets, yycolumn, yyline, yytext());
                        }
<YYINITIAL> ","         {System.out.println("Reconocido " + yytext()+" coma");        
                        tabla_tokens.add(new Tokens(yytext() ,"coma" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.coma, yycolumn, yyline, yytext());
                        }


//---> Operadores aritmeticos
<YYINITIAL> "+"         {System.out.println("Reconocido " + yytext()+" mas");   
                        tabla_tokens.add(new Tokens(yytext() ,"Simbolo_mas" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.Simbolo_mas, yycolumn, yyline, yytext()); 
                        }
<YYINITIAL> "-"         {System.out.println("Reconocido " + yytext()+" menos"); 
                        tabla_tokens.add(new Tokens(yytext() ,"Simbolo_menos" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.Simbolo_menos, yycolumn, yyline, yytext()); 
                        }
<YYINITIAL> "*"         {System.out.println("Reconocido " + yytext()+" multi"); 
                        tabla_tokens.add(new Tokens(yytext() ,"Simbolo_multi" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.Simbolo_multi, yycolumn, yyline, yytext()); 
                        }
<YYINITIAL> "/"        {System.out.println("Reconocido " + yytext()+" divi");  
                        tabla_tokens.add(new Tokens(yytext() ,"Simbolo_divi" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.Simbolo_divi, yycolumn, yyline, yytext()); 
                        }

//---> Operadores relacionales
<YYINITIAL> ">"         {System.out.println("Reconocido " + yytext()+" mayor");         
                        tabla_tokens.add(new Tokens(yytext() ,"mayor" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.mayor, yycolumn, yyline, yytext());
                        }    
<YYINITIAL> "<"         {System.out.println("Reconocido " + yytext()+" menor");         
                        tabla_tokens.add(new Tokens(yytext() ,"menor" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.menor, yycolumn, yyline, yytext());
                        }
<YYINITIAL> ">="        {System.out.println("Reconocido " + yytext()+" mayor_igual");   
                        tabla_tokens.add(new Tokens(yytext() ,"mayor_igual" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.mayor_igual, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "<="        {System.out.println("Reconocido " + yytext()+" menor_igual");   
                        tabla_tokens.add(new Tokens(yytext() ,"menor_igual" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.menor_igual, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "=="        {System.out.println("Reconocido " + yytext()+" igual_relacional");         
                        tabla_tokens.add(new Tokens(yytext() ,"igual_relacional" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.igual_relacional, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "!="        {System.out.println("Reconocido " + yytext()+" distinto");      
                        tabla_tokens.add(new Tokens(yytext() ,"distinto" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.distinto, yycolumn, yyline, yytext());
                        }

//---> Operadores logicos
<YYINITIAL> "&&"        {System.out.println("Reconocido " + yytext()+" and");           
                        tabla_tokens.add(new Tokens(yytext() ,"and" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.and, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "||"        {System.out.println("Reconocido " + yytext()+" or");            
                        tabla_tokens.add(new Tokens(yytext() ,"or" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.or, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "!"         {System.out.println("Reconocido " + yytext()+" not");           
                        tabla_tokens.add(new Tokens(yytext() ,"not" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.not, yycolumn, yyline, yytext());
                        }

//---> Palabras reservadas
<YYINITIAL> "void"      {System.out.println("Reconocido " + yytext()+" reservada_void");        
                        tabla_tokens.add(new Tokens(yytext() ,"reservada_void" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.reservada_void, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "main"      {System.out.println("Reconocido " + yytext()+" reservada_main");        
                        tabla_tokens.add(new Tokens(yytext() ,"reservada_main" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.reservada_main, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "if"        {System.out.println("Reconocido " + yytext()+" reservada_if");          
                        tabla_tokens.add(new Tokens(yytext() ,"reservada_if" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.reservada_if, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "else"      {System.out.println("Reconocido " + yytext()+" reservada_else");          
                        tabla_tokens.add(new Tokens(yytext() ,"reservada_else" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.reservada_else, yycolumn, yyline, yytext());
                        }

<YYINITIAL> "console"   {System.out.println("Reconocido " + yytext()+" reservada_console");     
                        tabla_tokens.add(new Tokens(yytext() ,"reservada_console" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.reservada_console, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "\."        {System.out.println("Reconocido " + yytext()+" dot");     
                        tabla_tokens.add(new Tokens(yytext() ,"dot" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.dot, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "write"     {System.out.println("Reconocido " + yytext()+" reservada_write");     
                        tabla_tokens.add(new Tokens(yytext() ,"reservada_write" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.reservada_write, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "switch"    {System.out.println("Reconocido " + yytext()+" reservada_switch");      
                        tabla_tokens.add(new Tokens(yytext() ,"reservada_switch" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.reservada_switch, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "case"      {System.out.println("Reconocido " + yytext()+" reservada_case");        
                        tabla_tokens.add(new Tokens(yytext() ,"reservada_case" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.reservada_case, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "break"     {System.out.println("Reconocido " + yytext()+" reservada_break");       
                        tabla_tokens.add(new Tokens(yytext() ,"reservada_break" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.reservada_break, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "default"   {System.out.println("Reconocido " + yytext()+" reservada_default");       
                        tabla_tokens.add(new Tokens(yytext() ,"reservada_default" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.reservada_default, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "for"       {System.out.println("Reconocido " + yytext()+" reservada_for");         
                        tabla_tokens.add(new Tokens(yytext() ,"reservada_for" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.reservada_for, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "while"     {System.out.println("Reconocido " + yytext()+" reservada_while");     
                        tabla_tokens.add(new Tokens(yytext() ,"reservada_while" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.reservada_while, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "do"        {System.out.println("Reconocido " + yytext()+" reservada_do");          
                        tabla_tokens.add(new Tokens(yytext() ,"reservada_do" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.reservada_do, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "string"    {System.out.println("Reconocido " + yytext()+" reservada_string");      
                        tabla_tokens.add(new Tokens(yytext() ,"reservada_string" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.reservada_string, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "double"    {System.out.println("Reconocido " + yytext()+" reservada_double");      
                        tabla_tokens.add(new Tokens(yytext() ,"reservada_double" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.reservada_double, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "int"       {System.out.println("Reconocido " + yytext()+" reservada_int");         
                        tabla_tokens.add(new Tokens(yytext() ,"reservada_int" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.reservada_int, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "char"      {System.out.println("Reconocido " + yytext()+" reservada_char");        
                        tabla_tokens.add(new Tokens(yytext() ,"reservada_char" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.reservada_char, yycolumn, yyline, yytext());
                        }
<YYINITIAL> "bool"      {System.out.println("Reconocido " + yytext()+" reservada_bool");        
                        tabla_tokens.add(new Tokens(yytext() ,"reservada_bool" ,yyline ,yycolumn));
                        return new Symbol(Simbolos.reservada_bool, yycolumn, yyline, yytext());
                        }

<YYINITIAL> "definirglobales"       {System.out.println("Reconocido " + yytext()+" reservada_definirglobales");     
                                    tabla_tokens.add(new Tokens(yytext() ,"reservada_definirglobales" ,yyline ,yycolumn));
                                    return new Symbol(Simbolos.reservada_definirglobales, yycolumn, yyline, yytext());
                                    }
<YYINITIAL> "graficabarras"         {System.out.println("Reconocido " + yytext()+" reservada_graficabarras");       
                                    tabla_tokens.add(new Tokens(yytext() ,"reservada_graficabarras" ,yyline ,yycolumn));
                                    return new Symbol(Simbolos.reservada_graficabarras, yycolumn, yyline, yytext());
                                    }
<YYINITIAL> "graficapie"            {System.out.println("Reconocido " + yytext()+" reservada_graficapie");          
                                    tabla_tokens.add(new Tokens(yytext() ,"reservada_graficapie" ,yyline ,yycolumn));
                                    return new Symbol(Simbolos.reservada_graficapie, yycolumn, yyline, yytext());
                                    }
<YYINITIAL> "titulo"                {System.out.println("Reconocido " + yytext()+" reservada_titulo");      
                                    tabla_tokens.add(new Tokens(yytext() ,"reservada_titulo" ,yyline ,yycolumn));
                                    return new Symbol(Simbolos.reservada_titulo, yycolumn, yyline, yytext());
                                    }
<YYINITIAL> "ejex"                  {System.out.println("Reconocido " + yytext()+" reservada_ejex");       
                                    tabla_tokens.add(new Tokens(yytext() ,"reservada_ejex" ,yyline ,yycolumn));
                                    return new Symbol(Simbolos.reservada_ejex, yycolumn, yyline, yytext());
                                    }
<YYINITIAL> "valores"               {System.out.println("Reconocido " + yytext()+" reservada_valores");     
                                    tabla_tokens.add(new Tokens(yytext() ,"reservada_valores" ,yyline ,yycolumn));
                                    return new Symbol(Simbolos.reservada_valores, yycolumn, yyline, yytext());
                                    }

<YYINITIAL> "titulox"               {System.out.println("Reconocido " + yytext()+" reservada_titulox");     
                                    tabla_tokens.add(new Tokens(yytext() ,"reservada_titulox" ,yyline ,yycolumn));
                                    return new Symbol(Simbolos.reservada_titulox, yycolumn, yyline, yytext());
                                    }
<YYINITIAL> "tituloy"               {System.out.println("Reconocido " + yytext()+" reservada_tituloy");     
                                    tabla_tokens.add(new Tokens(yytext() ,"reservada_tituloy" ,yyline ,yycolumn));
                                    return new Symbol(Simbolos.reservada_tituloy, yycolumn, yyline, yytext());
                                    }

"newvalor"              {System.out.println("Reconocido " + yytext()+" reservada_newvalor");    tabla_tokens.add(new Tokens(yytext() ,"reservada_newvalor" ,yyline ,yycolumn));}


//---> Simbolos ER
<YYINITIAL> {numero}            {System.out.println("Reconocido " + yytext()+" numero"); 
                                tabla_tokens.add(new Tokens(yytext() , "numero" ,yyline ,yycolumn)); 
                                return new Symbol(Simbolos.numero, yycolumn, yyline, yytext()); 
                                }
<YYINITIAL> {comentario}        {System.out.println("Reconocido " + yytext()+" comentario"); 
                                tabla_tokens.add(new Tokens(yytext() , "comentario" ,yyline ,yycolumn)); 
                                return new Symbol(Simbolos.comentario, yycolumn, yyline, yytext()); 
                                }
<YYINITIAL> {multi_comentario}  {System.out.println("Reconocido " + yytext()+" multi_comentario"); 
                                tabla_tokens.add(new Tokens(yytext() , "multi_comentario" ,yyline ,yycolumn)); 
                                return new Symbol(Simbolos.multi_comentario, yycolumn, yyline, yytext()); 
                                }
<YYINITIAL> {id}                {System.out.println("Reconocido " + yytext()+" id"); 
                                tabla_tokens.add(new Tokens(yytext() , "id" ,yyline ,yycolumn)); 
                                return new Symbol(Simbolos.id, yycolumn, yyline, yytext());
                                }
<YYINITIAL> {string_literal}    {System.out.println("Reconocido " + yytext()+" string_literal"); 
                                tabla_tokens.add(new Tokens(yytext() , "string_literal" ,yyline ,yycolumn)); 
                                return new Symbol(Simbolos.string_literal, yycolumn, yyline, yytext());
                                }


//---> Espacios 
[\t\r\n\f\s]                          {/* White spaces */}

//---> Errores Lexicos

.            {
                System.out.println(" Error Lexico " + yytext() + " Linea " + yyline + " Columna " + yycolumn); 
                TError datos = new TError(yytext() ,"Error Lexico" ,yyline ,yycolumn);
                TablaEL.add(datos);
             }