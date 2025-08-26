package solid.openClosedPrinciple.badExample;

import solid.openClosedPrinciple.components.Invoice;

// 1. Managing the database operations only
public class InvoiceDaoOld {
    Invoice invoice;

    public InvoiceDaoOld(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB() {
        System.out.println("Saving to db");
    }
}
