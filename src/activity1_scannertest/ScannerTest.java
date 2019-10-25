/*
 * Quick recap of using the Scanner
 * @author st20155985
 */

package activity1_scannertest;

import java.util.Scanner;

public class ScannerTest
{

    public static void main(String[] args)
    {

        // Initialize the Scanner
        Scanner input = new Scanner(System.in);

        // Declare and initialize variables for storing user inputs from Scanner
        String yourname = "";
        int yourage = 0;

        // Request input for user's name and store to variable
        System.out.println("What is your name?");
        yourname = input.next();

        // Request input for user's age and store to variable
        System.out.println("What is your age?");
        yourage = input.nextInt();

        // Output to user the inputs they provided in a message
        System.out.println("Hi, " + yourname + "! You are " + yourage + " years old!");

        // Stop requesting input
        input.close();

    }

}
