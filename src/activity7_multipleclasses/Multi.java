package activity7_multipleclasses;

public class Multi
{

    public static void main(String[] args)
    {

        // Message from this class
        String msg = "This is a local variable from 'Multi' class";
        System.out.println(msg);

        // Message from global variable in 'Data' class
        System.out.println(Data.txt);

        // Message from method within 'Data' class
        Data.greeting();

        // Message from method within 'Draw' class
        Draw.line();

    }

}
