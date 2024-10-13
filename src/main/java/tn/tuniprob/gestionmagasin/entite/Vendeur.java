package tn.tuniprob.gestionmagasin.entite;

public class Vendeur extends Employe {
    private float tauxDeVente;

    public Vendeur(int id, String nom, String adresse, int nbr_heures, float tauxDeVente) {
        super(id, nom, adresse, nbr_heures);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public String toString() {
        return super.toString() + ", taux de vente=" + tauxDeVente + "}";
    }

    @Override
    public float calculerSalaire() {
        return 460 * tauxDeVente;
    }


}
