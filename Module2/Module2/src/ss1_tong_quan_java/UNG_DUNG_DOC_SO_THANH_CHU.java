package ss1_tong_quan_java;

import java.util.Scanner;

public class UNG_DUNG_DOC_SO_THANH_CHU {
    public static void main(String[] args) {
        System.out.println("Nhập số n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n >= 0 && n < 10) {
            switch (n) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }
        } else if (n < 20 && n >= 10) {
            switch (n) {
                case 10:
                    System.out.println("ten");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelve");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
                case 16:
                    System.out.println("sixteen");
                    break;
                case 17:
                    System.out.println("seventeen");
                    break;
                case 18:
                    System.out.println("eighteen");
                    break;
                case 19:
                    System.out.println("nineteen");
                    break;
            }
        } else if (n >= 20 && n < 100) {
            int tens = 0;
            int ones = 0;
            switch (tens) {
                case 2:
                    System.out.println("twenty");
                    break;
                case 3:
                    System.out.println("thirty");
                    break;
                case 4:
                    System.out.println("fourty");
                    break;
                case 5:
                    System.out.println("fifty");
                    break;
                case 6:
                    System.out.println("sixty");
                    break;
                case 7:
                    System.out.println("seventy");
                    break;
                case 8:
                    System.out.println("eighty");
                    break;
                case 9:
                    System.out.println("ninety");
                    break;
            }
            switch (ones) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println(" one");
                    break;
                case 2:
                    System.out.println(" two");
                    break;
                case 3:
                    System.out.println(" three");
                    break;
                case 4:
                    System.out.println(" four");
                    break;
                case 5:
                    System.out.println(" five");
                    break;
                case 6:
                    System.out.println(" six");
                    break;
                case 7:
                    System.out.println(" seven");
                    break;
                case 8:
                    System.out.println(" eight");
                    break;
                case 9:
                    System.out.println(" nine");
            }
        } else {
            System.out.println("out of ability");
        }
    }
}
