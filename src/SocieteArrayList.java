import java.util.ArrayList;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe> {
    private ArrayList<Employe> listeEmployes;

    public SocieteArrayList() {
        this.listeEmployes = new ArrayList<>();
    }


    @Override
    public void ajouterEmploye(Employe employe) {
        listeEmployes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe employe : listeEmployes) {
            if (employe.getNom().equals(nom)) {
                return true; 
            }
        }
        return false; 
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        return listeEmployes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        listeEmployes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        for (Employe employe : listeEmployes) {
            System.out.println(employe.toString());
        }
    }

    @Override
    public void trierEmployeParId() {
        Comparator<Employe> comparator = null;
        sort(listeEmployes, comparator);
    }

    private void sort(ArrayList<Employe> listeEmployes, Comparator<Employe> comparator) {
    }

    @Override
    public void trierEmployeParNomDepartementEtGrade() {
        Comparator<Employe> comparator = Comparator
                .comparing(Employe::getNom_dep)
                .thenComparing(Employe::getGrade);

        sort(listeEmployes, comparator);
    }
}
