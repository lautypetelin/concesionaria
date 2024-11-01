package com.devcoder.concesionaria.persistencia;

import com.devcoder.concesionaria.logica.Automovil;
import com.devcoder.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;

public class ControladoraPersistencia {

    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void guardarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }

    public Automovil traerAutomovil(int idAuto) {
        return autoJpa.findAutomovil(idAuto);
    }

    public List<Automovil> traerAutomoviles() {
        return autoJpa.findAutomovilEntities();
    }

    public void modificarAutomovil(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            // // Excepción controlada desde ModificarAutomovil
        }
    }

    public void eliminarAutomovil(int idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            // Excepción controlada desde VerDatos
        }
    }
}