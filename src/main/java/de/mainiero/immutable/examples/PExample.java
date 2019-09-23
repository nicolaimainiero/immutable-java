package de.mainiero.immutable.examples;

import org.pcollections.*;

public class PExample {
  public static void main(String[] args) {
    final PVector<Integer> set = 
        TreePVector.<Integer>empty()
            .plus(1).plus(2).plus(3);

    System.out.println(set);
    System.out.println(set.plus(4));
    System.out.println(set);
  }
}