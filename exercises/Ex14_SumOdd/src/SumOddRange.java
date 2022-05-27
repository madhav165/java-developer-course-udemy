public class SumOddRange {
    public static boolean isOdd (int number) {
        return number % 2 == 1;
    }

    public static int sumOdd (int start, int end) {
        if ((end < start) || (start < 0) || (end < 0)) {
            return -1;
        } else {
            int sum = 0;
            int i;
            for (i = start; i <= end; i++) {
                if (isOdd(i)) sum += i;
            }
            return sum;
        }
    }
}
