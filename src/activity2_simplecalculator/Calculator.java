package activity2_simplecalculator;

import java.util.Scanner;

public class Calculator
{

    public static void main(String[] args)
    {

        // Declaring Variables
        @SuppressWarnings("unused")
            double valueA;
            double valueB;
            double sum;
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
            System.out.println("\nADDITION");
            System.out.println("First value:");
            valueA = s.nextInt();
            System.out.println("Second value:");
            valueB = s.nextInt();
            sum = valueA + valueB;
            System.out.println("\nANSWER");
            System.out.println(valueA + " + " + valueB + " = " + sum);
        }
        else if (menu == 2)
        {
            System.out.println("\nSUBTRACTION");
            System.out.println("First value:");
            valueA = s.nextInt();
            System.out.println("Second value:");
            valueB = s.nextInt();
            sum = valueA - valueB;
            System.out.println("\nANSWER");
            System.out.println(valueA + " - " + valueB + " = " + sum);
        }
        else if (menu == 3)
        {
            System.out.println("\nMULTIPLICATION");
            System.out.println("First value:");
            valueA = s.nextInt();
            System.out.println("Second value:");
            valueB = s.nextInt();
            sum = valueA * valueB;
            System.out.println("\nANSWER");
            System.out.println(valueA + " x " + valueB + " = " + sum);
        }
        else if (menu == 4)
        {
            System.out.println("\nDIVISION");
            System.out.println("First value:");
            valueA = s.nextInt();
            System.out.println("Second value:");
            valueB = s.nextInt();
            sum = valueA / valueB;
            System.out.println("\nANSWER");
            System.out.println(valueA + " / " + valueB + " = " + sum);
        }
        else
        {
            System.out.println("\nInvalid option. Re-run the program!");
        }

    }

}
