public class Main {
    public static void main(String[] args) {
        double kmph = 95.75;
        long mph = SpeedConverter.toMilesPerHour(kmph);
        System.out.println(mph);
        SpeedConverter.printConversion(kmph);
    }
}
