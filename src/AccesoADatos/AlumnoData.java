
package AccesoADatos;

import com.sun.jdi.connect.spi.Connection;



public class AlumnoData {
    
    private Connection con = null;

    public AlumnoData() {
        con = Conexion.getConexion();
    }
    
    
}
