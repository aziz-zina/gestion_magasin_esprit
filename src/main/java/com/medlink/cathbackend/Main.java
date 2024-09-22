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
        Produit produit3 = new Produit(3250, "Tomate", "Sicam", 1.2f);

        // Q3:
        System.out.println("Question 3:");
        produit1.afficher();
        produit2.afficher();
        produit3.afficher();

        // Q4
        produit1.prix = (0.7f);
        produit1.afficher();

        // Q5
        produit2.prix = (0.5f);

        // Q6:
        System.out.println("Question 6:");
        produit1.afficher();
        produit2.afficher();
        produit3.afficher();

        // Q7:
        System.out.println("Question 7:");
        System.out.println(produit1.toString());
        System.out.println(produit2.toString());
        System.out.println(produit3.toString());

        // Q8
        System.out.println("Question 8: Add date");
        produit1.dateExpiration = new Date(2022, 12, 31);
        produit2.dateExpiration = new Date(2024, 8, 11);
        produit3.dateExpiration = new Date(2024, 3, 21);
    }
}