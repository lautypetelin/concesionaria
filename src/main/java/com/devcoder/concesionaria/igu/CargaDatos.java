package com.devcoder.concesionaria.igu;

import com.devcoder.concesionaria.logica.Controladora;
import javax.swing.JOptionPane;

public class CargaDatos extends javax.swing.JPanel {

    private Controladora control = null;
    
    public CargaDatos() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTitulo = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        datos = new javax.swing.JPanel();
        jlModelo = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        jlMarca = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jlMotor = new javax.swing.JLabel();
        txtMotor = new javax.swing.JTextField();
        jlColor = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jlPatente = new javax.swing.JLabel();
        txtPatente = new javax.swing.JTextField();
        jlCantPuertas = new javax.swing.JLabel();
        txtCantPuertas = new javax.swing.JTextField();
        botones = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        jlTitulo.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(0, 0, 0));
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("ALTA DE AUTOMÓVILES");

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coche256x256.png"))); // NOI18N

        datos.setBackground(new java.awt.Color(204, 204, 204));

        jlModelo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlModelo.setText("Modelo:");

        txtModelo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jlMarca.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlMarca.setText("Marca:");

        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jlMotor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlMotor.setText("Motor:");

        txtMotor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jlColor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlColor.setText("Color:");

        txtColor.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jlPatente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlPatente.setText("Patente:");

        txtPatente.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jlCantPuertas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jlCantPuertas.setText("Cantidad de puertas:");

        txtCantPuertas.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        javax.swing.GroupLayout datosLayout = new javax.swing.GroupLayout(datos);
        datos.setLayout(datosLayout);
        datosLayout.setHorizontalGroup(
            datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, datosLayout.createSequentialGroup()
                        .addComponent(jlCantPuertas)
                        .addGap(18, 18, 18)
                        .addComponent(txtCantPuertas))
                    .addGroup(datosLayout.createSequentialGroup()
                        .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, datosLayout.createSequentialGroup()
                                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlPatente)
                                    .addComponent(jlColor)
                                    .addComponent(jlMotor)
                                    .addComponent(jlMarca))
                                .addGap(18, 18, 18))
                            .addGroup(datosLayout.createSequentialGroup()
                                .addComponent(jlModelo)
                                .addGap(15, 15, 15)))
                        .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtModelo)
                            .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMotor)
                            .addComponent(txtColor)
                            .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        datosLayout.setVerticalGroup(
            datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlMotor)
                    .addComponent(txtMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlColor)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPatente)
                    .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCantPuertas)
                    .addComponent(txtCantPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        botones.setBackground(new java.awt.Color(204, 204, 204));

        btnModificar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnModificar.setText("Guardar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout botonesLayout = new javax.swing.GroupLayout(botones);
        botones.setLayout(botonesLayout);
        botonesLayout.setHorizontalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        botonesLayout.setVerticalGroup(
            botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(botonesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(botonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(imagen)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jlTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
        if(validar()){
            return;
        }
        
        try{
            String modelo = txtModelo.getText();
            String marca = txtMarca.getText();
            String motor = txtMotor.getText();
            String color = txtColor.getText();
            String patente = txtPatente.getText();
            int cantPuertas = Integer.parseInt(txtCantPuertas.getText());
            
            control.guardarAutomovil(modelo, marca, motor, color, patente, cantPuertas);
            JOptionPane.showMessageDialog(this, "Automóvil agregado correctamente.", "Guardado exitoso", JOptionPane.INFORMATION_MESSAGE);
            
        }catch(java.lang.NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Debe ingresar un valor númerico en el campo \'Cantidad de puertas\'", "Error al procesar dato", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        txtModelo.setText(null);
        txtMarca.setText(null);
        txtMotor.setText(null);
        txtColor.setText(null);
        txtPatente.setText(null);
        txtCantPuertas.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel botones;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JPanel datos;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel jlCantPuertas;
    private javax.swing.JLabel jlColor;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlMotor;
    private javax.swing.JLabel jlPatente;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField txtCantPuertas;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables

    private boolean validar() {
        
        if(txtModelo.getText().isEmpty() || txtMarca.getText().isEmpty() || txtMotor.getText().isEmpty() || txtColor.getText().isEmpty() || txtPatente.getText().isEmpty() || txtCantPuertas.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos para guardar.", "Error al guardar automóvil", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        
        return false;
    }
}