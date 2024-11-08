package tn.tuniprob.gestionmagasin.test;

import tn.tuniprob.gestionmagasin.entite.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Prosit 4

        // Q1
        Magasin magasin1 = new Magasin(1, "Carrefour", "Centre-Ville");
        Magasin magasin2 = new Magasin(2, "Monoprix", "Menzah 6");

        // Q2
        Caissier caissier1 = new Caissier(1, "Ali", "Rue A", 40, 1);
        Caissier caissier2 = new Caissier(2, "Sami", "Rue B", 40, 2);
        Vendeur vendeur1 = new Vendeur(3, "Omar", "Rue C", 40, 0.1f);
        Responsable responsable1 = new Responsable(4, "Hichem", "Rue D", 40, 500.0f);

        magasin1.ajouterEmploye(caissier1);
        magasin1.ajouterEmploye(caissier2);
        magasin1.ajouterEmploye(vendeur1);
        magasin1.ajouterEmploye(responsable1);

        Caissier caissier3 = new Caissier(5, "Ahmed", "Rue E", 40, 3);
        Vendeur vendeur2 = new Vendeur(6, "Mehdi", "Rue F", 40, 0.15f);
        Vendeur vendeur3 = new Vendeur(7, "Nour", "Rue G", 40, 0.12f);
        Vendeur vendeur4 = new Vendeur(8, "Yasmine", "Rue H", 40, 0.2f);
        Responsable responsable2 = new Responsable(9, "Salma", "Rue I", 40, 800.0f);

        magasin2.ajouterEmploye(caissier3);
        magasin2.ajouterEmploye(vendeur2);
        magasin2.ajouterEmploye(vendeur3);
        magasin2.ajouterEmploye(vendeur4);
        magasin2.ajouterEmploye(responsable2);

        // Q3:
        System.out.println(caissier1.toString());
        System.out.println(caissier2.toString());
        System.out.println(caissier3.toString());
        System.out.println(vendeur1.toString());
        System.out.println(vendeur2.toString());
        System.out.println(vendeur3.toString());
        System.out.println(vendeur4.toString());
        System.out.println(responsable1.toString());
        System.out.println(responsable2.toString());

        // Q4
        Produit produit1 = new Produit(1, "Lait", "Délice", 1.2, new Date());
        Produit produit2 = new Produit(2, "Jus", "Sabrine", 0.8, new Date());
        Produit produit3 = new Produit(3, "Pain", "Baguette", 0.5, new Date());
        Produit produit4 = new Produit(4, "Fromage", "Vitalait", 2.5, new Date());

        magasin1.ajouter(produit1);
        magasin1.ajouter(produit2);

        magasin2.ajouter(produit3);
        magasin2.ajouter(produit4);


        // Q5
        System.out.println("\nDétails du magasin Carrefour:");
        System.out.println(magasin1);

        System.out.println("\nDétails du magasin Monoprix:");
        System.out.println(magasin2);

        // Q6:
        System.out.println("\nSalaires des employés du magasin Carrefour:");
        for (int i = 0; i < magasin1.getNbEmployes(); i++) {
            Employe e = magasin1.getEmployes()[i];
            System.out.println(e.getNom() + " salaire: " + e.calculerSalaire() + " DT");
        }

        System.out.println("\nSalaires des employés du magasin Monoprix:");
        for (int i = 0; i < magasin2.getNbEmployes(); i++) {
            Employe e = magasin2.getEmployes()[i];
            System.out.println(e.getNom() + " salaire: " + e.calculerSalaire() + " DT");
        }

        // Q7:
        System.out.println("\nPrimes des responsables du magasin Carrefour:");
        for (int i = 0; i < magasin1.getNbEmployes(); i++) {
            Employe e = magasin1.getEmployes()[i];
            if (e instanceof Responsable) {
                Responsable r = (Responsable) e;
                System.out.println(r.getNom() + " prime: " + r.getPrime() + " DT");
            }
        }

        System.out.println("\nPrimes des responsables du magasin Monoprix:");
        for (int i = 0; i < magasin2.getNbEmployes(); i++) {
            Employe e = magasin2.getEmployes()[i];
            if (e instanceof Responsable) {
                Responsable r = (Responsable) e;
                System.out.println(r.getNom() + " prime: " + r.getPrime() + " DT");
            }
        }

        // Q8
        System.out.println("\nSalaires de tous les employés dans le magasin Carrefour:");
        for (int i = 0; i < magasin1.getNbEmployes(); i++) {
            Employe e = magasin1.getEmployes()[i];
            System.out.println(e.getNom() + " salaire: " + e.calculerSalaire() + " DT");
        }

        System.out.println("\nSalaires de tous les employés dans le magasin Monoprix:");
        for (int i = 0; i < magasin2.getNbEmployes(); i++) {
            Employe e = magasin2.getEmployes()[i];
            System.out.println(e.getNom() + " salaire: " + e.calculerSalaire() + " DT");
        }

        // Q9
        System.out.println("\nTous les employés du magasin Carrefour:");
        for (int i = 0; i < magasin1.getNbEmployes(); i++) {
            System.out.println(magasin1.getEmployes()[i].toString());
        }

        System.out.println("\nTous les employés du magasin Monoprix:");
        for (int i = 0; i < magasin2.getNbEmployes(); i++) {
            System.out.println(magasin2.getEmployes()[i].toString());
        }

        // Q10
        System.out.println(magasin1);
        System.out.println(magasin2);

        // Q11
        // DONE

        //Q12
        magasin1.afficherNbEmployesParType();
        magasin2.afficherNbEmployesParType();



    }
}