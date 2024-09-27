package com.medlink.cathbackend;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Q1
        Produit p = new Produit();

        // Q2
        Produit produit1 = new Produit(1021, "Lait", "Delice");
        Produit produit2 = new Produit(2510, "Yaourt", "Vitalait");
        Produit produit3 = new Produit(3250, "Tomate", "Sicam", 1.2);

        // Q3:
        System.out.println("Question 3:");
        produit1.toString();
        produit2.toString();
        produit3.toString();

        // Q4
        produit1.setPrix(0.7);
        produit1.toString();

        // Q5
        produit2.setPrix(0.5);

        // Q6:
        System.out.println("Question 6:");
        System.out.println(produit1.toString());
        System.out.println(produit2.toString());
        System.out.println(produit3.toString());

        // Q7:
        System.out.println("Question 7:");
        System.out.println(produit1.toString());
        System.out.println(produit2.toString());
        System.out.println(produit3.toString());

        // Q8
        System.out.println("Question 8: Add date");
        produit1.setDateExpiration(new Date(2022, 12, 31));
        produit2.setDateExpiration(new Date(2024, 8, 11));
        produit3.setDateExpiration(new Date(2024, 3, 21));

        // Prosit 2
        Magasin magasin1 = new Magasin(1, "123 Rue Principale");
        Magasin magasin2 = new Magasin(2, "456 Avenue Secondaire");

        magasin1.ajouter(produit1);
        magasin1.ajouter(produit2);
        magasin2.ajouter(produit3);

        System.out.println(magasin1.toString());
        System.out.println(magasin2.toString());

        System.out.println("Nombre total de produits: " + Magasin.getNbProduits());
    }
}