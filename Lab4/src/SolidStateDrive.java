public class SolidStateDrive {
    String brand;
    String capacity;
    String interfaceType;
    int DRAM;
    String model;

    public void setInformations(String brand, String capacity, String interfaceType, int dram, String model){
        this.brand = brand;
        this.capacity = capacity;
        this.model = model;
        DRAM = dram;
        this.interfaceType = interfaceType;
    }

    public static void main(String[] args) {
        SolidStateDrive SSD1 = new SolidStateDrive();
        SSD1.setInformations("Samsung","1TB","PCIe 4.0 x4", 1024, "Samsung 980 PRO");
        System.out.println("SSD brand: " + SSD1.brand);
    }
}
