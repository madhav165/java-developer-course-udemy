public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double firstNum, double secondNum) {
        return ((long)(firstNum * 1000) == (long)(secondNum * 1000));
    }
}
