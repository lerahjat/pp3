public class Counter29 {
    public int value;

    public Counter29(){
        value = 0;
    }

    public void plus(){
        value++;
    }

    public void minus(){
        value--;
    }

    public void plus10(){
        value +=10;
    }
     public void minus10(){
        value -=10;
    }

    public void reset(){
        value = 0;
    }

    public int getValue(){
        return value;
    }
}

