package src.FactoryPattern;

public class ShapeFactory {
   
    Shape getShape(String input) {

        switch(input) {
            case "CIRCLE":
             return new Circle();
            case "RECTANGLE":
             return new Rectangle();
            default:
             return null;
        }
    }
}
