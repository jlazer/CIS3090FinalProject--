//Justin Lazarski
//CIS 3090.04
//5/8/19
//Final Project

package com.company;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Initialize the variables
        int breadChoice;
        int vegetableChoice;
        int meatChoice;

        double totalPrice = 0.0;

        String breadRestart = "";
        String vegRestart = "";
        String meatRestart = "";
        String customerName = "";
        String customerBread = "";
        String customerVegtable = "";
        String customerMeat = "";
        //Creating a linked list to store multiple vegetables if the customer adds more than one
        LinkedList<String> customerVegetables = new LinkedList<String>();
        //Using a do-while loop to run the bread selection code
        do {
            System.out.println("=== Select Sandwich Bread ===");
            System.out.println("1 White Bread $1.5");
            System.out.println("2 Wheat Bread $1.6");
            System.out.println("3 French Bread $1.8");
            System.out.println("4 Organic Bread $2.0");
            System.out.print("Select a bread [1 - 4], Enter 5 to exit the program: ");

            breadChoice = input.nextInt();
            input.nextLine();

            switch (breadChoice) {
                case 1:
                    totalPrice = 1.5;
                    customerBread = "White Bread";
                    break;
                case 2:
                    totalPrice = 1.6;
                    customerBread = "Wheat Bread";
                    break;
                case 3:
                    totalPrice = 1.8;
                    customerBread = "French Bread";
                    break;
                case 4:
                    totalPrice = 2.0;
                    customerBread = "Organic Bread";
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR! Number must be within the range 1 - 4");
                    break;
            }
            //If the user inputs a number outside of the range 1 - 5 the program will print ERROR and restart the bread selection code
            if (breadChoice > 5|| breadChoice < 1) {
                breadRestart = "y";
            } else {
                breadRestart = "n";
            }

        } while (breadRestart.toLowerCase().equals("y"));

        do {
            System.out.println("=== Select Sandwich Vegetables: ===");
            System.out.println("1 red onions $0.05");
            System.out.println("2 olives $0.10");
            System.out.println("3 pickles $0.10");
            System.out.println("4 lettuce $0.20");
            System.out.println("5 green peppers $0.25");
            System.out.println("6 tomatoes $0.30");
            System.out.println("7 cheese $0.50");
            System.out.println("8 Quit vegetable selection");
            System.out.print("Select vegetables: [1 - 8]: ");

            vegetableChoice= input.nextInt();
            input.nextLine();

            switch (vegetableChoice) {
                case 1:
                    totalPrice += 0.05;
                    customerVegetables.add("red onions");
                    break;
                case 2:
                    totalPrice += 0.10;
                    customerVegetables.add("olives");
                    break;
                case 3:
                    totalPrice += 0.10;
                    customerVegetables.add("pickles");
                    break;
                case 4:
                    totalPrice += 0.20;
                    customerVegetables.add("lettuce");
                    break;
                case 5:
                    totalPrice += 0.25;
                    customerVegetables.add("green peppers");
                    break;
                case 6:
                    totalPrice += 0.30;
                    customerVegetables.add("tomatoes");
                    break;
                case 7:
                    totalPrice += 0.50;
                    customerVegetables.add("cheese");
                    break;
                case 8:
                    break;
                default:
                    System.out.println("ERROR! Number must be within the range 1 - 8");
                    break;
            }
            //If the user input is 8 it will bypass the vegetable selection code otherwise it will prompt the customer for more vegetables
            if (vegetableChoice == 8) {
                vegRestart = "n";
            } else if (vegetableChoice > 8 || vegetableChoice < 1) {
                vegRestart = "y";
            } else {
                System.out.print("Would you like to add more vegetables? Enter Y or N: ");
                vegRestart = input.nextLine();
            }
        } while (vegRestart.toLowerCase().equals("y"));

        do {
            System.out.println("=== Select Sandwich Meat ===");
            System.out.println("1 Ham $1.0");
            System.out.println("2 Roasted Chicken Breast $1.1");
            System.out.println("3 Turkey Breast $1.2");
            System.out.println("4 Roast Beef $1.5");
            System.out.println("5 Quit meat selection");
            System.out.print("Select a meat [1 - 4], Enter 5 to exit the program: ");

            meatChoice = input.nextInt();
            input.nextLine();

            switch (meatChoice) {
                case 1:
                    totalPrice += 1.0;
                    customerMeat = "Ham";
                    break;
                case 2:
                    totalPrice += 1.1;
                    customerMeat = "Roasted Chicken Breast";
                    break;
                case 3:
                    totalPrice += 1.2;
                    customerMeat = "Turkey Breast";
                    break;
                case 4:
                    totalPrice += 1.5;
                    customerMeat = "Roast Beef";
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("ERROR! Number must be within the range 1 - 8");
                    break;
            }
            //If the user inputs a number outside of the range 1 - 5 the program will print ERROR and restart the meat selection code
            if (meatChoice > 5 || meatChoice < 1) {
                meatRestart = "y";
            } else {
                meatRestart = "n";
            }
        } while (meatRestart.toLowerCase().equals("y"));

        System.out.print("Please enter a customer name: ");
        customerName = input.nextLine();

        ListIterator<String> listIterator;
        listIterator = customerVegetables.listIterator();
        //Outputting a receipt with the customers choices and order total
        System.out.println("=== Order Receipt ===");
        System.out.print("Name: " + customerName + "\nBread: " + customerBread);
        //Using a listIterator to print the values in the customer vegetable linked list
        while (listIterator.hasNext()) {
            customerVegtable = listIterator.next();
            System.out.print("\nVegetables: " + customerVegtable);
        }
        System.out.print("\nMeat: " + customerMeat);
        //Printing the order total formatted to two decimal places
        System.out.printf("\nOrder Total: $ %.2f", totalPrice);
        System.out.println("");

    }
}
