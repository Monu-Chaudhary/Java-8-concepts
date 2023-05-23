package org.example.equal;

public class EqualDemo1 {
    // == is an operator while .equals is a method
    // == compares if the reference or memory location of the objects is same of not while .equals() compares the objects values
    // == can be applied to compare primitive types and objects while .equals can only be applied on objects
    // == cannot be overridden while .equals is usually overridden
    public static void main(String args[]) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        // == operator
        System.out.println(s1==s2);
        System.out.println(s2==s3);

        // .equals method
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        s1 = "Hi";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));
    }
}
