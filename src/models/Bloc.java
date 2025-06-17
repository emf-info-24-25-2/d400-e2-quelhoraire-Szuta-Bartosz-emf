package models;

public class Bloc {
    public final static int NBRE_DEMI_JOURS_SEMAINE = 10;
    private final String nom;
    private ModuleInfo[] modules;

    public Bloc(String nom) {
        this.nom = nom;
        this.modules = new ModuleInfo[NBRE_DEMI_JOURS_SEMAINE];

    }

    public boolean planifierModule(ModuleInfo module) {
        boolean reussi = false;
        int demijournee = 0;
        do {
            for (int i = 0; i < modules.length; i++) {
                if (modules[i] == null) {
                    modules[i] = module;
                    demijournee++;
                }

            }

        } while (demijournee == 3);

        return reussi;
    }

    public void afficherHoraire() {

    }

    public boolean estTotalementPlanifie() {
        boolean complet = false;
        int nbrenull = 0;
        for (int i = 0; i < modules.length; i++) {
            if (modules[i] == null) {
                nbrenull++;
            }
        }
        if (nbrenull == 0) {
            complet = true;
        }
        return complet;
    }

    public boolean contientModule(ModuleInfo module) {
        boolean planifier = false;
        for (int i = 0; i < modules.length; i++) {
            if (module == modules[i]) {
                planifier = true;
                break;
            }
        }
        return planifier;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom;
    }

}
