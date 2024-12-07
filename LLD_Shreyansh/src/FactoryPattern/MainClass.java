package src.FactoryPattern;

public class MainClass {

    public static void main(String args[]) {

        ShapeFactory shapeFactoryObj = new ShapeFactory();
        Shape shapeObj = shapeFactoryObj.getShape("CIRCLE");
        shapeObj.draw();
    }
}
