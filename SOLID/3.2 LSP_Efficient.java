abstract class Bird {
    public abstract void move();
}

class FlyingBird extends Bird {
    @Override
    public void move() {
        System.out.println("Flying...");
    }
}

class NonFlyingBird extends Bird {
    @Override
    public void move() {
        System.out.println("Walking...");
    }
}

class Ostrich extends NonFlyingBird {
    @Override
    public void move() {
        System.out.println("Running...");
    }
}

class Penguin extends NonFlyingBird {
    @Override
    public void move() {
        System.out.println("Swimming...");
    }
}

public class LSP_Efficient {
    public static void main(String[] args) {
        Bird bird1 = new FlyingBird();
        Bird bird2 = new Ostrich();
        Bird bird3 = new Penguin();

        bird1.move(); // Output: Flying...
        bird2.move(); // Output: Running...
        bird3.move(); // Output: Swimming...
    }
}
