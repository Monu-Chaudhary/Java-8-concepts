package org.example.equal;

public class EqualDemo4 {
    public static void main(String args[]) {
        Thread t = new Thread();
        Object o = new Object();
        String s = new String();

        System.out.println(t == o);
//        System.out.println(t == s);   // incompatible comparison
        System.out.println(o == s);

        System.out.println(t.equals(o));
        System.out.println(t.equals(s));
        System.out.println(o.equals(s));
    }
}
