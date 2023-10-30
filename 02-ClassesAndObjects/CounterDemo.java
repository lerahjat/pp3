public class CounterDemo {
    public static void main(String[] args){
        Counter29 counter1 = new Counter29();
        Counter29 counter2 = new Counter29();
        counter1.plus10();
        counter1.plus10();
        counter1.plus();
        counter1.plus();
        counter1.plus();

        // Set the value for the second counter to -47
        counter2.minus10();
        counter2.minus10();
        counter2.minus10();
        counter2.minus10();
        counter2.minus();
        counter2.minus();
        counter2.minus();
        counter2.minus();
        counter2.minus();
        counter2.minus();
        counter2.minus();

        // Display the results
        System.out.println("Counter 1 Value: " + counter1.getValue()); // Should be 23
        System.out.println("Counter 2 Value: " + counter2.getValue()); // Should be -47
    }
}
