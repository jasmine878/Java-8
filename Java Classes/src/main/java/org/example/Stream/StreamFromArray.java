package org.example.Stream;

import org.example.User;

import java.util.stream.Stream;

public class StreamFromArray {
    public static void main(String[] args) {
        User p1 = new User("Paul", 25);
        User p2 = new User("Sarah", 27);
        User p3 = new User("James", 31);
        User p4 = new User("Julie", 25);
        User p5 = new User("Charles", 22);

        User[] people = {p1, p2, p3, p4, p5};

        long count = Stream.of(people).count();
        System.out.println("Count = " + count);
    }
}
