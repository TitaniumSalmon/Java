import java.util.Scanner;
public class TestTriangle {
    public static void main(String[] args) {
        double b,h;
        Scanner input = new Scanner(System.in);
        System.out.print("Size of Base: ");
        b = input.nextDouble();
        System.out.print("Size of Height: ");
        h = input.nextDouble();
        Triangle triangle = new Triangle(b, h);
        double area = triangle.getArea();
        System.out.println("Triangle (base = "+b+", height = "+h+")");
        System.out.println("Area = "+area);

    }
}
