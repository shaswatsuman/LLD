package src.StrategyPattern.WithStrategyPattern;

import src.StrategyPattern.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodVehicle extends Vehicle{

    GoodVehicle() {
        super( new NormalDriveStrategy());
    }
}