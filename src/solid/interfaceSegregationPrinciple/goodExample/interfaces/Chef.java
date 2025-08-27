package solid.interfaceSegregationPrinciple.goodExample.interfaces;


// Good ISP
// Only the needful functions need to be implemented.
public class Chef implements ChefInterface{
    @Override
    public void prepareFood() {
        System.out.println("Chef prepare the food");
    }

    @Override
    public void decideMenu() {
        System.out.println("Chef decide the menu");
    }
}
