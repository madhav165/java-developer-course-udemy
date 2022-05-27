import java.util.Scanner;

public class InputCalculator {
    public static void  inputThenPrintSumAndAverage() {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        boolean isAnInt;

        while (true) {
            isAnInt = sc.hasNextInt();
            if (isAnInt) {
                sum += sc.nextInt();
                count += 1;
            } else {
                break;
            }
        }
        sc.close();

        System.out.println("SUM = "+sum+" AVG = "+Math.round((double) sum/(double) count));

    }
}
