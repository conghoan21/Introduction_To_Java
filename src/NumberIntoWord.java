import java.util.Scanner;

public class NumberIntoWord {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number wanna read");

        int number = sc.nextInt();
        String numberIntoWord;
        switch (number){
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
        if (numberIntoWord !="") System.out.println("The number is ", number, numberIntoWord);
        else System.out.println("out of ability!");
    }
}
