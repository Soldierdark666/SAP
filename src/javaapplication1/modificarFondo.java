/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;
import static javaapplication1.fondo.ejecutivo;
import static javaapplication1.fondo.txtFechaFondo;

/**
 *
 * @author vgmos
 */
public class modificarFondo extends javax.swing.JFrame {

    /**
     * Creates new form modificarFondo
     */
    metodos m1= new metodos();
    String cmbejecutivo=ejecutivo.getSelectedItem().toString();
    String txtfechaFondo=txtFechaFondo.getDateFormatString();
    String datos[]=m1.filtrarFondo(txtfechaFondo, cmbejecutivo);
    public modificarFondo() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jPanel1 = new javax.swing.JPanel();
        txtFondo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCobroSemana = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDepositoEjecutivo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAdelantos = new javax.swing.JTextField();
        txtTrece = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSupervision = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        value7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        value8 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        value9 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        value10 = new javax.swing.JTextField();
        value11 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        value12 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtFondo.setEditable(false);
        txtFondo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 120, -1));

        jLabel1.setText("Fondo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 20));

        jLabel2.setText("Cobro semana");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 20));

        txtCobroSemana.setEditable(false);
        txtCobroSemana.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtCobroSemana, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 120, -1));

        jLabel3.setText("Deposito a ejecutivo");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 20));

        txtDepositoEjecutivo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtDepositoEjecutivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 120, -1));

        jLabel4.setText("Adelantos");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));

        txtAdelantos.setEditable(false);
        txtAdelantos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtAdelantos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 120, -1));

        txtTrece.setEditable(false);
        txtTrece.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtTrece, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 120, -1));

        jLabel5.setText("Trece");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 20));

        txtSupervision.setEditable(false);
        txtSupervision.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtSupervision.setText("$0");
        jPanel1.add(txtSupervision, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 120, -1));

        jLabel6.setText("Supervision");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 20));

        txtTotal.setEditable(false);
        txtTotal.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 120, -1));

        jLabel7.setText("Total");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("INGRESOS");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 400, 290));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 390, 240));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Monto");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Concepto");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 250, -1));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 220, 250, -1));

        jButton1.setText("Agregar ");
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 350, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setText("GASTO");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 790, 320));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        value7.setEditable(false);
        value7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(value7, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 120, -1));

        jLabel11.setText("Prestamos");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 20));

        jLabel12.setText("Comisiones");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 20));

        value8.setEditable(false);
        value8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(value8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 120, -1));

        jLabel13.setText("Especiales");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, 20));

        value9.setEditable(false);
        value9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(value9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 120, -1));

        jLabel14.setText("Gastos");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));

        value10.setEditable(false);
        value10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(value10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 120, -1));

        value11.setEditable(false);
        value11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(value11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 120, -1));

        jLabel15.setText("Otros");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 20));

        value12.setEditable(false);
        value12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel4.add(value12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 120, -1));

        jLabel16.setText("Total");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setText("EGRESOS");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 100, 390, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        txtTrece.setText(datos[0]);
        txtAdelantos.setText(datos[1]);
        
        float sumTotal=Float.parseFloat(datos[0])+Float.parseFloat(datos[1]);
        //System.out.println(sumTotal);

        String Total=Float.toString(sumTotal);
        
        txtTotal.setText(Total);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(modificarFondo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificarFondo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificarFondo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificarFondo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificarFondo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextField txtAdelantos;
    private javax.swing.JTextField txtCobroSemana;
    private javax.swing.JTextField txtDepositoEjecutivo;
    private javax.swing.JTextField txtFondo;
    private javax.swing.JTextField txtSupervision;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTrece;
    private javax.swing.JTextField value10;
    private javax.swing.JTextField value11;
    private javax.swing.JTextField value12;
    private javax.swing.JTextField value7;
    private javax.swing.JTextField value8;
    private javax.swing.JTextField value9;
    // End of variables declaration//GEN-END:variables
}
