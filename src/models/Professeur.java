package models;

public class Professeur {

    private final String nom;
    private final String prenom;
    private ModuleInfo[] modulesEnseignes;

    public Professeur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.modulesEnseignes = new ModuleInfo[0];
    }

    public boolean enseigneCeModule(String nomDuModule) {
        boolean enseigne = false;
        for (int i = 0; i < modulesEnseignes.length; i++) {
            if (modulesEnseignes[i].getNom() == nomDuModule) {
                enseigne = true;
                break;
            }
        }
        return enseigne;
    }

    public void ajouterModuleEnseigne(ModuleInfo module) {
        ModuleInfo[] tableaux = new ModuleInfo[modulesEnseignes.length + 1];
        for (int i = 0; i < tableaux.length; i++) {
            if (tableaux[i] == null) {
                tableaux[i] = module;
            }
            modulesEnseignes = tableaux;
        }
    }

    public void viderModules() {
        ModuleInfo[] vide = new ModuleInfo[0];
        modulesEnseignes = vide;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public ModuleInfo[] getModulesEnseignes() {
        return modulesEnseignes;
    }

    @Override
    public String toString() {
        return prenom + " " + nom;
    }

}
