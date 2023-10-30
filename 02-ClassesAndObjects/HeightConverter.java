public class HeightConverter {
    static float[] convert(float centimeters) {
        return new float[] {
                0.3937f * centimeters,
                0.0328f * centimeters
        };
    }

    public static void main(String[] args) {
        float cm = 170;
        float[] ftInches = convert(cm);

        System.out.printf(
                "%d cm tall, so %f feet tall.\n",
                Math.round(cm),
                ftInches[1]);
    }
}