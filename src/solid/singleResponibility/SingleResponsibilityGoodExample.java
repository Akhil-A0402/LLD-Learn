package solid.singleResponibility;

public class SingleResponsibilityGoodExample {
    static class Marker {
        String name;
        String color;
        int price;
        int year;

        public Marker(String name, String color, int price, int year) {
            this.name = name;
            this.color = color;
            this.price = price;
            this.year = year;
        }
    }

    static class Invoice{
        Marker marker;
        private int quantity;
        private int total;

        private Invoice(Marker marker, int quantity) {
            this.marker = marker;
            this.quantity = quantity;
        }

        // Responsibility 1: Calculate the total price(no other responsibility)
        public void calculateTotal() {
            this.total = quantity*marker.price;
            System.out.println("The total price: " + this.total);
        }

    }

    static class InvoiceDB {
        private Invoice invoice;

        public InvoiceDB(Invoice invoice) {
            this.invoice = invoice;
        }

        // Single Responsibility
        public void saveToDb() {
            System.out.println("Saved to db");
        }
    }

    static class InvoicePrint {
        private Invoice invoice;

        public InvoicePrint(Invoice invoice) {
            this.invoice = invoice;
        }

        // Single Responsiblity
        public void printInvoice() {
            System.out.println("Printing the invoice");
        }
    }

    public static void main(String[] args) {
        Marker marker = new Marker("GoodSRP", "black", 20, 2025);
        Invoice invoice = new Invoice(marker, 10);
        invoice.calculateTotal();

        InvoiceDB invoiceDB = new InvoiceDB(invoice);
        invoiceDB.saveToDb();

        InvoicePrint invoicePrint = new InvoicePrint(invoice);
        invoicePrint.printInvoice();
    }
}
