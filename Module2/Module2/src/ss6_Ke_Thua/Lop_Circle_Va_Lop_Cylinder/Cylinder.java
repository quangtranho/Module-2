package ss6_Ke_Thua.Lop_Circle_Va_Lop_Cylinder;

public class Cylinder {
    public double radius;
    public String color;
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getAreaCylinder() {
        return 2*Math.PI*radius*height;
    }

}
