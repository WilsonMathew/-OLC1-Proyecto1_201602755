package Generadores;

import java.io.File;
import java.io.IOException;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathew
 */
public class GLexico {
        
    public static void main(String[] args) throws Exception{
        //String path = "C:/Users/mathew/Documents/NetBeansProjects/Proyecto 1/src/Analizadores/A_Lexico.jflex";
        String path = "C:/Users/mathew/Documents/NetBeansProjects/[OLC1]Proyecto1_201602755/src/Analizadores/A_Lexico.jflex";
        //String[] rutaS ={"-parser", "Sintax","C:/Users/mathew/Documents/NetBeansProjects/simple_lexical_analyzer/src/Analizadores/A_Sintactico.cup"};
        generar(path);
    }
    
    public static void generar(String path){
        File file = new File(path);
        jflex.Main.generate(file);
        
        //java_cup.Main.main(rutaS);
    }
    
}
