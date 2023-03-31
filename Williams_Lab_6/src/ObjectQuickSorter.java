/**
    ObjectQuickSorter.java
    This program sorts a given array.
    03/15/2023
    @author Joshua Williams
 */

public class ObjectQuickSorter
{
    /**
        This method calls the doQuickSort method to sort a given array.
        @param array the array to sort.
     */
    public static void quickSort(Comparable array[])
    {
        doQuickSort(array, 0, (array.length - 1));
    }

    /**
        This method uses the Quicksort algorithm to sort a given array.
        @param array the array to sort.
        @param start the starting index of the array to sort.
        @param end the ending index of the array to sort.
     */
    private static void doQuickSort(Comparable array[], int start, int end)
    {
        int pivotPoint;

        if(start < end)
        {
            pivotPoint = partition(array, start, end);
            doQuickSort(array, start, (pivotPoint - 1));
            doQuickSort(array, (pivotPoint + 1), end);
        }
    }

    /**
        This method takes the array and selects a pivot value within it to
            separate the array into two sections.
        Any values less than the pivot value will be assigned to the left
            section.
        Any values greater than or equal to the pivot value will be assigned
            to the right section.
        @param array the array to partition.
        @param start the starting index of the section to partition.
        @param end the ending index of the section to partition.
        @return the index of the pivot value.
     */
    private static int partition(Comparable array[], int start, int end)
    {
        Comparable pivotValue;
        int lastElementLeft;
        int mid;

        mid = (start + end) / 2;

        swap(array, start, mid);

        pivotValue = array[start];
        lastElementLeft = start;

        for(int i = (start + 1); i <= end; i++)
        {
            if(array[i].compareTo(pivotValue) < 0)
            {
                lastElementLeft++;
                swap(array, lastElementLeft, i);
            }
        }
        
        swap(array, start, lastElementLeft);

        return lastElementLeft;
    }

    /**
        This method swaps two elements in a given array.
        @param array the array containing the two elements to swap.
        @param a the index of the first element.
        @param b the index of the second element.
     */
    private static void swap(Comparable array[], int a, int b)
    {
        Comparable c;
        c = array[a];
        array[a] = array[b];
        array[b] = c;
    }
}
