package activity3_numgenerator;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery
{

    /**
        I need to verify that the user inputs birthday numbers from 1 to 31.
        I can do this by considering a FOR Loop that repeatedly asks UP TO 6 times for a birthday
        number for the lottery ticket if desired.

        I.E.
            "Do you want to add a birthday number of 1 to 31? [1]"
                - yes
                - "Number:"
                - 20
                - if not 1-31, randomize instead and move on (maybe add a message to say so)
            "Do you want to add a birthday number of 1 to 31? [2]"

            ...

            "Do you want to add a birthday number of 1 to 31? [4]"
                - no
                - Randomizes the rest if applicable
     **/

    public static void main(String[] args)
    {

        /************************************
         * SETUP
         ************************************/

        // Initialize input Scanner
        Scanner s = new Scanner(System.in);

        // Declaring number variables
        int numA = 0;
        int numB = 0;
        int numC = 0;
        int numD = 0;
        int numE = 0;
        int numF = 0;

        // Initializing array of above number variables
        int[] lotteryNumbers = { numA, numB, numC, numD, numE, numF };


        /************************************
         * PROGRAM FUNCTIONALITY
         ************************************/

        // Count for each time the user is asked for birthday
        int count = 1;

        // For-Loop for asking the user in each iteration of the lottery number array
        for (int i=0; i<lotteryNumbers.length; i++)
        {
            // Ask the user for input
            System.out.println("Do you want to add a birthday number of 1 to 31? [" + count + "]");

            // IF response is a form of 'Yes', ask for the user to input and apply it to current iteration
            if ((s.next() == "Y") || (s.next() == "y") || (s.next() == "Yes") || (s.next() == "yes"))
            {
                System.out.println("Type Birthday #" + i);
                lotteryNumbers[i] = s.nextInt();
            }
            // ELSE IF not, randomize current iteration's number instead
            else
            {
                System.out.println("Number has been randomized");
                lotteryNumbers[i] = (int) (Math.random() * (43 - 1) + 1);
            }

            // Increment the birthday counter and increment the iteration to continue
            count++;
            i++;
        }

        // Sort the array values (ascending order)
        Arrays.sort(lotteryNumbers);

        // Output each array value to console
        for (int j=0; j<lotteryNumbers.length; j++)
        {
            System.out.println(lotteryNumbers[j]);
        }

    }

}
