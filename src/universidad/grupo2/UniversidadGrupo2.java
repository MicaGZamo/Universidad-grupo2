
package universidad.grupo2;

//import org.mariadb.jdbc.Connection;
import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import Entidades.Alumno;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class UniversidadGrupo2 {

    public static void main(String[] args) {
     Connection con = Conexion.getConexion();
     LocalDate fecha= LocalDate.of(1997, 05, 10);
     Alumno alum1= new Alumno("Silvera", 4781236, "Jose", fecha, true);
     
     AlumnoData ad= new AlumnoData();
     ad.guardarAlumno(alum1);
     
     
     
    }
}
