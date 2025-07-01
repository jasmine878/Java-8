package org.example;

public class Rental {
    private String name;
    private int daysRented;

    public Rental (String name, int daysRented) {
        this.name = name;
        this.daysRented = daysRented;
    }

    public String getName() {
        return this.name;
    }

    public int getDaysRented() {
        return this.daysRented;
    }
}
