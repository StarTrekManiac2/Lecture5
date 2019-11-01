package activity8_arraylists;

import java.util.ArrayList;

public class Lists
{

    public static void main(String[] args)
    {

        // Create a String ArrayList object
        ArrayList<String> list = new ArrayList<String>();

        // Populate the list
        list.add("Alpha");
        list.add("Delta");
        list.add("Charlie");

        // Display current state of list to console
        System.out.println("List: " + list);

        // Get and replace second element [1]
        System.out.println("Replacing '" + list.get(1) + "'...");
        list.set(1, "Bravo");

        // Display current state of list to console
        System.out.println("Updated List: " + list);

        // Iterating through the list and outputting again (for sake of practice)
        System.out.println("\nOutputting via iteration....");
        for (int i=0; i<list.size(); i++)
        {
            System.out.println("Item #" + (i+1) + ": " + list.get(i));
        }

    }

}
