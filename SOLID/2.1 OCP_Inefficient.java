class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
}

class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * Math.pow(circle.getRadius(), 2);
        } else if (shape instanceof Square) {
            Square square = (Square) shape;
            return Math.pow(square.getSide(), 2);
        }
        return 0; // Or throw an IllegalArgumentException
    }
}

public class OCP_Inefficient {
    public static void main(String[] args) {
        Circle circle = new Circle(5); // Example: Circle with radius 5
        Square square = new Square(4); // Example: Square with side 4

        AreaCalculator areaCalculator = new AreaCalculator();

        double circleArea = areaCalculator.calculateArea(circle);
        double squareArea = areaCalculator.calculateArea(square);

        System.out.println("Area of Circle: " + circleArea);
        System.out.println("Area of Square: " + squareArea);
    }
}
