package class3D;
import class2D.Point2D;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), getZ()};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                " x= " + getX() +
                ", Y= " + getY() +
                ", z= " + z + ", Array: " +
                Arrays.toString(getXYZ()) +
                '}';
    }
}
