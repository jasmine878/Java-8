package org.example.LambdaExpression.PrimitiveLambda;

import java.util.function.IntSupplier;

public class PrimitiveLambda {
    public static void main(String[] args) {
        IntSupplier supplier = () -> 10;

        int i = supplier.getAsInt();
        System.out.println("i = " + i);
    }
}
