package solid.openClosedPrinciple.badExample;

import solid.openClosedPrinciple.components.Invoice;


// Responsibility: Managing database operations and file operations
public class InvoiceDao {

    Invoice invoice;

    public InvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        System.out.println("Saving to db");
    }

    // Bad: This violates the principle of OCP
    // Every time we add a new save function, we need to modify the existing InvoiceDao class
    public void saveToFile() {
        System.out.println("Saving to file");
    }


}
