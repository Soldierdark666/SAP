package javaapplication1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author vgmos
 */
public class metodos {

    conexion c1 = new conexion();
    Connection cn = c1.getConexion();
    
    
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    
    
        
    public static String Suma13(String fechaInicial) {
        try {
            // Formato de entrada de la fecha
            SimpleDateFormat formatoFecha = new SimpleDateFormat("y-MM-d");
            
            // Convertir la cadena de fecha en un objeto Date
            Date fecha = formatoFecha.parse(fechaInicial);

            // Crear un objeto Calendar y establecer la fecha inicial
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(fecha);

            // Agregar 13 semanas a la fecha
            calendar.add(Calendar.WEEK_OF_YEAR, 12);

            // Obtener la fecha resultante después de 13 semanas
            Date fechaDespuesDe13Semanas = calendar.getTime();

            // Formatear la fecha resultante en el formato deseado
            String fechaFormateada = formatoFecha.format(fechaDespuesDe13Semanas);

            return fechaFormateada;
        } catch (ParseException e) {
            // Manejo de excepciones si ocurre un error al analizar la fecha
            e.printStackTrace();
            return null;
        }
    }
    
    public String formatoFecha(Date fecha){
        
        SimpleDateFormat formateador = new SimpleDateFormat("y-MM-d");
        
        
        
        String newFecha=formateador.format(fecha);
        
        return newFecha;
    }
    
    
    
    
    ////////////////////////////////////////////////////////////////////////////
    
    
    public void registrarClientes(String nombreCliente, String direccionCliente, String idMunicipioCliente, String nombreAval1Cliente, String direccionAval1Cliente, String idMunicipioAval1Cliente, String nombreAval2Cliente, String direccionAval2Cliente, String idMunicipioAval2Cliente, String txtEncargadoPrestamo, String txtStatusCliente) {
        try {
            String sql="insert into cliente values(null,'"+nombreCliente+"','"+direccionCliente+"',"+"(select idMunicipio from municipio where nombreMunicipio = '"+idMunicipioCliente+"')"+",'"+nombreAval1Cliente+"','"+direccionAval1Cliente+"',"+"(select idMunicipio from municipio where nombreMunicipio = '"+idMunicipioAval1Cliente+"')"+",'"+nombreAval2Cliente+"','"+direccionAval2Cliente+"',"+"(select idMunicipio from municipio where nombreMunicipio = '"+idMunicipioAval2Cliente+"')"+","+"(select idEncargado from encargado where nombreEncargado='"+txtEncargadoPrestamo+"')"+", (select idStatus from catalogoStatus where descripcionStatus='"+txtStatusCliente+"'));";
            PreparedStatement pss = cn.prepareStatement(sql);
            pss.executeUpdate();
            JOptionPane.showMessageDialog(null, "Se registro el cliente correctamente");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);

        }
    }

    public void agregarAdelanto(String fechaEntrnateAdelanto, String fechaSaleinteAdelanto, String montoAdelanto, String nombreCliente, String fechaPrestamo) {
        try {
            String sql = "insert into adelanto values(null,'"+fechaEntrnateAdelanto+"','"+fechaSaleinteAdelanto+"',"+montoAdelanto+",(select idPrestamo from prestamo where fechaInicioPrestamo='"+fechaPrestamo+"' and idClientePrestamo=(select idCliente from cliente where nombreCliente='"+nombreCliente+"')));";
            PreparedStatement pss = cn.prepareStatement(sql);
            pss.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
    }

    public void agregarEncargado(String nombreEncargado, String telefonoEncargado, String direccionEncargado, String comisionEncargado, String idMunicipioEncargado, String idSupervisorEncargado) {
        try {
            PreparedStatement pss = cn.prepareStatement("insert into encargado values(null,?,?,?,?,(select idMunicipio from municipio where nombreMunicipio=?),(select idSupervisor from supervisor where nombreSupervisor=?));");
            pss.setString(1, nombreEncargado);
            pss.setString(2, telefonoEncargado);
            pss.setString(3, direccionEncargado);
            pss.setString(4, comisionEncargado);
            pss.setString(5, idMunicipioEncargado);
            pss.setString(6, idSupervisorEncargado);
            pss.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
    }
    
    public void agregarFalla (String fechaFalla, String montoFalla, String idPrestamoFalla, String nombreCliente) {
        try{
            String sql = "insert into falla values(null,'"+fechaFalla+"',"+montoFalla+",(select idPrestamo from prestamo where fechaInicioPrestamo='"+idPrestamoFalla+"' and idClientePrestamo=(select idCliente from cliente where nombreCliente='"+nombreCliente+"')));";
            PreparedStatement pss = cn.prepareStatement(sql);
            pss.executeUpdate();
            //System.out.println(sql);
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
    
    public void agregarEjecutivo(String nombreEjecutivo, String telefonoEjecutivo, String direccionEjecutivo, String MunicipioEjecutivo, String plazaEjecutivo, String semanasEjecutivo, String montoEjecutivo, String montoEspecialEjecutivo){
        try {
            String sql="insert into ejecutivo values(null,'"+nombreEjecutivo+"','"+telefonoEjecutivo+"','"+direccionEjecutivo+"',(select idMunicipio from municipio where nombreMunicipio='"+MunicipioEjecutivo+"'),'"+plazaEjecutivo+"',"+semanasEjecutivo+","+montoEjecutivo+","+montoEspecialEjecutivo+");";
            System.out.println(sql);
            PreparedStatement pss = cn.prepareStatement(sql);
            pss.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
    }

    
    public void agregarSupervisor(String nombreSupervisor, String telefonoSupervisor, String direccionSupervisor, String municipioSupervisor, String ejecutivoSupervisor){
        try {
            PreparedStatement pss = cn.prepareStatement("insert into supervisor values(null,?,?,?,(select idMunicipio from municipio where nombreMunicipio=?),(select idEjecutivo from ejecutivo where nombreEjecutivo=?));");
            pss.setString(1, nombreSupervisor);
            pss.setString(2, telefonoSupervisor);
            pss.setString(3, direccionSupervisor);
            pss.setString(4, municipioSupervisor);
            pss.setString(5, ejecutivoSupervisor);
            pss.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
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
    
    public void agregarRecuperado(String fechaRecuperado,String montoRecuperado,String fechaPrestamo, String nombreCliente){ 
        try {
            String sql="insert into recuperado value(null,'"+fechaRecuperado+"','"+montoRecuperado+"',(select idPrestamo from prestamo where fechaInicioPrestamo='"+fechaPrestamo+"'and idClientePrestamo=(select idCliente from cliente where nombreCliente='"+nombreCliente+"')));";
            PreparedStatement pss = cn.prepareStatement(sql);
            pss.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
         }
    }
    
    public void agregarTrece(String fechaTrece,String montoTrece,String fechaPrestamo, String nombreCliente){
         try {
            String sql="insert into trece value(null,'"+fechaTrece+"','"+montoTrece+"',(select idPrestamo from prestamo where fechaInicioPrestamo='"+fechaPrestamo+"' and idClientePrestamo=(select idCliente from cliente where nombreCliente='"+nombreCliente+"')));";
            
            PreparedStatement pss = cn.prepareStatement(sql);
            pss.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
         }
    }
    
    public void agregarPrestamo(String fechaInicioPrestamo, String fechaFinPrestamo, String montoPrestamo, String especial, String idClientePrestamo, String encargado){
        String sql = "insert into prestamo value(null,'"+fechaInicioPrestamo+"','"+fechaFinPrestamo+"','"+montoPrestamo+"','"+especial+"', "+idClientePrestamo+", (select idEncargado from encargado where nombreEncargado='"+encargado+"'))";
            
        try {
            PreparedStatement pss = cn.prepareStatement(sql);
            pss.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
            System.out.println(sql);
            
        }
    }
    ///////////////////////////////////////////////////////

    public DefaultComboBoxModel llenarCMBEjecutivo(){
        DefaultComboBoxModel modelo= new DefaultComboBoxModel();
        String sql = "select * from ejecutivo;";
        String datos="";
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos=rs.getString(2);
                modelo.addElement(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        return modelo;
    }
    public DefaultComboBoxModel llenarCMBEncargado(){
        DefaultComboBoxModel modelo= new DefaultComboBoxModel();
        String sql = "select * from encargado;";
        String datos="";
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos=rs.getString(2);
                modelo.addElement(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        return modelo;
    }
    public DefaultComboBoxModel llenarCMBFechaEjecutivoPrestamo(String nombreEjecutivo){
        DefaultComboBoxModel modelo= new DefaultComboBoxModel();
        String sql = "select p.fechaInicioPrestamo from prestamo p inner join ejecutivo e on p.idEjecutivoPrestamo=e.idEjecutivo where e.idEjecutivo=(select idEjecutivo from ejecutivo where nombreEjecutivo='"+nombreEjecutivo+"');";
        String datos="";
        try{
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos=rs.getString(1);
                modelo.addElement(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        return modelo;
    }
    
    public DefaultComboBoxModel llenarCMBSupervisor(){
        DefaultComboBoxModel modelo= new DefaultComboBoxModel();
        String sql = "select * from supervisor;";
        String datos="";
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos=rs.getString(2);
                modelo.addElement(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        return modelo;
    }
    
    
    public DefaultComboBoxModel llenarCMBMunicipio(){
        DefaultComboBoxModel modelo= new DefaultComboBoxModel();
        String sql = "select * from municipio;";
        String datos="";
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos=rs.getString(2);
                modelo.addElement(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        return modelo;
    }
    
    public DefaultComboBoxModel llenarCMBFechaPrestamo(String nombreCliente){
        DefaultComboBoxModel modelo= new DefaultComboBoxModel();
        String sql = "select fechaInicioPrestamo from prestamo where idClientePrestamo=(select idCliente from cliente where nombreCliente=('"+nombreCliente+"'));";
        String datos="";
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos=rs.getString(1);
                modelo.addElement(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        return modelo;
    }
    
    public DefaultComboBoxModel llenarCMBClientes(){
        DefaultComboBoxModel modelo= new DefaultComboBoxModel();
        String sql = "select * from cliente ORDER BY nombreCliente ASC;";
        String datos="";
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos=rs.getString(2);
                modelo.addElement(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        return modelo;
    }
    
    public DefaultComboBoxModel llenarCMBPrestamista(){
        DefaultComboBoxModel modelo= new DefaultComboBoxModel();
        String sql = "select * from ejecutivo;";
        String datos="";
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos=rs.getString(2);
                modelo.addElement(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        return modelo;
    }
     
    public DefaultComboBoxModel llenarCMBStatus(){
        DefaultComboBoxModel modelo= new DefaultComboBoxModel();
        String sql = "select * from catalogoStatus;";
        String datos="";
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos=rs.getString(2);
                modelo.addElement(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        return modelo;
    }
    
    public DefaultComboBoxModel llenarCMBPromotor(){
        DefaultComboBoxModel modelo= new DefaultComboBoxModel();
        String sql = "select * from encargado order By nombreEncargado ASC;";
        System.out.println(sql);
        String datos;
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos=rs.getString(2);
                modelo.addElement(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        return modelo;
    }
    public DefaultComboBoxModel llenarCMBPromotorPrestamo(String idCliente){
        DefaultComboBoxModel modelo= new DefaultComboBoxModel();
        String sql = "select * from encargado ORDER BY nombreEncargado=(select nombreEncargado where idEncargado=(select idEncargadoCliente from cliente where idCliente="+idCliente+"))DESC,nombreEncargado;;";
        String datos;
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos=rs.getString(2);
                modelo.addElement(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        return modelo;
    }
    
    public DefaultListModel llenarLista(){
        
        DefaultListModel modelo = new DefaultListModel();
        String sql = "select nombreCliente from cliente order by nombreCliente ASC;";
        String datos="";
        try{
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos=rs.getString(1);
                modelo.addElement(datos);
            }
        }catch(SQLException e){
            System.out.println("Error");
        }
        return modelo;
    }
    public String[] mostrarCliente(String nombreCliente){
    
        String sql = "select c.idCliente, c.nombreCliente, c.direccionCliente, m.nombreMunicipio, c.nombreAval1Cliente, c.direccionAval1Cliente, n.nombreMunicipio, c.nombreAval2Cliente, c.direccionAval2Cliente, o.nombreMunicipio, s.descripcionStatus from cliente c inner join catalogoStatus s on c.idStatus = s.idStatus inner join municipio m on c.idMunicipioCliente = m.idMunicipio inner join municipio n on c.idMunicipioAval1Cliente = n.idMunicipio inner join municipio o on c.idMunicipioAval2Cliente = o.idMunicipio where nombreCliente='"+nombreCliente+"';";
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
            }
        }catch(SQLException e){
            System.out.println("Error");
        }
        return datos;
    }
    
    public String[] buscarPrestamo(String fechaInicioPrestamo, String nombreCliente){
        DefaultComboBoxModel modelo= new DefaultComboBoxModel();
        String sql = "select c.nombreCliente, e.nombreEncargado, p.montoPrestamo, p.fechaFinPrestamo from cliente c inner join prestamo p on c.idCliente=p.idClientePrestamo inner join encargado e on e.idEncargado=p.idEncargadoPrestamo where fechaInicioPrestamo='"+fechaInicioPrestamo+"' and c.nombreCliente='"+nombreCliente+"';";
        
        //System.out.println(sql);
        
        //System.out.println(sql);
        String datos[]=new String[4];
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                modelo.addElement(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        return datos;
    }
    
    public DefaultListModel BuscarCliente(String nombreCliente){
    
        DefaultListModel modelo = new DefaultListModel();
        String sql = "select nombreCliente from cliente where nombreCliente like '%"+nombreCliente+"%' ORDER BY nombreCliente ASC;";
        String datos="";
        try{
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos=rs.getString(1);
                modelo.addElement(datos);
            }
        }catch(SQLException e){
            System.out.println("Error");
        }
        return modelo;
    }
    public String[] filtrarSupervisor(String nombreSupervisor){
        String sql = "select * from supervisor where nombreSupervisor = '"+nombreSupervisor+"';";
        String datos[] = new String[6];
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
            }
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
        return datos;
    }
    public String[] filtrarEncargado(String nombreEncargado){
        String sql = "select * from encargado where nombreEncargado = '"+nombreEncargado+"';";
        String datos[] = new String[5];
        try{
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
            }
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
        return datos;
    }
    public String[] filtrarFondo(String fechaPrestamo, String nombreEjecutivo){
        String sql = "select sum(t.montoTrece) as totalTrece, sum(a.montoAdelanto) as totalAdelanto, c.nombreCliente, p.fechaInicioPrestamo from cliente c inner join prestamo p on p.idClientePrestamo=c.idCliente inner join trece t on t.idPrestamoTrece=p.idPrestamo inner join adelanto a on a.idprestamoAdelanto=p.idPrestamo inner join ejecutivo e on e.idEjecutivo=p.idEjecutivoPrestamo where p.fechaInicioPrestamo='"+fechaPrestamo+"' and p.idClientePrestamo=1 and e.nombreEjecutivo='"+nombreEjecutivo+"';";
        //System.out.println(sql);
        String datos[] = new String[4];
        try{
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
            }
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
        return datos;
    }
    public String[] filtrarEjecutivo(String nombreEjecutivo){
        String sql = "select * from ejecutivo where nombreEjecutivo='"+nombreEjecutivo+"';";
        String datos[] = new String[9];
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
            }
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
        return datos;
    }
    
    
    public String[] filtrarCliente(String nombreCliente){
        String sql = "select * from cliente where nombreCliente = '"+nombreCliente+"';";
        String datos[] = new String[6];
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
            }
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
        return datos;
    }
    
    
    ///////////////////////////////////////////////////////
    
    public void editarCliente(String nombreCliente, String direccionCliente, String idMunicipioCliente, String nombreAval1Cliente, String direccionAval1Cliente, String idMunicipioAval1Cliente, String nombreAval2Cliente, String direccionAval2Cliente, String idMunicipioAval2Cliente, String Status, String idCliente){
        
        
        
        try{
            String idStatus="1";
            if (Status=="Activo") {
                idStatus="1";
            }else{
                idStatus="0";
            }
            
            String sql ="update cliente set nombreCliente='"+nombreCliente+"' ,direccionCliente='"+direccionCliente+"', idMunicipioCliente=(select idMunicipio from municipio where nombreMunicipio='"+idMunicipioCliente+"'),nombreAval1Cliente='"+nombreAval1Cliente+"',direccionAval1Cliente='"+direccionAval1Cliente+"',idMunicipioAval1Cliente=(select idMunicipio from municipio where nombreMunicipio='"+idMunicipioCliente+"'),nombreAval2Cliente='"+nombreAval2Cliente+"',direccionAval2Cliente='"+direccionAval2Cliente+"',idMunicipioAval2Cliente=(select idMunicipio from municipio where nombreMunicipio='"+idMunicipioCliente+"'),idStatus="+idStatus+" where idCliente="+idCliente+";";
            PreparedStatement pss = cn.prepareStatement(sql);
            pss.executeUpdate();
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
    }
    public void editarEjecutivo(String idEjecutivo, String nombreEjecutivo,String telefonoEjecutivo,String direccionEjecutivo,String nombreMunicipio,String plazaEjecutivo,String semanasEjecutivo,String montoEjecutivo,String montoEspecialEjecutivo){
        try{
            String sql="update ejecutivo set nombreEjecutivo='"+nombreEjecutivo+"', telefonoEjecutivo='"+telefonoEjecutivo+"', direccionEjecutivo='"+direccionEjecutivo+"', idMunicipioEjecutivo=(select idMunicipio from municipio where nombreMunicipio='"+nombreMunicipio+"'), plazaEjecutivo='"+plazaEjecutivo+"', semanasEjecutivo='"+semanasEjecutivo+"', montoEjecutivo="+montoEjecutivo+", montoEspecialEjecutivo="+montoEspecialEjecutivo+" where idEjecutivo="+idEjecutivo+";";
            System.out.println(sql);
            PreparedStatement pss = cn.prepareStatement(sql);
            pss.executeUpdate();
        }catch(SQLException e){
            System.out.println("Error: "+e);
        }
    }
    public void editarSupervisor(String nombreSupervisor, String telefonoSupervisor, String direccionSupervisor, String municipioSupervisor, String ejecutivoSupervisor,String idSupervisor){
        try {
            PreparedStatement pss = cn.prepareStatement("update supervisor set  nombreSupervisor=?, telefonoSupervisor=?, direccionSupervisor=?, idMunicipioSupervisor=(select idMunicipio from municipio where nombreMunicipio=?),idEjecutivoSupervisor=(select idEjecutivo from ejecutivo where nombreEjecutivo=?) where idSupervisor=?;");
            pss.setString(1, nombreSupervisor);
            pss.setString(2, telefonoSupervisor);
            pss.setString(3, direccionSupervisor);
            pss.setString(4, municipioSupervisor);
            pss.setString(5, ejecutivoSupervisor);
            pss.setInt(6, Integer.parseInt(idSupervisor));
            pss.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
    }
    public void editarEncargado(String nombreEncargado, String telefonoEncargado, String direccionEncargado, String idMunicipioEncargado, String idSupervisorEncargado, String idEncargado){
        try {
            PreparedStatement pss = cn.prepareStatement("update encargado set  nombreEncargado=?, telefonoEncargado=?, direccionEncargado=?, idMunicipioEncargado=(select idMunicipio from municipio where nombreMunicipio=?),idSupervisorEncargado=(select idSupervisor from supervisor where nombreSupervisor=?) where idEncargado=?;");
            pss.setString(1, nombreEncargado);
            pss.setString(2, telefonoEncargado);
            pss.setString(3, direccionEncargado);
            pss.setString(4, idMunicipioEncargado);
            pss.setString(5, idSupervisorEncargado);
            pss.setInt(6, Integer.parseInt(idEncargado));
            pss.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
    }
    
    
    ///////////////////////////////////////////////////////
    public DefaultTableModel showTablaEncargado(){
        
        DefaultTableModel modelo= new DefaultTableModel();
        
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Telefono");
        modelo.addColumn("Direccion");
        modelo.addColumn("Comision");
        modelo.addColumn("Municipio");
        modelo.addColumn("Supervisor");
        
        String sql = "select e.idEncargado, e.nombreEncargado, e.telefonoEncargado, e.direccionEncargado, e.comisionEncargado, m.nombreMunicipio, s.nombreSupervisor from encargado e inner join municipio m on m.idMunicipio=e.idMunicipioEncargado inner join supervisor s on s.idSupervisor=e.idSupervisorEncargado;";
        String datos[] = new String [11];
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5)+"%";
                datos[5]=rs.getString(6);
                datos[6]=rs.getString(7);
                modelo.addRow(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        
        
        return modelo;
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
    
     public DefaultTableModel showTableFalla(String nombreCliente, String fechaPrestamo){
        
        DefaultTableModel modelo= new DefaultTableModel();
        
        modelo.addColumn("ID falla");
        modelo.addColumn("Fecha falla");
        modelo.addColumn("Monto falla");
        modelo.addColumn("Fecha prestamo");
        
        String sql = "select f.idFalla, f.fechaFalla, f.montoFalla, p.fechaInicioPrestamo from falla f inner join prestamo p on f.idPrestamoFalla = p.idPrestamo inner join cliente c on c.idCliente=p.idClientePrestamo where c.nombreCliente='"+nombreCliente+"' and p.fechaInicioPrestamo='"+fechaPrestamo+"';";
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
     
    public DefaultTableModel showTabletRecuperado(String nombreCliente, String fechaPrestamo){
        
        DefaultTableModel modelo= new DefaultTableModel();
        
        modelo.addColumn("ID Recuperado");
        modelo.addColumn("Fecha Recuperado");
        modelo.addColumn("Monto Recuperado");
        modelo.addColumn("Fecha Prestamo");
        
        String sql = "select r.idRecuperado, r.fechaRecuperado, r.montoRecuperado, p.fechaInicioPrestamo from recuperado r inner join prestamo p on r.idPrestamoRecuperado=p.idPrestamo inner join cliente c on c.idCliente=p.idClientePrestamo where c.nombreCliente='"+nombreCliente+"' and p.fechaInicioPrestamo='"+fechaPrestamo+"';";
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
    
    public DefaultTableModel showTabletTrece(String nombreCliente, String fechaPrestamo){
        
        DefaultTableModel modelo= new DefaultTableModel();
        
        modelo.addColumn("ID Trece");
        modelo.addColumn("Fecha Trece");
        modelo.addColumn("Monto Trece");
        modelo.addColumn("Fecha Prestamo");
        
        String sql = "select t.idTrece, t.fechaTrece, t.montoTrece, p.fechaInicioPrestamo from trece t inner join prestamo p on t.idPrestamoTrece=p.idPrestamo inner join cliente c on c.idCliente=p.idClientePrestamo where c.nombreCliente='"+nombreCliente+"' and p.fechaInicioPrestamo='"+fechaPrestamo+"';";
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
    
    public DefaultTableModel showTabletAdelanto(String nombreCliente, String fechaPrestamo){
        
        DefaultTableModel modelo= new DefaultTableModel();
        
        modelo.addColumn("ID Adelanto");
        modelo.addColumn("Fecha Entrada Adelanto");
        modelo.addColumn("Fecha Salida Adelanto");
        modelo.addColumn("Monto Adelanto");
        modelo.addColumn("Fecha Prestamo");
        
        String sql = "select a.idAdelanto, a.fechaEntrnateAdelanto, a.fechaSaleinteAdelanto, a.montoAdelanto, p.fechaInicioPrestamo from adelanto a inner join prestamo p on a.idPrestamoAdelanto=p.idPrestamo inner join cliente c on c.idCliente=p.idClientePrestamo where c.nombreCliente='"+nombreCliente+"' and p.fechaInicioPrestamo='"+fechaPrestamo+"';";
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
    public DefaultTableModel showTabletPrestamo(String idClientePrestamo){
        
        DefaultTableModel modelo= new DefaultTableModel();
        
        modelo.addColumn("ID Prestamo");
        modelo.addColumn("Fecha inicial prestamo");
        modelo.addColumn("Fecha final prestamo");
        modelo.addColumn("Monto");
        modelo.addColumn("Especial");
        modelo.addColumn("Ejecutivo");
        
        String sql = "select p.idPrestamo, p.fechaInicioPrestamo, p.fechaFinPrestamo, P.montoPrestamo, p.especial, e.nombreEncargado from prestamo p inner join encargado e on p.idEncargadoPrestamo=e.idEncargado where p.idClientePrestamo="+idClientePrestamo+";";
        String datos[] = new String [6];
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
    public DefaultTableModel showTablaFalla(String idPrestamo){
        
        DefaultTableModel modelo= new DefaultTableModel();
        
        modelo.addColumn("ID Falla");
        modelo.addColumn("Fecha Falla");
        modelo.addColumn("Monto Falla");
        
        String sql = "SELECT * FROM falla WHERE idPrestamoFalla="+idPrestamo+";";
        System.out.println(sql);
        String datos[] = new String [6];
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                modelo.addRow(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        
        return modelo;
    }
    public DefaultTableModel showTablaRecuperado(String idPrestamo){
        
        DefaultTableModel modelo= new DefaultTableModel();
        
        modelo.addColumn("ID Recuperado");
        modelo.addColumn("Fecha Recuperado");
        modelo.addColumn("Monto Recuperado");
        
        String sql = "SELECT * FROM recuperado WHERE idPrestamoRecuperado="+idPrestamo+";";
        String datos[] = new String [6];
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                modelo.addRow(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        
        return modelo;
    }
    public DefaultTableModel showTablaTrece(String idPrestamo){
        
        DefaultTableModel modelo= new DefaultTableModel();
        
        modelo.addColumn("ID Trece");
        modelo.addColumn("Fecha Trece");
        modelo.addColumn("Monto Trece");
        
        String sql = "SELECT * FROM trece WHERE idPrestamoTrece="+idPrestamo+";";
        String datos[] = new String [6];
        try{
            
            Statement st=cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while(rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                modelo.addRow(datos);
            }
            
        }catch(SQLException e){
            System.out.println("Error");
        }
        
        return modelo;
    }
    //////////////////////////////////////
    public void borrarCliente(String idCliente){
         try {
            PreparedStatement pss = cn.prepareStatement("delete from cliente where idCliente="+idCliente+";");
            pss.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
         }
    }
    public void borrarEjecutivo(String idEjecutivo){
         try {
            PreparedStatement pss = cn.prepareStatement("delete from ejecutivo where idEjecutivo="+idEjecutivo+";");
            pss.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
         }
    }
    public void borrarSupervisor(String idSupervisor){
        try {
            PreparedStatement pss = cn.prepareStatement("delete from supervisor where idSupervisor =?;");
            pss.setInt(1, Integer.parseInt(idSupervisor));
            pss.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
    }
    public void borrarEncargado(String idEncargadp){
        try {
            PreparedStatement pss = cn.prepareStatement("delete from encargado where idEncargado =?;");
            pss.setInt(1, Integer.parseInt(idEncargadp));
            pss.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
    }
    
    public void borrarFalla(String idFalla){
        try {
            PreparedStatement pss = cn.prepareStatement("delete from falla where idFalla =?;");
            pss.setInt(1, Integer.parseInt(idFalla));
            pss.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
    }
    
        public void borrarRecuperado(String idRecuperado){
        try {
            PreparedStatement pss = cn.prepareStatement("delete from recuperado where idRecuperado =?;");
            pss.setInt(1, Integer.parseInt(idRecuperado));
            pss.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
    }
        public void borrarTrece(String idTrece){
        try {
            PreparedStatement pss = cn.prepareStatement("delete from trece where idTrece =?;");
            pss.setInt(1, Integer.parseInt(idTrece));
            pss.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
    }
        public void borrarAdelanto(String idAdelanto){
        try {
            PreparedStatement pss = cn.prepareStatement("delete from adelanto where idAdelanto =?;");
            pss.setInt(1, Integer.parseInt(idAdelanto));
            pss.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
    }
}



