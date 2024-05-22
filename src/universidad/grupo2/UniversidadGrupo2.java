package universidad.grupo2;

import AccesoADatos.AlumnoData;
import AccesoADatos.Conexion;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

public class UniversidadGrupo2 {

    public static void main(String[] args) {
        Connection con = Conexion.getConexion();
        LocalDate fecha = LocalDate.of(1997, 05, 10);

//    // Creacion de alumnos    
        Alumno alum1 = new Alumno("Silvera", 4781236, "Jose", fecha, true);
        LocalDate fecha2 = LocalDate.of(1999, 05, 12);
        Alumno alum2 = new Alumno("Soza", 4981236, "Julia", fecha2, true);
        LocalDate fecha3 = LocalDate.of(1991, 12, 10);
        Alumno alum3 = new Alumno("Fuentes", 39258123, "Gisela", fecha3, true);

//    // Creacion objeto alumnodata y añadir alumnos a la bs (insert)   
        AlumnoData ad = new AlumnoData();
//        ad.guardarAlumno(alum1);
//        ad.guardarAlumno(alum2);
//        ad.guardarAlumno(alum3);
//
//    // Buscar alumno por id:    
//        System.out.println(ad.buscarAlumno(2));
//        
//    // Buscar alumno por dni:    
//        System.out.println(ad.buscarAlumnoPorDni(39258123));
//    
//    // Mostrar alumnos activos:    
//        List<Alumno> listadoA = ad.listarAlumnos();
//        System.out.println("--- LISTADO ALUMNOS ---");
//        for (Alumno alumno : listadoA) {
//            System.out.println(alumno);
//
//        }
//    // Modificar datos de un alumno (update)    
        Alumno alum4 = new Alumno(4, "Sanchez", 35874123, "Sofia", fecha3, true);
//        ad.actualizarAlumno(alum4);
//
//    // Dar de baja un alumno (update)    
//        ad.darBaja(1);
//
//     // Creacion objetos Materias
//        Materia mat1 = new Materia("Matematica", 1, true);
//        Materia mat2 = new Materia("Literatura", 1, true);
//        Materia mat3 = new Materia("Quimica", 2, true);
//
//     // Agregar esas materias a la tabla
//        MateriaData md = new MateriaData();
//        md.guardarMateria(mat1);
//        md.guardarMateria(mat2);
//        md.guardarMateria(mat3);
//
//     // Busca e imprime la materia por id
//        System.out.println(md.BuscarMateria(2));
//
//        Materia mat4 = new Materia(1, "Matematica", 2, true);
//        md.modificarMateria(mat4);
//        md.darBajaMateria(1);
//
//     // Muestra las materias en estado 1 (activas)    
//        List<Materia> listadoMaterias = md.listarMaterias();
//        System.out.println("--- Listado Materias Activas ---");
//        for (Materia materia : listadoMaterias) {
//            System.out.println(materia);
//        }

        InscripcionData id = new InscripcionData();
//        Alumno Juan = ad.buscarAlumno(1);
//        Materia Matematica = md.BuscarMateria(1);
//        Alumno Sofia = ad.buscarAlumno(4);
//        Materia Quimica = md.BuscarMateria(3);
//
//        Inscripcion in1 = new Inscripcion(Sofia, Quimica, 7);
//        id.guardarInscripcion(in1);

        // Mostrar inscipciones :    
//        List<Inscripcion> listaInsc = id.listaInscripcion();
//        System.out.println("--- LISTADO INSCRIPCIONES ---");
//        for (Inscripcion lista : listaInsc) {
//            System.out.println(lista);
//
//        }
        
//         List<Inscripcion> listaInscAlumno = id.listarInscripcionesPorAlumno(4);
//        System.out.println("--- LISTADO INSCRIPCIONES POR ALUMNO ---");
//        for (Inscripcion lista : listaInscAlumno) {
//            System.out.println(lista);

//        }
        
        
//        List<Materia> listadeMaterias = id.listarMateriasCursadas(4);
//        System.out.println("--- LISTADO DE MATERIAS POR ALUMNO ---");
//        for (Materia lista : listadeMaterias) {
//            System.out.println(lista);
//
//        }
        
//        List<Materia> listadeMaterias2 = id.listarMateriasNoCursadas(4);
//        System.out.println("--- LISTADO DE MATERIAS NO CURSADAS POR ALUMNO ---");
//        for (Materia lista : listadeMaterias2) {
//            System.out.println(lista);
//
//        }
        
       id.borrarInscripcion(1, 1);
        
    }
    

}
