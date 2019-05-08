//Justin Lazarski
//CIS 3090.04
//5/8/19
//Final Project



package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        int choice = 0;


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
                
        }


        System.out.println(choice);








    }
}
