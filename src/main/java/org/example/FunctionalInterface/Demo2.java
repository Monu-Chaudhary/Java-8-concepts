package org.example.FunctionalInterface;

import javax.sound.midi.Soundbank;

interface Square {
    int calculate(int x);
}
public class Demo2 {
    public static void main(String[] args) {
        // anonymous implementation used before Java 8
        Square s = new Square() {
            @Override
            public int calculate(int x) {
                return x * x;
            }
        };

        System.out.println(s.calculate(2));

        // lambda implementation
        Square s1 = a -> a*a;
        System.out.println(s1.calculate(3));
    }



}
