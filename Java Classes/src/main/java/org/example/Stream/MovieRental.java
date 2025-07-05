package org.example.Stream;

import org.example.Rental;

import java.util.ArrayList;
import java.util.List;

public class MovieRental {

    //Stream from nested for-loop
    public static void main(String[] args) {
        MovieRental movieRental = new MovieRental();
        movieRental.addRental("Blade Runner", 2);
        movieRental.addRental("Frozen", 3);
        movieRental.addRental("Star Wars", 1);

        String statement = movieRental.statement();
        System.out.println(statement);
    }

    private void addRental(String name, int daysRented) {
        Rental rental = new Rental(name, daysRented);
        this.rentals.add(rental);
    }

    private List<Rental> rentals = new ArrayList<>();

    public String statement() {
//        double totalAmount = 0;
//        int frequentRenterPoints = 0;
//        String statement = composeHeader();

//        for (Rental rental : rentals) {
//            totalAmount += computeRentalAmount(rental);
//            frequentRenterPoints += getFrequentRenterPoints(rental);
//            statement += computeStatementLine(rental);
//        }

        double totalAmount = rentals.stream()
                .mapToDouble(this::computeRentalAmount)
                .sum();

        for (Rental rental : rentals) {
            totalAmount += computeRentalAmount(rental);
        }

        int frequentRenterPoints = 0;

        for (Rental rental : rentals) {
            frequentRenterPoints += getFrequentRenterPoints(rental);
        }

        String statement = composeHeader();

        for (Rental rental : rentals) {
            statement += computeStatementLine(rental);
        }

        statement += composeFooter(totalAmount, frequentRenterPoints);

        return statement;
    }

    private String composeHeader() {
        return "Statement for the rental of " + rentals.size() + "movies\n";
    }

    private double computeRentalAmount(Rental rental) {
        return 2.0 + rental.getDaysRented();
    }

    private int getFrequentRenterPoints(Rental rental) {
        return rental.getDaysRented() > 2 ? 2 : 1;
    }

    private String computeStatementLine(Rental rental) {
        return "\t" + rental.getName() + ": " + computeRentalAmount(rental) + "\n";
    }

    private String composeFooter(double totalAmount, int frequentRenterPoints) {
        return "Total amount owed: " + totalAmount +
                "\nFrequent renter points earned: " + frequentRenterPoints;
    }
}
