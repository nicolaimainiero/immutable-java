package de.mainiero.immutable.examples;

import java.util.Arrays;

import de.mainiero.immutable.examples.pojo .Address;
import de.mainiero.immutable.examples.pojo.Person;

public class VanillaExample{
    public static void main(final String[] args) {
        Address home = new Address("London", "England");
        Address work = new Address("New York", "England");

        Person englishman = new Person("Englishman", Arrays.asList(home, work));
        
        System.out.println(englishman);

        englishman.getAddresses().add(new Address("Stuttgart", "Germany"));
    }
}