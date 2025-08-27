package solid.interfaceSegregationPrinciple.badExample;

public class ViolationDemo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();

        // works fine
        waiter.serveFoodAndDrinks();
        waiter.takeOrders();

        // forced implementations: does throw exception
        waiter.prepareFood();
        waiter.cleanTheKitchen();
        waiter.decideMenu();
    }
}
