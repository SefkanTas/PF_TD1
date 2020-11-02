package v3.main;

import v3.arbres.Arbre;
import v3.arbres.Feuille;
import v3.arbres.Noeud;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Arbre<String>> listFeuille = new ArrayList<>();
        listFeuille.add(new Feuille<>("a"));
        listFeuille.add(new Feuille<>("b"));
        listFeuille.add(new Feuille<>("c"));
        listFeuille.add(new Feuille<>("d"));
        //Arbre<String> noeud = new Noeud()
    }
}
