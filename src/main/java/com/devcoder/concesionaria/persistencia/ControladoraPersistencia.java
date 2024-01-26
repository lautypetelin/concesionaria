package com.devcoder.concesionaria.persistencia;

import com.devcoder.concesionaria.logica.Automovil;
import com.devcoder.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }

    public List<Automovil> traerAutomoviles() {
        return autoJpa.findAutomovilEntities();
    }

    public void eliminarVehiculo(int idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
//            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAutomovil(int idAuto) {
        return autoJpa.findAutomovil(idAuto);
    }

    public void modificarAutomovil(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
//            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}