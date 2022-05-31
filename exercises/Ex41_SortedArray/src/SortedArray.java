import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int size){
        System.out.println("Enter each number and press <Enter>: ");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i];
        }
        Arrays.sort(sortedArray);
        int n = sortedArray.length;
        for (int i = 0; i < n / 2; i++) {

            // Storing the first half elements temporarily
            int temp = sortedArray[i];

            // Assigning the first half to the last half
            sortedArray[i] = sortedArray[n - i - 1];

            // Assigning the last half to the first half
            sortedArray[n - i - 1] = temp;
        }
        return sortedArray;
    }
}
