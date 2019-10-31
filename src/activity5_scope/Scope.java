package activity5_scope;

public class Scope
{

    // Static activity - global variable constant (of same name)
    final static String text = "This is 'TEXT' - a GLOBAL variable of Scope class.";

    public static void main(String[] args)
    {

        // Local Variable access example
        String text = "This is 'TEXT' - it is local to the main method";
        System.out.println(text);

        // Non-Local Variable access example
        sub();

        // Trying to call a variable from outside the SCOPE ... uncommenting and running will cause an error
        // System.out.println(subText);

        // Call global variable
        System.out.println( Scope.text );

    }



    // SUB method for providing an example as to how external variables cannot be accessed (scope)
    public static void sub()
    {
        String subText = "This is 'SUBTEXT' - it is local only to sub method";
        System.out.println(subText);
    }

}
