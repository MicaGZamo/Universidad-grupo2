package AccesoADatos;

import Entidades.Alumno;
import Entidades.Inscripcion;
import java.sql.*;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class InscripcionData {

    private Connection con = null;
    private MateriaData matData = new MateriaData();
    private AlumnoData aluData = new AlumnoData();

    public InscripcionData() {
        con = Conexion.getConexion();
    }

    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO `inscripcion`(`nota`, `idAlumno`, `idMateria`) VALUES (?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, insc.getNota());
            ps.setInt(2, insc.getAlumno().getIdAlumno());
            ps.setInt(3, insc.getMateria().getIdMateria());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripción hecha correctamente");
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public List<Inscripcion> listaInscripcion() {

        List<Inscripcion> listaInsc = new ArrayList<>();

        String sql = "SELECT * FROM `inscripcion`";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion in = new Inscripcion();
                in.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alum = aluData.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = matData.BuscarMateria(rs.getInt("idMateria"));

                in.setAlumno(alum);
                in.setMateria(mat);
                in.setNota(rs.getDouble("nota"));

                listaInsc.add(in);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
            System.out.println("error" + e);
            e.printStackTrace();
        }

        return listaInsc;
    }

    public List<Inscripcion> listarInscripcionesPorAlumno(int idAlum) {
        List<Inscripcion> listaInscAlumn = new ArrayList<>();

        String sql = "SELECT * FROM inscripcion WHERE idAlumno= ? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlum);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Inscripcion in = new Inscripcion();
                in.setIdInscripcion(rs.getInt("idInscripto"));
                Alumno alum = aluData.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = matData.BuscarMateria(rs.getInt("idMateria"));

                in.setAlumno(alum);
                in.setMateria(mat);
                in.setNota(rs.getDouble("nota"));

                listaInscAlumn.add(in);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion");
            System.out.println("error" + e);
            e.printStackTrace();
        }

        return listaInscAlumn;

    }

    public List<Materia> listarMateriasCursadas(int idAlum) {
        List<Materia> materiasPorAlumno = new ArrayList<>();
        String sql = "SELECT inscripcion.idMateria, nombre, año, estado  "
                + " FROM inscripcion, materia "
                + " WHERE inscripcion.idMateria=materia.idMateria "
                + " AND inscripcion.idAlumno=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlum);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
                materiasPorAlumno.add(materia);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion y/o materia");
            System.out.println("error" + e);
            e.printStackTrace();
        }

        return materiasPorAlumno;
    }

    public List<Materia> listarMateriasNoCursadas(int idAlum) {
        ArrayList<Materia> materias = new ArrayList<>();

        String sql = "SELECT * FROM materia WHERE estado =1 AND idMateria not in"
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlum);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) { //si pudo hacer consulta 
                Materia materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("año"));
                materia.setEstado(rs.getBoolean("estado"));
                materias.add(materia);
            }
            ps.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion y/o materia");
            System.out.println("error" + e);
            e.printStackTrace();
        }

        return materias;
    }

    public void borrarInscripcion(int idAlumno, int idMateria) {

        String sql = "DELETE FROM inscripcion WHERE idAlumno=? AND idMateria=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
            int filas = ps.executeUpdate();

            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Se borró la inscripción correctamente.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripcion y/o materia");
            System.out.println("error" + e);
            e.printStackTrace();
        }

    }

}
