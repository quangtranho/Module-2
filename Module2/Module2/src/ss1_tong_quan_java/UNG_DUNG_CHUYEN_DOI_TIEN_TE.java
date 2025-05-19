package ss1_tong_quan_java;

import java.util.Scanner;

public class UNG_DUNG_CHUYEN_DOI_TIEN_TE {
    public static void main(String[] args) {
        System.out.print("Mời bạn nhập số tiền USD: ");
        Scanner sc = new Scanner(System.in);
        double USD1 = sc.nextDouble();
        double USD2 = USD1 * 23000;
        System.out.println("Giá trị VND: " + USD2);
    }
}
