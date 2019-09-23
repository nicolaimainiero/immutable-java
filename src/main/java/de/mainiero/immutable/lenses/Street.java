package de.mainiero.immutable.lenses;

public class Street {
    public final String name;

    public Street(String name) {
        this.name = name;
    }

    public Street withName(String name) {
        return new Street(name);
    }

    @Override
    public String toString() {
        return "Street@" + Integer.toHexString(hashCode()) + " { " +
                "name = '" + name + '\'' +
                " }";
    }
}