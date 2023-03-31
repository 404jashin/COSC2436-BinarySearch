/**
    ObjectBinarySearcher.java
    This program searches through an array for a given value.
    03/15/2023
    @author Joshua Williams
 */

public class ObjectBinarySearcher
{
    /**
        This method searches an array for a given value.
        @param array the array to be searched.
        @param value the value to be searched for.
        @return the index of the value.
                returns -1 if value is not found.
     */
    public static int search(Comparable[] array, Comparable value)
    {
        int low = 0;
        int high = (array.length - 1);
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(value.compareTo(array[mid]) == 0)
            {
                return mid;
            }
            else if(value.compareTo(array[mid]) < 0)
            {
                high = mid - 1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return -1;
    }   
}
