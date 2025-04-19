package org.example.LambdaExpression.Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class CreatingComparators {
    public static void main(String[] args) {
        List<String> stringsArr = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine");

        Comparator<String> cmp = (s1, s2) -> s1.compareTo(s2);

        stringsArr.sort(cmp);
        System.out.println(stringsArr);

        Comparator<String> cmpLength = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        stringsArr.sort(cmpLength);
        System.out.println(stringsArr);

        Function<String, Integer> listByLength = number -> number.length();

        Comparator<String> cmpLength2 = Comparator.comparing(listByLength);

        stringsArr.sort(cmpLength2);
        System.out.println(stringsArr);

        ToIntFunction<String> listByLength2 = number -> number.length();

        Comparator<String> cmpLength3 = Comparator.comparingInt(listByLength2);

        stringsArr.sort(cmpLength3);
        System.out.println(stringsArr);

    }
}
