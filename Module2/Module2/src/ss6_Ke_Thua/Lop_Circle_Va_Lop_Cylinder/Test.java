package ss6_Ke_Thua.Lop_Circle_Va_Lop_Cylinder;

public class Test {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(4.0);
        c.setColor("blue");
        System.out.println(c.getAreaCircle()+" "+c.getColor());
        Cylinder c2 = new Cylinder();
        c2.setRadius(5.0);
        c2.setHeight(1.0);
        c2.setColor("red");
        System.out.println(c2.getAreaCylinder()+" "+c2.getColor());
    }
}
