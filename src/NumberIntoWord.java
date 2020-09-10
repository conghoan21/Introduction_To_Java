import java.util.Scanner;

public class NumberIntoWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number wanna read");

        int number = sc.nextInt();
        String numberIntoWord = "";
        if (number == 0) {
            numberIntoWord = "Zero";
        } else if (number < 10) {
            numberIntoWord = Unit(number);
        } else if (number < 20) {
            numberIntoWord = Tens(number);
        } else if (number < 100) {
            numberIntoWord = Dozens(number);
        } else if (number < 1000) {
            numberIntoWord = Hundreds(number);
            int a = (int) Math.floor((double) number / 100);
            int b = number - a * 100;
            numberIntoWord = numberIntoWord + Hundreds(a);
            if (b < 10) {
                numberIntoWord = numberIntoWord + "and " + Unit(b);
            } else if (b < 20) {
                numberIntoWord = numberIntoWord + "and " + Tens(b);
            } else {
                numberIntoWord = numberIntoWord + "and " + TwoDigits(b);
            }
        }
        System.out.println("This number is: " + numberIntoWord);
        }


    public static String Unit(int number) {
        String numberIntoWord = "";
        switch (number) {
            case 1:
                numberIntoWord = "one";
                break;
            case 2:
                numberIntoWord = "two";
                break;
            case 3:
                numberIntoWord = "three";
                break;
            case 4:
                numberIntoWord = "four";
                break;
            case 5:
                numberIntoWord = "five";
                break;
            case 6:
                numberIntoWord = "six";
                break;
            case 7:
                numberIntoWord = "seven";
                break;
            case 8:
                numberIntoWord = "eight";
                break;
            case 9:
                numberIntoWord = "nine";
                break;
            default:
                numberIntoWord = "";
        }
        return numberIntoWord;
    }

    public static String Tens(int number) {
        String numberIntoWord = "";
        switch (number) {
            case 10:
                numberIntoWord = "ten";
                break;
            case 11:
                numberIntoWord = "eleven";
                break;
            case 12:
                numberIntoWord = "twelve";
                break;
            case 13:
                numberIntoWord = "third teen";
                break;
            case 14:
                numberIntoWord = "four teen";
                break;
            case 15:
                numberIntoWord = "fif teen";
                break;
            case 16:
                numberIntoWord = "six teen";
                break;
            case 17:
                numberIntoWord = "seven teen";
                break;
            case 18:
                numberIntoWord = "eight teen";
                break;
            case 19:
                numberIntoWord = "nine teen";
                break;
        }
        return numberIntoWord;
    }

    public static String Dozens(int number) {
        String numberIntoWord = "";
        switch (number) {
            case 20:
                numberIntoWord = "twenty";
                break;
            case 30:
                numberIntoWord = "thirty";
                break;
            case 40:
                numberIntoWord = "forty";
                break;
            case 50:
                numberIntoWord = "fifty";
                break;
            case 60:
                numberIntoWord = "sixty";
                break;
            case 70:
                numberIntoWord = "seventy";
                break;
            case 80:
                numberIntoWord = "eighty";
                break;
            case 90:
                numberIntoWord = "ninety";
                break;
        }
        return numberIntoWord;
    }

    public static String Hundreds(int number) {
        String numberIntoWord = "";
        switch (number) {
            case 1:
                numberIntoWord = "One hundred";
                break;
            case 2:
                numberIntoWord = "Two hundred";
                break;
            case 3:
                numberIntoWord = "Three hundred";
                break;
            case 4:
                numberIntoWord = "Four hundred";
                break;
            case 5:
                numberIntoWord = "Five hundred";
                break;
            case 6:
                numberIntoWord = "Six hundred";
                break;
            case 7:
                numberIntoWord = "Seven hundred";
                break;
            case 8:
                numberIntoWord = "Eight hundred";
                break;
            case 9:
                numberIntoWord = "Nine hundred";
                break;
        }
        return numberIntoWord;
    }

    public static String TwoDigits(int number) {
        String numberIntoWord = "";
        int a = (int) Math.floor((double) number / 10);
        int b = number - a * 10;
        numberIntoWord = Dozens(a)+Unit(b);
        return numberIntoWord;
    }
}

