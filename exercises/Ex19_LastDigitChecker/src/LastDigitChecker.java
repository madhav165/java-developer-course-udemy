public class LastDigitChecker {

    public static boolean hasSameLastDigit (int a, int b, int c) {

        if (isValid(a) && isValid(b) && isValid(c)) {
            int lastDigitA = a % 10;
            int lastDigitB = b % 10;
            int lastDigitC = c % 10;

            if ((lastDigitA == lastDigitB) || (lastDigitB == lastDigitC) || (lastDigitC == lastDigitA)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid (int x) {
        return (x >= 10) && (x <= 1000);
    }
}
