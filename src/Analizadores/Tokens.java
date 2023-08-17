/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;

/**
 *
 * @author mathew
 */
public class Tokens {
    String lexema, token;
    int linea, columna;
    
    Tokens(){
        System.out.println("created empty token");
    }
    
    Tokens(String lexema, String token,  int linea, int columna){
        this.token = token;
        this.lexema = lexema; 
        this.linea = linea; 
        this.columna = columna;
    }
    
    @Override
    public String toString(){
        return "{" + "lexema: "     + this.lexema       + " "
                   + "des: "        + this.token  + " "
                   + "linea: "      + this.linea        + " " 
                   + "columna: "    + this.columna      + " "
                + "} \n";
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getLexema() {
        return lexema;
    }

    public String getToken() {
        return token;
    }

    public int getLinea() {
        return linea;
    }

    public int getColumna() {
        return columna;
    }
}
