package com.mycompany.hundefriseursalon.Persistence;

import com.mycompany.hundefriseursalon.BusinessLogik.Besitzer;
import com.mycompany.hundefriseursalon.BusinessLogik.Haustier;
import com.mycompany.hundefriseursalon.Persistence.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControllerPersistence {
    
    BesitzerJpaController besitzerJpa = new BesitzerJpaController();
    HaustierJpaController haustierJpa = new HaustierJpaController();

    public void speichern(Besitzer besitzer, Haustier haustier) {
        
        //Besitzer in der Datenbank erschafft
        besitzerJpa.create(besitzer);
        
        //Haustier in der Datenbank erschafft
        haustierJpa.create(haustier);
    }

    public List<Haustier> haustierenHolen() {
        
        return haustierJpa.findHaustierEntities();
        
        }

    public void hastierLoeschen(int num_cliente) {
        try {
            haustierJpa.destroy(num_cliente);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Haustier haustierHolen(int num_cliente) {
        return haustierJpa.findHaustier(num_cliente);
    }

    public void haustierModifizieren(Haustier hausti) {
        try {
            haustierJpa.edit(hausti);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Besitzer besitzerHolen(int id_Besitzer) {
        return besitzerJpa.findBesitzer(id_Besitzer);
    }

    public void besitzerModifizieren(Besitzer besitzer) {
        try {
            besitzerJpa.edit(besitzer);
        } catch (Exception ex) {
            Logger.getLogger(ControllerPersistence.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    


    
}
