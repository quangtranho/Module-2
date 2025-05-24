package ss3_array_va_method;

import java.util.Scanner;

public class XoaPhanTuKhoaiMang {
    public static void main(String[] args) {
        int[] n = {10, 4, 6, 7, 8, 6, 0};
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println("\nNhập phần tử cần xóa khỏi mảng ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int index_del = -1;
        for (int i = 0; i < n.length; i++) {
            if (n[i] == x) {
                index_del = i;
                break;
            }
        }
        System.out.println(index_del);
        if (index_del == -1) {
            System.out.println("Không tìm thấy phần tử xuất hiện trong mảng ");
        } else {
            for (int i = index_del; i < n.length - 1; i++) {
                n[i] = n[i + 1];
            }
        }
        System.out.println("Mảng sau khi xóa phần tử " + x + ":");
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }
}
