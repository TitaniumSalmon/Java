public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public void displayInfo() {
        System.out.println("Circle (radius: " + radius + "), area: " + getArea());
    }
}
