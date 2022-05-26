public class Main {
    public static void main(String[] args) {
        boolean ly = LeapYear.isLeapYear(-1600);
        System.out.println(ly);

        ly = LeapYear.isLeapYear(1600);
        System.out.println(ly);

        ly = LeapYear.isLeapYear(2017);
        System.out.println(ly);

        ly = LeapYear.isLeapYear(2000);
        System.out.println(ly);
    }
}
