package ss6_Ke_Thua.Lop_Point_va_MoveablePoint;

import ss6_Ke_Thua.Lop_Point2D_Va_Lop_Point3D.Point3D;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;
    MoveablePoint(float x, float y,float xSpeed,float ySpeed) {
        setX(x);
        setY(y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MoveablePoint() {}

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        return new float[]{xSpeed,ySpeed};
    }
    public MoveablePoint move() {
        this.x += xSpeed;
        this.y += ySpeed;
        return this;
    }
    @Override
    public String toString() {
        return "Point" + "x=" + getX() + ", y= " + getY()+",Speed=(" + getxSpeed()+","+getySpeed()+")" ;
    }

}
