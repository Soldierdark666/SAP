/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
/**
 *
 * @author vgmos
 */
public class Falla extends javax.swing.JFrame {

    /**
     * Creates new form trece
     */
    
    metodos m1 = new metodos();
    
    public Falla() {
        initComponents();
        setLocationRelativeTo(null);
        llenarcombos();
    }
    
    public void llenarcombos() {
        nombreCliente.setModel(m1.llenarCMBClientes());
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        fechaPrestamoFalla = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nombreCliente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        psFalla = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        montoFalla = new javax.swing.JTextField();
        nombreClienteFalla = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        promotorFalla = new javax.swing.JTextField();
        fechaFinFalla = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        fechaFalla = new javax.swing.JTextField();
        montoFechaFalla = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 40));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("PS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, 20));

        fechaPrestamoFalla.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(fechaPrestamoFalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 160, -1));

        jButton1.setText("Cargar Info.");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, 30));

        jLabel2.setText("Nombre: ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, 20));

        nombreCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        nombreCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreClienteActionPerformed(evt);
            }
        });
        jPanel2.add(nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 410, -1));

        jLabel3.setText("Fecha Ptmo.");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 20));
        jPanel2.add(psFalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 180, -1));

        jLabel4.setText("Monto:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 110, -1, -1));

        jLabel5.setText("Nombre Cliente:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        montoFalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                montoFallaActionPerformed(evt);
            }
        });
        jPanel2.add(montoFalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 110, -1));

        nombreClienteFalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreClienteFallaActionPerformed(evt);
            }
        });
        jPanel2.add(nombreClienteFalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 180, -1));

        jLabel6.setText("Promotor:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        promotorFalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                promotorFallaActionPerformed(evt);
            }
        });
        jPanel2.add(promotorFalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 140, 180, -1));

        fechaFinFalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaFinFallaActionPerformed(evt);
            }
        });
        jPanel2.add(fechaFinFalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 110, -1));

        jLabel7.setText("Fecha Fin:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 730, 10));

        jLabel8.setText("Fecha falla");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 30));

        fechaFalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaFallaActionPerformed(evt);
            }
        });
        jPanel2.add(fechaFalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 180, 30));
        jPanel2.add(montoFechaFalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 200, 30));

        jLabel9.setText("Monto");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, 30));

        jButton2.setText("Grabar Falla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 140, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 740, 210));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 790, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre                   =           nombreCliente.getSelectedItem().toString();
        DefaultComboBoxModel modelo     =           m1.llenarCMBFechaPrestamo(nombre);
        this.fechaPrestamoFalla.setModel(modelo);
        String FechaInicioPrestamo      =           this.fechaPrestamoFalla.getSelectedItem().toString();
        String[] datosPrestamo          =           m1.buscarPrestamo(FechaInicioPrestamo);
        
        this.nombreClienteFalla.setText(datosPrestamo[0]);
        this.promotorFalla.setText(datosPrestamo[1]);
        this.montoFalla.setText(datosPrestamo[2]);
        this.fechaFinFalla.setText(datosPrestamo[3]);
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void montoFallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_montoFallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_montoFallaActionPerformed

    private void nombreClienteFallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteFallaActionPerformed
        
    }//GEN-LAST:event_nombreClienteFallaActionPerformed

    private void promotorFallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_promotorFallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_promotorFallaActionPerformed

    private void fechaFinFallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaFinFallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaFinFallaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String txtfechaFalla=fechaFalla.getText();
        String txtmontoFechaFalla=montoFechaFalla.getText();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fechaFallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaFallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaFallaActionPerformed

    private void nombreClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreClienteActionPerformed

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
            java.util.logging.Logger.getLogger(Falla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Falla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Falla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Falla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Falla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fechaFalla;
    private javax.swing.JTextField fechaFinFalla;
    private javax.swing.JComboBox<String> fechaPrestamoFalla;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField montoFalla;
    private javax.swing.JTextField montoFechaFalla;
    private javax.swing.JComboBox<String> nombreCliente;
    private javax.swing.JTextField nombreClienteFalla;
    private javax.swing.JTextField promotorFalla;
    private javax.swing.JTextField psFalla;
    // End of variables declaration//GEN-END:variables
}
