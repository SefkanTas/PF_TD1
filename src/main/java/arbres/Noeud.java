package arbres;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Noeud implements Arbre{
    private final List<Arbre> fils;

    public Noeud(){
        this.fils = new ArrayList<>();
    }

    @Override
    public int taille() {
        return this.fils.stream().map(Arbre::taille).reduce(0, Integer::sum);
    }

    @Override
    public boolean contient(Integer val) {
        boolean res = false;

        for(final Arbre a : fils){
            if(a.contient(val)) return true;
        }

        return res;
    }

    @Override
    public Set<Integer> valeurs() {
        return null;
    }

    @Override
    public Integer somme() {
        return null;
    }

    @Override
    public Integer min() {
        return null;
    }

    @Override
    public Integer max() {
        return null;
    }

    @Override
    public boolean estTrie() {
        return false;
    }
}
