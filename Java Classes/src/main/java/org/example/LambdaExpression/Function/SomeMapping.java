package org.example.LambdaExpression.Function;

import org.example.User;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class SomeMapping {
    public static void main(String[] args) {
        User sarah = new User("Sarah");
        User james = new User("James");
        User mary = new User("Mary");
        User john = new User("John");

        List<User> users = List.of(sarah, james, mary, john);
        List<String> names = new ArrayList<String>();
        Function<User, String> toName = (User user) -> user.getName();

        for (User user: users) {
            String name = toName.apply(user);
            names.add(name);
        }

//        Consumer<User> action = (User user) -> System.out.println(user);
//        Consumer<User> action = user -> System.out.println(user);
//        users.forEach(action);
        users.forEach(user -> System.out.println(user));
        
        names.forEach(name -> System.out.println(name));
    }
}
