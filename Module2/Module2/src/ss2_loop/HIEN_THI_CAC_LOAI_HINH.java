package ss2_loop;

import java.util.Scanner;

public class HIEN_THI_CAC_LOAI_HINH {
    public static void main(String[] args) {
        System.out.println("Menu:\n" +
                "\n" +
                "1.Print the rectangle\n" +
                "\n" +
                "2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)\n" +
                "\n" +
                "3.Print isosceles triangle\n" +
                "\n" +
                "4.Exit");
        Scanner n = new Scanner(System.in);
        int a = n.nextInt();
        switch (a) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 7; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                System.out.println("The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right\n" +
                        "1.Top-left\n" +
                        "2.Top-right\n" +
                        "3.Boton-left\n" +
                        "4.Boton-right");
                int b = n.nextInt();
                switch (b) {
                    case 1:
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j < i; j++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }
                        break;
                    case 2:
                        for (int i = 1; i <= 5; i++) {
                            for (int j = 1; j <= i; j++) {
                                System.out.print(" ");
                            }
                            for (int j = 1; j <= 5 - i; j++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }
                        break;
                    case 3:
                        for (int i = 7; i >= 1; i--) {
                            for (int j = 1; j < i; j++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }
                        break;
                    case 4:
                        for (int i = 7; i >= 1; i--) {
                            for (int j = 1; j < i; j++) {
                                System.out.print(" ");
                            }
                            for (int j = 1; j < 7 - i; j++) {
                                System.out.print("*");
                            }
                            System.out.println(" ");
                        }
                        break;

                }
                break;
            case 3:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                break;
            case 4:
                break;
        }

    }
}
