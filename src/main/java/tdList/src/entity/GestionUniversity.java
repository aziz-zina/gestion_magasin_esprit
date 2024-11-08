package tdList.src.entity;

import tdList.src.service.University;
import tdList.src.sort.SortByID;
import tdList.src.sort.SortByName;

import java.util.ArrayList;
import java.util.Collections;

public class GestionUniversity implements University {
    private ArrayList<Etudiant> etudiants = new ArrayList<>();

    @Override
    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    @Override
    public boolean rechercherEtudiant(Etudiant e) {
        return etudiants.contains(e);
    }

    @Override
    public boolean rechercherEtudiant(String nom) {
        for (Etudiant e : etudiants) {
            if (e.getNom().equals(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerEtudiant(Etudiant e) {
        etudiants.remove(e);
    }

    @Override
    public void displayEtudiants() {
        for (Etudiant e : etudiants) {
            System.out.println(e);
        }
    }

    @Override
    public void trierEtudiantsParId() {
        etudiants.sort(new SortByID());
    }

    @Override
    public void trierEtudiantsParNom() {
        etudiants.sort(new SortByName());
    }
}
