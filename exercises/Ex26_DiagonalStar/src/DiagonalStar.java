public class DiagonalStar {

    public static void printSquareStar (int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int i = 0; i < number; i++) {
                String row = "";
                for (int j = 0; j < number; j++) {
                    if ((i == j) || (i + j == number - 1) || (i == 0) || (j == 0) || (i == number - 1) || (j == number - 1)) {
                        row += "*";
                    } else {
                        row += " ";
                    }
                }
                System.out.println(row);
            }
        }
    }
}
