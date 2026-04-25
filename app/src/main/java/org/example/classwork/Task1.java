package org.example.classwork;

import java.time.LocalDate;
import java.time.LocalTime;

public class Task1 {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> sum = (a, b, c) -> a + b + c;
        TriFunction<Integer, Integer, Integer, Integer> product = (a, b, c) -> a * b * c;

        Runnable showTime = () -> System.out.println(LocalTime.now());
        Runnable showDate = () -> System.out.println(LocalDate.now());

        System.out.println("Sum: " + sum.apply(1, 2, 3));
        System.out.println("Product: " + product.apply(2, 3, 4));

        showTime.run();
        showDate.run();
    }

    @FunctionalInterface
    public interface TriFunction<T, U, V, R> {
        R apply(T t, U u, V v);
    }
}
