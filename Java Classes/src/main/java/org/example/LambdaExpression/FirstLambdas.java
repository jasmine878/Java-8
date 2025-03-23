package org.example.LambdaExpression;

import java.util.function.Supplier;

public class FirstLambdas {
    public static void main(String[] args) {
        Supplier<String> supplier =
                () -> "Hello!";

        String string = supplier.get();
        System.out.println("string = " + string);
    }
}
