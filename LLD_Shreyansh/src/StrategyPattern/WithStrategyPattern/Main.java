package src.StrategyPattern.WithStrategyPattern;

public class Main {

    public static void main(String args[]) {
        // Vehicle vehicle = new SportVehicle();
        // vehicle.drive();

        Vehicle vehicle = new GoodVehicle();
        vehicle.drive();
    }
}