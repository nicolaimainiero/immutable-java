package de.mainiero.immutable.convert.step3;

import java.util.List;

public class Person {
    private final String name;
    private final List<Address> addresses;

    public Person(final String name, final List<Address> addresses) {
        this.name = name;
        this.addresses = List.copyOf(addresses);
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return "Address@" + Integer.toHexString(hashCode()) + " { " + "name=" + name + ", addresses="
                + addresses.toString() + " }";
    }
}