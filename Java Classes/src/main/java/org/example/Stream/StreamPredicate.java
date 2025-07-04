package org.example.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamPredicate {
    public static void main(String[] args) {
        Class<?> clzz = ArrayList.class;

//        clzz.getSuperclass();

//        Stream<Class<?>> classes =
                Stream.<Class<?>>iterate(clzz, c -> c.getSuperclass())
                        .takeWhile(cl -> cl != null)
                        .forEach(System.out::println);

    }
}
