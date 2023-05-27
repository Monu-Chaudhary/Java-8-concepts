package org.example.equal;

public class EqualDemo2 {
    // == operator comparing primitive types and boolean
    public static void main(String args[]) {
        System.out.println(10==20);         // false
        System.out.println('a'=='b');       //false
        System.out.println('a'==90.00);     //false
        System.out.println(true == true);   //true
    }
}
