package solid.openClosedPrinciple.goodExample;

import solid.openClosedPrinciple.components.Invoice;

// Follows OCP using interface polymorphism
public interface InvoiceDao {
    public void save();
}
