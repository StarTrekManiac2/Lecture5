package activity3_numgenerator;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery
{

    /**
     *
     *  TO-DO
     *
     *  - Verify that the user inputs birthday numbers from 1 to 31.
     *  - Fix error which ignores the IF statement and skips to the ELSE despite correct condition.
     *
     **/

    public static void main(String[] args)
    {

        // Initialize input Scanner
        Scanner s = new Scanner(System.in);

        // Initializing integer array of 6 elements
        int[] lotteryNumbers = new int[6];

        // Count for each time the user is asked for birthday
        int count = 1;

        // For-Loop for asking the user in each iteration of the lottery number array
        for (int i=0; i<lotteryNumbers.length; i++)
        {
            // Ask the user for input
            System.out.println("Do you want to add a birthday number of 1 to 31? [" + count + "]");
            String response = s.next();

            // IF response is a form of 'Yes', ask for the user to input and apply it to current iteration
            if (response.equals("yes"))
            {
                // Ask for and store birthday number user wants to a temporary variable
                System.out.println("\nType Birthday #" + i);
                int birthdayNum = s.nextInt();

                // IF said input is between the valid range of 1 to 31
                if ((birthdayNum) < 31 && (birthdayNum > 0))
                {
                    lotteryNumbers[i] = birthdayNum;
                    System.out.println("\n");
                }
                // ELSE let the user know that the number will be randomized instead
                else
                {
                    System.out.println("\tInvalid number (must be 1 to 31)");
                    System.out.println("\tRandomizing number instead...\n");
                    lotteryNumbers[i] = (int) (Math.random() * (43 - 1) + 1);
                }

            }
            // ELSE IF not, randomize current iteration's number instead
            else
            {
                System.out.println("\tNumber has been randomized\n");
                lotteryNumbers[i] = (int) (Math.random() * (43 - 1) + 1);
            }

            // Increment the birthday counter and increment the iteration to continue
            count++;
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
