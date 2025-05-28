package ss6_Ke_Thua.Lop_Point2D_Va_Lop_Point3D;

public class Test  {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        float[] xy1 = p1.getXY();
        System.out.println("p1.getX()=" + p1.getX());
        System.out.println("p1.getY()=" + p1.getY());
        System.out.println("p1.getXY()=" + xy1[0] + ", " + xy1[1]);
        System.out.println(p1.toString());
        Point2D p2 = new Point2D(3.0f,5.0f);
        System.out.println(p2.toString());
        Point3D p3 = new Point3D();
        System.out.println(p3.toString());
        Point3D p4 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println(p4.toString());
    }
}
