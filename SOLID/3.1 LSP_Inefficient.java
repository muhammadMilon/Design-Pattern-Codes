class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}

class Ostrich extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Ostriches cannot fly!");
    }
}

public class LSP_Inefficient {
    public static void main(String[] args) {
        Bird bird = new Ostrich();
        bird.fly(); // This will throw an UnsupportedOperationException
    }
}
