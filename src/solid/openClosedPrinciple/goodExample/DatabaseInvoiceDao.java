package solid.openClosedPrinciple.goodExample;

import solid.openClosedPrinciple.components.Invoice;

// Concrete implementation for DatabaseInvoiceDao
public class DatabaseInvoiceDao implements InvoiceDao{
    Invoice invoice;

    public DatabaseInvoiceDao(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void save() {
        System.out.println("Saving to db");
    }
}
