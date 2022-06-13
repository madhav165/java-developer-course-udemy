import java.util.Scanner;

public class MinimumElement {

    public MinimumElement() {
        int arrayLength = readInteger();
        int[] array = readElements(arrayLength);
        int min = findMin(array);
        System.out.println("Minimum element of array = " + min);
    }

    private static int readInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many integers you want to enter : ");
        return sc.nextInt();
    }

    private static int[] readElements(int arrayLength) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arrayLength + " elements: ");
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
