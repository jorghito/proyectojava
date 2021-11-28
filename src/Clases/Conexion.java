
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author tu_jo
 */
public class Conexion {
    
    public static Connection obtenerConexion() {
        
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","");
            System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de Clase conexion" +e.getMessage());
            
            
            
        }
        return connection;
        
}
//    public static void main(String[] args) {
//        Conexion conn = new Conexion();
//        conn.obtenerConexion();
//    }

    

   
    
    
   
        
}
