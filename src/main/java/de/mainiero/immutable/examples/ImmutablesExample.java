package de.mainiero.immutable.examples;

import org.immutables.value.Value;
import com.google.common.truth.Truth;

public class ImmutablesExample {

    public static void main(final String[] args) {
        final Employee julie = ImmutableEmployee.builder().name("Julie Mao").age(28).build();
        final Employee james = ImmutableEmployee.copyOf(julie).withName("James Holden");
        Truth.assertThat(julie.age()).isEqualTo(28);
        Truth.assertThat(james.name()).isEqualTo("James Holden");
        System.out.println(julie);
        System.out.println(james);
    }

    @Value.Immutable
    abstract static class Employee {
        public abstract String name();
        public abstract Integer age();
    }
}