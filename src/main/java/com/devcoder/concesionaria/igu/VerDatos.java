package com.devcoder.concesionaria.igu;

import com.devcoder.concesionaria.logica.Automovil;
import com.devcoder.concesionaria.logica.Controladora;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerDatos extends javax.swing.JPanel {

    private Controladora control = null;
    
    public VerDatos() {
        control = new Controladora();
        initComponents();
        cargarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblAutomoviles = new javax.swing.JTable();
        botones = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        tblAutomoviles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblAutomoviles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblAutomoviles);

        botones.setBackground(new java.awt.Color(204, 204, 204));

        btnModificar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonesLayout.setVerticalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        // Controlar que la tabla no esté vacía
        if(tblAutomoviles.getRowCount() > 0){
            
            // Controlar que se haya seleccionado un registro
            if(tblAutomoviles.getSelectedRow() != -1){
            
                // Obtener el ID del automóvil a modificar
                int idAutomovil = Integer.parseInt(String.valueOf(tblAutomoviles.getValueAt(tblAutomoviles.getSelectedRow(), 0)));
                
                // Hacer visible la interfaz gráfica para modificar vehículo
                ModificarAutomovil modificarAutomovil = new ModificarAutomovil(idAutomovil);
                modificarAutomovil.setSize(660,460);
                modificarAutomovil.setLocation(0,0);
                
                this.removeAll();
                this.add(modificarAutomovil, BorderLayout.CENTER);
                this.revalidate();
                this.repaint();
                
            }else{
                JOptionPane.showMessageDialog(this, "No seleccionó ningún registro para modificar.", "Error al modificar", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay ningún registro para modificar.", "Error al modificar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        // Controlar que la tabla no esté vacía
        if(tblAutomoviles.getRowCount() > 0){
            
            // Controlar que se haya seleccionado un registro
            if(tblAutomoviles.getSelectedRow() != -1){
            
                // Obtener ID del automóvil a eliminar
                int idAutomovil = Integer.parseInt(String.valueOf(tblAutomoviles.getValueAt(tblAutomoviles.getSelectedRow(), 0)));
                
                if(JOptionPane.showConfirmDialog(this, "¿Desea realmente eliminar este registro?", "Confirmación para eliminar vehículo", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
                
                    // Llamar al método eliminar
                    control.eliminarAutomovil(idAutomovil);
                    
                    // Avisar al usuario que borró correctamente
                    JOptionPane.showMessageDialog(this, "El vehículo ha sido eliminado correctamente.", "Eliminado exitoso", JOptionPane.INFORMATION_MESSAGE);

                    // Volver a cargar la tabla.
                    cargarTabla();
                }
            }else{
                JOptionPane.showMessageDialog(this, "No seleccionó ningún registro para eliminar.", "Error al eliminar", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No hay ningún registro para eliminar.", "Error al eliminar", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botones;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblAutomoviles;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
     
        // Establecer que no se puedan cambiar de lugar las columnas
        tblAutomoviles.getTableHeader().setReorderingAllowed(false); 
        
        DefaultTableModel modelo = new DefaultTableModel(){
        
            // Establecer que no sean editables las celdas
            @Override
            public boolean isCellEditable(int row, int col){
                return false;
            }
        };
        
        // Establecer los nombres de las columnas
        String titulos[] = {"ID", "Modelo", "Marca", "Motor", "Color", "Patente", "Puertas"};
        modelo.setColumnIdentifiers(titulos);
        
        // Obtener la lista de mascotas desde la BD
        List<Automovil> listaAutomoviles  = control.traerAutomoviles();
        
        // Recorrer la lista y mostrar cada uno de los elementos en la tabla
        if(!listaAutomoviles.isEmpty()){
            
            for(Automovil automovil: listaAutomoviles){
                Object registro[] = {automovil.getId(), automovil.getModelo(), automovil.getMarca(), automovil.getMotor(), automovil.getColor(), automovil.getPatente(), automovil.getCantidadPuertas()};
                modelo.addRow(registro);
            }
        }
        
        // Asignar el modelo a la tabla
        tblAutomoviles.setModel(modelo);
    }
}