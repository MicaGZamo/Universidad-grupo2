
package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;


public class FormularioInscripciones extends javax.swing.JInternalFrame {

    private ArrayList<Materia> listaM;
    private ArrayList<Alumno> listaA;
    private InscripcionData inscData;
    private MateriaData mData;
    private AlumnoData aData;
    private DefaultTableModel modelo;
    
    public FormularioInscripciones() {
        initComponents();
        aData = new AlumnoData();
        listaA = (ArrayList<Alumno>)aData.listarAlumnos();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData();
        mData = new MateriaData();
        guardarAlumno();
        armarCabeceraTabla();
        
    }
    
    private void armarCabeceraTabla(){
    ArrayList<Object> filaCabecera = new ArrayList<>();
    filaCabecera.add("ID");
    filaCabecera.add("Nombre");
    filaCabecera.add("Año");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
    jtMateriaPorALumno.setModel(modelo);
    }
    
    private void borrarFilaTabla(){
        int indice = modelo.getRowCount()-1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcbAlumnos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbMatInsc = new javax.swing.JCheckBox();
        jcbMatNoInsc = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtMateriaPorALumno = new javax.swing.JTable();
        jbInscribir = new javax.swing.JButton();
        jbAnularInscripcion = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        jLabel1.setText("Seleccione un alumno");

        jcbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbAlumnosActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel2.setText("Formulario de Inscripción");

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setText("Listado de Materias");

        jcbMatInsc.setText("Materias Inscriptas");
        jcbMatInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMatInscActionPerformed(evt);
            }
        });

        jcbMatNoInsc.setText("Materias no inscriptas");
        jcbMatNoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMatNoInscActionPerformed(evt);
            }
        });

        jtMateriaPorALumno.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jtMateriaPorALumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtMateriaPorALumno);

        jbInscribir.setText("Inscribir");
        jbInscribir.setEnabled(false);
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbAnularInscripcion.setText("Anular Inscripcion");
        jbAnularInscripcion.setEnabled(false);
        jbAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularInscripcionActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jDesktopPane1.setLayout(new javax.swing.BoxLayout(jDesktopPane1, javax.swing.BoxLayout.LINE_AXIS));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(123, 123, 123))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jbInscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(61, 61, 61)
                            .addComponent(jbAnularInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(40, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jcbAlumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jcbMatInsc)
                                            .addGap(87, 87, 87)
                                            .addComponent(jcbMatNoInsc))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(11, 11, 11)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(435, Short.MAX_VALUE)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbMatInsc)
                    .addComponent(jcbMatNoInsc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbAnularInscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbInscribir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setBounds(35, 50, 474, 362);
    }// </editor-fold>//GEN-END:initComponents
    private void cargarDatosNoInscriptas(){
        Alumno selec = (Alumno) jcbAlumnos.getSelectedItem();
        listaM = inscData.listarMateriasNoCursadas(selec.getIdAlumno());
        
        for (Materia m : listaM) {
            modelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(), m.getAnio()});
        }
    }
    
    private void cargarDatosInscriptas(){
        Alumno selec = (Alumno) jcbAlumnos.getSelectedItem();
        List<Materia> lista = inscData.listarMateriasCursadas(selec.getIdAlumno());
        
        for (Materia m : lista) {
            modelo.addRow(new Object[] {m.getIdMateria(), m.getNombre(), m.getAnio()});
        }
    }
    
    private void jcbMatInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMatInscActionPerformed
        
        borrarFilaTabla();
        jcbMatNoInsc.setSelected(false);
        cargarDatosInscriptas();
        jbInscribir.setEnabled(false);
        jbAnularInscripcion.setEnabled(true);
        
        
    }//GEN-LAST:event_jcbMatInscActionPerformed

    private void jcbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbAlumnosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbAlumnosActionPerformed

    private void jcbMatNoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMatNoInscActionPerformed

        borrarFilaTabla();
        jcbMatInsc.setSelected(false);
        cargarDatosNoInscriptas();
        jbInscribir.setEnabled(true);
        jbAnularInscripcion.setEnabled(false);
    }//GEN-LAST:event_jcbMatNoInscActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        
        int filaSeleccionada = jtMateriaPorALumno.getSelectedRow();
        
        if(filaSeleccionada!=-1){
            Alumno a = (Alumno) jcbAlumnos.getSelectedItem();
            
            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada,0);
            String nombreMateria= (String) modelo.getValueAt(filaSeleccionada, 1);
            int anio = (Integer) modelo.getValueAt(filaSeleccionada,2);
            Materia m = new Materia(idMateria,nombreMateria,anio,true);
            
            Inscripcion i = new Inscripcion(a,m,0);
            inscData.guardarInscripcion(i);
            borrarFilaTabla();
        }
        
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularInscripcionActionPerformed
        
        int filaSeleccionada = jtMateriaPorALumno.getSelectedRow();
        
        if(filaSeleccionada!=-1){
            Alumno a = (Alumno) jcbAlumnos.getSelectedItem();
            
            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada,0);
            
           inscData.borrarInscripcion(a.getIdAlumno(), idMateria);
            
            borrarFilaTabla();
        }
    }//GEN-LAST:event_jbAnularInscripcionActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void guardarAlumno(){
        for (Alumno item : listaA) {
            jcbAlumnos.addItem(item); 
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAnularInscripcion;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Alumno> jcbAlumnos;
    private javax.swing.JCheckBox jcbMatInsc;
    private javax.swing.JCheckBox jcbMatNoInsc;
    private javax.swing.JTable jtMateriaPorALumno;
    // End of variables declaration//GEN-END:variables
}
