package solid.singleResponibility;

public class SingleResponsibilityBadExample {

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

        // Responsibility 1: Calculate the total price
        public void calculateTotal() {
            this.total = quantity*marker.price;
            System.out.println("The total price: " + this.total);
        }

        // Responsibility 2: Database
        public void saveToDb() {
            System.out.println("Saving the data to db");
        }

        // printing the invoice
        public void printInvoice() {
            System.out.println("Printing invoice");
        }
    }


    // in-case if any change is made to a function the other can also be affected
    public static void main(String[] args) {
        Marker marker = new Marker("Pentec", "blue", 10, 2025);
        Invoice invoice = new Invoice(marker, 10);

        invoice.calculateTotal();
        invoice.saveToDb();
        invoice.printInvoice();
    }
}
