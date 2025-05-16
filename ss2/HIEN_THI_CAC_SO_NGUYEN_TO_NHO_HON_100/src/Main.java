import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int SNT = 0;
        int numbers = 1;
        while (numbers <= 100) {
            int count = 0;
            for (int i = 1; i <= numbers; i++) {
                if (numbers % i == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.println(numbers + " ");
            }
            numbers++;
        }
    }
}