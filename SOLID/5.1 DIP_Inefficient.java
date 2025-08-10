// Low-Level module 1 - PizzaMaker
class PizzaMaker {
    public void preparePizza() {
        System.out.println("Preparing pizza...");
    }
}

// Low-Level module 2 - BurgerMaker
class BurgerMaker {
    public void prepareBurger() {
        System.out.println("Preparing burger...");
    }
}

// High-Level module - Waiter
class Waiter {
    private PizzaMaker pizzaMaker;
    private BurgerMaker burgerMaker;

    // Constructor directly creates the food makers (tight coupling)
    public Waiter() {
        pizzaMaker = new PizzaMaker();
        burgerMaker = new BurgerMaker();
    }

    // Waiter takes an order and prepares the food
    // (depending directly on PizzaMaker and BurgerMaker)
    public void takeOrder(String foodType) {
        if (foodType.equals("Pizza")) {
            pizzaMaker.preparePizza();
        } else if (foodType.equals("Burger")) {
            burgerMaker.prepareBurger();
        }
        System.out.println("Order is complete!");
    }
}

public class Main {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.takeOrder("Pizza");  // Waiter directly calls the PizzaMaker
        waiter.takeOrder("Burger"); // Waiter directly calls the BurgerMaker
    }
}
