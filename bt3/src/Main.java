public class Main {
    public static void main(String[] args) {
        Point point = new Point(9.9f,7.0f);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint(point.getX(), point.getY(),1.1f,3.8f);
        System.out.println(moveablePoint);
        System.out.println(moveablePoint.move());
    }
}