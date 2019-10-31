package activity6_refactoredcalculator;

import java.util.Scanner;

public class Calculator
{

    // Global variable for accessing and changing sum
    public static double sum;

    public static void main(String[] args)
    {

        // Declaring Variables
        @SuppressWarnings("unused")
        double valueA;
        double valueB;
        int menu;

        Scanner s = new Scanner(System.in);

        // Console outputs
        System.out.println("****** CALCULATOR ******");
        System.out.println("PLEASE CHOOSE AN OPTION\n");
        System.out.println("1.Addition\n2.Subtraction");
        System.out.println("3.Multiplication\n4.Division");

        // Receive user menu option input
        menu = s.nextInt();

        // Validating the options and perform relevant maths
        if (menu == 1)
        {
            // Request 2 inputs from user
            System.out.println("\nADDITION");
            System.out.println("First value:");
            valueA = s.nextInt();
            System.out.println("Second value:");
            valueB = s.nextInt();
            addition(valueA, valueB);
        }
        else if (menu == 2)
        {
            // Request 2 inputs from user
            System.out.println("\nSUBTRACTION");
            System.out.println("First value:");
            valueA = s.nextInt();
            System.out.println("Second value:");
            valueB = s.nextInt();
            subtraction(valueA, valueB);
        }
        else if (menu == 3)
        {
            System.out.println("\nMULTIPLICATION");
            System.out.println("First value:");
            valueA = s.nextInt();
            System.out.println("Second value:");
            valueB = s.nextInt();
            multiplication(valueA, valueB);
        }
        else if (menu == 4)
        {
            System.out.println("\nDIVISION");
            System.out.println("First value:");
            valueA = s.nextInt();
            System.out.println("Second value:");
            valueB = s.nextInt();
            division(valueA, valueB);
        }
        else
        {
            System.out.println("\nInvalid option. Re-run the program!");
        }

    }



    // ADDITION method
    public static void addition(double numA, double numB)
    {
        sum = numA + numB;
        System.out.println("\nANSWER");
        System.out.println(numA + " + " + numB + " = " + sum);
    }

    // SUBTRACTION method
    public static void subtraction(double numA, double numB)
    {
        sum = numA - numB;
        System.out.println("\nANSWER");
        System.out.println(numA + " - " + numB + " = " + sum);
    }

    // MULTIPLICATION method
    public static void multiplication(double numA, double numB)
    {
        sum = numA * numB;
        System.out.println("\nANSWER");
        System.out.println(numA + " x " + numB + " = " + sum);
    }

    // DIVISION method
    public static void division(double numA, double numB)
    {
        sum = numA / numB;
        System.out.println("\nANSWER");
        System.out.println(numA + " / " + numB + " = " + sum);
    }

}
