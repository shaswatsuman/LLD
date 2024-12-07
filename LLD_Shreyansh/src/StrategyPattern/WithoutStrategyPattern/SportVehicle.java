package src.StrategyPattern.WithoutStrategyPattern;

public class SportVehicle extends Vehicle{

    @Override
    public void drive() {
        //different drive logic
        System.out.println("sports drive capability");
    }
}