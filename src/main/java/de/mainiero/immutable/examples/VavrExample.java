package de.mainiero.immutable.examples;

import io.vavr.collection.List;

public final class VavrExample {
    public static void main(final String[] args) {
        final List<Integer> a = List.of(1, 2, 3);
        final List<Integer> b = a.map(i -> i + 42);
        System.out.println(a);
        System.out.println(b);
    }
}

