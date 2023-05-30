package org.example.FailFastFailSafe;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> arrayList = new CopyOnWriteArrayList<>(new Integer[] {1,2,3});
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == 3) {
                try {
                    arrayList.add(4);
                }
                finally {
                    System.out.println(arrayList);
                }
            }
        }
    }


}
