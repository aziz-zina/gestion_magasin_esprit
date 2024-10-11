package tn.tuniprob.gestionmagasin.entite;

public abstract class Employe {
    protected int id;
    protected String nom;
    protected String adresse;
    protected int nbr_heures;

    public Employe(int id, String nom, String adresse, int nbr_heures) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures = nbr_heures;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", nbr_heures=" + nbr_heures +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return id == employe.id &&
                nbr_heures == employe.nbr_heures &&
                nom.equals(employe.nom) &&
                adresse.equals(employe.adresse);
    }

    public abstract float calculerSalaire();
}
