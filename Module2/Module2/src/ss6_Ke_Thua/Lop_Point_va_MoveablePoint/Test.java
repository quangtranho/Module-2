package ss6_Ke_Thua.Lop_Point_va_MoveablePoint;

public class Test {
    public static void main(String[] args) {
        MoveablePoint mp = new MoveablePoint(1.0f, 2.0f, 0.5f, 0.5f);
        System.out.println(mp);
        mp.move();
        System.out.println(mp);
    }
}
