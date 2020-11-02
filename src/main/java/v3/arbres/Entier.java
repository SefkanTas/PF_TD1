package v3.arbres;

import java.util.Objects;

public class Entier implements Sommable<Chaine>, Comparable<Chaine> {

    Integer value;

    public Entier(Integer value) {
        this.value = value;
    }

    @Override
    public Chaine sommer(Chaine other) {

        return new Chaine(this.value + other.value);
    }

    @Override
    public int compareTo(Chaine o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entier entier = (Entier) o;
        return Objects.equals(value, entier.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
