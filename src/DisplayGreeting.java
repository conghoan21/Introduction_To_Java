import java.util.Scanner;

public class DisplayGreeting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // Khai báo đối tượng "sc"
        System.out.println("Enter the name"); // Nhập tên người
        String name = sc.nextLine(); //Lấy dòng ở trên
        System.out.println("Hello: " + name);
    }
}
