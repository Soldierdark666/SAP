package javaapplication1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author vgmos
 */
public class metodos {

    conexion c1 = new conexion();
    Connection cn = c1.getConexion();
    
    
    
    
    public DefaultComboBoxModel llenarCMBMunicipio(){
        DefaultComboBoxModel modelo= new DefaultComboBoxModel();
        
        String sql = "select nombreMunicipio from municipio;";
        String datos="";
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos=rs.getString(1);
                modelo.addElement(datos);
                System.out.println(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        return modelo;
    }
    
    
    //////////////////////////////////////////////////////
    public void registrarClientes2(String nombreCliente, String direccionCliente, String idMunicipioCliente, String nombreAval1Cliente, String direccionAval1Cliente, String idMunicipioAval1Cliente, String nombreAval2Cliente, String direccionAval2Cliente, String idMunicipioAval2Cliente, String idStatus) {
        try {
            String sql="insert into cliente values(null,'"+nombreCliente+"','"+direccionCliente+"',"+"(select idMunicipio from municipio where nombreMunicipio = '"+idMunicipioCliente+"')"+",'"+nombreAval1Cliente+"','"+direccionAval1Cliente+"',"+"(select idMunicipio from municipio where nombreMunicipio = '"+idMunicipioAval1Cliente+"')"+",'"+nombreAval2Cliente+"','"+direccionAval2Cliente+"',"+"(select idMunicipio from municipio where nombreMunicipio = '"+idMunicipioAval2Cliente+"')"+",'"+idStatus+"');";
            System.out.println(sql);
            PreparedStatement pss = cn.prepareStatement(sql);
            pss.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);

        }
    }

    public void registrarClientes(String nombreCliente, String direccionCliente, String idMunicipioCliente, String nombreAval1Cliente, String direccionAval1Cliente, String idMunicipioAval1Cliente, String nombreAval2Cliente, String direccionAval2Cliente, String idMunicipioAval2Cliente, String idStatus) {
        try {
            PreparedStatement pss = cn.prepareStatement("insert into cliente values(null,?,?,?,?,?,?,?,?,?,?);");
            pss.setString(1, nombreCliente);
            pss.setString(2, direccionCliente);
            pss.setString(3, idMunicipioCliente);
            pss.setString(4, nombreAval1Cliente);
            pss.setString(5, direccionAval1Cliente);
            pss.setString(6, idMunicipioAval1Cliente);
            pss.setString(7, nombreAval2Cliente);
            pss.setString(8, direccionAval2Cliente);
            pss.setString(9, idMunicipioAval2Cliente);
            pss.setString(10, idStatus);
            pss.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);

        }
    }

    public boolean agregarAdelanto(String fechaEntrnateAdelanto, String fechaSaleinteAdelanto, String montoAdelanto, String idPrestamoAdelanto) {
        try {
            PreparedStatement pss = cn.prepareStatement("insert into adelanto values(null,?,?,?,?);");
            pss.setString(1, fechaEntrnateAdelanto);
            pss.setString(2, fechaSaleinteAdelanto);
            pss.setString(3, montoAdelanto);
            pss.setString(4, idPrestamoAdelanto);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
            return false;
        }
    }

    public boolean agregarEncargado(String nombreEncargado, String telefonoEncargado, String direccionEncargado, String idMunicipioEncargado, String idSupervisorEncargado) {
        try {
            PreparedStatement pss = cn.prepareStatement("insert into encargado values(null,?,?,?,?,?);");
            pss.setString(1, nombreEncargado);
            pss.setString(2, telefonoEncargado);
            pss.setString(3, direccionEncargado);
            pss.setString(4, idMunicipioEncargado);
            pss.setString(5,idSupervisorEncargado);
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
            return false;
        }
    }
    
    public void agregarFalla (String fechaFalla, String montoFalla, String idPrestamoFalla) {
        try{
            PreparedStatement pss = cn.prepareStatement("insert into falla values(null,?,?,?);");
            pss.setString(1, fechaFalla);
            pss.setString(2, montoFalla);
            pss.setString(3, idPrestamoFalla);
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
    }
    
    public void agregarMunicipio(String idMunicipio, String folioMunicipio, String nombreMunicipio){
        try {
            PreparedStatement pss = cn.prepareStatement("insert into municipio(null,?,?);");
            pss.setString(1, idMunicipio);
            pss.setString(2, folioMunicipio);
            pss.setString(3, nombreMunicipio);
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
    }
    
    public void agregarEjecutivo(String idEjecutivo, String nombreEjecutivo, String telefonoEjecutivo, String direccionEjecutivo, String idMunicipioEjecutivo, String plazaEjecutivo, String semanasEjecutivo, String montoEjecutivo, String montoEspecialEjecutivo){
        try {
            PreparedStatement pss = cn.prepareStatement("insert into ejecutivo(null,?,?,?,?,?,?,?,?);");
            pss.setString(1, idEjecutivo);
            pss.setString(2, nombreEjecutivo);
            pss.setString(3, telefonoEjecutivo);
            pss.setString(4, direccionEjecutivo);
            pss.setString(5, idMunicipioEjecutivo);
            pss.setString(6, plazaEjecutivo);
            pss.setString(7, semanasEjecutivo);
            pss.setString(8, montoEjecutivo);
            pss.setString(9, montoEspecialEjecutivo);
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
    }
    
    public boolean agregarSupervisor(String idSupervisor, String nombreSupervisor, String telefonoSupervisor, String direccionSupervisor, String idMunicipioSupervisor, String idEjecutivoSupervisor){
         try {
            PreparedStatement pss = cn.prepareStatement("insert into supervisor(null,?,?,?,?,?);");
            pss.setString(1, idSupervisor);
            pss.setString(2, nombreSupervisor);
            pss.setString(3, telefonoSupervisor);
            pss.setString(4, direccionSupervisor);
            pss.setString(5, idMunicipioSupervisor);
            pss.setString(6, idEjecutivoSupervisor);
            return true;
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
            return false;
         }
    }
    public void agregarFondo(String idFondo,String fechaFondo,String idEjecutivo){
        try {
            PreparedStatement pss = cn.prepareStatement("insert into fondo(null,?,?);");
            pss.setString(1, idFondo);
            pss.setString(2, fechaFondo);
            pss.setString(3, idEjecutivo);  
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
         }
    }
    
    public boolean agregarRecuperado(String fechaRecuperado,String montoRecuperado,String idPrestamoRecuperado){
        try {
            PreparedStatement pss = cn.prepareStatement("insert into recuperado(null,?,?,?);");
            pss.setString(1, fechaRecuperado);
            pss.setString(2, montoRecuperado);  
            pss.setString(3, idPrestamoRecuperado);  
            return true;
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
            return false;
         }
    }
    
    public boolean agregarTrece(String fechaTrece,String montoTrece,String idPrestamoTrece){
         try {
            PreparedStatement pss = cn.prepareStatement("insert into trece(null,?,?,?);");
            pss.setString(1, fechaTrece);
            pss.setString(2, montoTrece);  
            pss.setString(3, idPrestamoTrece);
            return true;
            } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
            return false;
         }
    }
    
    public DefaultTableModel showTabletCliente(){
        
        DefaultTableModel modelo= new DefaultTableModel();
        
        modelo.addColumn("ID Cliente");
        modelo.addColumn("Nombre Cliente");
        modelo.addColumn("Direccion Cliente");
        modelo.addColumn("Municipio Cliente");
        modelo.addColumn("Aval 1");
        modelo.addColumn("Direccion Aval 1");
        modelo.addColumn("Municipio Aval 1");
        modelo.addColumn("Aval 2");
        modelo.addColumn("Direccion Aval 2");
        modelo.addColumn("Municipio Aval 2");
        modelo.addColumn("Status");
        
        String sql = "select * from cliente;";
        String datos[] = new String [11];
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                datos[7]=rs.getString(8);
                datos[8]=rs.getString(9);
                datos[9]=rs.getString(10);
                datos[10]=rs.getString(11);
                modelo.addRow(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        
        
        return modelo;
    }
    
    public DefaultTableModel showTabletEncargado(){
        
        DefaultTableModel modelo= new DefaultTableModel();
        
        modelo.addColumn("ID Encargado");
        modelo.addColumn("Nombre Encagrado");
        modelo.addColumn("Teléfono Encargado");
        modelo.addColumn("Dirección Cliente");
        modelo.addColumn("Municipio Encargado");
        modelo.addColumn("ID Supervisor Encargado");
        
        String sql = "select * from encargado;";
        String datos[] = new String [11];
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                datos[5]=rs.getString(6);
                modelo.addRow(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        
        
        return modelo;
    }
    
     public DefaultTableModel showTabletFalla(){
        
        DefaultTableModel modelo= new DefaultTableModel();
        
        modelo.addColumn("ID Falla");
        modelo.addColumn("Fecha Falla");
        modelo.addColumn("Monto Falla");
        modelo.addColumn("ID Prestamo Falla");
        
        String sql = "select * from falla;";
        String datos[] = new String [11];
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                modelo.addRow(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        
        
        return modelo;
    }
     
    public DefaultTableModel showTabletRecuperado(){
        
        DefaultTableModel modelo= new DefaultTableModel();
        
        modelo.addColumn("ID Recuperado");
        modelo.addColumn("Fecha Recuperado");
        modelo.addColumn("Monto Recuperado");
        modelo.addColumn("ID Prestamo Recuperado");
        
        String sql = "select * from recuperado;";
        String datos[] = new String [11];
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                modelo.addRow(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        
        return modelo;
    }
    
        public DefaultTableModel showTabletTrece(){
        
        DefaultTableModel modelo= new DefaultTableModel();
        
        modelo.addColumn("ID Trece");
        modelo.addColumn("Fecha Trece");
        modelo.addColumn("Monto Trece");
        modelo.addColumn("ID Prestamo Trece");
        
        String sql = "select * from trece;";
        String datos[] = new String [11];
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                modelo.addRow(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        
        return modelo;
    }
    
    public DefaultTableModel showTabletAdelanto(){
        
        DefaultTableModel modelo= new DefaultTableModel();
        
        modelo.addColumn("ID Adelanto");
        modelo.addColumn("Fecha Entrada Adelanto");
        modelo.addColumn("Fecha Salida Adelanto");
        modelo.addColumn("Monto Adelanto");
        modelo.addColumn("ID Prestamo Adelanto");
        
        String sql = "select * from adelanto;";
        String datos[] = new String [11];
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(4);
                modelo.addRow(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        
        return modelo;
    }
}



