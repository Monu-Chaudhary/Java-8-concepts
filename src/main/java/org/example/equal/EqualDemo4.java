package org.example.equal;

public class EqualDemo4 {
    public static void main(String args[]) {
        Thread t = new Thread();
        Object o = new Object();
        String s = new String();

        System.out.println(t == o);     // false
//        System.out.println(t == s);   // incompatible comparison
        System.out.println(o == s);     // false

        System.out.println(t.equals(o));    //false
        System.out.println(t.equals(s));    //false
        System.out.println(o.equals(s));    //false
    }
}
