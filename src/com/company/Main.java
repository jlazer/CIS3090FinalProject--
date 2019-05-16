//Justin Lazarski
//CIS 3090.04
//5/8/19
//Final Project



package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int breadChoice;
        int vegetableChoice;
        int meatChoice;
        double totalPrice = 0.0;
        String vegRestart = "";

        //boolean restart = false;

        System.out.println("=== Select Sandwich Bread ===");
        System.out.println("1 White Bread $1.5");
        System.out.println("2 Wheat Bread $1.6");
        System.out.println("3 French Bread $1.8");
        System.out.println("4 Organic Bread $2.0");
        System.out.print("Select a bread [1 - 4], Enter 5 to exit the program: ");

        breadChoice = input.nextInt();
        input.nextLine();

        switch(breadChoice){
            case 1:
                totalPrice = 1.5;
                break;
            case 2:
                totalPrice = 1.6;
                break;
            case 3:
                totalPrice = 1.8;
                break;
            case 4:
                totalPrice = 2.0;
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("ERROR! Number must be within the range 1 - 4");
                /*System.out.println("Please select a bread:");
                choice = input.nextInt();
                System.out.println("Press any key to restart.");
                restart = input.hasNext();
                System.out.println("Restart Value: " + restart);*/
                break;
        }

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
                    System.out.print("Enter the quantity: ");
                    int veg1Quantity = input.nextInt();
                    totalPrice += (veg1Quantity * 0.05);
                    //totalPrice = totalPrice + (vegQuantity1 * 0.05);
                    break;
                case 2:
                    System.out.print("Enter the quantity: ");
                    int veg2Quantity = input.nextInt();
                    totalPrice += (veg2Quantity * 0.10);
                    break;
                case 3:
                    System.out.print("Enter the quantity: ");
                    int veg3Quantity = input.nextInt();
                    totalPrice += (veg3Quantity * 0.10);
                    break;
                case 4:
                    System.out.print("Enter the quantity: ");
                    int veg4Quantity = input.nextInt();
                    totalPrice += (veg4Quantity * 0.20);
                    break;
                case 5:
                    System.out.print("Enter the quantity: ");
                    int veg5Quantity = input.nextInt();
                    totalPrice += (veg5Quantity * 0.25);
                    break;
                case 6:
                    System.out.print("Enter the quantity: ");
                    int veg6Quantity = input.nextInt();
                    totalPrice += (veg6Quantity * 0.30);
                    break;
                case 7:
                    System.out.print("Enter the quantity: ");
                    int veg7Quantity = input.nextInt();
                    totalPrice += (veg7Quantity * 0.5);
                    break;
                case 8:
                    System.exit(0);
                    //System.out.println("Enter the quantity");
                    //int vegQuantity8 = input.nextInt();
                    break;
                default:
                    System.out.println("ERROR! Number must be within the range 1 - 8");
                    break;
            }
            input.nextLine();
            System.out.print("Would you like to add more vegetables? Enter Y or N: ");
            vegRestart = input.nextLine();
            System.out.println(vegRestart);

        } while (vegRestart.toLowerCase().equals("y"));

        System.out.println("TESTING: This is after the vegetable loop.");
        System.out.println("");
        System.out.println("TESTING: " + totalPrice);
        System.out.println("TESTING: Entering Meat Selection");

        System.out.println("=== Select Sandwich Meat ===");
        System.out.println("1 Ham $1.0");
        System.out.println("2 Roasted Chicken Breast $1.1");
        System.out.println("3 Turkey Breast $1.2");
        System.out.println("4 Roast Beef $1.5");
        System.out.println("5 Quit meat selection");
        System.out.print("Select a meat [1 - 4], Enter 5 to exit the program: ");

        meatChoice = input.nextInt();
        input.nextLine();

        System.out.println("TESTING: " + meatChoice);

        switch (meatChoice) {
            case 1:
                totalPrice += 1.0;
                break;
            case 2:
                totalPrice += 1.1;
                break;
            case 3:
                totalPrice += 1.2;
                break;
            case 4:
                totalPrice += 1.5;
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("ERROR! Number must be within the range 1 - 8");
                break;
        }
        System.out.println("TESTING: TotalPrice: " + totalPrice);












    }
}
