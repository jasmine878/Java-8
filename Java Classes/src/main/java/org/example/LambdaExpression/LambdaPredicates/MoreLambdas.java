package org.example.LambdaExpression.LambdaPredicates;

import java.util.ArrayList;
import java.util.List;

public class MoreLambdas {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("one", "two", "three", "four", "five"));

//        Predicate<String> filter = (String string) -> string.startsWith("t");
//        Predicate<String> filter = string -> string.startsWith("t");
//        Predicate<String> filter = string -> !string.startsWith("t");
//        strings.removeIf(filter);

        strings.removeIf(string -> !string.startsWith("t"));


//        Consumer<String> action = (String string) -> System.out.println(string);
//        Consumer<String> action = string -> System.out.println(string);
//        strings.forEach(action);

        strings.forEach(action -> System.out.println(action));
    }
}
