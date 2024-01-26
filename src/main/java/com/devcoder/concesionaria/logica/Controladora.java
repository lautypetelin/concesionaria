package com.devcoder.concesionaria.logica;

import com.devcoder.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia persis = new ControladoraPersistencia();
    
    public void agregarAutomovil(String marca, String modelo, String color, String motor, String patente, int cantPuertas) {
        
        Automovil auto = new Automovil();
        
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setCantidadPuertas(cantPuertas);
        
        persis.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutomoviles() {
        return persis.traerAutomoviles();
    }

    public void eliminarVehiculo(int idAuto) {
        persis.eliminarVehiculo(idAuto);
    }

    public Automovil traerAutomovil(int idAuto) {
        return persis.traerAutomovil(idAuto);
    }

    public void modificarAutomovil(Automovil auto, String marca, String modelo, String color, String motor, String patente, int cantPuertas) {

        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setCantidadPuertas(cantPuertas);
        
        persis.modificarAutomovil(auto);
    }
    
    
    
    
}