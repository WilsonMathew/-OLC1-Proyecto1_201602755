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
        compilar();
    }
    
    public static void compilar(){
        try{
            String ruta = "src/Analizadores/";
            String opcFlex[] = {ruta + "A_Lexico.jflex", "-d", ruta};
            jflex.Main.generate(opcFlex);
            
            String opcFlexJson[] = { ruta + "json_lexico.jflex", "-d", ruta };
            jflex.Main.generate(opcFlexJson);
            
            String opcCup[] = {"-destdir", ruta, "-parser", "analisis_sintactico","-symbols", "Simbolos", ruta+"A_Sintactico.cup"};
            java_cup.Main.main(opcCup);
            /*
            cd C:\Users\mathew\Desktop\Compi 1\JflexyCupEjemplo\src\Analizadores
            java -jar C:\java-cup-11b.jar -parser analisis_sintactico -symbols Simbolos A_Sintactico.cup
            pause



            //String path = "C:/Users/mathew/Documents/NetBeansProjects/Proyecto 1/src/Analizadores/A_Lexico.jflex";
            String path = "C:/Users/mathew/Documents/NetBeansProjects/[OLC1]Proyecto1_201602755/src/Analizadores/A_Lexico.jflex";
            String[] rutaS ={"-parser", "Sintax","C:/Users/mathew/Documents/NetBeansProjects/[OLC1]Proyecto1_201602755/src/Analizadores/A_Sintactico.cup"};
            //generar(path);
             
            File file = new File(path);
            jflex.Main.generate(file);
            java_cup.Main.main(rutaS);
            */
        }catch (Exception e ){
            e.printStackTrace();
        }
        
        
    }
    
}
