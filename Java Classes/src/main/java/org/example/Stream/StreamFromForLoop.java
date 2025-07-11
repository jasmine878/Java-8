package org.example.Stream;

import org.example.User;

import java.util.List;

public class StreamFromForLoop {
    public static void main(String[] args) {
        User p1 = new User("Paul", 12);
        User p2 = new User("Sarah", 27);
        User p3 = new User("James", 31);
        User p4 = new User("Julie", 15);
        User p5 = new User("Charles", 22);

        List<User> people = List.of(p1, p2, p3, p4, p5);

//        int sum = 0;
//        int count = 0;
//
//        for (User person : people) {
//            if (person.getAge() > 20) {
//                count++;
//                sum += person.getAge();
//            }
//        }

        Double average = people.stream()
                .mapToInt(User::getAge)
                .filter(age -> age > 20)
                .average()
                .orElseThrow();

//        double average = 0;
//
//        if (count > 0) {
//            average = sum / count;
//        }

        System.out.println("Average: " + average);
    }
}
