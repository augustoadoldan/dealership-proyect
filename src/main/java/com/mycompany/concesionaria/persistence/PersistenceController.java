
package com.mycompany.concesionaria.persistence;

import com.mycompany.concesionaria.logica.Automovil;
import com.mycompany.concesionaria.persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersistenceController {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void agregarAuto(Automovil auto) {
        autoJpa.create(auto);
    }

    public List<Automovil> traerAutos() {
        return autoJpa.findAutomovilEntities();

    }

    public void borrarAuto(int idAuto) {
        try {
            autoJpa.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAuto(int idAuto) {
        return autoJpa.findAutomovil(idAuto);
    }

    public void modificarAuto(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(PersistenceController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
