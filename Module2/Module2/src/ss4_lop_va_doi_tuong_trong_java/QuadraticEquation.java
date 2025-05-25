package ss4_lop_va_doi_tuong_trong_java;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant() {
        return Math.pow(b,2)-4*a*c;
    }
    public double getRoot() {
        return (-b)/(2*a);
    }
    public double getRoot1() {
        double delta = getDiscriminant();
        return (-b + Math.sqrt(delta)) / (2 * a);
    }
    public double getRoot2() {
        double delta = getDiscriminant();
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
    public void result(){
        double delta = getDiscriminant();
        if(delta>0){
            System.out.println("The equation has two roots "+getRoot1()+" and "+getRoot2());
        } else if (delta==0) {
            System.out.println("The equation has one roots "+getRoot());
        }else {
            System.out.println("The equation has no real roots ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter a, b, c: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        QuadraticEquation result = new QuadraticEquation(a, b, c);
        result.result();
    }
}