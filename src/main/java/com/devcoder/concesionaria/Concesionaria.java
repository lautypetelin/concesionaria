package com.devcoder.concesionaria;

import com.devcoder.concesionaria.igu.Principal;

public class Concesionaria {

    public static void main(String[] args) {
        
        //Llamamos y hacemos visible a nuestra IGU.
        Principal princ = new Principal();
        princ.setVisible(true);
        princ.setLocationRelativeTo(null);
    }
}
