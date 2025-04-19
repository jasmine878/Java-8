package org.example.LambdaExpression.Comparator;

import org.example.User;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UserComparator {
    public static void main(String[] args) {
        User sarah = new User("Sarah", 28);
        User james = new User("James", 35);
        User mary = new User("Mary", 33);
        User john1 = new User("John", 25);
        User john2 = new User("John", 24);

        List<User> users = Arrays.asList(sarah, james, mary, john1, john2);

        Comparator<User> cmp = Comparator.comparing(user -> user.getName());
        users.sort(cmp);

        System.out.println(users);
        System.out.println();
        users.forEach(user -> System.out.println(user));
        System.out.println();

        Comparator<User> cmpName = Comparator.comparing(user -> user.getName());
        Comparator<User> cmpAge = Comparator.comparing(user -> user.getAge());
        Comparator<User> cmpNameAge = cmpName.thenComparing(cmpAge);
        users.sort(cmpNameAge);

        users.forEach(user -> System.out.println(user));
    }
}
