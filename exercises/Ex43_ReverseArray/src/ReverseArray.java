import java.util.Scanner;

public class ReverseArray {

    public ReverseArray() {
        Scanner sc = new Scanner(System.in);
        int arrayLength = 5;
        System.out.println("Enter " + arrayLength + " integers");
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = sc.nextInt();
        }
        reverse(array);
    }

    private static void reverse(int[] array) {
        int temp;
        int n = array.length;
        String arrayString = "Array = [";
        for (int i = 0; i < n; i++) {
            arrayString += (array[i]) + ((i == n - 1) ? "" : ", ");
        }
        arrayString += "]";
        System.out.println(arrayString);

        for (int i = 0; i < n/2; i++) {
            temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }

        arrayString = "Reversed array = [";
        for (int i = 0; i < n; i++) {
            arrayString += (array[i]) + ((i == n - 1) ? "" : ", ");
        }
        arrayString += "]";
        System.out.println(arrayString);
    }
}
