// คลาส Abstract ส าหรับ Shape
public abstract class Shape {

    private String type; // ตัวแปร private ส าหรับประเภทของรูปทรง

    public Shape(String type) {

        this.type = type;

    }

    // เมธอด abstract ส าหรับการวาดรูปทรง
    public abstract void draw();



    public abstract double area();

    public String getType() {

        return type; // คืนค่าประเภทของรูปทรง

    }

}