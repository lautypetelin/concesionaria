package com.devcoder.concesionaria.igu;

import com.devcoder.concesionaria.logica.Automovil;
import com.devcoder.concesionaria.logica.Controladora;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaAutomovil extends javax.swing.JFrame {

    Controladora control = null;
    
    public ConsultaAutomovil() {
        control = new Controladora();
        initComponents();
        this.cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbRegresar = new javax.swing.JButton();
        jlTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVehiculos = new javax.swing.JTable();
        jbEliminar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jbRegresar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jbRegresar.setText("<");
        jbRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegresarActionPerformed(evt);
            }
        });

        jlTitulo.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Consulta de Automóviles");

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaVehiculos);

        jbEliminar.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jbEliminar)))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jbEliminar)
                .addGap(18, 18, 18)
                .addComponent(jbModificar)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jbRegresar)
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlTitulo)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jbRegresar)
                        .addGap(18, 18, 18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbRegresarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        
        //Si la lista tiene registros.
        if(TablaVehiculos.getRowCount() > 0){
            
            //Si la lista tiene seleccionado algún registro.
            if(TablaVehiculos.getSelectedRow() != -1){
                
                //Obtener la ID del vehiculo que deseo eliminar.
                int idAuto = (int)TablaVehiculos.getValueAt(TablaVehiculos.getSelectedRow(), 0);
                control.eliminarVehiculo(idAuto);
                
                JOptionPane.showMessageDialog(this, "Registro eliminado correctamente.", "Información", 1);
                
            }else{
                JOptionPane.showMessageDialog(this, "Debe seleccionar algún registro para eliminar.", "Información", 0);
            }
        }else{
            JOptionPane.showMessageDialog(this, "La tabla no contiene ningún registro.", "Información", 2);
        }  
        
        cargarTabla();
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        
        //Si la lista tiene registros.
        if(TablaVehiculos.getRowCount() > 0){
            
            //Si la lista tiene seleccionado algún registro.
            if(TablaVehiculos.getSelectedRow() != -1){
                
                int idAuto = (int)TablaVehiculos.getValueAt(TablaVehiculos.getSelectedRow(), 0);
                
                ModificarAutomovil modificar = new ModificarAutomovil(idAuto);
                modificar.setVisible(true);
                modificar.setLocationRelativeTo(null);
                
                this.dispose();
                
            }else{
                JOptionPane.showMessageDialog(this, "Debe seleccionar algún registro para modificar.", "Información", 0);
            }
        }else{
            JOptionPane.showMessageDialog(this, "La tabla no contiene ningún registro.", "Información", 2);
        }  
    }//GEN-LAST:event_jbModificarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaVehiculos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbRegresar;
    private javax.swing.JLabel jlTitulo;
    // End of variables declaration//GEN-END:variables

    public void cargarTabla() {
        
        //Seteamos que no se puedan mover las columnas.
        TablaVehiculos.getTableHeader().setReorderingAllowed(false);
        
        //Hacemos que la tabla no sea editable.
        DefaultTableModel modelo = new DefaultTableModel(){
            
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };
        
        //Definimos título a las columnas.
        String columnas[] = {"ID", "Marca", "Modelo", "Motor", "Color", "Patente", "Puertas"};
        modelo.setColumnIdentifiers(columnas);

        //Traemos los autos desde la BD.
        List<Automovil> listaAutomoviles = control.traerAutomoviles();
        
        //Agregamos la lista obtenida a las filas de la tabla.
        if(listaAutomoviles != null){
            for(Automovil auto: listaAutomoviles){
                Object[] registro = {auto.getId(), auto.getMarca(), auto.getModelo(), auto.getMotor(), auto.getColor(), auto.getPatente(), auto.getCantidadPuertas()};
                modelo.addRow(registro);
            }
        }
        
        //Asignamos el modelo a la tabla.
        TablaVehiculos.setModel(modelo);
    }
}
