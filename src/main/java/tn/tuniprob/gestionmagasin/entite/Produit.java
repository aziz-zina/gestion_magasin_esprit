package tn.tuniprob.gestionmagasin.entite;

import java.util.Date;

public class Produit {

    private Integer id;
    private String libelle;
    private String marque;
    private Double prix;
    private Date dateExpiration;

    public Produit() {
    }

    public Produit(Integer id, String libelle, String marque, Double prix, Date dateExpiration) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        if(prix < 0){
            throw new IllegalArgumentException("Prix doit etre positif");
        }
        this.prix = prix;
        this.dateExpiration = dateExpiration;
    }

    public Produit(Integer id, String libelle, String marque) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
    }

    public Produit(Integer id, String libelle, String marque, Double prix) {
        this.id = id;
        this.libelle = libelle;
        this.marque = marque;
        if(prix < 0){
            throw new IllegalArgumentException("Prix doit etre positif");
        }
        this.prix = prix;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "id=" + id +
                ", libelle='" + libelle + '\'' +
                ", marque='" + marque + '\'' +
                ", prix=" + prix +
                ", dateExpiration=" + dateExpiration +
                '}';
    }
}