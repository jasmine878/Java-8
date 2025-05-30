package org.example.LambdaExpression.Consumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {

        //Consumer to display a number
        Consumer<Integer> display = a -> System.out.println(a);

        //Implement display using accept()
        display.accept(10);

        //Consumer to multiply 2 to every integer of a list
        Consumer<List<Integer>> modify = list -> {
            for (int i = 0; i < list.size(); i++)
                list.set(i, 2 * list.get(i));
        };

        //Consumer to display a list of numbers
        Consumer<List<Integer>> dispList = list -> list.stream().forEach(a -> System.out.print(a + " "));

        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(3);

        //Implement modify using accept()
//        modify.accept(list);

        //Implement dispList using accept()
//        dispList.accept(list);

        //Using andThen()
        modify.andThen(dispList).accept(list);
        System.out.println();

        class InnerConsumer<String> implements Consumer<String> {
            @Override
            public void accept(String string) {
                System.out.println(" - " + string);
            }
        }

        InnerConsumer innerConsumer = new InnerConsumer<String>();

        String[] colorsArray = {"red", "green", "blue"};

        ArrayList<String> colorsList = new ArrayList<>(Arrays.asList(colorsArray));
        colorsList.forEach(innerConsumer);
        System.out.println();
        Consumer<String> anonymousClass = new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(" - " + string);
            }
        };

        colorsList.forEach(anonymousClass);
        System.out.println();

//        Consumer<String> lambdaConsumer = (String displayColor) -> {System.out.println(" - " + displayColor);};
        Consumer<String> lambdaConsumer = displayColor -> System.out.println(" - " + displayColor);
        colorsList.forEach(lambdaConsumer);
        System.out.println();

        colorsList.forEach(displayColor -> System.out.println(" - " + displayColor));
        System.out.println();

        colorsList.sort((color1, color2) -> color1.compareTo(color2));
        colorsList.forEach(anonymousClass);
    }
}
