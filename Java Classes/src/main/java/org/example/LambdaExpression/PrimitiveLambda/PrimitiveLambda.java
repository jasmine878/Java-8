package org.example.LambdaExpression.PrimitiveLambda;

import java.util.function.DoubleToIntFunction;
import java.util.function.IntSupplier;

public class PrimitiveLambda {
    public static void main(String[] args) {
        IntSupplier supplier = () -> 10;

        int i = supplier.getAsInt();
        System.out.println("i = " + i);

//        DoubleToIntFunction function = (double var1) -> (int)Math.floor(var1);
        DoubleToIntFunction function = var1 -> (int)Math.floor(var1);
        int pi = function.applyAsInt(Math.PI);
        System.out.println("Pi = " + pi);
    }
}
