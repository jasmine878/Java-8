package org.example.Stream;

import org.example.User;

import java.util.List;
import java.util.stream.Stream;

public class MapFilterReduce {
    public static void main(String[] args) {
        User p1 = new User("Paul", 25);
        User p2 = new User("Sarah", 27);
        User p3 = new User("James", 31);
        User p4 = new User("Julie", 25);
        User p5 = new User("Charles", 22);
        User p6 = new User("Charlotte", 31);
        User p7 = new User("Ann", 27);
        User p8 = new User("Boris", 29);
        User p9 = new User("Emily", 34);
        User p10 = new User("", 34);
        User p11 = new User("", 30);

        List<User> people = List.of(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);

        Stream<User> stream =  people.stream();
        Stream<String> nameStream = stream.map(p -> p.getName());
        Stream<String> emptyNames = nameStream.filter(name -> name.isEmpty());
        long countEmptyNames = emptyNames.count();
        System.out.println("Empty names = " + countEmptyNames);

        Stream<User> stream2 = people.stream();
        Stream<String> nameStream2 = stream2.map(p -> p.getName());
        Stream<String> nonEmptyNames = nameStream2.filter(name -> !name.isEmpty());
        long countNonEmptyNames = nonEmptyNames.count();
        System.out.println("Non-empty names = " + countNonEmptyNames);
    }
}
