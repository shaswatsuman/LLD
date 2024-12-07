package src.StrategyPattern.WithStrategyPattern;

import src.StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class SportVehicle extends Vehicle{

    SportVehicle() {
        super( new SportsDriveStrategy());
    }
}