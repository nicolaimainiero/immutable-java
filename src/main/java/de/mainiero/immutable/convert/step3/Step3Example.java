package de.mainiero.immutable.convert.step3;

import java.util.ArrayList;
import java.util.List;

public class Step3Example {
    public static void main(String[] args) {
        List<Address> addresses = new ArrayList<>();
        addresses.add(new Address("New York", "United States of America"));
        addresses.add(new Address("London", "England"));
        Person jim = new Person("Jim Holden", addresses);
        System.out.println(jim);
        // Change name
        Person james = new Person("James Holden", addresses);
        System.out.println(james);
        // List.copyOf is safe against manipulation the underlying list 
        addresses.add(new Address("Paris", "France"));
        System.out.println(james);
        // doesn't work
        jim.getAddresses().add(new Address("Stuttgart","Germany"));
    }
}