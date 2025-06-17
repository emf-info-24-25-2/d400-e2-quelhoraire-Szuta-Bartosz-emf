package models;

public class Horaire {
    public final static int NBRE_DE_BLOCS = 6;
    private final Bloc[] blocs;

    public Horaire(Bloc[] blocs) {
        this.blocs = new Bloc[0];
    }

    public boolean planifier(ModuleInfo[] modules, Professeur[] profs) {
        if (profs != null) {

            for (int i = 0; i < modules.length; i++) {
                for (int j = 0; j < profs.length; j++) {
                    if (profs[j].enseigneCeModule(modules[i].getNom()) == true) {
                        profs[j].ajouterModuleEnseigne(modules[i]);
                    }
                }
            }
            for (int i = 0; i < blocs.length; i++) {
                for (int k = 0; k < modules.length; k++) {
                    if (blocs[i].contientModule(modules[k]) != true) {
                        blocs[i].planifierModule(modules[i]);
                    }
                }

            }
        }
        return false;
    }

    public void afficherHoraire() {

    }

    public Bloc moduleDansQuelBloc(ModuleInfo module) {
        Bloc a = null;
        for (int i = 0; i < blocs.length; i++) {
            if (blocs[i].contientModule(module)) {
                a = blocs[i];
            }
        }
        return a;
    }

}
