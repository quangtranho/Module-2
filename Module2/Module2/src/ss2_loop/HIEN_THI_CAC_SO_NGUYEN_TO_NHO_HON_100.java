package ss2_loop;

public class HIEN_THI_CAC_SO_NGUYEN_TO_NHO_HON_100 {
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
