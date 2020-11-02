package v3.arbres;

import java.util.Set;

public class Feuille<T> implements Arbre<T>, Sommable<T> {

    private final T valeur;

    public Feuille(final T valeur) {
        this.valeur = valeur;
    }

    @Override
    public int taille() {
        return 1;
    }

    @Override
    public boolean contient(final T val) {
        return val.equals(valeur);
    }

    @Override
    public Set<T> valeurs() {
        return Set.of(valeur);
    }

    @Override
    public T sommer(T other) {
        return this.sommer(other);
    }
    
}