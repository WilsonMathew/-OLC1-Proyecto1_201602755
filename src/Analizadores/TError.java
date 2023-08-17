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
public class TError {
    String lexema, descripcion;
    int linea, columna;
    
    public TError(String le, String de, int li, int co ){
        lexema = le;
        linea = li;
        columna = co;
        descripcion = de;
    }
    
    @Override
    public String toString(){
        return "{" + "lexema: "     + this.lexema       + " "
                   + "des: "        + this.descripcion  + " "
                   + "linea: "      + this.linea        + " " 
                   + "columna: "    + this.columna      + " "
                + "} \n";
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public String getDescripcion() {
        return descripcion;
    }

    public int getLinea() {
        return linea;
    }

    public int getColumna() {
        return columna;
    }
}
