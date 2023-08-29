package Analizadores;

import java.io.*;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class tests {

    public static class objeto {

        String a, b, c, d;

        objeto(String a, String b, String c, String d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
      @Override
    public String toString(){
        return "{" + "a: "     + this.a       + " "
                   + "b: "     + this.b       + " "
                   + "c: "     + this.c       + " " 
                   + "d: "     + this.d       + " "
                + "} \n";
    }
    }
    int indentacion = 0;

    public static void main(String[] args) {

        /*
        objeto tmp2 = new objeto("lexema 3","test 3", "linea", "columna");
                        gList.add(tmp);
         */
        LinkedList<objeto> idunno = new LinkedList<>();        
        idunno.add(new objeto("lexema 1","test 1", "linea", "columna"));
        idunno.add(new objeto("lexema 2","test 2", "linea", "columna"));
        idunno.add(new objeto("lexema 3","test 3", "linea", "columna"));

        LinkedList<objeto> idunno1 = new LinkedList<>();        
        idunno1.add(new objeto("si pues","test 1", "linea", "columna"));
        idunno1.add(new objeto("lexema 2","test 2", "linea", "columna"));
        idunno1.add(new objeto("lexema 3","test 3", "linea", "columna"));

        
        
        
        Hashtable<String, LinkedList<objeto>> map = new Hashtable<>();
        map.put("A", idunno);
        map.put("B", idunno1);
        
        System.out.println( map.get("B"));
       /*
        System.out.println("LinkedList: " + map);
        String path_current_file = "C:\\Users\\mathew\\Documents\\NetBeansProjects\\[OLC1]Proyecto1_201602755\\json1.json";
        String [] jsonFileName = path_current_file.split("\\\\",0); // split array and get the last value
        
        for(String a : jsonFileName)
            System.out.println(a);
        
        for (Map.Entry<String, LinkedList<objeto>> entry : map.entrySet()) {
            for(objeto item: entry.getValue() ){
                        System.out.println( "  <tr>\n" +
                                            "  <td>"   + item.a         + "</td>\n" +
                                            "  <td>"   + item.b         + "</td>\n" +
                                            "  <td>"   + item.c         + "</td>\n" +
                                            "  <td>"   + item.d         + "</td>\n" +
                                            "  </tr>\n"
                                    );
                    }
        }
        */
         
    }

        /*
        try{
            PrintWriter file_out;

            file_out =  new PrintWriter("test.html");

            file_out.println(   "<!DOCTYPE html>\n" +
                                "<html>\n" +
                                "<head>\n" +
                                "  <title>Reporte de Errores</title>\n" +
                                "  <style>\n" +
                                "    body {\n" +
                                "      font-family: Arial, sans-serif;\n" +
                                "      margin: 0;\n" +
                                "      padding: 0;\n" +
                                "      background-color: #c4cef9;\n" +
                                "    }\n" +
                                "    \n" +
                                "    h2 {\n" +
                                "      text-align: center;\n" +
                                "      padding: 20px;\n" +
                                "      color: #FFFFFF;\n" +
                                "    }\n" +
                                "    \n" +
                                "    table {\n" +
                                "      border-collapse: collapse;\n" +
                                "      width: 80%;\n" +
                                "      margin: 20px auto;\n" +
                                "      background-color: #fff3e0;\n" +
                                "      border: 1px solid #e57373;\n" +
                                "      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);\n" +
                                "    }\n" +
                                "    \n" +
                                "    th, td {\n" +
                                "      border: 1px solid #ffcdd2;\n" +
                                "      padding: 10px;\n" +
                                "      text-align: left;\n" +
                                "    }\n" +
                                "    \n" +
                                "    th {\n" +
                                "      background-color: #ffcc80;\n" +
                                "      color: #d84315;\n" +
                                "    }\n" +
                                "    \n" +
                                "    tr:nth-child(even) {\n" +
                                "      background-color: #ffecb3;\n" +
                                "    }\n" +
                                "  </style>\n" +
                                "</head>\n" +
                                "<body>\n" +
                                "\n" +
                                "<h2> Tabla de errores Lexicos </h2>");
            
                        LinkedList<objeto> gList = new LinkedList<objeto>(); 
                        objeto tmp =  new objeto("lexema 1","test 1", "linea", "columna");
                        objeto tmp1 = new objeto("lexema 2","test 2", "linea", "columna");
                        objeto tmp2 = new objeto("lexema 3","test 3", "linea", "columna");
                        gList.add(tmp);
                        gList.add(tmp1);
                        gList.add(tmp2);
                    //Table 
                    file_out.println(   "<table>\n" +
                                        "  <tr>\n" +
                                        "    <th> Lexema </th>\n" +
                                        "    <th> Descripcion </th>\n" +
                                        "    <th> Linea </th>\n" +
                                        "    <th> Columna </th>\n" +
                                        "  </tr>\n" +
                                        "  \n" +
                                        "  <!-- Replace \"x\" with the desired number of rows -->\n" +
                                        "  <tr>\n" +
                                        "    <td>Row 1, Cell 1</td>\n" +
                                        "    <td>Row 1, Cell 2</td>\n" +
                                        "    <td>Row 1, Cell 3</td>\n" +
                                        "    <td>Row 1, Cell 4</td>\n" +
                                        "  </tr>\n" +
                                        "  <tr>\n" +
                                        "    <td>Row 2, Cell 1</td>\n" +
                                        "    <td>Row 2, Cell 2</td>\n" +
                                        "    <td>Row 2, Cell 3</td>\n" +
                                        "    <td>Row 2, Cell 4</td>\n" +
                                        "  </tr>\n" +
                                        "  <!-- Add more rows as needed -->\n"
                                        );
                    
                    for(objeto item: gList){
                        file_out.println("  <tr>\n" +
                                        "    <td>" + item.a + "</td>\n" +
                                        "    <td>" + item.b + "</td>\n" +
                                        "    <td>" + item.c + "</td>\n" +
                                        "    <td>" + item.d + "</td>\n" +
                                        "  </tr>\n"
                                    );
                    }
                    
                    file_out.println(   "</table>\n" +
                                        "</body>\n" +
                                        "</html>");

            System.out.println("Generated html table");

            file_out.close();
        }catch(FileNotFoundException e){
            System.out.println("not found");
        }
         */
    }

