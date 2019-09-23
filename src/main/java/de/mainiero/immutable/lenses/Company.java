package de.mainiero.immutable.lenses;

public class Company {
    public final String name;
    public final Address address;

    public Company(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Company withName(String n) {
        return new Company(n, address);
    }

    public Company withAddress(Address a) {
        return new Company(name, a);
    }

    @Override
    public String toString() {
        return "Company@" + Integer.toHexString(hashCode()) + " { " +
                "name='" + name + '\'' +
                ", address=" + address +
                " }";
    }
}