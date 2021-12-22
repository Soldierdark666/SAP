package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author vgmos
 */
public class conexion {
    public String url = "jdbc:mysql://localhost/sap";
    public String user = "root";
    public String pass = "";
    
    public Connection getConexion(){
        Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, pass);
            JOptionPane.showMessageDialog(null,"Se logro la conexion");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e.getMessage());
        }
        return con;
    }
}