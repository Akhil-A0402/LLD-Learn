package solid.interfaceSegregationPrinciple.goodExample.interfaces;

// No forced implementations
public class Demo {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        waiter.serveFoodAndDrinks();
        waiter.takeOrder();

        Chef chef = new Chef();
        chef.decideMenu();
        chef.prepareFood();

        MaintenanceEmployee maintenanceEmployee = new MaintenanceEmployee();
        maintenanceEmployee.cleanKitchen();
    }
}
