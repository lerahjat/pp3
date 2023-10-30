public class Smartphone {
    // Attributes
    public String brand;
    public String model;
    public double screenSize;
    public int batteryCapacity;
    public double price;
    public static void main(String[] args){

        Smartphone s1 = new Smartphone();
        s1.brand = "Apple";
        s1.model = "XR";
        s1.screenSize = 12.5;
        s1.batteryCapacity = 12000;
        s1.price = 2000;


    }
    public void displayMyData() {
        System.out.printf("Brand: %s\nModel: %s\nScreen: %s\nPrice: %d/%d\n",
                this.brand, this.model,
                this.batteryCapacity, this.screenSize,
                this.price);
    }
}