package ss3_array_va_method;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hàng mảng 2 chiều ");
        int c = sc.nextInt();
        System.out.println("Nhập số cột mảng 2 chiều");
        int r = sc.nextInt();
        double[][] matrix = new double[c][r];
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.println("Nhập hàng thứ " + (i + 1) + " cột thứ " + (j + 1));
                matrix[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Hiển thị mảng 2 chiều ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        double max = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (max < matrix[i][j]) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Số lớn nhất trong mảng 2 chiều là " + max);
    }
}
