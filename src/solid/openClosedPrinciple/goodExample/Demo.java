package solid.openClosedPrinciple.goodExample;

import solid.openClosedPrinciple.components.Invoice;

public class Demo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        DatabaseInvoiceDao databaseInvoiceDao = new DatabaseInvoiceDao(invoice);
        databaseInvoiceDao.save();

        FileInvoiceDao fileInvoiceDao = new FileInvoiceDao(invoice);
        fileInvoiceDao.save();

        // The system is:
        // - Open for extension (new save function can be added)
        // - Closed for modification (existing code remains unchanged)
    }
}
