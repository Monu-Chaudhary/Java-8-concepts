package org.example.string;

public class StringDemo {
    public static void main(String[] args) {
        String s = new String();
        s = "Monu";
        s = "Ajit";
        s.concat("Sukamani");   // immutable - no concatination
        s = s + " Kumar";
        System.out.println(s);
    }
}
