package org.example.Stream;

import java.util.stream.IntStream;

public class SkippingAndLimiting {
    public static void main(String[] args) {
        IntStream.range(0, 30)
                .forEach(index -> System.out.print(index + " "));
    }
}
