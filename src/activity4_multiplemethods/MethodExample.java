package activity4_multiplemethods;

public class MethodExample
{

    public static void main(String[] args)
    {

        System.out.println("This is a message directly from the PSVM main method!");
        sub();

    }



    // Sub() method to be called in the main method
    public static void sub()
    {
        System.out.println("This is a message from the 'sub()' method!" );
    }


}
