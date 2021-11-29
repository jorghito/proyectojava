package Clases;

import Clases.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Clases.Cliente;
import Vistas.VistaCliente;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author tu_jo
 */
public class Metodos {

    public boolean agregarCliente(Cliente cliente) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "INSERT INTO cliente (rut_cliente, nombre_cliente, ap_paterno, ap_materno, telefono_cliente, correo)VALUES(?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, cliente.getRut());
            stmt.setString(2, cliente.getNombre());
            stmt.setString(3, cliente.getAppaterno());
            stmt.setString(4, cliente.getApmaterno());
            stmt.setInt(5, cliente.getTelefono());
            stmt.setString(6, cliente.getCorreo());

            stmt.executeUpdate();
            stmt.close();
            cnx.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error en SQL al agregar cliente - Clase Cliente" + e.getMessage());
            return false;
        }
    }

    public boolean eliminarCliente(String rut) {
        try {
            Conexion con = new Conexion();
            Connection cnx = con.obtenerConexion();

            String query = "DELET FROM cliente WHERE rut_cliente";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, rut);
            

            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;
        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente"+e.getMessage());
            return false;
        }

    }
    
//    public boolean modificarCliente(Cliente cliente){
//        try {
//            Conexion con = new Conexion();
//            Connection cnx = con.obtenerConexion();
//            
//            
//        } catch (Exception e) {
//        }
//        
//    }

   

}
