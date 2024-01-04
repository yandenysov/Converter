package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter distance in miles which will be converted into kilometers: ");
        double miles = scanner.nextDouble();
        double kilometers = convertMilesToKilometers(miles);
        printConversionResult(miles, kilometers);
        scanner.close();
    }

    private static double convertMilesToKilometers(double miles) {
        return miles * 1.609344;
    }

    private static void printConversionResult(double miles, double kilometers) {
        System.out.println(miles + " miles = " + kilometers + " kilometers");
    }
}
