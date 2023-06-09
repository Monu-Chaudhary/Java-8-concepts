package org.example.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>(1);
        arrayList.add(1);
        arrayList.add(2);   // dynamically adjusts the length if more elements are added
        System.out.println(arrayList);

        String[] names = {"Monu", "Mayur", "Varun", "Nidhi", "Pujit"};
        List<String> nameList = new ArrayList<String>(Arrays.asList(names));

        names[1]="Ajit";
        nameList.add("Ajit");
        nameList.remove(1);
        Arrays.stream(names).forEach(System.out::println);
        System.out.println(nameList);
    }
}
