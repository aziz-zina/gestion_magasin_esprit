package tdList.src.sort;

import tdList.src.entity.Etudiant;

import java.util.Comparator;

public class SortByID implements Comparator<Etudiant> {

    @Override
    public int compare(Etudiant e1, Etudiant e2) {
        return e1.getId() - e2.getId();
    }
}
