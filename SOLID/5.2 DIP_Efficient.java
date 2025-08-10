// Interface for FoodMaker
interface FoodMaker {
    void prepareFood();
}

// PizzaMaker implementation
class PizzaMaker implements FoodMaker {
    @Override
    public void prepareFood() {
        System.out.println("Preparing pizza...");
        System.out.println("Order is complete!");
    }
}

// BurgerMaker implementation
class BurgerMaker implements FoodMaker {
    @Override
    public void prepareFood() {
        System.out.println("Preparing burger...");
        System.out.println("Order is complete!");
    }
}

// PastaMaker implementation
class PastaMaker implements FoodMaker {
    @Override
    public void prepareFood() {
        System.out.println("Preparing pasta...");
        System.out.println("Order is complete!");
    }
}

// Waiter class depends on abstraction (FoodMaker) not concrete classes
class Waiter {
    private FoodMaker foodMaker;

    public Waiter(FoodMaker foodMaker) {
        this.foodMaker = foodMaker;
    }

    public void takeOrder() {
        foodMaker.prepareFood();
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Inject PizzaMaker into Waiter
        FoodMaker pizzaMaker = new PizzaMaker();
        Waiter waiter = new Waiter(pizzaMaker);
        waiter.takeOrder(); // Waiter delegates to PizzaMaker

        // Inject BurgerMaker into Waiter without modifying Waiter class
        FoodMaker burgerMaker = new BurgerMaker();
        waiter = new Waiter(burgerMaker);
        waiter.takeOrder(); // Waiter delegates to BurgerMaker

        // Add PastaMaker without changing Waiter class
        FoodMaker pastaMaker = new PastaMaker();
        waiter = new Waiter(pastaMaker);
        waiter.takeOrder(); // Waiter delegates to PastaMaker
    }
}
