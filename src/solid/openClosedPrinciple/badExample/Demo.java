package solid.openClosedPrinciple.badExample;

import solid.openClosedPrinciple.components.Invoice;

public class Demo {
    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        InvoiceDao invoiceDao = new InvoiceDao(invoice);

        invoiceDao.saveToDB();
        invoiceDao.saveToDB();

        // Problem: If we want to add a new function to save to mongodb or cloud
        // we will have to modify in the same class
        // This will affect InvoiceDao and all its derived classes (if exists)
        // this violates the closed modification part of OCP
    }
}
