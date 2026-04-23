package org.example;

public class Task3 {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> max3 =
                (a, b, c) -> Math.max(a, Math.max(b, c));

        TriFunction<Integer, Integer, Integer, Integer> min3 =
                (a, b, c) -> Math.min(a, Math.min(b, c));

        System.out.println("Max of 3: " + max3.apply(3, 7, 5));
        System.out.println("Min of 3: " + min3.apply(3, 7, 5));
    }
    @FunctionalInterface
    interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }
}
