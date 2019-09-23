package de.mainiero.immutable.lenses;

public class Address {
    public final Street street;
    public final Integer number;

    public Address(Street street, Integer number) {
        this.street = street;
        this.number = number;
    }

    public Address withStreet(Street s) {
        return new Address(s, number);
    }

    public Address withNumber(Integer n) {
        return new Address(street, n);
    }

    @Override
    public String toString() {
        return "Address@" + Integer.toHexString(hashCode()) + " { " +
                "street=" + street +
                ", number=" + number +
                " }";
    }
}