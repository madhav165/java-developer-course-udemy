public class NumberToWords {

    public static void numberToWords (int number) {
        if (number > 0) {
            int reverse = reverse(number);
            int numberDigitCount = getDigitCount(number);
            int reverseDigitCount = getDigitCount(reverse);
            int digit = 0;
            String wordString = "";
            while (reverse > 0) {
                digit = reverse % 10;
                String digitString = "";
                switch (digit) {
                    case 0:
                        digitString = "Zero";
                        break;
                    case 1:
                        digitString = "One";
                        break;
                    case 2:
                        digitString = "Two";
                        break;
                    case 3:
                        digitString = "Three";
                        break;
                    case 4:
                        digitString = "Four";
                        break;
                    case 5:
                        digitString = "Five";
                        break;
                    case 6:
                        digitString = "Six";
                        break;
                    case 7:
                        digitString = "Seven";
                        break;
                    case 8:
                        digitString = "Eight";
                        break;
                    case 9:
                        digitString = "Nine";
                        break;
                };
                if (wordString != "") {
                    wordString += (" " + digitString);
                } else {
                    wordString += digitString;
                }
                reverse /= 10;
            }
            for (int i = 0; i < numberDigitCount - reverseDigitCount; i++) {
                wordString += " Zero";
            }
            System.out.println(wordString);

        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            System.out.println("Invalid Value");
        }
    }

    public static int reverse (int number) {
        boolean sign = (number >= 0);
        int posNumber = sign ? number : -1 * number;
        int reverse = 0;
        int digit;
        while (posNumber > 0) {
            digit = posNumber % 10;
            reverse = (10 * reverse) + digit;
            posNumber /= 10;
        }
        reverse = sign ? reverse : -1 * reverse;
        return reverse;
    }

    public static int getDigitCount (int number) {
        if (number > 0) {
            int count = 0;
            while (number > 0) {
                count += 1;
                number /= 10;
            }
            return count;
        } else if (number == 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
