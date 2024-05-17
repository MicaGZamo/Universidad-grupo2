
package AccesoADatos;
import java.sql.*;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class MateriaData {
    
    private Connection con = null;

    public MateriaData() {
          con = Conexion.getConexion();
    }
  
   public void guardarMateria(Materia materia){
      String sql = "INSERT INTO `materia`(`nombre`, `año`, `estado`) VALUES (?,?,?)";
      
      try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); 
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                materia.setIdMateria(rs.getInt("idMateria"));
                JOptionPane.showMessageDialog(null, "Materia cargada correctamente");
            }
            ps.close();
      } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos ");
            System.out.println("error " + ex.getMessage());
            ex.printStackTrace();
        }
            
   }
   
   public Materia BuscarMateria(int id){
       Materia materia = null;
       String sql = "SELECT idMateria, nombre, año, estado FROM materia WHERE idMateria=?";
       PreparedStatement  ps = null;
       try{
           ps = con.prepareStatement(sql);
           ps.setInt(1, id);
           ResultSet rs = ps.executeQuery(); // busqueda
           
           if(rs.next()){
               materia = new Materia();
               materia.setIdMateria(id);
               materia.setNombre(rs.getString("nombre"));
               materia.setAnio(rs.getInt("año"));
               materia.setEstado(rs.getBoolean("estado"));
               
           }
       
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
           System.out.println("error"+e);
           e.printStackTrace();
       }
   return materia;}
    
}
