public class LargestPrime {

    public static int getLargestPrime (int number) {

        if (number <= 1) {
            return -1;
        } else {
            int largestPrimeFactor = -1;
            for (int i = 2; i <= number; i++) {
                int count = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) count++;
                }
                if ((count == 0) && (number % i == 0)) largestPrimeFactor = i;
            }
            return largestPrimeFactor;
        }
    }
}
