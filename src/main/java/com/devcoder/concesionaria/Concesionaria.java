package com.devcoder.concesionaria;

import com.devcoder.concesionaria.igu.Principal;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;

public class Concesionaria {

    public static void main(String[] args) {
        
        // Cambiar el Look and Feel
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "El Look And Feel no ha sido instalado o no es compatible con la versión de java que estás utilizando.", "Error con Look And Feel", JOptionPane.ERROR_MESSAGE);
        }
        
        // Hacer visible la IGU
        Principal princ = new Principal();
        princ.setTitle("Concesionaria by Lautaro Petelin");
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
}