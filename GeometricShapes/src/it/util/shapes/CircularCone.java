package it.util.shapes;

public class CircularCone implements GeometricShapes{
    private double radius;
    private double height;

    public CircularCone(double r, double h){
        radius = r;
        height = h;
    }
    @Override
    public double getVolume() {
        return (Math.PI*Math.pow(this.radius, 2)*this.height)/3;
    }

    @Override
    public double getTotalSurfaceArea() {
        return getLateralSurfaceArea() + getBaseSurfaceArea();
    }
    public double getLateralSurfaceArea(){
        return Math.PI*this.radius*Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
    }
    public double getBaseSurfaceArea(){
        return Math.PI*Math.pow(this.radius, 2);
    }
    public double getSlantHeight(){
        return Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
    }
    public double getRadius(){
        return this.radius;
    }
    public double getHeight(){
        return this.height;
    }

    public static void main(String[] args) {
        CircularCone cc = new CircularCone(4, 2);
        System.out.println("Volume = " + cc.getVolume());
        System.out.println("Lateral Surface Area = " + cc.getLateralSurfaceArea());
        System.out.println("Base Surface Area = " + cc.getBaseSurfaceArea());
        System.out.println("Slant Height = " + cc.getSlantHeight());
        System.out.println("Total Surface Area = " + cc.getTotalSurfaceArea());
    }
}
