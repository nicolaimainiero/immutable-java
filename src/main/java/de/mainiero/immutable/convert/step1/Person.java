package de.mainiero.immutable.convert.step1;

import java.util.List;

public class Person {
    private String name;
    private List<Address> addresses;

    public Person() {
        super();
    }

    public Person(String name, List<Address> addresses) {
        this.name = name;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
}