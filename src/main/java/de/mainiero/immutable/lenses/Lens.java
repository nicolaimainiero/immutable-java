package de.mainiero.immutable.lenses;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Lens<A, B> {

    private final Function<A, B> getter;
    private final BiFunction<A, B, A> setter;

    private Lens(Function<A, B> getter, BiFunction<A, B, A> setter) {
        this.getter = getter;
        this.setter = setter;
    }

    public static <A, B> Lens<A, B> of(Function<A, B> getter, BiFunction<A, B, A> setter) {
        return new Lens<>(getter, setter);
    }

    public B get(A target) {
        return getter.apply(target);
    }

    public A set(A target, B value) {
       return modify(ignore -> value).apply(target);
    }

    public Function<A, A> modify(Function<B, B> mapper) {
        return (oldValue) -> {
            B extracted = getter.apply(oldValue);
            B transformed = mapper.apply(extracted);
            return setter.apply(oldValue, transformed);
        };
    }

    public <C> Lens<A, C> compose(Lens<B, C> other) {
        return new Lens<>(
            (A a) -> other.getter.apply(getter.apply(a)),
            (A a, C c) -> {
                B b = getter.apply(a);
                B newB = other.modify(ignored -> c).apply(b);
                return setter.apply(a, newB);
            }
        );
    }
}