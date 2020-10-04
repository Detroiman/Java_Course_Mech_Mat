import java.util.Scanner;
import java.lang.Math;
class Point{
    double v, w, vx, vy, vz, x0, x, y0, y, z0, z, t;

    public void setX0(double x0) {
        this.x0 = x0;
    }

    public double getX0() {
        return x0;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY0(double y0) {
        this.y0 = y0;
    }

    public double getY0() {
        return y0;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ0(double z0) {
        this.z0 = z0;
    }

    public double getZ0() {
        return z0;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getT() {
        return t;
    }

    public double getV() {
        return v;
    }

    public void setVx() {
        this.vx = (this.x - this.x0)/this.t;
    }

    public void setVy() {
        this.vy = (this.y - this.y0)/this.t;
    }

    public void setVz() {
        this.vz = (this.z - this.z0)/this.t;
    }

    public void setV() {
        setVx();
        setVy();
        setVz();
        this.v = Math.sqrt(this.vx * this.vx + this.vy*this.vy + this.vz*this.vz);
    }

    public void setW() {
        this.w = this.v / this.t;
    }

}

public class Ex2_6 {
    public static void main(String[] args) {
        Point p = new Point();
        Scanner number = new Scanner(System.in);
        System.out.println("Enter x0, y0, z0, x, y, z, t: ");
        System.out.print("x0: ");
        p.setX0(number.nextDouble());
        System.out.print("y0: ");
        p.setY0(number.nextDouble());
        System.out.print("z0: ");
        p.setZ0(number.nextDouble());
        System.out.print("x: ");
        p.setX(number.nextDouble());
        System.out.print("y: ");
        p.setY(number.nextDouble());
        System.out.print("z: ");
        p.setZ(number.nextDouble());
        System.out.print("t: ");
        p.setT(number.nextDouble());
        p.setV();
        p.setW();
        System.out.println("V: " + p.v );
        System.out.println("W: " + p.w );
        Point p1 = new Point();
        System.out.println("Enter x10, y10, z10, x1, y1, z1, t1: ");
        System.out.print("x10: ");
        p.setX0(number.nextDouble());
        System.out.print("y10: ");
        p.setY0(number.nextDouble());
        System.out.print("z10: ");
        p.setZ0(number.nextDouble());
        System.out.print("x1: ");
        p.setX(number.nextDouble());
        System.out.print("y1: ");
        p.setY(number.nextDouble());
        System.out.print("z1: ");
        p.setZ(number.nextDouble());
        System.out.print("t1: ");
        p.setT(number.nextDouble());
        p.setV();
        p.setW();
        System.out.println("V1: " + p.v );
        System.out.println("W1: " + p.w );
        System.out.println("Enter new T: ");
        double tt = number.nextDouble(), distance;
        p.setT(tt);
        p1.setT(tt);
        p.setX(p.x + p.v * p.t + 0.5 * p.w * p.t * p.t);
        p.setY(p.y + p.v * p.t + 0.5 * p.w * p.t * p.t);
        p.setZ(p.z + p.v * p.t + 0.5 * p.w * p.t * p.t);
        p1.setX(p1.x + p1.v * p1.t + 0.5 * p1.w * p1.t * p1.t);
        p1.setY(p1.y + p1.v * p1.t + 0.5 * p1.w * p1.t * p1.t);
        p1.setZ(p1.z + p1.v * p1.t + 0.5 * p1.w * p1.t * p1.t);
        distance = Math.sqrt((p1.x - p.x) * (p1.x - p.x) + (p1.y - p.y) * (p1.y - p.y) + (p1.z - p.z) * (p1.z - p.z));
        System.out.println("Distance with 2 points is: " + distance);
    }
}
