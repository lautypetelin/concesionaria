package com.devcoder.concesionaria.logica;

import com.devcoder.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia persis = new ControladoraPersistencia();
    
    public void guardarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        
        Automovil auto = new Automovil(modelo, marca, motor, color, patente, cantPuertas);
        persis.guardarAutomovil(auto);
    }
    
    public Automovil traerAutomovil(int idAuto) {
        
        return persis.traerAutomovil(idAuto);
    }
    
    public List<Automovil> traerAutomoviles() {
        
        return persis.traerAutomoviles();
    }

    public void modificarAutomovil(int idAutomovil, String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        
        Automovil automovil = new Automovil(idAutomovil, modelo, marca, motor, color, patente, cantPuertas);   
        persis.modificarAutomovil(automovil);
    }
    
    public void eliminarAutomovil(int idAuto) {
        
        persis.eliminarAutomovil(idAuto);
    }
}