package org.example;

/**
 * The Main class for calculating phone call costs based on specific criteria.
 * This class provides a method to calculate the total cost of a phone call and a main method
 * to demonstrate its usage.
 */
public class DummyTel {
    /**
     * Calculates the total cost of a phone call.
     *
     * @param startHour  The hour of the call start time (0-23).
     * @param startMinute The minute of the call start time (0-59).
     * @param duration   The duration of the call in minutes.
     * @return The total cost of the call after applying discounts and taxes, rounded to the nearest integer.
     */
    public static double calculateCallCost(int startHour, int startMinute, int duration) {
        double cost = duration * 0.50; // Normal fee
        double discount = 0.0;

        // Apply discount based on start time
        if (startHour >= 18  || (startHour <= 7 && startMinute < 60)) {
            discount = 0.50; // 50% discount for calls after 18:00 and before 08:00
        }

        // Apply discount for long calls
        if (duration > 60) {
            discount += 0.15; // 15% discount for calls longer than 60 minutes
        }

        // Calculate tax
        double tax = (cost - (cost * discount)) * 0.05; // 5% tax

        // Calculate total cost after discounts and taxes
        cost = (cost - (cost * discount)) + tax;

        // Round to the nearest integer
        return Math.round(cost*100.0)/100.0;
    }
    /**
     * The main entry point of the program. Demonstrates the usage of the calculateCallCost method.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Example usage of calculateCallCost
        System.out.printf(String.valueOf(calculateCallCost(8,46,72)));
    }
}