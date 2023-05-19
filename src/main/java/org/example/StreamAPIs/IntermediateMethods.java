package org.example.StreamAPIs;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class IntermediateMethods {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        List<Integer> newList;

        /*
        // without using stream
        // for (int n: numbers) {
        //     newList.add(n+1);
        // } */

        // using map
        newList = numbers.stream().map(n -> n+1).collect(Collectors.toList());
        System.out.println(newList);

        /*
        // without using stream
        List<Integer> evenList;
         for (int n: numbers) {
             if(n % 2 == 0)
                evenList.add(n+1);
         } */

        // filter
        List<Integer> evenList = numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        System.out.println(evenList);

        // sorted
        List<Integer> descList = numbers.stream().sorted((b,a) -> a.compareTo(b)).collect(Collectors.toList());
        System.out.println(descList);

        // distinct and sorted
        List<Integer> dupNumbers = Arrays.asList(2,3,1,5,5,2,7,6,5,8,4,4);
        List<Integer> distinctSortedList = dupNumbers.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(distinctSortedList);

    }

}
