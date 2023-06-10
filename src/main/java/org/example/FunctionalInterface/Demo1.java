package org.example.FunctionalInterface;

import java.util.function.Predicate;

public class Demo1 {
    public static void main(String[] args) {
        // anonymous implementation
        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("M");
            }
        };


        System.out.println(predicate.test("Monnu"));
        System.out.println(predicate.test("Ajit"));

        // lambda expression for implementation
        Predicate<Integer> predicate1 = x -> x != 0;
        System.out.println(predicate1.test(10));
        System.out.println(predicate1.test(0));

    }
}
