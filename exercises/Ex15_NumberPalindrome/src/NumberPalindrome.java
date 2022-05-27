public class NumberPalindrome {

    public static boolean isPalindrome (int number) {
        int initNumber = (number < 0) ? -1 * number : number;
        number = initNumber;
        int reverse = 0;
        int lastDigit;
        while (number > 0) {
            lastDigit = number % 10;
            reverse = (reverse * 10) + lastDigit;
            number = number / 10;
        }
        return reverse == initNumber;
    }
}
