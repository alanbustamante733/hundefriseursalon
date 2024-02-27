package com.mycompany.hundefriseursalon.BusinessLogik;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Besitzer implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id_Besitzer;
    private String name;
    private String handynummer;

    public Besitzer() {
    }

    public Besitzer(int id_Besitzer, String name, String handynummer) {
        this.id_Besitzer = id_Besitzer;
        this.name = name;
        this.handynummer = handynummer;
    }

    public int getId_Besitzer() {
        return id_Besitzer;
    }

    public void setId_Besitzer(int id_Besitzer) {
        this.id_Besitzer = id_Besitzer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHandynummer() {
        return handynummer;
    }

    public void setHandynummer(String handynummer) {
        this.handynummer = handynummer;
    }
    
    
    
}
