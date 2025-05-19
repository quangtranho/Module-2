package ss2_loop;

import java.util.Scanner;

public class HIEN_THI_20_SO_NGUYEN_TO_DAU_TIEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int socaninraSNT = sc.nextInt();
        int countSNT = 0;
        int number = 2;
        while (countSNT < socaninraSNT) {
            int count = 0;
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.println(number + " ");
                countSNT++;
            }
            number++;
        }
    }
}
