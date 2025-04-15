package org.example.LambdaExpression.Comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CreatingComparators {
    public static void main(String[] args) {
        List<String> stringsArr = Arrays.asList("one", "two", "three", "four", "five", "six", "seven", "eight", "nine");

        Comparator<String> cmp = (s1, s2) -> s1.compareTo(s2);

        stringsArr.sort(cmp);
        System.out.println(stringsArr);
    }
}
