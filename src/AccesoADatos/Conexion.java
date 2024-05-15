package AccesoADatos;

import javax.swing.JOptionPane;
//import java.sql.Connection;
//import org.mariadb.jdbc.Connection;
import java.sql.*;

public class Conexion {

    private static String url = "jdbc:mysql://localhost:3306/universidad-grupo2";
    private static String usuario = "root";
    private static String password = "";

    private static Conexion conexion = null;

    private Conexion() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            JOptionPane.showMessageDialog(null, "Drivers cargados correctamente ");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase Conexion: Error al cargar Driver");
        }
    }

    public static Connection getConexion() {
        Connection con = null;
        if (conexion == null) {

            conexion = new Conexion();
        }

        try {
            // Setup the connection with the DB
            con = DriverManager.getConnection(url, usuario, password);
            JOptionPane.showMessageDialog(null, "Conexion con base de datos exitosa ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion ");
        }

        return con;
    }

}
