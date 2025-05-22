package ss3_array_va_method;

import java.util.Scanner;

public class TIM_GIA_TRI_NHO_NHAT_TRONG_MANG {
    public static void main(String[] args) {
        System.out.println("Nhập số phần tử trong mảng ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhập phần tử thứ "+(i+1));
            arr[i]=sc.nextInt();
        }
        System.out.println("\nHiển thị mảng ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int phanTuNhoNhat= arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(phanTuNhoNhat>arr[i]){
                phanTuNhoNhat=arr[i];
            }
        }
        System.out.println("\nGiá trị nhỏ nhất là "+phanTuNhoNhat);
    }
}
