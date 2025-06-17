package services;

import models.ModuleInfo;
import models.Professeur;

public class ServiceFormationMaitres {

    public static void attribuerModules(Professeur[] professeur, ModuleInfo[] modules) {
        for (int i = 0; i < professeur.length; i++) {
            boolean reussi = false;
            do {
                for (int j = 0; j < modules.length; j++) {
                    if (professeur[i].enseigneCeModule(modules[j].getNom()) == false) {
                        professeur[i].ajouterModuleEnseigne(modules[i]);
                        reussi = true;
                    }
                }
            } while (reussi == true);

        }

    }

    public static boolean tousModulesCouverts(Professeur[] professeur, ModuleInfo[] modules) {
        boolean couvert = false;
        int nbremodule = modules.length;
        int compter = 0;
        for (int i = 0; i < modules.length; i++) {
            for (int j = 0; j < professeur.length; j++) {
                if (professeur[i].enseigneCeModule(modules[i].getNom()) == true) {
                    compter++;
                }
            }
        }
        if (compter == nbremodule) {
            couvert = true;
        }
        return couvert;
    }
}
