package org.example.LambdaExpression.Predicates;

import java.util.function.Predicate;

public class ChainingPredicate {
    public static void main(String[] args) {
        Predicate<String> isNull = s -> s == null;
        System.out.println("For null = " + isNull.test(null));
        System.out.println("For Hello = " + isNull.test("Hello"));

        Predicate<String> isEmpty = s -> s.isEmpty();
        System.out.println("For empty = " + isEmpty.test(""));
        System.out.println("For Hello = " + isEmpty.test("Hello"));

//        Predicate<String> p = s -> !isNull.test(s) && !isEmpty.test(s);

        Predicate<String> p = isNull.negate().and(isEmpty.negate());

        System.out.println("For null = " + p.test(null));
        System.out.println("For empty = " + p.test(""));
        System.out.println("For Hello = " + p.test("Hello"));
    }
}
