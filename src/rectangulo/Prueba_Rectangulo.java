
package rectangulo;
import java.awt.geom.Area;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import rectangulo.Rectangulo;

public class Prueba_Rectangulo extends javax.swing.JFrame {
    
    Rectangulo rect = new Rectangulo();

    public Prueba_Rectangulo() {
        initComponents();
        jBtnGuardar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPopupMenuTabla = new javax.swing.JPopupMenu();
        jMenuItemModificar = new javax.swing.JMenuItem();
        jMenuItemEliminar = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTxtFldLongitud = new javax.swing.JTextField();
        jTxtFldAncho = new javax.swing.JTextField();
        jBtnObtener = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBtnGuardar = new javax.swing.JButton();
        jBtnFile = new javax.swing.JButton();

        jMenuItemModificar.setText("Modificar");
        jMenuItemModificar.setToolTipText("");
        jMenuItemModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemModificarActionPerformed(evt);
            }
        });
        JPopupMenuTabla.add(jMenuItemModificar);

        jMenuItemEliminar.setText("Eliminar");
        jMenuItemEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEliminarActionPerformed(evt);
            }
        });
        JPopupMenuTabla.add(jMenuItemEliminar);

        JPopupMenuTabla.getAccessibleContext().setAccessibleName("");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Area y Perimetro de un Triangulo");

        jLabel2.setText("Longitud");

        jLabel3.setText("Ancho");

        jTxtFldAncho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtFldAnchoActionPerformed(evt);
            }
        });

        jBtnObtener.setText("Obtener Resultado");
        jBtnObtener.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnObtenerActionPerformed(evt);
            }
        });

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jTable1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Longitud", "Ancho", "Perimetro", "Area"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setComponentPopupMenu(JPopupMenuTabla);
        jScrollPane1.setViewportView(jTable1);

        jBtnGuardar.setText("Guardar");
        jBtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnGuardarActionPerformed(evt);
            }
        });

        jBtnFile.setText("Generar Archivo");
        jBtnFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnFileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnObtener)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnGuardar)
                        .addGap(268, 268, 268))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTxtFldLongitud)
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTxtFldAncho)
                                .addGap(10, 10, 10)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnFile)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTxtFldLongitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTxtFldAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnObtener)
                            .addComponent(jBtnGuardar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnFile)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtFldAnchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtFldAnchoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtFldAnchoActionPerformed

    private void jBtnObtenerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnObtenerActionPerformed
        // TODO add your handling code here:
        double lon = Double.parseDouble(jTxtFldLongitud.getText());
        double an = Double.parseDouble(jTxtFldAncho.getText());

        double resulArea, resulParam;

        resulArea = rect.Area(lon, an);
        resulParam = rect.Perimetro(lon, an);

        //Mostar area y perimetro
        JOptionPane.showMessageDialog(null, "El Area del Rectangulo es " + resulArea
                + ".\nEl Perimetro del Rectangulo es " + resulParam + ".", "RECTANGULO", 1);
        llenarTabla(lon, an, resulArea, resulParam);
    }//GEN-LAST:event_jBtnObtenerActionPerformed

    private void jMenuItemModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemModificarActionPerformed
        // Modificar datos de la tabla
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRow()>=0){
            jTxtFldLongitud.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString());
            jTxtFldAncho.setText(jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString());
        } 
        //ocultamos boton de obtener resultados
        jBtnGuardar.setVisible(true);
        jBtnObtener.setVisible(false);
    }//GEN-LAST:event_jMenuItemModificarActionPerformed
    //metodo guardarDatosModificados
    private void guardarDatosModificados(int filaSelec){
        //boton para guardar la informacion modificada
        try {
            double lon, anc;
            lon= Double.parseDouble(jTxtFldLongitud.getText());
            anc= Double.parseDouble(jTxtFldAncho.getText());
            double resulArea, resulParam;
            resulArea = rect.Area(lon, anc);
            resulParam = rect.Perimetro(lon, anc);
            
            jTable1.setValueAt(lon, filaSelec, 0);
            jTable1.setValueAt(anc, filaSelec, 1);
            jTable1.setValueAt(resulArea, filaSelec, 2);
            jTable1.setValueAt(resulParam, filaSelec, 3);
            
            JOptionPane.showMessageDialog(this, "Registro Modificado exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        jTxtFldLongitud.setText(null);
        jTxtFldAncho.setText(null);
    }
    private void jMenuItemEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEliminarActionPerformed
        // Eliminar datos de una tabla
        DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRow()>=0){
            tb.removeRow(jTable1.getSelectedRow());
        } 
    }//GEN-LAST:event_jMenuItemEliminarActionPerformed

    private void jBtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnGuardarActionPerformed
         guardarDatosModificados(jTable1.getSelectedRow());
    }//GEN-LAST:event_jBtnGuardarActionPerformed

    private void jBtnFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnFileActionPerformed
        // llamamos al metodo generador del archivo txt
        crearArchivo();
    }//GEN-LAST:event_jBtnFileActionPerformed
    
    //metodo para llenar la tabla con los registros
    private void llenarTabla(double lon, double anc, double area, double perim){
        try {
            DefaultTableModel tb = (DefaultTableModel) jTable1.getModel();
            Object nuevaTab[] = {lon, anc, area, perim};
            tb.addRow(nuevaTab);
            JOptionPane.showMessageDialog(this, "Registro Añadido exitosamente");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        jTxtFldLongitud.setText(null);
        jTxtFldAncho.setText(null);
    }
    
    //metodo para crear un archivo txt y cargar la informacion
    private void crearArchivo(){
        try{
           String fileRectangulo = "D:\\Documents\\NetBeansProjects\\Rectangulo\\src\\rectangulo\\datos.txt";
           BufferedWriter bfw = new BufferedWriter(new FileWriter(fileRectangulo));
            for (int i = 0; i < jTable1.getColumnCount(); i++) {
                bfw.write(jTable1.getColumnName(i) + "      ");
            }
            bfw.write("\n");
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                for (int j = 0; j < jTable1.getColumnCount(); j++) {
                    bfw.write(jTable1.getValueAt(i, j).toString() + "           ");
                }
                bfw.newLine();
            }
            bfw.close();
            JOptionPane.showMessageDialog(this, "El archivo fue creado correctamente.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al crear el archivo." + e.getMessage());
        }
    }
    
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
            java.util.logging.Logger.getLogger(Prueba_Rectangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prueba_Rectangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prueba_Rectangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prueba_Rectangulo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prueba_Rectangulo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu JPopupMenuTabla;
    private javax.swing.JButton jBtnFile;
    private javax.swing.JButton jBtnGuardar;
    private javax.swing.JButton jBtnObtener;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItemEliminar;
    private javax.swing.JMenuItem jMenuItemModificar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtFldAncho;
    private javax.swing.JTextField jTxtFldLongitud;
    // End of variables declaration//GEN-END:variables
}
