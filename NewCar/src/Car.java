public class Car {
    private String make;
    private String model;

    // probably should make interchangable
    private double curFuel = 100;
    private double maxFuel = 100;
    private double health = 100;
    private double efficiency;


    public Car(String make, String model, double newEfficiency){
        make = make;
        model = model;
        efficiency = newEfficiency;
    }

    public void drive(int miles){

        // i need to drive 5 miles while
        // the more efficient a car is the more health is degraded
        // why? for gameplay
        double checkFuel = curFuel - ((miles/efficiency) * miles);
        if (checkFuel >= 0) {
            curFuel -= Math.round((miles/efficiency) * miles);
            health -= efficiency/25;
            System.out.println("Sucessfully made it!");
        }else{
            System.out.println("Couldn't make it sadly.");
        }

    }

    public void refuel(){
        curFuel = 100;
    }

    public double getFuel(){
        return  curFuel;
    }

    public double getHealth(){
        return  health;
    }



}
