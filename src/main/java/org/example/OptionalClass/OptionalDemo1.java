package org.example.OptionalClass;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        System.out.println(list.get(2));

        String[] str = new String[10];
//        System.out.println(str[1].equals(1));   // NullPointerException

        Optional<String> checkNull = Optional.ofNullable(str[1]);
        if (checkNull.isPresent()){
            System.out.println(str[1].toLowerCase());
        }
        else {
            System.out.println("String value is null");
        }
    }
}
