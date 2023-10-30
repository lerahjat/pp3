public class EuroSpreadCalculator23 {
    public static void main(String[] args) {
        // Define the buying and selling rates of Euro
        double buyingRate = 4.5940;
        double sellingRate = 4.6250;

        // Calculate the spread
        double spread = sellingRate - buyingRate;

        // Display the results with 4 decimal places using printf
        System.out.printf("Bank buys EUR: %.4f%n", buyingRate);
        System.out.printf("Bank sells EUR: %.4f%n", sellingRate);
        System.out.printf("Spread: %.4f%n", spread);
    }
}