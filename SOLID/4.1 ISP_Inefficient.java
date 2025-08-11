interface Vehicle {
    void drive();
    void fly();
    void sail();
}

class Car implements Vehicle {
    public void drive() {
        System.out.println("Driving a car");
    }

    public void fly() {
        throw new UnsupportedOperationException("Cars can't fly");
    }

    public void sail() {
        throw new UnsupportedOperationException("Cars can't sail");
    }
}

class Bicycle implements Vehicle {
    public void drive() {
        System.out.println("Riding a bicycle");
    }

    public void fly() {
        throw new UnsupportedOperationException("Bicycles can't fly");
    }

    public void sail() {
        throw new UnsupportedOperationException("Bicycles can't sail");
    }
}

class Airplane implements Vehicle {
    public void drive() {
        System.out.println("Driving an airplane");
    }

    public void fly() {
        System.out.println("Flying the airplane");
    }

    public void sail() {
        throw new UnsupportedOperationException("Airplanes can't sail");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        car.drive();
        try {
            car.fly();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Vehicle bicycle = new Bicycle();
        bicycle.drive();
        try {
            bicycle.fly();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        Vehicle airplane = new Airplane();
        airplane.drive();
        airplane.fly();
        try {
            airplane.sail();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
