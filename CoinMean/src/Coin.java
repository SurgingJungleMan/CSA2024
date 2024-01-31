import java.util.concurrent.ThreadLocalRandom;

public class Coin {

    // took some inspiration
    private final int TAILS = 1;
    private final int HEADS = 2;

    // I make this private just incase
    // they want to get the value without the
    // Method

    public String face = "";

    public Coin(){
        flip();
    }

    public int getFlip() {
        // get if it's either 1 or 2, meaning heads or tails
        // math.random returns 0.00 - 1.00...

        /*


        int value = 1;
        if (Math.random() > 0.5){
            value = 2;
        }

         */

        /*

        I wanted to try this
        stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java

         */

        return ThreadLocalRandom.current().nextInt(TAILS, HEADS + 1);
    }

    // returns
    public String getFace(){
        return  face;
    }

    public void flip(){
        int coinValue = getFlip();
        // System.out.println(coinValue);

        // check
        if (coinValue == TAILS){
            face = "TAILS";
        }else if (coinValue == HEADS){
            face = "HEADS";
        }
    }


}
