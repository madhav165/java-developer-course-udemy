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

        byte myByteVal = 4;
        short myShortVal = 12000;
        int myIntegerVal = 45000;
        myLongVal = (long) (50000 + 10 * (myByteVal + myShortVal + myIntegerVal));
        System.out.println("Byte = "+myByteVal+", Short = "
                +myShortVal+", Integer = "+myIntegerVal+")");
        System.out.println("Long = 50000+ 10 * ("
                +myByteVal+" + "+myShortVal+" + "
                +myIntegerVal+") = "+myLongVal);

        System.out.println('\u20b9');

        boolean isMyVariable = true;
        System.out.println(isMyVariable);

        String myCity = "Bengaluru";
        System.out.println(myCity);
    }
}
