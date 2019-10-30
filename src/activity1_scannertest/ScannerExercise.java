/*
 * Practice using the Scanner to perform tasks on user inputs
 * @author st20155985
 */

package activity1_scannertest;

import java.util.Scanner;

public class ScannerExercise
{

    public static void main(String[] args)
    {

        Scanner s = new Scanner(System.in);

        // PERSON A
        System.out.println("PERSON 1 - What is your name?");
        String personA_Name = s.next();
        System.out.println("PERSON 1 - What is your age?");
        int personA_Age = s.nextInt();

        System.out.println("\n");

        // PERSON B
        System.out.println("PERSON 2 - What is your name?");
        String personB_Name = s.next();
        System.out.println("PERSON 2 - What is your age?");
        int personB_Age = s.nextInt();

        System.out.println("\n");

        // PERSON C
        System.out.println("PERSON 3 - What is your name?");
        String personC_Name = s.next();
        System.out.println("PERSON 3 - What is your age?");
        int personC_Age = s.nextInt();

        System.out.println("\n");

        // PERSON D
        System.out.println("PERSON 4 - What is your name?");
        String personD_Name = s.next();
        System.out.println("PERSON 4 - What is your age?");
        int personD_Age = s.nextInt();

        System.out.println("\n");

        // Calculating and outputting average age
        int averageAge = (personA_Age + personB_Age + personC_Age + personD_Age) / 4;
        System.out.println("The average age of " + personA_Name + ", " + personB_Name + ", " +
            personC_Name + ", " + personD_Name + " is " + averageAge + "!");

    }

}
