package org.example.homework;

public class Task3 {
    public static void main(String[] args) {
        QuadFunction<Integer, Integer, Integer, Integer, Integer> max = (a, b, c, d) -> Math.max(a, Math.max(b, Math.max(c, d)));
        QuadFunction<Integer, Integer, Integer, Integer, Integer> min = (a, b, c, d) -> Math.min(a, Math.min(b, Math.min(c, d)));

        int maxResult = max.apply(3, 7, 2, 9);
        int minResult = min.apply(3, 7, 2, 9);

        System.out.println("Max of 4: " + maxResult);
        System.out.println("Min of 4: " + minResult);
    }
    
    @FunctionalInterface
    interface QuadFunction<T, U, V, W, X> {
        X apply(T t, U u, V v, W w);
    }
}
