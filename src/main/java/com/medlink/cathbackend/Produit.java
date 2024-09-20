package com.medlink.cathbackend;

import java.util.Date;

public class Produit {
    public Integer id;
    public String libelle;
    public String marque;
    public float prix;
    public Date dateExpiration;

    public Produit() {
    }

    public Produit(Integer id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }

    public Produit(Integer id, String libelle, String marque, float prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    public void afficher(){
        String string = "Produit{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                '}';
        System.out.println(string);
    }
}
