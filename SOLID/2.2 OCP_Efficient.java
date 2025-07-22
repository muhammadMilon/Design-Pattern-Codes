interface Shape {
    double calculateArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class AreaCalculator {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}

public class OCP_Efficient {
    public static void main(String[] args) {
        // Create instances of Circle, Square, and Rectangle
        Shape circle = new Circle(5);
        Shape square = new Square(4);
        Shape rectangle = new Rectangle(6, 3);

        // Create an instance of AreaCalculator
        AreaCalculator areaCalculator = new AreaCalculator();

        // Calculate areas
        double circleArea = areaCalculator.calculateArea(circle);
        double squareArea = areaCalculator.calculateArea(square);
        double rectangleArea = areaCalculator.calculateArea(rectangle);

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Rectangle: " + rectangleArea);
    }
}
