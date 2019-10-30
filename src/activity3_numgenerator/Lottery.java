package activity3_numgenerator;

import java.util.Arrays;
import java.util.Scanner;

public class Lottery
{

    /**
        I need to verify that the user inputs birthday numbers from 1 to 31.
        I can do this by considering a Do-While Loop that repeatedly asks UP TO 6 times for a birthday
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

        // Declaring birthday number variables
        int birthdayNumA, birthdayNumB, birthdayNumC, birthdayNumD, birthdayNumE, birthdayNumF;

        // Initializing array of above number variables
        int[] lotteryNumbers = { numA, numB, numC, numD, numE, numF };



        /************************************
         * PROGRAM FUNCTIONALITY
         ************************************/

        // Ask whether or not to include birthday numbers
        System.out.println("Type 'Y' if you wish to include birthdays (1 to 31)?");
        String response = s.next();

        // If YES to including birthday numbers
        if (response.equals("Y") || response.equals("y"))
        {
            // Ask how many birthday numbers to include
            System.out.println("How many birthdays do you want to include (1-6)?");
            int amount = s.nextInt();

            // Perform birthday inputs depending on amount desired above
            if (amount == 1)
            {
                System.out.println("Birthday Number: ");
                birthdayNumA = s.nextInt();

                // Apply to lottery array
                lotteryNumbers[0] = birthdayNumA;

                // Randomize remaining numbers
                for (int i = 1; i < lotteryNumbers.length; i++)
                {
                    lotteryNumbers[i] = (int) (Math.random() * (43 - 1) + 1);
                }
            }
            else if (amount == 2)
            {
                System.out.println("Birthday Numbers: ");
                birthdayNumA = s.nextInt();
                birthdayNumB = s.nextInt();

                // Apply to lottery array
                lotteryNumbers[0] = birthdayNumA;
                lotteryNumbers[1] = birthdayNumB;

                // Randomize remaining numbers
                for (int i = 2; i < lotteryNumbers.length; i++)
                {
                    lotteryNumbers[i] = (int) (Math.random() * (43 - 1) + 1);
                }
            }
            else if (amount == 3)
            {
                System.out.println("Birthday Numbers: ");
                birthdayNumA = s.nextInt();
                birthdayNumB = s.nextInt();
                birthdayNumC = s.nextInt();

                // Apply to lottery array
                lotteryNumbers[0] = birthdayNumA;
                lotteryNumbers[1] = birthdayNumB;
                lotteryNumbers[2] = birthdayNumC;

                // Randomize remaining numbers
                for (int i = 3; i < lotteryNumbers.length; i++)
                {
                    lotteryNumbers[i] = (int) (Math.random() * (43 - 1) + 1);
                }
            }
            else if (amount == 4)
            {
                System.out.println("Birthday Numbers: ");
                birthdayNumA = s.nextInt();
                birthdayNumB = s.nextInt();
                birthdayNumC = s.nextInt();
                birthdayNumD = s.nextInt();

                // Apply to lottery array
                lotteryNumbers[0] = birthdayNumA;
                lotteryNumbers[1] = birthdayNumB;
                lotteryNumbers[2] = birthdayNumC;
                lotteryNumbers[3] = birthdayNumD;

                // Randomize remaining numbers
                for (int i = 4; i < lotteryNumbers.length; i++)
                {
                    lotteryNumbers[i] = (int) (Math.random() * (43 - 1) + 1);
                }
            }
            else if (amount == 5)
            {
                System.out.println("Birthday Numbers: ");
                birthdayNumA = s.nextInt();
                birthdayNumB = s.nextInt();
                birthdayNumC = s.nextInt();
                birthdayNumD = s.nextInt();
                birthdayNumE = s.nextInt();

                // Apply to lottery array
                lotteryNumbers[0] = birthdayNumA;
                lotteryNumbers[1] = birthdayNumB;
                lotteryNumbers[2] = birthdayNumC;
                lotteryNumbers[3] = birthdayNumD;
                lotteryNumbers[4] = birthdayNumE;

                // Randomize remaining numbers
                for (int i = 5; i < lotteryNumbers.length; i++)
                {
                    lotteryNumbers[i] = (int) (Math.random() * (43 - 1) + 1);
                }
            }
            else if (amount == 6)
            {
                System.out.println("Birthday Numbers: ");
                birthdayNumA = s.nextInt();
                birthdayNumB = s.nextInt();
                birthdayNumC = s.nextInt();
                birthdayNumD = s.nextInt();
                birthdayNumE = s.nextInt();
                birthdayNumF = s.nextInt();

                // Apply to lottery array - no need to randomize afterward
                lotteryNumbers[0] = birthdayNumA;
                lotteryNumbers[1] = birthdayNumB;
                lotteryNumbers[2] = birthdayNumC;
                lotteryNumbers[3] = birthdayNumD;
                lotteryNumbers[4] = birthdayNumE;
                lotteryNumbers[5] = birthdayNumF;
            }
            else
            {
                // Terminates the program due to error
                System.out.println("You did not enter a valid number of birthdays to include (1 to 6)!");
                System.exit(1);
            }

            // Sort array into ascending order
            Arrays.sort(lotteryNumbers);

            // Output lottery numbers
            for (int i=0; i<lotteryNumbers.length; i++)
            {
                System.out.println(lotteryNumbers[i]);
            }
        }

        // IF NO to including birthday numbers
        else
        {
            // Declaring all 6 random numbers (1 to 42)
            for (int i=0; i<lotteryNumbers.length; i++)
            {
                lotteryNumbers[i] = (int) (Math.random() * (43-1) +1);
            }

            // Sort array into ascending order
            Arrays.sort(lotteryNumbers);

            // Output lottery numbers
            for (int i=0; i<lotteryNumbers.length; i++)
            {
                System.out.println(lotteryNumbers[i]);
            }
        }

    }

}
