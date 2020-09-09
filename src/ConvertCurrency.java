import java.util.Scanner;

public class ConvertCurrency {
    public static void main(String[] args){
        double vnd = 23000;
        double usd ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter USD: ");
        usd = sc.nextDouble();
        double convert = usd * 23000;
        System.out.println("VND is :" + convert);
    }
}
