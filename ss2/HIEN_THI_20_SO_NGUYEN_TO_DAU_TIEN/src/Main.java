import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int socaninraSNT = sc.nextInt();
        int countSNT=0;
        int number=2;
        while (countSNT < socaninraSNT) {
            int count=0;
            for (int i=1;i<=number;i++) {
                if (number%i==0){
                    count+=1;
                }
            }
            if (count==2) {
                System.out.println(number+" ");
                countSNT++;
            }
            number++;
        }
    }
}