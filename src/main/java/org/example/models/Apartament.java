package org.example.models;

public class Apartament{

    int codApartament;
    int etaj;
    int nrCamere;
    int pret;
    int metriPatrati;
    int codAgent;

    public Apartament() {
    }

    public Apartament(int etaj, int nrCamere, int pret, int metriPatrati, int codAgent) {
        this.etaj = etaj;
        this.nrCamere = nrCamere;
        this.pret = pret;
        this.metriPatrati = metriPatrati;
        this.codAgent = codAgent;
    }
    public Apartament(int codApartament, int etaj, int nrCamere, int pret, int metriPatrati, int codAgent) {
        this.etaj = etaj;
        this.nrCamere = nrCamere;
        this.pret = pret;
        this.metriPatrati = metriPatrati;
        this.codAgent = codAgent;
    }

    public int getCodApartament() {
        return codApartament;
    }

    public void setCodApartament(int codApartament) {
        this.codApartament = codApartament;
    }

    public int getEtaj() {
        return etaj;
    }

    public void setEtaj(int etaj) {
        this.etaj = etaj;
    }

    public int getNrCamere() {
        return nrCamere;
    }

    public void setNrCamere(int nrCamere) {
        this.nrCamere = nrCamere;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public int getMetriPatrati() {
        return metriPatrati;
    }

    public void setMetriPatrati(int metriPatrati) {
        this.metriPatrati = metriPatrati;
    }

    public int getCodAgent() {
        return codAgent;
    }

    public void setCodAgent(int codAgent) {
        this.codAgent = codAgent;
    }
}