public class Main {

    public static void main (String[] args) {

        SimpleCalculator sc = new SimpleCalculator();
        sc.setFirstNumber(3);
        sc.setSecondNumber(2);
        System.out.println("First number = "+sc.getFirstNumber());
        System.out.println("Second number = "+sc.getSecondNumber());
        System.out.println("Addition = "+sc.getAdditionResult());
        System.out.println("Subtraction = "+sc.getSubtractionResult());
        System.out.println("Multiplication = "+sc.getMultiplicationResult());
        System.out.println("Division = "+sc.getDivisionResult());
    }
}
