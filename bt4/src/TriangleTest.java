import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a side1: ");
        double a = scanner.nextDouble();
        System.out.println("Enter a side1: ");
        double b = scanner.nextDouble();
        System.out.println("Enter a side1: ");
        double c = scanner.nextDouble();
        System.out.println("Enter color: ");

        Triangle triangle = new Triangle(a,b,c);
        System.out.println(triangle);

    }
}
