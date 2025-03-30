package org.example.LambdaFunction;

import org.example.LambdaFunction.model.User;

import java.util.List;

public class SomeMapping {
    public static void main(String[] args) {
        User sarah = new User("Sarah");
        User james = new User("James");
        User mary = new User("Mary");
        User john = new User("John");

        List<User> users = List.of(sarah, james, mary, john);
    }
}
