public class SharedDigit {

    public static boolean hasSharedDigit (int a, int b) {
        if ((a >= 10) && (a <= 99) && (b >= 10) && (b <= 99)) {
            int init_a = a;
            int digit_a;
            int digit_b;
            while (b > 0) {
                digit_b = b % 10;
                while (a > 0) {
                    digit_a = a % 10;
                    a /= 10;
                    if (digit_a == digit_b) {
                        return true;
                    }
                }
                b /= 10;
                a = init_a;
            }
        }
        return false;
    }
}
