package src.DecoratorPattern;

import src.DecoratorPattern.BasePizza.BasePizza;
import src.DecoratorPattern.BasePizza.Farmhouse;
import src.DecoratorPattern.BasePizza.Margherita;
import src.DecoratorPattern.BasePizza.VegDelight;
import src.DecoratorPattern.ToppingDecoratorPizza.ExtraCheese;
import src.DecoratorPattern.ToppingDecoratorPizza.Mushroom;

public class Store {
   public static void main(String args[]) {

       BasePizza pizza1 = new ExtraCheese(new Margherita());
       BasePizza pizza2 = new Mushroom(new ExtraCheese(new Farmhouse()));
       BasePizza pizza3 = new Mushroom(new VegDelight());

       System.out.println(pizza1.cost());
       System.out.println(pizza2.cost());
       System.out.println(pizza3.cost()); 
    } 
}
