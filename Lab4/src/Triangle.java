public class Triangle {
    private double base;
    private double height;

    public Triangle(double b, double h){
        this.base = b;
        this.height = h;
    }
    public Triangle(){
    }
    public void setBase(double b){
        this.base = b;
    }
    public void setHeight(double h){
        this.height = h;
    }
    public double getArea(){
        double area = 0.5 * base * height;
        return area;
    }
}
