package model;

import interfaccia.Clonabile;

import java.util.Objects;

public class Studente implements Comparable<Studente>, Clonabile<Studente> {

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<< ATTRIBUTES >>>>>>>>>>>>>>>>>>>>>>>>>>>>

    private Integer matricola;
    private boolean isMale;
    private Integer totaleCrediti;
    private Double mediaVoti;

    // indirizzo
    private String via, civico, paese, provincia;

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<< CONSTRUCTORS >>>>>>>>>>>>>>>>>>>>>>>>>>


    public Studente(Integer matricola, boolean isMale, Integer totaleCrediti, Double mediaVoti, String via, String civico, String paese, String provincia) {
        this.matricola = matricola;
        this.isMale = isMale;
        this.totaleCrediti = totaleCrediti;
        this.mediaVoti = mediaVoti;
        this.via = via;
        this.civico = civico;
        this.paese = paese;
        this.provincia = provincia;
    }

    public Studente() {
        this.setMatricola(-1);
        this.setTotaleCrediti(-1);
        this.setMediaVoti(-1D);
        this.setVia("");
        this.setCivico("");
        this.setPaese("");
        this.setProvincia("");
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<< METHODS >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    public Integer getMatricola() {
        return matricola;
    }

    public void setMatricola(Integer matricola) {
        this.matricola = matricola;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public Integer getTotaleCrediti() {
        return totaleCrediti;
    }

    public void setTotaleCrediti(Integer totaleCrediti) {
        this.totaleCrediti = totaleCrediti;
    }

    public Double getMediaVoti() {
        return mediaVoti;
    }

    public void setMediaVoti(Double mediaVoti) {
        this.mediaVoti = mediaVoti;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    public String getCivico() {
        return civico;
    }

    public void setCivico(String civico) {
        this.civico = civico;
    }

    public String getPaese() {
        return paese;
    }

    public void setPaese(String paese) {
        this.paese = paese;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public int compareTo(Studente studente) {
        return this.matricola - studente.matricola;
    }

    @Override
    public String toString() {
        return "Studente{" +
                "matricola=" + matricola +
                ", isMale=" + isMale +
                ", totaleCrediti=" + totaleCrediti +
                ", mediaVoti=" + mediaVoti +
                ", via='" + via + '\'' +
                ", civico='" + civico + '\'' +
                ", paese='" + paese + '\'' +
                ", provincia='" + provincia + '\'' +
                '}';
    }

    @Override
    public Studente clona() {
        Studente that;
        try {
            that = (Studente) super.clone();
        } catch (CloneNotSupportedException e) {
            that = new Studente(this.matricola, this.isMale, this.totaleCrediti, this.mediaVoti, this.via, this.civico, this.paese, this.provincia);
        }
        return that;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Studente studente = (Studente) o;
        return matricola.equals(studente.matricola);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricola);
    }
}
