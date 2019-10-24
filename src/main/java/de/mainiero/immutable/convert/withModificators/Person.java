package de.mainiero.immutable.convert.withModificators;


public class Person {
    private final String name;
    private final String address;
    

    public Person(final String name, final String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Person withName(final String newName){
        return new Person(newName, address);
    }
}