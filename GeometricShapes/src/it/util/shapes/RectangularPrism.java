package it.util.shapes;

public class RectangularPrism implements GeometricShapes{
    private double width;
    private double height;
    private double lenght;
    public RectangularPrism(double w, double h, double l){
        width = w;
        height = h;
        lenght = l;
    }
    @Override
    public double getVolume() {
        return lenght * width * height;
    }

    @Override
    public double getTotalSurfaceArea() {
        return 2*(lenght*width + lenght*height + width*height);
    }
    public double getDiagonal(){
        return Math.sqrt((Math.pow(lenght, 2)) + (Math.pow(width, 2)) + (Math.pow(height, 2)));
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getLenght() {
        return lenght;
    }

    public static void main(String[] args) {
        RectangularPrism cc = new RectangularPrism(4, 5, 2);
        System.out.println("Volume = " + cc.getVolume());
        System.out.println("Diagonal = " + cc.getDiagonal());
        System.out.println("Total Surface Area = " + cc.getTotalSurfaceArea());
    }
}
