package org.example.StreamAPIs;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalMethods {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        // forEach
        numbers.stream().forEach(n -> System.out.println(n));

        // min, max, count
        Optional<Integer> min = numbers.stream().min((a, b) -> a.compareTo(b));
        Optional<Integer> max = numbers.stream().max((a, b) -> a.compareTo(b));
        long count = numbers.stream().count();

        System.out.println("MIN: " + min);
        System.out.println("Max: " + max);
        System.out.println("COUNT: " + count);

        // allMatch, noneMatch, anyMatch
        boolean matchesAll = numbers.stream().allMatch(n -> n <= 6);
        boolean matchesNone = numbers.stream().noneMatch(n -> n >= 6);
        boolean matchesAny = numbers.stream().anyMatch(n -> n == 6);

        System.out.println("MatchesAll: " + matchesAll);
        System.out.println("MatchesNone: " + matchesNone);
        System.out.println("MatchesAny: " + matchesAny);


        // collect
        List<Integer> newList = numbers.stream().collect(Collectors.toList());
        System.out.println("NEWLIST: " + newList);

        // reduce
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("SUM: " + sum);

    }
}
