public class Main {
    public static void main (String[] args) {

        byte minByteVal = Byte.MIN_VALUE;
        byte maxByteVal = Byte.MAX_VALUE;

        short minShortVal = Short.MIN_VALUE;
        short maxShortVal = Short.MAX_VALUE;

        int minIntegerVal = Integer.MIN_VALUE;
        int maxIntegerVal = Integer.MAX_VALUE;

        long minLongVal = Long.MIN_VALUE;
        long maxLongVal = Long.MAX_VALUE;

        long myLongVal = 1L;

        byte customByteVal = (byte) (maxByteVal / 2);
        short customShortVal = (short) (maxShortVal / 2);
        int customIntegerVal = (maxIntegerVal / 2);
        long customLongVal = (long) (maxLongVal / 2);

        System.out.println(myLongVal);
        System.out.println(customByteVal);
        System.out.println(customShortVal);
        System.out.println(customIntegerVal);
        System.out.println(customLongVal);
    }
}
