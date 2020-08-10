package com.AbhinavMaddukuri;
// Imports
import java.util.Scanner;

public class coffee_Machine_Stage_2 {

    public static void main(String[] args) {

        // Use the imported Scanner class to make a new Scanner object
        System.out.println("Write how many cups of coffee you will need:");
        Scanner scanner = new Scanner(System.in);

        // Initialise Variables for the number of coffees, amount of water, amount of milk and amount of beans
        // For coffees use the scanner class to get User Input

        int coffees = scanner.nextInt();
        int water = 200 * coffees;
        int milk = 50 * coffees;
        int beans = 15 * coffees;

        // Print out the values for the various variables
        System.out.println("For " + coffees + " cups of coffee you will need:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
    }
}