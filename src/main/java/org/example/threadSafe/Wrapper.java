package org.example.threadSafe;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Wrapper {
    public static void main(String[] args) {
        Collection<Integer> syncCollection = Collections.synchronizedCollection(new ArrayList<>());
        Thread thread1 = new Thread(() -> syncCollection.addAll(Arrays.asList(1, 2, 3, 4, 5, 6)));
        Thread thread2 = new Thread(() -> syncCollection.addAll(Arrays.asList(7, 8, 9, 10, 11, 12)));
        thread1.start();
        thread2.start();
//        syncCollection.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(syncCollection);

        Map<String,String> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("1", "one");
        concurrentMap.put("1", "One");
        concurrentMap.put("2", "two");
        concurrentMap.put("3", "three");
        System.out.println(concurrentMap);

    }
}
