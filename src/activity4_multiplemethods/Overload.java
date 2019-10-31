package activity4_multiplemethods;

public class Overload
{

    public static void main(String[] args)
    {

        // Calling each of the below methods
        System.out.println( write(12) );
        System.out.println( write("Twelve") );
        System.out.println( write(4, 3) );

    }



    // WRITE method for an integer parameter
    public static String write(int num)
    {
        return ("Integer passed is " + num);
    }

    // WRITE method for a string parameter
    public static String write(String num)
    {
        return ("String passed is " + num);
    }

    // WRITE method for multiple integer parameters for multiplication
    public static String write(int num1, int num2)
    {
        return (num1 + " x " + num2 + " = " + (num1*num2));
    }

}
