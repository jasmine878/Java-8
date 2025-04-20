package org.example.LambdaExpression.Predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class MoreLambdas {
    public static void main(String[] args) {

        String[] colors = {"red", "green", "blue", "orange", "purple", "yellow"};
        ArrayList<String> aList1 = new ArrayList<>(Arrays.asList(colors));
        ArrayList<String> aList2 = new ArrayList<>(Arrays.asList(colors));
        ArrayList<String> aList3 = new ArrayList<>(Arrays.asList(colors));

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String color) {
                return color.endsWith("e");
            }
        };

        aList1.removeIf(predicate);
        aList1.forEach(color -> System.out.println(" - " + color));
        System.out.println();


        List<String> strings = new ArrayList<>(List.of("one", "two", "three", "four", "five"));

//        Predicate<String> filter = (String string) -> string.startsWith("t");
//        Predicate<String> filter = string -> string.startsWith("t");
//        Predicate<String> filter = string -> !string.startsWith("t");
//        strings.removeIf(filter);

        // Using Predicate with a Lambda expression
        strings.removeIf(string -> !string.startsWith("t"));


//        Consumer<String> action = (String string) -> System.out.println(string);
//        Consumer<String> action = string -> System.out.println(string);
//        strings.forEach(action);

        // Using Predicate with a Lambda expression
        strings.forEach(action -> System.out.println(action));
    }
}
