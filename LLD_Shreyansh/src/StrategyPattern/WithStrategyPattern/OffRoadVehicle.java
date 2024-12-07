package src.StrategyPattern.WithStrategyPattern;

import src.StrategyPattern.WithStrategyPattern.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

    OffRoadVehicle() {
        super( new SportsDriveStrategy());
    }
}