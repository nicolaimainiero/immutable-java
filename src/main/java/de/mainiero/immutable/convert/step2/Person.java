package de.mainiero.immutable.convert.step2;

import java.util.List;

public class Person {
    private final String name;
    private final List<Address> addresses;

    public Person(final String name, final List<Address> addresses) {
        this.name = name;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }
}