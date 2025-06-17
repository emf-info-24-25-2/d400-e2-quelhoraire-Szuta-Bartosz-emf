package models;

public class ModuleInfo {

    private final String nom;
    private Professeur professeur;

    public ModuleInfo(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    @Override
    public String toString() {
        String presente;
        if (professeur.enseigneCeModule(nom) != false) {
            presente = nom + " avec " + professeur.getPrenom() + " " + professeur.getNom();
        } else {
            presente = nom;
        }
        return presente;
    }

}
