package solid.interfaceSegregationPrinciple.badExample;

// Bad: This class violates the Interface Segregation Principle, (client have to implement unused interfaces)
// Bloated class with empty or error throwing methods
// This waiter is forced to implement methods it doesn't need
public class Waiter implements RestaurantEmployee{

    @Override
    public void takeOrders() {
        System.out.println("Takes order from customer");
    }

    @Override
    public void serveFoodAndDrinks() {
        System.out.println("Serving food and drinks");
    }

    // Below method implementations are forcefully implemented
    @Override
    public void prepareFood() {
        throw new AssertionError("Detailed Message: Waiter doesn't prepare food.");
    }

    @Override
    public void decideMenu() {
        throw new AssertionError("Detailed Message: Waiter doesn't decide the menu");
    }

    @Override
    public void cleanTheKitchen() {
        throw new AssertionError("Detailed Message: Waiter doesn't clean the kitchen");
    }
}
