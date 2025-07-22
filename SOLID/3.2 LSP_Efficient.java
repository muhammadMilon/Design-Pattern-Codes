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

public class LSP_Efficient {
    public static void main(String[] args) {
        Bird bird1 = new FlyingBird();
        Bird bird2 = new Ostrich();

        bird1.move(); // Output: Flying...
        bird2.move(); // Output: Running...
    }
}
