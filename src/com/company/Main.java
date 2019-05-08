//Justin Lazarski
//CIS 3090.04
//5/8/19
//Final Project



package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int breadChoice = 0;
        double totalPrice = 0.0;
        //boolean restart = false;

        System.out.println("=== Select Sandwich Bread ===");
        System.out.println("1 White Bread $1.5");
        System.out.println("2 Wheat Bread $1.6");
        System.out.println("3 French Bread $1.8");
        System.out.println("4 Organic Bread $2.0");

        System.out.println("Select a bread [1 - 4], Enter 5 to exit the program.");


        breadChoice = input.nextInt();

        switch(breadChoice){
            case 1:
                System.out.println("Enter the quantity");

                int quantity = input.nextInt();

                totalPrice = totalPrice + (quantity * 1.5);

                break;
            case 2:
                System.out.println("Enter the quantity");

                int quantity1 = input.nextInt();

                totalPrice = totalPrice + (quantity1 * 1.6);

                break;
            case 3:
                System.out.println("Enter the quantity");

                int quantity2 = input.nextInt();

                totalPrice = totalPrice + (quantity2 * 1.8);

                break;
            case 4:
                System.out.println("Enter the quantity");

                int quantity3 = input.nextInt();

                totalPrice = totalPrice + (quantity3 * 2.0);

                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("ERROR! Number must be within the range 1 - 4");
                //System.out.println("Please select a bread:");
                //choice = input.nextInt();

                //System.out.println("Press any key to restart.");
                //restart = input.hasNext();
                //System.out.println("Restart Value: " + restart);

                break;
        }

        System.out.println("=== Select Sandwich Vegetables: ===");
        System.out.println("1 red onions $0.05");
        System.out.println("2 olives $0.10");
        System.out.println("3 pickles $0.10");
        System.out.println("4 lettuce $0.20");
        System.out.println("5 green peppers $0.25");
        System.out.println("6 tomatoes $0.30");
        System.out.println("7 cheese $0.50");
        System.out.println("8 Quit vegetable selection");
        System.out.println("Select vegetables: [1 - 8]:");

        int vegetableChoice = input.nextInt();

        switch(vegetableChoice) {
            case 1:
                totalPrice = totalPrice + 0.05;

                break;
            case 2:
                totalPrice = totalPrice + 0.10;

                break;
            case 3:
                totalPrice = totalPrice + 0.10;

                break;
            case 4:
                totalPrice = totalPrice + 0.20;

                break;
            case 5:
                totalPrice = totalPrice + 0.25;

                break;
            case 6:
                totalPrice = totalPrice + 0.30;

                break;
            case 7:
                totalPrice = totalPrice + 0.5;

                break;
            case 8:
                System.exit(0);

                break;

            default:
                System.out.println("ERROR! Number must be within the range 1 - 8");

                break;
        }
        //TODO: Make the vegetable selection program rerun or allow them to input quantiies.





        System.out.println("");

        System.out.println(totalPrice);








    }
}
