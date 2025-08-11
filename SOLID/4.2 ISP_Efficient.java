// Interfaces
interface Drivable {
    void drive();
}

interface Flyable {
    void fly();
}

interface Sailable {
    void sail();
}

// Implementing classes
class Car implements Drivable {
    public void drive() {
        System.out.println("Driving a car");
    }
}

class Bicycle implements Drivable {
    public void drive() {
        System.out.println("Riding a bicycle");
    }
}

class Truck implements Drivable {
    public void drive() {
        System.out.println("Driving a truck");
    }
}

class Airplane implements Drivable, Flyable {
    public void drive() {
        System.out.println("Driving an airplane");
    }

    public void fly() {
        System.out.println("Flying the airplane");
    }
}

class Boat implements Sailable {
    public void sail() {
        System.out.println("Sailing the boat");
    }
}

// Main class to run the code
public class Main {
    public static void main(String[] args) {
        Drivable car = new Car();
        car.drive();

        Drivable bicycle = new Bicycle();
        bicycle.drive();

        Drivable truck = new Truck();
        truck.drive();

        Drivable airplane = new Airplane();
        airplane.drive();
        ((Airplane) airplane).fly(); // Cast to Flyable or Airplane to access fly()

        Sailable boat = new Boat();
        boat.sail();
    }
}
