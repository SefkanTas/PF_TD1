package v3.arbres;

import java.util.Objects;

public class Chaine implements Sommable<Chaine>, Comparable<Chaine> {

    String value;

    public Chaine(String value) {
        this.value = value;
    }

    @Override
    public Chaine sommer(Chaine other) {

        return new Chaine(this.value + other.value);
    }

    @Override
    public int compareTo(Chaine o) {
        return value.compareTo(o.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chaine chaine = (Chaine) o;
        return Objects.equals(value, chaine.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
