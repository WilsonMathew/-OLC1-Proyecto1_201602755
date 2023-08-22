/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import Analizadores.*;
import java.io.*;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mathew
 */
public class user_interface extends javax.swing.JFrame {

    /**
     * Creates new form user_interface
     */
    public user_interface() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        label_analyzer = new javax.swing.JLabel();
        btn_tog = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        text_entrada = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        text_salida = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROYECTO 1");
        setMaximumSize(new java.awt.Dimension(900, 900));
        setPreferredSize(new java.awt.Dimension(1000, 700));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Entrada:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Salida:");

        label_analyzer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label_analyzer.setText("Analizador: StatPy");

        btn_tog.setText("Analizador");
        btn_tog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_togActionPerformed(evt);
            }
        });

        jScrollPane3.setViewportView(text_entrada);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));

        text_salida.setEditable(false);
        text_salida.setBackground(new java.awt.Color(51, 51, 51));
        text_salida.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(text_salida);

        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenuBar1.setMaximumSize(new java.awt.Dimension(98, 300));

        jMenu1.setText("Archivo");

        jMenuItem1.setText("Abrir Archivo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Guardar");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Guardar Como");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Reporte");

        jMenuItem4.setText("jMenuItem4");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("jMenuItem5");
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(btn_tog)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_analyzer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(424, 424, 424))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btn_tog)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_analyzer)
                            .addComponent(jButton1))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(612, 612, 612))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btn_togActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_togActionPerformed
        // TODO add your handling code here:
        if(btn_tog.isSelected()){
            label_analyzer.setText("Analizador: StatPy");
            btn_tog.setText("StatPy");
        }else{
            label_analyzer.setText("Analizador: JSON ");
            btn_tog.setText("JSON");
        }
            
    }//GEN-LAST:event_btn_togActionPerformed

    private void ejecutar(String codigoFuente){
        
        try {
            Analizador_Lexico scan = new Analizador_Lexico(new java.io.StringReader(codigoFuente));
            analisis_sintactico parser = new analisis_sintactico(scan);
            parser.parse();
            //System.out.println(scan.tabla_tokens);
            reporte_tokens(scan.tabla_tokens);
            scan.tabla_tokens.clear();
            
            // Genera reporte de erroes lexicos en HTMl
            reporte_errores_lexicos(scan.TablaEL);
            scan.TablaEL.clear();
            System.out.println("pues analizo esta mierda");
        } catch (Exception ex) {
            Logger.getLogger(user_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        ejecutar(" 5");
        /*
         File archivo = new File("archivo.txt");
        PrintWriter escribir;
        
        try {    
            escribir = new PrintWriter(archivo);
            escribir.print(" " + text_entrada.getText());
            //System.out.println("Entrada: \n" + text_entrada.getText());
            escribir.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(user_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Reader lector;
        try{
            lector = new BufferedReader(new FileReader("archivo.txt"));
            Analizador_Lexico lexer = new Analizador_Lexico(lector);
            analisis_sintactico parser = new analisis_sintactico(lexer);
            parser.parse();
            
            //System.out.println(lexer.TablaEL);
            System.out.println(lexer.tabla_tokens);
            
            reporte_tokens(lexer.tabla_tokens);
            lexer.tabla_tokens.clear();
            
            // Genera reporte de erroes lexicos en HTMl
            reporte_errores_lexicos(lexer.TablaEL);
            lexer.TablaEL.clear();
            //public static LinkedList<TError> TablaEL = new LinkedList<TError>();
        }catch(Exception e){
            
            System.out.println("no lee esa mierda");
        }
        */
            
    }//GEN-LAST:event_jButton1ActionPerformed

    public void reporte_tokens(LinkedList<Tokens> tabla_tokens){
        try{
            PrintWriter file_out;

            file_out =  new PrintWriter("Tabla_de_tokens.html");

            file_out.println(   "<!DOCTYPE html>\n" +
                                "<html>\n" +
                                "<head>\n" +
                                "  <title> Reporte de Tokens </title>\n" +
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
                                "      color: #000000;\n" +
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
                                "<h2> Reporte de Tokens </h2>");
           
                    //Table 
                    file_out.println(   "<table>\n" +
                                        "  <tr>\n" +
                                        "    <th> Lexema </th>\n" +
                                        "    <th> Descripcion </th>\n" +
                                        "    <th> Linea </th>\n" +
                                        "    <th> Columna </th>\n" +
                                        "  </tr>\n" +
                                        "  \n"
                                        );
                    
                    for(Tokens item: tabla_tokens){
                        file_out.println("  <tr>\n" +
                                        "    <td>" + item.getLexema()       + "</td>\n" +
                                        "    <td>" + item.getToken()        + "</td>\n" +
                                        "    <td>" + item.getLinea()        + "</td>\n" +
                                        "    <td>" + item.getColumna()      + "</td>\n" +
                                        "  </tr>\n"
                                    );
                    }
                    
                    file_out.println(   "</table>\n" +
                                        "</body>\n" +
                                        "</html>");

            System.out.println("Generated html table for Tokens");

            file_out.close();
        }catch(FileNotFoundException e){
            System.out.println("not found");
        }
        
    }
    
    public void reporte_errores_lexicos(LinkedList<TError> TablaEL){
        try{
            PrintWriter file_out;

            file_out =  new PrintWriter("Tabla_errores_lexicos.html");

            file_out.println(   "<!DOCTYPE html>\n" +
                                "<html>\n" +
                                "<head>\n" +
                                "  <title>Reporte de Errores</title>\n" +
                                "  <style>\n" +
                                "    body {\n" +
                                "      font-family: Arial, sans-serif;\n" +
                                "      margin: 0;\n" +
                                "      padding: 0;\n" +
                                "      background-color: #008B95;\n" +
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
           
                    //Table 
                    file_out.println(   "<table>\n" +
                                        "  <tr>\n" +
                                        "    <th> Lexema </th>\n" +
                                        "    <th> Descripcion </th>\n" +
                                        "    <th> Linea </th>\n" +
                                        "    <th> Columna </th>\n" +
                                        "  </tr>\n" +
                                        "  \n"
                                        );
                    
                    for(TError item: TablaEL){
                        file_out.println("  <tr>\n" +
                                        "    <td>" + item.getLexema()       + "</td>\n" +
                                        "    <td>" + item.getDescripcion()  + "</td>\n" +
                                        "    <td>" + item.getLinea()        + "</td>\n" +
                                        "    <td>" + item.getColumna()      + "</td>\n" +
                                        "  </tr>\n"
                                    );
                    }
                    
                    file_out.println(   "</table>\n" +
                                        "</body>\n" +
                                        "</html>");

            System.out.println("Generated html table for errores lexicos");

            file_out.close();
        }catch(FileNotFoundException e){
            System.out.println("not found");
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(user_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_tog;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel label_analyzer;
    private javax.swing.JTextPane text_entrada;
    private javax.swing.JTextPane text_salida;
    // End of variables declaration//GEN-END:variables
}
