import java.text.DecimalFormat;
import java.util.Random;

public class VSCompSort {

    static final int SIZE = 20;            // triangle_size of array to be sorted
    static int EXP = 1;                    // static integer for radix sort
    static int[] values = new int[SIZE];   // values to be sorted

    static public boolean isSorted()
    // Returns true if the array values are sorted and false otherwise.
    {
        for (int index = 0; index < (SIZE - 1); index++)
            if (values[index] > values[index + 1])
                return false;
        return true;
    }

    static public void swap(int index1, int index2)
    // Precondition: index1 and index2 are >= 0 and < SIZE.
    //
    // Swaps the integers at locations index1 and index2 of the values array.
    {
        int temp = values[index1];
        values[index1] = values[index2];
        values[index2] = temp;
    }

    static public void printValues()
    // Prints all the values integers.
    {
        int value;
        DecimalFormat fmt = new DecimalFormat("00");
        System.out.println("The values array is:");
        for (int index = 0; index < SIZE; index++)
        {
            value = values[index];
            if (((index + 1) % 10) == 0)
                System.out.println(fmt.format(value));
            else
                System.out.print(fmt.format(value) + " ");
        }
        System.out.println();
    }

    /**Selection Sort*/
    static int minIndex(int startIndex, int endIndex)
    // Returns the index of the smallest value in
    // values[startIndex]..values[endIndex].
    {
        int indexOfMin = startIndex;
        for (int index = startIndex + 1; index <= endIndex; index++)
            if (values[index] < values[indexOfMin])
                indexOfMin = index;
        return indexOfMin;
    }

    static void selectionSort()
    // Sorts the values array using the selection sort algorithm.
    {
        int endIndex = SIZE - 1;
        for (int current = 0; current < endIndex; current++)
            swap(current, minIndex(current, endIndex));
    }

    /**Radix Sort:*/

    /**Returns the index of the largest value in values
     * @return integer of max value
     */
    static int maxIndex() {
        int indexOfMax = values[0];
        for (int index = 1; index < SIZE; index++)
            if (values[index] > indexOfMax)
                indexOfMax = values[index];
        return indexOfMax;
    }
    static void countRadixSort() {
        //Arrays that take up more space in memory
        int[] output = new int[SIZE];
        int[] count = new int[10];

        //Store count of occurrences
        for (int i = 0; i < SIZE; i++) {
            count[(values[i] / EXP) % 10]++;
        }
        //Change count array values to contain actual position of each digit
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        //Build output array
        for (int i = SIZE - 1; i >= 0; i--) {
            output[count[(values[i] / EXP) % 10] - 1] = values[i];
            count[(values[i] / EXP) % 10]--;
        }
        //Copy output array to values array
        System.arraycopy(output, 0, values, 0, SIZE);
    }

    /**Sorts using radix sorting algorithm
     *  Preconditions: Integers cannot be negative.
     */
    static void radixSort() {
        //Need to find the largest integer in values array
        int maxInt = maxIndex();
        //Sort by each digit of the integer
        for (EXP = 1; maxInt / EXP > 0; EXP *= 10) {
            countRadixSort();
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] valuesCopy = new int[SIZE];

        //Initialize values array
        for (int index = 0; index < SIZE; index++)
            values[index] = Math.abs(rand.nextInt()) % 100;

        //Copying values array to valuesCopy array
        System.arraycopy(values, 0, valuesCopy, 0, SIZE);

        //Print values array
        printValues();
        System.out.println("values is sorted: " + isSorted());
        System.out.println();

        //Sort values array using Comparison-Based Sort
        System.out.println("Sorting using Selection Sort... ");
        selectionSort();
        System.out.println();

        //Print sorted values array
        printValues();
        System.out.println("values is sorted: " + isSorted());
        System.out.println();

        //Resetting values array
        System.out.println("Resetting values array... ");
        values = valuesCopy;
        valuesCopy = new int[SIZE];
        System.arraycopy(values, 0, valuesCopy, 0, SIZE);
        printValues();
        System.out.println("values is sorted: " + isSorted());
        System.out.println();

        //Sort values array using Radix sort
        System.out.println("Sorting using Radix Sort... ");
        radixSort();
        System.out.println();

        //Print sorted values array
        printValues();
        System.out.println("values is sorted: " + isSorted());
        System.out.println();

        //Testing with negative integers
        System.out.println("Testing array including negative integers... ");
        values = new int[SIZE];
        for (int index = 0; index < SIZE; index++)
            values[index] = rand.nextInt() % 100;
        System.arraycopy(values, 0, valuesCopy, 0, SIZE);
        printValues();

        //Sort values array using Comparison-Based Sort
        System.out.println("Sorting using Selection Sort... ");
        selectionSort();
        System.out.println();

        //Print sorted values array
        printValues();
        System.out.println("values is sorted: " + isSorted());
        System.out.println();

        //Resetting values array
        System.out.println("Resetting values array... ");
        values = valuesCopy;
        valuesCopy = new int[SIZE];
        System.arraycopy(values, 0, valuesCopy, 0, SIZE);
        printValues();
        System.out.println("values is sorted: " + isSorted());
        System.out.println();

        //Sort values array with negative integers using Radix sort will throw an exception!
        System.out.println("Sorting using Radix Sort... ");
        radixSort();
        System.out.println();

        //Print sorted values array
        printValues();
        System.out.println("values is sorted: " + isSorted());
        System.out.println();
    }
}
