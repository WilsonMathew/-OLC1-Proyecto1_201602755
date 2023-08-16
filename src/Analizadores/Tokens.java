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
    
    Tokens(String token, String lexema, int linea, int columna){
        this.token = token;
        this.lexema = lexema; 
        this.linea = linea; 
        this.columna = columna;
    }
    
}
