package com.devcoder.concesionaria.igu;

import com.devcoder.concesionaria.logica.Controladora;
import javax.swing.JOptionPane;

public class AltaAutomovil extends javax.swing.JFrame {

    Controladora control = null;
    
    public AltaAutomovil() {
        control = new Controladora();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlTitulo = new javax.swing.JLabel();
        jlLogo = new javax.swing.JLabel();
        jlMarca = new javax.swing.JLabel();
        jtfMarca = new javax.swing.JTextField();
        jlModelo = new javax.swing.JLabel();
        jtfModelo = new javax.swing.JTextField();
        jlMotor = new javax.swing.JLabel();
        jtfMotor = new javax.swing.JTextField();
        jlColor = new javax.swing.JLabel();
        jtfColor = new javax.swing.JTextField();
        jlPatente = new javax.swing.JLabel();
        jtfPatente = new javax.swing.JTextField();
        jlCantPuertas = new javax.swing.JLabel();
        jtfCantPuertas = new javax.swing.JTextField();
        jbAgregar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(750, 470));

        jlTitulo.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("Alta de Automóviles");

        jlLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LogoMercedesBenz.png"))); // NOI18N

        jlMarca.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jlMarca.setText("Marca:");

        jtfMarca.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        jlModelo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jlModelo.setText("Modelo:");

        jtfModelo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        jlMotor.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jlMotor.setText("Motor:");

        jtfMotor.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        jlColor.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jlColor.setText("Color:");

        jtfColor.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        jlPatente.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jlPatente.setText("Patente:");

        jtfPatente.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        jlCantPuertas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jlCantPuertas.setText("Cantidad de puertas:");

        jtfCantPuertas.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        jbAgregar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbLimpiar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbRegresar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jbRegresar.setText("<");
        jbRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlTitulo)
                        .addGap(84, 84, 84)
                        .addComponent(jbRegresar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jlCantPuertas)
                                            .addGap(18, 18, 18)
                                            .addComponent(jtfCantPuertas))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jlPatente)
                                                .addComponent(jlColor)
                                                .addComponent(jlMotor))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jtfMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtfColor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jtfPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jlMarca)
                                            .addGap(30, 30, 30)
                                            .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jlModelo)
                                        .addGap(21, 21, 21)
                                        .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(66, 66, 66))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jbAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbLimpiar)
                                .addGap(94, 94, 94)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jlLogo)))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jlTitulo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbRegresar)
                        .addGap(18, 18, 18)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMarca)
                            .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlModelo)
                            .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlMotor)
                            .addComponent(jtfMotor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlColor)
                            .addComponent(jtfColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPatente)
                            .addComponent(jtfPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlCantPuertas)
                            .addComponent(jtfCantPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbAgregar)
                            .addComponent(jbLimpiar)))
                    .addComponent(jlLogo))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbRegresarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        
        try{
            String marca = jtfMarca.getText();
            String modelo = jtfModelo.getText();
            String color = jtfColor.getText();
            String motor = jtfMotor.getText();
            String patente = jtfPatente.getText();
            int cantPuertas = Integer.parseInt(jtfCantPuertas.getText());

            control.agregarAutomovil(marca, modelo, color, motor, patente, cantPuertas);

            JOptionPane.showMessageDialog(this, "Automóvil agregado correctamente.", "Información", 1);
            
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Debe ingresar un valor númérico en \"Cantidad de puertas\".", "Información", 2);
        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        
        jtfMarca.setText(null);
        jtfModelo.setText(null);
        jtfColor.setText(null);
        jtfMotor.setText(null);
        jtfPatente.setText(null);
        jtfCantPuertas.setText(null);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbRegresar;
    private javax.swing.JLabel jlCantPuertas;
    private javax.swing.JLabel jlColor;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlMotor;
    private javax.swing.JLabel jlPatente;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTextField jtfCantPuertas;
    private javax.swing.JTextField jtfColor;
    private javax.swing.JTextField jtfMarca;
    private javax.swing.JTextField jtfModelo;
    private javax.swing.JTextField jtfMotor;
    private javax.swing.JTextField jtfPatente;
    // End of variables declaration//GEN-END:variables
}
