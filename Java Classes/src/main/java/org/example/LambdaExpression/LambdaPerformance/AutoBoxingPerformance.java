package org.example.LambdaExpression.LambdaPerformance;

import java.util.Comparator;

public class AutoBoxingPerformance {

    //Comparator uses Integers
    Comparator<Integer> cmp = (i1, i2) -> Integer.compare(i1, i2);

    //compare method uses ints
    int compare = cmp.compare(10, 20);
}
