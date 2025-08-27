package solid.interfaceSegregationPrinciple.goodExample.interfaces;


// Good ISP
// Only the needful functions need to be implemented.
public class MaintenanceEmployee implements MaintenanceTaskInterface{
    @Override
    public void cleanKitchen() {
        System.out.println("Clean the kitchen at EOD");
    }
}
