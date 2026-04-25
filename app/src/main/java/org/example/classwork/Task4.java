package org.example.classwork;

import java.util.function.Predicate;

public class Task4 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 10, 15};

        System.out.println(sum(arr, x -> x % 2 == 0)); // even
        System.out.println(sum(arr, x -> x % 2 != 0)); // odd
        System.out.println(sum(arr, x -> x >= 3 && x <= 10)); // range
        System.out.println(sum(arr, x -> x % 5 == 0)); // multiple of 5
    }

    static int sum(int[] arr, Predicate<Integer> condition) {
        int s = 0;
        for (int x : arr)
            if (condition.test(x)) s += x;
        return s;
    }
}
