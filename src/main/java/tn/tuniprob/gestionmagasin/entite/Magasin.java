package tn.tuniprob.gestionmagasin.entite;

public class Magasin {
    private Integer id;
    private String adresse;
    private final int CAPACITE = 50;
    private Produit[] produits = new Produit[CAPACITE];
    private int nbProduits = 0;
    public static int COMP;

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
}