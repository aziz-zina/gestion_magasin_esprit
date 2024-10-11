package tn.tuniprob.gestionmagasin.entite;

public class Caissier extends Employe {
    private int numeroDeCaisse;

    public Caissier(int id, String nom, String adresse, int nbr_heures, int numeroDeCaisse) {
        super(id, nom, adresse, nbr_heures);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public String toString() {
        return super.toString() + ", numero de caisse=" + numeroDeCaisse + "}";
    }

    @Override
    public float calculerSalaire() {
        float salaireSupp = 0;
        if(nbr_heures > 180) {
            salaireSupp = (nbr_heures - 180) * 15;
        }
        return (nbr_heures * 5) + salaireSupp;
    }
}
