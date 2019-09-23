package de.mainiero.immutable.convert.step2;

public class Address {

    private final String city;
    private final String country;

    public Address(final String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }
}