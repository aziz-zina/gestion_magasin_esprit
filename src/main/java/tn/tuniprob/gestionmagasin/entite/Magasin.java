package tn.tuniprob.gestionmagasin.entite;

import java.util.Arrays;

public class Magasin {
    private int id;
    private String nom;
    private String adresse;
    private final int CAPACITE = 50;
    private final int CAPACITE_EMPLOYES = 20;
    private Produit[] produits = new Produit[CAPACITE];
    private Employe[] employes = new Employe[CAPACITE_EMPLOYES];
    private int nbProduits = 0;
    private int nbEmployes = 0;
    public static int COMP;

    public Magasin(int id, String adresse) {
        this.id = id;
        this.adresse = adresse;
    }

    public Magasin() {
    }

    public Magasin(int id, String nom, String adresse) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
    }

    public int getNbEmployes() {
        return nbEmployes;
    }

    public Employe[] getEmployes() {
        return employes;
    }

    @Override
    public String toString() {
        return "Magasin{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", CAPACITE=" + CAPACITE +
                ", CAPACITE_EMPLOYES=" + CAPACITE_EMPLOYES +
                ", produits=" + Arrays.toString(produits) +
                ", employes=" + Arrays.toString(employes) +
                ", nbProduits=" + nbProduits +
                ", nbEmployes=" + nbEmployes +
                '}';
    }

    public void ajouter(Produit p) {
        if (chercherProduit(p)) {
            System.out.println("Produit déjà existant");
            return;
        }
        if (nbProduits < CAPACITE) {
            produits[nbProduits] = p;
            nbProduits++;
            COMP++;
        } else {
            System.out.println("Capacite maximale atteinte");
        }
    }

    public int getNbProduits() {
        return nbProduits;
    }

    public boolean chercherProduit(Produit p) {
        for (int i = 0; i < nbProduits; i++) {
            if (produits[i].comparer(p)) {
                return true;
            }
        }
        return false;
    }

    public static Magasin comparerMagasins(Magasin m1, Magasin m2) {
        if (m1.getNbProduits() > m2.getNbProduits()) {
            return m1;
        } else {
            return m2;
        }
    }

    public void supprimerProduit(Produit p) {
        if (!chercherProduit(p)) {
            System.out.println("Produit non trouvé");
            return;
        }
        for (int i = 0; i < nbProduits; i++) {
            if (produits[i].comparer(p)) {
                // Shift products to the left to fill the gap
                for (int j = i; j < nbProduits - 1; j++) {
                    produits[j] = produits[j + 1];
                }
                produits[nbProduits - 1] = null; // Clear the last product
                nbProduits--;
                COMP--;
                System.out.println("Produit supprimé");
                return;
            }
        }
    }

    public boolean chercherEmploye(Employe e) {
        for (int i = 0; i < nbEmployes; i++) {
            if (employes[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    public void ajouterEmploye(Employe e) {
        if (chercherEmploye(e)) {
            System.out.println("Employé déjà existant");
            return;
        }
        if (nbEmployes < CAPACITE_EMPLOYES) {
            employes[nbEmployes] = e;
            nbEmployes++;
        } else {
            System.out.println("Capacite maximale atteinte");
        }
    }

    public void supprimerEmploye(Employe e) {
        if (!chercherEmploye(e)) {
            System.out.println("Employe non trouvé");
            return;
        }
        for (int i = 0; i < nbEmployes; i++) {
            if (employes[i].equals(e)) {
                // Shift products to the left to fill the gap
                for (int j = i; j < nbEmployes - 1; j++) {
                    employes[j] = employes[j + 1];
                }
                employes[nbEmployes - 1] = null; // Clear the last product
                nbEmployes--;
                System.out.println("Employé supprimé");
                return;
            }
        }
    }

    public void afficherNbEmployesParType() {
        int nbCaissiers = 0;
        int nbVendeurs = 0;
        int nbResponsables = 0;
        for (int i = 0; i < nbEmployes; i++) {
            if (employes[i] instanceof Caissier) {
                nbCaissiers++;
            } else if (employes[i] instanceof Vendeur) {
                nbVendeurs++;
            } else if (employes[i] instanceof Responsable) {
                nbResponsables++;
            }
        }
        System.out.println("Nombre de caissiers: " + nbCaissiers);
        System.out.println("Nombre de vendeurs: " + nbVendeurs);
        System.out.println("Nombre de responsables: " + nbResponsables);
    }
}