package solid.depenencyInversionPrinciple.badExample;

import solid.depenencyInversionPrinciple.impl.WiredKeyboard;
import solid.depenencyInversionPrinciple.impl.WiredMouse;

public class Demo {
    public static void main(String[] args) {
        MacBook macBook = new MacBook(new WiredKeyboard("Wired", "Apple", "i10", "white"), new WiredMouse("Wired", "Apple", "magic mouse i10", "white"));
        macBook.getKeyboard().getSpecification();
        macBook.getMouse().getSpecification();

        // we can't add bluetooth keyboard here, as there wiredkeyboard is tightly coupled in MacBook class
    }
}
