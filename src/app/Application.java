package app;

import java.util.ArrayList;

import models.Personne;

public class Application {

    public static void main(String[] args) {

        ArrayList<Personne> personnes = new ArrayList<Personne>();

        Personne adam = new Personne("Dizant", "Adam", "Impasse Satanique 35", "Les enfers", 666);
        Personne gizel = new Personne("de la Fontaine", "gizel", "Impasse Satanique 35", "Les enfers", 666);
        Personne alucard = new Personne("le Vampire", "alucard", "Impasse Satanique 35", "Les enfers", 666);
        Personne logi = new Personne("Tech", "logi", "Impasse Satanique 35", "Les enfers", 666);

        personnes.add(gizel);
        personnes.add(adam);
        personnes.add(alucard);
        personnes.add(logi);

        for (Personne personne : personnes) {
            System.out.println(personne.getNom());
        }
    }

}
