/**
    BinarySearchTest.java
    This program tests the ObjectQuickSorter and ObjectBinarySearcher classes.
    03/15/2023
    @author Joshua Williams
 */

import java.util.Scanner;

public class BinarySearchTest
{
    public static void main(String[] args) throws Exception
    {
        Scanner s = new Scanner(System.in);
        String[] names = {"Joshua", "Connor", "Odin", "Sosa", "Melody", "Killua"};
        
        // Displays the array in the original order.
        System.out.println("Original Order:");
        for(int i = 0; i < names.length; i++)
        {
            if(i == 0)
            {
                System.out.print("{" + names[i] + ", ");
            }
            else if(i == (names.length - 1))
            {
                System.out.print(names[i] + "}\n");
            }
            else
            {
                System.out.print(names[i] + ", ");
            }
        }

        ObjectQuickSorter.quickSort(names);

        // Displays the sorted array.
        System.out.println("Sorted Order:");
        for(int i = 0; i < names.length; i++)
        {
            if(i == 0)
            {
                System.out.print("{" + names[i] + ", ");
            }
            else if(i == (names.length - 1))
            {
                System.out.print(names[i] + "}\n");
            }
            else
            {
                System.out.print(names[i] + ", ");
            }
        }

        String input;
        System.out.print("\nEnter a name to search for: ");
        input = s.nextLine();

        int i;
        i = ObjectBinarySearcher.search(names, input);

        if(i >= 0)
        {
            System.out.println("\"" + input + "\" was found at index " + i + "!");
        }
        if(i == -1)
        {
            System.out.println("\"" + input + "\" was not found.");
        }
    }
}
