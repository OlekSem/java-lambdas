package org.example.classwork;

import java.util.function.*;

public class Task2 {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> max =
                (a, b) -> a > b ? a : b;

        BiFunction<Integer, Integer, Integer> min =
                (a, b) -> a < b ? a : b;

        Function<Integer, Long> factorial = n -> {
            long res = 1;
            for (int i = 1; i <= n; i++) res *= i;
            return res;
        };

        Function<Integer, Boolean> isPrime = n -> {
            if (n < 2) return false;
            for (int i = 2; i <= Math.sqrt(n); i++)
                if (n % i == 0) return false;
            return true;
        };

        System.out.println("Max: " + max.apply(5, 10));
        System.out.println("Min: " + min.apply(5, 10));
        System.out.println("Factorial: " + factorial.apply(5));
        System.out.println("Is prime: " + isPrime.apply(17));
    }
}
