package de.mainiero.immutable.examples;

import static fj.data.List.list;
import fj.data.List;
import static fj.Show.intShow;
import static fj.Show.listShow;

public final class FJExample {
    public static void main(final String[] args) {
        final List<Integer> a = list(1, 2, 3);
        final List<Integer> b = a.map(i -> i + 42);
        listShow(intShow).println(a);
        listShow(intShow).println(b);
    }
}

