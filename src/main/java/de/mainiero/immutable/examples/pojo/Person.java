package de.mainiero.immutable.examples.pojo;

import java.util.List;

public final class Person {
    private final String name;
    private final List<Address> addresses;

    public Person(String name, List<Address> addresses) {
        this.name = name;
        this.addresses = List.copyOf(addresses);
    }

    public String getName() {
        return this.name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    @Override
    public String toString() {
        return "Address@" + Integer.toHexString(hashCode()) + " { " +
                "name=" + name +
                ", addresses=" + addresses.toString() +
                " }";
    }
}
