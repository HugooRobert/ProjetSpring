package com.example.servingwebcontent.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AdresseForm {
    @NotNull
    @Size(min=2, max=30)
    private String ville;

    @NotNull
    @Size(min=2, max=30)
    private String codePostal;

    @NotNull
    @Size(min=1, max=30)
    private String numeroRue;

    @NotNull
    @Size(min=2, max=30)
    private String libelleVoirie;

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

    @Override
    public String toString() {
        return "AdresseForm{" +
                "ville='" + ville + '\'' +
                ", codePostal='" + codePostal + '\'' +
                ", numeroRue='" + numeroRue + '\'' +
                ", libelleVoirie='" + libelleVoirie + '\'' +
                '}';
    }

}