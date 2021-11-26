/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author tu_jo
 */
public class Conexion {

    public Connection obtenerConexion() {

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/videojuegos", "root", "");
            System.out.println("Conexión exitosa");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de Clase conexión " + e.getMessage());

        }
        return connection;
    }

    public static void main(String[] args) {
        Conexion con = new Conexion();
        con.obtenerConexion();
    }
}
