//Justin Lazarski
//CIS 3090.04
//5/8/19
//Final Project



package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int choice = 0;
        double totalPrice = 0.0;
        //boolean restart = false;

        System.out.println("=== Select Sandwich Bread ===");
        System.out.println("1 White Bread $1.5");
        System.out.println("2 Wheat Bread $1.6");
        System.out.println("3 French Bread $1.8");
        System.out.println("4 Organic Bread $2.0");

        System.out.println("Select a bread [1 - 4]:");

        choice = input.nextInt();

        switch(choice){
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

        System.out.println(totalPrice);








    }
}
