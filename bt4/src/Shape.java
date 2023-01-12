import java.util.Scanner;

public class Shape {
    Scanner scanner = new Scanner(System.in);
    String color = scanner.nextLine();

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "A Shape with color of "
                + getColor();
    }
}