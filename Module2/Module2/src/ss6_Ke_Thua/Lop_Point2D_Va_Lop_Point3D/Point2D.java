package ss6_Ke_Thua.Lop_Point2D_Va_Lop_Point3D;

public class Point2D {
    private float x =0.0f;
    private float y =0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public Point2D(){}

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
       return new float[] {x,y};
    }
    @Override
    public String toString() {
        return "Point2D x=" + x + ", y=" + y ;
    }
}
