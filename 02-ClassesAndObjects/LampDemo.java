public class LampDemo {
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp();
        Lamp lamp2 = new Lamp();

        lamp1.switchOn();
        lamp2.switchOff();

        System.out.println("Lamp 1 status:");
        lamp1.displayStatus();
        System.out.println("Lamp 2 status:");
        lamp2.displayStatus();
    }
}
