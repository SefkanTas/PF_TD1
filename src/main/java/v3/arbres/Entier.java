package v3.arbres;

import java.util.Objects;

public class Entier implements Sommable<Entier>, Comparable<Entier> {

    Integer value;

    public Entier(Integer value) {
        this.value = value;
    }

    @Override
    public Entier sommer(Entier other) {

        return new Entier(this.value + other.value);
    }

    @Override
    public int compareTo(Entier o) {
        return value.compareTo(o.value);
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
