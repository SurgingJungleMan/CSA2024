import java.util.Objects;
import java.util.Scanner;

/*

Tien V. Doan
Period 2, AP CSA


Coin flipping program. Multiple classes.

 */
public class Main {
    static Scanner sc = new Scanner(System.in);


    // Main methodology
    // Loop through x amount of times
    // Flip each loop
    // Find how the percentages
    static void Games(int amount){
        Coin BLESSED = new Coin();

        double HEADS = 0;
        double TAILS = 0;

        for (int i = 1; i <= amount; i++){
            BLESSED.flip();


            //
            if (Objects.equals(BLESSED.getFace(), "TAILS")
                    || Objects.equals(BLESSED.face, "TAILS")){

                HEADS++;
            }else if (Objects.equals(BLESSED.getFace(), "HEADS")
                    || Objects.equals(BLESSED.face, "HEADS")){


                TAILS++;
            }
        }


        TAILS = Math.round((TAILS/amount) * 100);
        HEADS = Math.round((HEADS/amount) * 100);

        System.out.println(HEADS + "%" + " Heads");
        System.out.println(TAILS + "%" + " Tails");
    }


    public static void main(String[] args) {
        System.out.println("How many times would you like to play?");
        int gamesAmount = sc.nextInt();


        for (int i = 1; i <= gamesAmount; i++){
            Games(10);
            System.out.println();
        }

    }
}