package ss3_array_va_method;

import java.util.Scanner;

public class THEM_PHAN_TU_VAO_MANG {
    public static void main(String[] args) {
        int[] n = {10, 4, 6, 7, 8,0};
        System.out.println("Hiển thị các phần tử trong mảng:");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("\nNhập số cần chèn:");
        int x = sc.nextInt();
        System.out.println("Nhập vào vị trí index cần chèn vào:");
        int index = sc.nextInt();
        if (index < 0 || index > n.length) {
            System.out.println("Không chèn được phần tử vào mảng. Vị trí không hợp lệ.");
        } else {
            int[] newArray = new int[n.length + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = n[i];
            }
            newArray[index] = x;
            for (int i = index; i < n.length; i++) {
                newArray[i + 1] = n[i];
            }
            System.out.println("Mảng sau khi chèn:");
            for (int i = 0; i < newArray.length; i++) {
                System.out.print(newArray[i] + " ");
            }
        }
    }
}
