
package com.mycompany.concesionaria.logica;

import com.mycompany.concesionaria.persistence.PersistenceController;
import java.util.List;

public class Controller {
    PersistenceController ctrlPersis = new PersistenceController();
    public void agregarAuto(String marca, String modelo, String motor, String color, String patente, int cantidadPuertas) {
        Automovil auto  = new Automovil ();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantidadPuertas(cantidadPuertas);
        ctrlPersis.agregarAuto(auto);
    }

    public List<Automovil> traerAutos() {
        return ctrlPersis.traerAutos();

    }

    public void borrarAuto(int idAuto) {
        ctrlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAuto(int idAuto) {
        return ctrlPersis.traerAuto(idAuto);

    }

    public void editCar(Automovil auto, String carBrand, String carModel, String carMotor, String carColor, String carPatente, int carDoors) {
        auto.setMarca(carBrand);
        auto.setModelo(carModel);
        auto.setMotor(carMotor);
        auto.setColor(carColor);
        auto.setPatente(carPatente);
        auto.setCantidadPuertas(carDoors);
        ctrlPersis.modificarAuto(auto);
    }

    
}
