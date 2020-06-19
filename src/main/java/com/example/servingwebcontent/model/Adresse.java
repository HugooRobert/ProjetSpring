package com.example.servingwebcontent.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
public class Adresse implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String ville;
    private String codePostal;
    private String numeroRue;
    private String libelleVoirie;

    protected Adresse() {}

    public Adresse(String ville, String codePostal, String numeroRue, String libelleVoirie) {
        this.ville = ville;
        this.codePostal = codePostal;
        this.numeroRue = numeroRue;
        this.libelleVoirie = libelleVoirie;
    }

    @Override
    public String toString() {
        return String.format(
                "Adresse[id=%d, ville='%s', numeroRue='%s', libelleVoirie='%s', codePostal='%s']",
                id, ville, numeroRue, libelleVoirie, codePostal);
    }

    public Long getId() {
        return id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getNumeroRue() {
        return numeroRue;
    }

    public void setNumeroRue(String numeroRue) {
        this.numeroRue = numeroRue;
    }

    public String getLibelleVoirie() {
        return libelleVoirie;
    }

    public void setLibelleVoirie(String libelleVoirie) {
        this.libelleVoirie = libelleVoirie;
    }

}