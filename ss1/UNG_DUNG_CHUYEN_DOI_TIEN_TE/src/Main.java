import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Mời bạn nhập số tiền USD: ");
        Scanner sc = new Scanner(System.in);
        double USD1 = sc.nextDouble();
        double USD2 = USD1*23000;
        System.out.println("Giá trị VND: "+USD2);
    }
}