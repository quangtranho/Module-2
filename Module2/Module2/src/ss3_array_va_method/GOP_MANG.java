package ss3_array_va_method;

import java.util.Scanner;

public class GOP_MANG {
    public static void main(String[] args) {
        System.out.println("Nhập mảng 1 bao nhiêu phần tử ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Nhập các phần tử của mảng 1");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Nhập mảng 2 bao nhiêu phần tử ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Nhập các phần tử của mảng 2");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3=new int[arr1.length+arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length+i] = arr2[i];
        }
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
