package ss5_Access_modifier;

public class Circle {
    private double radius;
    private String color;
    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.getArea());
        Circle circle2 = new Circle(4.0);
        System.out.println(circle2.getArea());
    }
}
