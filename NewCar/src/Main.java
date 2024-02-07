import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    static Scanner sc = new Scanner(System.in);

    public static Car build(){
        System.out.println("What is the make of your car?");
        String make = sc.nextLine();

        System.out.println("What is the model of your car?");
        String model = sc.nextLine();

        System.out.println("What is the efficiency of your car?");
        double newEff = sc.nextDouble();

        // https://stackoverflow.com/questions/13102045/scanner-is-skipping-nextline-after-using-next-or-nextfoo
        sc.nextLine();

        return new Car(make, model, newEff);
    }


    public static void main(String[] args) {

        // https://www.geeksforgeeks.org/how-to-create-array-of-objects-in-java/
        Car[] inventory = {
                new Car("Toyota", "IDK", 12),
                new Car("Mazda", "IDK", 32),
                new Car("Lamborghini", "IDK", 45)
        };

        for (int i = 0; i < 3; i++) {
            // Do something
            System.out.println("Testing if your car can drive 25 miles.");
            inventory[i].drive(25);
            System.out.println("Checking your car's health");
            System.out.println(inventory[i].getFuel() + " : gallons left.");
            System.out.println(inventory[i].getHealth() + " : health left.");
            System.out.println("Refilling car fuel...");
            inventory[i].refuel();
            System.out.println(inventory[i].getFuel() + " : gallons left.");
            System.out.println();
        }

    }
}