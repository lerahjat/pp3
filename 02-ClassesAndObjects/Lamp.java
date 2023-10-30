public class Lamp {
    public boolean isOn;

    public Lamp(){
        isOn = false;
    }
    public void switchOn(){
        isOn = true;
    }
    public void switchOff(){
        isOn = false;
    }

    public void displayStatus(){
        String status = isOn ? "Lamp is on." : "Lamp is off.";
        System.out.println(status);

    }
}
