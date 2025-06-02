package org.example.Stream;

import org.example.City;
import org.example.User;

import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        User p1 = new User("Paul", 25);
        User p2 = new User("Sarah", 27);
        User p3 = new User("James", 31);
        User p4 = new User("Julie", 25);
        User p5 = new User("Charles", 22);
        User p6 = new User("Charlotte", 31);
        User p7 = new User("Ann", 27);
        User p8 = new User("Boris",29);
        User p9 = new User("Emily", 34);

        City newYork = new City("New York", p1, p2, p3);
        City paris = new City("Paris", p4, p5, p6);
        City london = new City("London", p7, p8, p9);

        List<City> cities = List.of(newYork, paris, london);

        long count =
                cities.stream()
                        .flatMap(city -> city.getUsers().stream())
                        .count();

        System.out.println("Count - " + count);
    }
}
