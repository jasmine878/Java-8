package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class City {
    private String name;
    private List<User> users = new ArrayList<>();

    public City(String name, User... users) {
        this.name = name;
        this.users.addAll(Arrays.asList(users));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "City [name=" + name + ", users=" + users + "]";
    }
}
