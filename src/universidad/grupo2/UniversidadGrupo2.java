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
        LocalDate fecha = LocalDate.of(1997, 05, 10);
        Alumno alum1 = new Alumno("Silvera", 4781236, "Jose", fecha, true);
        LocalDate fecha2 = LocalDate.of(1999, 05, 12);
        Alumno alum2 = new Alumno("Soza", 4981236, "Julia", fecha2, true);
        LocalDate fecha3 = LocalDate.of(1991, 12, 10);
        Alumno alum3 = new Alumno("Fuentes", 39258123, "Gisela", fecha3, true);
        
        AlumnoData ad = new AlumnoData();
        ad.guardarAlumno(alum1);
        ad.guardarAlumno(alum2);
        ad.guardarAlumno(alum3);

    }
}
