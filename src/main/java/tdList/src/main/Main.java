package tdList.src.main;

import tdList.src.entity.Etudiant;
import tdList.src.entity.GestionUniversity;
import tdList.src.service.University;

public class Main {
    public static void main(String[] args) {
        Etudiant e1 = new Etudiant(1, "Doe", "John");
        Etudiant e2 = new Etudiant(2, "Doe", "Jane");
        Etudiant e3 = new Etudiant(3, "Doe", "Alice");
        Etudiant e4 = new Etudiant(4, "Doe", "Bob");

        // Afficher les Etudiants
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        // Comparer les Etudiants
        System.out.println(e1.equals(e2));
        System.out.println(e1.equals(e3));
        System.out.println(e1.equals(e4));

        // Gestion université
        GestionUniversity university = new GestionUniversity();
        university.ajouterEtudiant(e1);
        university.ajouterEtudiant(e2);
        university.ajouterEtudiant(e3);
        university.ajouterEtudiant(e4);

        university.displayEtudiants();

        university.trierEtudiantsParId();
        university.displayEtudiants();

        university.trierEtudiantsParNom();
        university.displayEtudiants();

        university.supprimerEtudiant(e1);
        university.displayEtudiants();
    }
}
