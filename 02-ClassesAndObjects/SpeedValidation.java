public class SpeedValidation {
    public static void main(String[] args) {
        final float[] speedLimit = new float[] { 40, 140 };
        float speed = 158;

        System.out.printf(
                "Vehicle speed: %f km/h\nSpeed is %s.\n",
                speed,
                speed >= speedLimit[0] && speed <= speedLimit[1] ? "valid" : "invalid");
    }
}