package com.medlink.cathbackend;

import java.util.Arrays;

public class Magasin {
    private Integer id;
    private String adresse;
    private final int CAPACITE = 50;
    private Produit[] produits = new Produit[CAPACITE];
    private static int nbProduits = 0;

    public Magasin(Integer id, String adresse) {
        this.id = id;
        this.adresse = adresse;
    }

    public Magasin() {
    }

    @Override
    public String toString() {
        StringBuilder produitsStr = new StringBuilder("[");
        for (int i = 0; i < nbProduits; i++) {
            produitsStr.append(produits[i]);
            if (i < nbProduits - 1) {
                produitsStr.append(", ");
            }
        }
        produitsStr.append("]");

        return "Magasin{" +
                "id=" + id +
                ", adresse='" + adresse + '\'' +
                ", CAPACITE=" + CAPACITE +
                ", produits=" + produitsStr.toString() +
                '}';
    }

    public void ajouter(Produit p) {
        if (nbProduits < CAPACITE) {
            produits[nbProduits] = p;
            nbProduits++;
        } else {
            System.out.println("Capacite maximale atteinte");
        }
    }

    public static int getNbProduits() {
        return nbProduits;
    }
}