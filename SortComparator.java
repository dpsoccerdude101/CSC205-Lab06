package sortingsearching;
import java.lang.Math;
/**
 * Tests GenericSortingMethods class
 *
 * @author (Kurt Mueller & Dennis Pavlyuk)
 * @version (9/26/19)
 */
public class SortComparator 
{

    public static void main (String [] args) {
        int arraySize = 2048;

        Integer [] a = new Integer[arraySize];
        Integer [] b = new Integer[arraySize];
        Integer [] c = new Integer[arraySize];

        fillArray(a);
        b = a.clone();
        c = b.clone();
        
        String selection;
        
        // for (int count = 0; count < arraySize; count++) {
            // System.out.print(a[count] + " ");
        // }
        
        boolean bool = true;
        //while (bool = true) {
                selection = ("Info on an array with an array size of " + arraySize + ": ");
                System.out.print(selection);
                GenericSortingMethods.selectionSort(a);
                
                selection = ("Info on an array with an array size of " + arraySize + ": ");
                System.out.print(selection);
                GenericSortingMethods.insertionSort(b);
                
                selection = ("Info on an array with an array size of " + arraySize + ": ");
                System.out.print(selection);
                GenericSortingMethods.bubbleSort(c);
            
        //}

    }

    public static void fillArray (Integer [] a) {
        for (int k = 0; k < 2048; k++) {
            a[k] = (Integer) ((int)(Math.random() * 100000));
        }
    }

}
