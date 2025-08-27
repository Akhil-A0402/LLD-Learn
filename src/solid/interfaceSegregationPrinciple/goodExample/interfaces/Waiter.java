package solid.interfaceSegregationPrinciple.goodExample.interfaces;


// Good ISP
// Only the needful functions need to be implemented.
public class Waiter implements WaiterInterface{
    @Override
    public void takeOrder() {
        System.out.println("Takes order from the customers");
    }

    @Override
    public void serveFoodAndDrinks() {
        System.out.println("Waiter serving the food");
    }
}
