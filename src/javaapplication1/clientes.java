/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javaapplication1;

import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author soldi
 */
public class clientes extends javax.swing.JFrame {

    metodos m1 = new metodos();
    public clientes() {
        initComponents();
        setLocationRelativeTo(null);
        llenarCombos();
        llenarListaClientes();
    }
    public void llenarListaClientes(){
        DefaultListModel modeloLista = m1.llenarLista();
        listClientes.setModel(modeloLista);
    }
    
    public void llenarCombos(){
        municipio.setModel(m1.llenarCMBMunicipio());
        municipioAval.setModel(m1.llenarCMBMunicipio());
        municipioAval2.setModel(m1.llenarCMBMunicipio());
        statusCliente.setModel(m1.llenarCMBStatus());
        encargadoPrestamoNuevo.setModel(m1.llenarCMBPromotor());
    }
    public void vaciarTXT(){
        codigoCliente.setText("");
        nombreCliente.setText("");
        direccionCliente.setText("");
        direccionAval.setText("");
        nombreAval2.setText("");
        direccionAval2.setText("");
        llenarListaClientes();
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
        clientes = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        listClientes = new javax.swing.JList<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        codigoCliente = new javax.swing.JTextField();
        nombreCliente = new javax.swing.JTextField();
        direccionCliente = new javax.swing.JTextField();
        municipio = new javax.swing.JComboBox<>();
        nombreAval = new javax.swing.JTextField();
        direccionAval = new javax.swing.JTextField();
        municipioAval = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nombreAval2 = new javax.swing.JTextField();
        direccionAval2 = new javax.swing.JTextField();
        municipioAval2 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        statusCliente = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        encargadoPrestamoNuevo = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        especialPrestamo = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        montoPrestamo = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        FechaInicio = new com.toedter.calendar.JDateChooser();
        encargadoPrestamo = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPrestamos = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                clientesKeyTyped(evt);
            }
        });
        jPanel1.add(clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 210, -1));

        listClientes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listClientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 210, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 580));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/serach.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel3.setText("Buscar");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel4.setText("Código Cliente");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, 20));

        jLabel5.setText("Nombre");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, 20));

        jLabel6.setText("Dirección");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 20));

        jLabel7.setText("Municipio");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, 20));

        jLabel8.setText("Nombre Aval");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, 20));

        jLabel9.setText("Dirección Aval");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, -1, 20));

        jLabel10.setText("Municipio Aval");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, 20));

        codigoCliente.setEditable(false);
        codigoCliente.setText("Codigo");
        codigoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoClienteActionPerformed(evt);
            }
        });
        jPanel2.add(codigoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 190, -1));
        jPanel2.add(nombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 190, -1));
        jPanel2.add(direccionCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 190, -1));

        municipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(municipio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 190, -1));
        jPanel2.add(nombreAval, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 190, -1));
        jPanel2.add(direccionAval, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 190, -1));

        municipioAval.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(municipioAval, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 190, -1));

        jLabel11.setText("Nombre Aval 2");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, 20));

        jLabel12.setText("Dirección Aval 2");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, -1, 20));

        jLabel13.setText("Municipio AVal 2");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, 20));
        jPanel2.add(nombreAval2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 190, -1));
        jPanel2.add(direccionAval2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 190, -1));

        municipioAval2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(municipioAval2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 190, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/cliente2.png"))); // NOI18N
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        jLabel19.setText("Status");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, 20));

        statusCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(statusCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 190, -1));

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, -1, -1));

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 80, -1));

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, -1, -1));

        encargadoPrestamoNuevo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        encargadoPrestamoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encargadoPrestamoNuevoActionPerformed(evt);
            }
        });
        jPanel2.add(encargadoPrestamoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 190, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 370, 450));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Prestamo");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jLabel15.setText("Inicia");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel17.setText("Promotor(a)");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel18.setText("Monto");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        especialPrestamo.setText("Especial");
        jPanel3.add(especialPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, -1, -1));

        montoPrestamo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                montoPrestamoKeyTyped(evt);
            }
        });
        jPanel3.add(montoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 240, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/prestamo-asegurado2.png"))); // NOI18N
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        FechaInicio.setDateFormatString("y-MM-d");
        jPanel3.add(FechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 240, -1));

        encargadoPrestamo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        encargadoPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                encargadoPrestamoActionPerformed(evt);
            }
        });
        jPanel3.add(encargadoPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 240, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 350, 450));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblPrestamos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tblPrestamos);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 700, 100));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 720, 130));

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setText("Filtrar cliente");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 210, 30));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 950, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoClienteActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String txtNombreCliente = nombreCliente.getText();
        String txtDireccionCliente = direccionCliente.getText();
        String txtMunicipio = municipio.getSelectedItem().toString();
        String txtNombreAval = nombreAval.getText();
        String txtDireccionAval = direccionAval.getText();
        String txtMunicipioAval = municipioAval.getSelectedItem().toString();
        String txtNombreAval2 = nombreAval2.getText();
        String txtDireccionAval2 = direccionAval2.getText();
        String txtMunicipioAval2 = municipioAval2.getSelectedItem().toString();
        String txtStatusCliente = statusCliente.getSelectedItem().toString();
        String txtEncargadoPrestamo = encargadoPrestamoNuevo.getSelectedItem().toString();
        m1.registrarClientes(txtNombreCliente, txtDireccionCliente, txtMunicipio, txtNombreAval, txtDireccionAval, txtMunicipioAval, txtNombreAval2, txtDireccionAval2, txtMunicipioAval2, txtEncargadoPrestamo,txtStatusCliente);
        vaciarTXT();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (codigoCliente.getText()=="Codigo") {
            JOptionPane.showMessageDialog(null, "Seleccione un cliente primero");
        }else{
            String txtCodigoCliente = codigoCliente.getText();
            String txtNombreCliente = nombreCliente.getText();
            String txtDireccionCliente = direccionCliente.getText();
            String txtMunicipio = municipio.getSelectedItem().toString();
            String txtNombreAval = nombreAval.getText();
            String txtDireccionAval = direccionAval.getText();
            String txtMunicipioAval = municipioAval.getSelectedItem().toString();
            String txtNombreAval2 = nombreAval2.getText();
            String txtDireccionAval2 = direccionAval2.getText();
            String txtMunicipioAval2 = municipioAval2.getSelectedItem().toString();
            String txtStatusCliente = statusCliente.getSelectedItem().toString();
            m1.editarCliente (txtNombreCliente, txtDireccionCliente, txtMunicipio, txtNombreAval, txtDireccionAval, txtMunicipioAval, txtNombreAval2, txtDireccionAval2, txtMunicipioAval2, txtStatusCliente, txtCodigoCliente);
            vaciarTXT();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void listClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listClientesMouseClicked
        String Cliente=listClientes.getSelectedValue().toString();
        String[] arrayCliente=m1.mostrarCliente(Cliente);
        codigoCliente.setText(arrayCliente[0]);
        nombreCliente.setText(arrayCliente[1]);
        direccionCliente.setText(arrayCliente[2]);
        municipio.setSelectedItem(arrayCliente[3]);
        nombreAval.setText(arrayCliente[4]);
        direccionAval.setText(arrayCliente[5]);
        municipioAval.setSelectedItem(arrayCliente[6]);
        nombreAval2.setText(arrayCliente[7]);
        direccionAval2.setText(arrayCliente[8]);
        municipioAval2.setSelectedItem(arrayCliente[9]);
        statusCliente.setSelectedItem(arrayCliente[10]);
        tblPrestamos.setModel(m1.showTabletPrestamo(arrayCliente[0]));        
        //Llenar combobox de prestamo
        encargadoPrestamo.setModel(m1.llenarCMBPromotorPrestamo(arrayCliente[0]));
        
    }//GEN-LAST:event_listClientesMouseClicked

    private void encargadoPrestamoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encargadoPrestamoNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_encargadoPrestamoNuevoActionPerformed

    private void montoPrestamoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_montoPrestamoKeyTyped
        char c=evt.getKeyChar();
        if((Character.isDigit(c))||(c==KeyEvent.VK_PERIOD)||(c==KeyEvent.VK_BACK_SPACE)){
            int punto=0;
            if(c==KeyEvent.VK_PERIOD){ 
                String s=montoPrestamo.getText();
                int dot=s.indexOf('.');
                punto=dot;
                if(dot!=-1){
                    getToolkit().beep();
                    evt.consume();
                }
                
                
            }
        }
        else{    
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_montoPrestamoKeyTyped

    private void clientesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_clientesKeyTyped
        DefaultListModel modelo = m1.BuscarCliente(clientes.getText());
        listClientes.setModel(modelo);
    }//GEN-LAST:event_clientesKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Date fecha=FechaInicio.getDate();
        String txtFechaInicio=m1.formatoFecha(fecha);
        
        String txtNombrePromotor=encargadoPrestamo.getSelectedItem().toString();
        String txtMontoPrestamo=montoPrestamo.getText();
        String txtCodigoCliente=codigoCliente.getText();
        String especial="No";
        if(especialPrestamo.isSelected()){
            especial="Si";
        }else{
            especial="No";
        }



        String txtFechaFin=m1.Suma13(txtFechaInicio);
        
        
        m1.agregarPrestamo(txtFechaInicio, txtFechaFin, txtMontoPrestamo, especial, txtCodigoCliente, txtNombrePromotor);


        tblPrestamos.setModel(m1.showTabletPrestamo(txtCodigoCliente));
        
        montoPrestamo.setText("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(codigoCliente.getText()=="Codigo"){
           JOptionPane.showMessageDialog(null, "Seleccione un cliente para asigarnle un prestamo");
        }else{
            if (JOptionPane.showConfirmDialog(null, "Estas seguro que deseas borrar este cliente", "WARNING", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                m1.borrarCliente(codigoCliente.getText());
                llenarListaClientes();
                vaciarTXT();
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void encargadoPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_encargadoPrestamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_encargadoPrestamoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        FiltrarClientee c1 = new FiltrarClientee();
        c1.setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FechaInicio;
    private javax.swing.JTextField clientes;
    private javax.swing.JTextField codigoCliente;
    private javax.swing.JTextField direccionAval;
    private javax.swing.JTextField direccionAval2;
    private javax.swing.JTextField direccionCliente;
    private javax.swing.JComboBox<String> encargadoPrestamo;
    private javax.swing.JComboBox<String> encargadoPrestamoNuevo;
    private javax.swing.JCheckBox especialPrestamo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listClientes;
    private javax.swing.JTextField montoPrestamo;
    private javax.swing.JComboBox<String> municipio;
    private javax.swing.JComboBox<String> municipioAval;
    private javax.swing.JComboBox<String> municipioAval2;
    private javax.swing.JTextField nombreAval;
    private javax.swing.JTextField nombreAval2;
    private javax.swing.JTextField nombreCliente;
    private javax.swing.JComboBox<String> statusCliente;
    private javax.swing.JTable tblPrestamos;
    // End of variables declaration//GEN-END:variables
}
