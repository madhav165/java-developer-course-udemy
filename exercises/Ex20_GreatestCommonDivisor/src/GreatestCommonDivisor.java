public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second) {
        if ((first >= 10) && (second >= 10)) {
            int max_d =  Math.min(first, second);
            int gcd = 1;
            for (int i = 1; i <= max_d; i++) {
                if ((first %i ==0) && (second % i == 0)) gcd = i;
            }
            return gcd;
        }
        return -1;
    }
}
