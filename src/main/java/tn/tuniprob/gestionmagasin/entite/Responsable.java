package tn.tuniprob.gestionmagasin.entite;

public class Responsable extends Employe {
    private float prime;

    public Responsable(int id, String nom, String adresse, int nbr_heures, float prime) {
        super(id, nom, adresse, nbr_heures);
        this.prime = prime;
    }

    public float getPrime() {
        return prime;
    }

    @Override
    public String toString() {
        return super.toString() + ", prime=" + prime + "}";
    }

    @Override
    public float calculerSalaire() {
        float salaireSupp = 0;
        if(nbr_heures > 160) {
            salaireSupp = (nbr_heures - 160) * 20;
        }
        return (nbr_heures * 10) + prime + salaireSupp;
    }
}
