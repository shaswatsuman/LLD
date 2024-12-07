package src.DecoratorPattern.ToppingDecoratorPizza;

import src.DecoratorPattern.BasePizza.BasePizza;

public class ExtraCheese extends ToppingDecorator{
    
    BasePizza basePizza;

    public ExtraCheese(BasePizza pizza) {
        this.basePizza = pizza;
    }

    @Override 
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
