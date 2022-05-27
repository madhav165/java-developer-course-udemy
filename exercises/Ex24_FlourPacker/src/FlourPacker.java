public class FlourPacker {

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) return false;
        if ((bigCount == 0) && (goal <= smallCount)) {
            return true;
        } else if ((bigCount != 0) && (goal <= 5 * bigCount + smallCount) && ((goal % (5 * bigCount)) % 5 <= smallCount)) {
            return true;
        }
        else {
            return false;
        }
    }
}
