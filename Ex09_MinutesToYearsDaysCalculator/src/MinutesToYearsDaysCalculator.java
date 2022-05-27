public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays (long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            long yy = Math.floorDiv(minutes, (60 * 24 * 365));
            long zz = Math.floorDiv(minutes, (60 * 24)) % 365;
            System.out.println(minutes+" min = "+yy+" y and "+zz+" d");
        }
    }
}
