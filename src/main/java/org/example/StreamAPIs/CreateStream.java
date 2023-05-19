package org.example.StreamAPIs;

import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


public class CreateStream {
    //  CREATE STREAM
    public static void main(String args[]) {

        String[] names = {"Monu", "Mayur", "Varun", "Nidhi", "Pujit"};
        List<String> nameList = new ArrayList<String>(Arrays.asList(names));

        // Create stream using Arrays:
        Stream<String> arrayStream = Arrays.stream(names);
        System.out.println(arrayStream);

        // Create stream using collections
        Stream<String> listStream = nameList.stream();
        System.out.println(listStream);

        // Create stream using generate method
        Stream<Integer> generateStream = Stream.generate(() -> 5);
        System.out.println(generateStream);

        // Create stream using iterate method
        Stream<Integer> iterateStream = Stream.iterate(1, x -> x + 1);
        System.out.println(iterateStream);
    }
}