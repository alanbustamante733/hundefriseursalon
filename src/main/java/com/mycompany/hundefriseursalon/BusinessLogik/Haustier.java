package com.mycompany.hundefriseursalon.BusinessLogik;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Haustier implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_cliente;
    private String name;
    private String rasse;
    private String farbe;
    private String allergien;
    private String besondernheiten;
    private String beobachtungen;
    @OneToOne
    private Besitzer einBesitzer;

    public Haustier() {
    }

    public Haustier(int num_cliente, String name, String rasse, String farbe, String allergien, String besondernheiten, String beobachtungen, Besitzer einBesitzer) {
        this.num_cliente = num_cliente;
        this.name = name;
        this.rasse = rasse;
        this.farbe = farbe;
        this.allergien = allergien;
        this.besondernheiten = besondernheiten;
        this.beobachtungen = beobachtungen;
        this.einBesitzer = einBesitzer;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRasse() {
        return rasse;
    }

    public void setRasse(String rasse) {
        this.rasse = rasse;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String getAllergien() {
        return allergien;
    }

    public void setAllergien(String allergien) {
        this.allergien = allergien;
    }

    public String getBesondernheiten() {
        return besondernheiten;
    }

    public void setBesondernheiten(String besondernheiten) {
        this.besondernheiten = besondernheiten;
    }

    public String getBeobachtungen() {
        return beobachtungen;
    }

    public void setBeobachtungen(String beobachtungen) {
        this.beobachtungen = beobachtungen;
    }

    public Besitzer getEinBesitzer() {
        return einBesitzer;
    }

    public void setEinBesitzer(Besitzer einBesitzer) {
        this.einBesitzer = einBesitzer;
    }
    
    
}
