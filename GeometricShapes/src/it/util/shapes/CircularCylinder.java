package it.util.shapes;

public class CircularCylinder implements GeometricShapes{
    private double radius;
    public double height;

    public CircularCylinder(double r, double h){
        this.radius =  r;
        this.height = h;
    }
    @Override
    public double getVolume() {
        double v = Math.PI*Math.pow(this.radius, 2)*this.height;
        return v;
    }

    @Override
    public double getTotalSurfaceArea() {
        double tt = getLateralSurfaceArea() + getTopSurfaceArea() + getBottomSurfaceArea();
        return tt;
    }
    public double getLateralSurfaceArea(){
        double l = 2*Math.PI*this.radius*this.height;
        return l;
    }
    public double getTopSurfaceArea(){
        double t = Math.PI*Math.pow(this.radius, 2);
        return t;
    }
    public double getBottomSurfaceArea(){
        double b = Math.PI*Math.pow(this.radius, 2);
        return b;
    }
    public double getRadius(){
        return this.radius;
    }
    public double getHeight(){
        return this.height;
    }

    public static void main(String[] args) {
        CircularCylinder cc = new CircularCylinder(4, 6);
        System.out.println("Volume = " + cc.getVolume());
        System.out.println("Lateral Surface Area = " + cc.getLateralSurfaceArea());
        System.out.println("Top Surface Area = " + cc.getTopSurfaceArea());
        System.out.println("Bottom Surface Area = " + cc.getBottomSurfaceArea());
        System.out.println("Total Surface Area = " + cc.getTotalSurfaceArea());
    }
}
