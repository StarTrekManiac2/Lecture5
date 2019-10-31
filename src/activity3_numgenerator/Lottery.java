package activity3_numgenerator;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery
{

    /**
     *
     *  TO-DO
     *
     *  - I need to verify that the user inputs birthday numbers from 1 to 31.
     *  - There is an error in that it ignores the IF statement and skips to the ELSE despite correct condition.
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
            if (response == "y")
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
