abstract class GTACharacter {
    public abstract void performAction();
}

class Michael extends GTACharacter {
    @Override
    public void performAction() {
        System.out.println("Michael performs a drive action!");
        int fuel = 50;
        while (fuel > 0) {
            System.out.println("Michael is driving... Fuel: " + fuel);
            fuel -= 20;
            if (fuel <= 20) {
                System.out.println("Low fuel! Michael needs to refuel.");
                break;
            }
        }
    }
}

class Trevor extends GTACharacter {
    @Override
    public void performAction() {
        System.out.println("Trevor performs a shoot action!");
        int ammo = 6;
        while (ammo > 0) {
            System.out.println("Trevor shoots... Ammo left: " + ammo);
            ammo--;
            if (ammo <= 3) {
                System.out.println("Trevor needs to reload!");
                break;
            }
        }
    }
}

class Franklin extends GTACharacter {
    @Override
    public void performAction() {
        System.out.println("Franklin performs a run action!");
        int stamina = 60;
        for (int i = 0; i < 5; i++) {
            System.out.println("Franklin runs... Stamina: " + stamina);
            stamina -= 20;
            if (stamina <= 40) {
                System.out.println("Franklin is getting tired! Needs to rest.");
                break;
            }
        }
    }
}

abstract class Vehicle {
    public abstract void performVehicleAction();
}

class Car extends Vehicle {
    @Override
    public void performVehicleAction() {
        System.out.println("Driving a car.");
        int speed = 0;
        for (int i = 0; i < 5; i++) {
            speed += 20;
            System.out.println("Car speed: " + speed + " km/h");
            if (speed > 60) {
                System.out.println("Car is going too fast! Slow down.");
                break;
            }
        }
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void performVehicleAction() {
        System.out.println("Riding a motorcycle.");
        int speed = 0;
        while (speed < 60) {
            speed += 15;
            System.out.println("Motorcycle speed: " + speed + " km/h");
            if (speed == 100) {
                System.out.println("Motorcycle is nearing max speed! Be cautious.");
                break;
            }
        }
    }
}

class Helicopter extends Vehicle {
    @Override
    public void performVehicleAction() {
        System.out.println("Flying a helicopter.");
        int altitude = 0;
        for (int i = 0; i < 10; i++) {
            altitude += 200;
            System.out.println("Helicopter altitude: " + altitude + " meters");
            if (altitude >= 1000) {
                System.out.println("Helicopter reached max altitude! Time to descend.");
                break;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GTACharacter michael = new Michael();
        GTACharacter trevor = new Trevor();
        GTACharacter franklin = new Franklin();

        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        Vehicle helicopter = new Helicopter();

        System.out.println("Character Actions:");
        michael.performAction();
        trevor.performAction();
        franklin.performAction();

        System.out.println("\nVehicle Actions:");
        car.performVehicleAction();
        motorcycle.performVehicleAction();
        helicopter.performVehicleAction();
    }
}
