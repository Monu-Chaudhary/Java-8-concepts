package org.example.equal;

public class EqualDemo3 {
    public static void main(String args[]) {
        Thread t1 = new Thread();
        Thread t2 = new Thread();
        Thread t3 = t1;

        System.out.println(t1==t2);
        System.out.println(t1==t3);

        System.out.println(t1.equals(t2));
        System.out.println(t1.equals(t3));
    }
}
