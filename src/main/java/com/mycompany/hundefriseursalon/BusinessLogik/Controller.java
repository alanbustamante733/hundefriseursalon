package com.mycompany.hundefriseursalon.BusinessLogik;

import com.mycompany.hundefriseursalon.Persistence.ControllerPersistence;
import java.util.List;

public class Controller {
    
    ControllerPersistence controllerPersis = new ControllerPersistence();

    public void speichern(String nameHaustier, String rasse, String farbe,
            String allergien, String besondernheiten, String beobachtungen,
            String nameBesitzer, String handynummer) {
        
        
        //Besitzer erschafft und werte verwiesen
        Besitzer besitzer = new Besitzer();
        besitzer.setName(nameBesitzer);
        besitzer.setHandynummer(handynummer);
        
        //Besitzer erschafft und werte verwiesen
        Haustier haustier = new Haustier();
        haustier.setName(nameHaustier);
        haustier.setRasse(rasse);
        haustier.setFarbe(farbe);
        haustier.setAllergien(allergien);
        haustier.setBesondernheiten(besondernheiten);
        haustier.setBeobachtungen(beobachtungen);
        haustier.setEinBesitzer(besitzer);
    
        controllerPersis.speichern(besitzer,haustier);
        
    }

    public List<Haustier> haustierenHolen() {
        
        return controllerPersis.haustierenHolen();
    }

    public void haustierLoeschen(int num_cliente) {
        controllerPersis.hastierLoeschen (num_cliente);
    }

    public Haustier haustierHolen(int num_cliente) {
        return controllerPersis.haustierHolen (num_cliente);
    }

    public void haustiermodifizieren(Haustier hausti, String nameHaustier,
            String rasse, String farbe, String allergien,
            String besondernheiten, String Beobachtungen, String nameBesitzer, String handynummer) {
        
        hausti.setName(nameHaustier);
        hausti.setRasse(rasse);
        hausti.setFarbe(farbe);
        hausti.setBeobachtungen(Beobachtungen);
        hausti.setBesondernheiten(besondernheiten);
        hausti.setAllergien(allergien);
        
        //modifiziere das Haustier
        controllerPersis.haustierModifizieren(hausti);
        
        Besitzer besitzer = this.besitzerSuchen(hausti.getEinBesitzer().getId_Besitzer());
        besitzer.setHandynummer(handynummer);
        besitzer.setName(nameBesitzer);
        
        //besitzerModifizieren aufrufen
        this.besitzerModifizieren(besitzer);
        
    }

    private Besitzer besitzerSuchen(int id_Besitzer) {
        return controllerPersis.besitzerHolen(id_Besitzer);
    }

    private void besitzerModifizieren(Besitzer besitzer) {
        controllerPersis.besitzerModifizieren(besitzer);
    }
    
    
    
}
