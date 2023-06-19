package org.example.FailFastFailSafe;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class FailFast {
    public static void main(String[] args) throws ConcurrentModificationException {
        ArrayList<Integer> count = new ArrayList<>();
        count.add(1);
        count.add(2);
        count.add(3);

        Iterator<Integer> iterator = count.iterator();

        while (iterator.hasNext()) {
            // do sth
            if (iterator.next() == 1) {
                try {
                    count.add(4);   // will always throw exception
//                    count.remove(0);  // throw excepton???
//                    count.remove(1);    // throw exception???
                }
                catch (ConcurrentModificationException e) {
                    System.out.println("Exception Occured:");
                }
                finally {
                    System.out.println(count);
                }
            }
        }
    }
}
