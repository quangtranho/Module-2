package ss3_array_va_method;

import java.util.Scanner;

public class XOA_PHAN_TU_KHOI_MANG {
    public static void main(String[] args) {
        int[] n = {10, 4, 6, 7, 8, 6};
        System.out.println("Hiển thị các phần tử trong mảng");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println("\nBạn muốn xóa phần từ nào ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int index_del = -1;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == x) {
                index_del = i;
                break;
            }
        }
        if (index_del == -1) {
            System.out.println("Không có phần tử cần xóa");
        } else {
            for (int i = index_del; i < n.length - 1; i++) {
                n[i] = n[i + 1];
            }
            n[n.length - 1] = 0;
            for (int i = 0; i < n.length; i++) {
                System.out.print(n[i] + " ");
            }
        }
    }
}
