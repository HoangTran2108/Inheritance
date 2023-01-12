package test;

import class2D.Point2D;
import class3D.Point3D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3.0f,4.5f);
        System.out.println(point2D);

        Point3D point3D = new Point3D(3.0f,4.5f,6.0f);
        System.out.println(point3D);
    }
}