package solid.depenencyInversionPrinciple.goodExample;

import solid.depenencyInversionPrinciple.impl.WiredKeyboard;
import solid.depenencyInversionPrinciple.impl.WiredMouse;
import solid.depenencyInversionPrinciple.interfaces.Keyboard;
import solid.depenencyInversionPrinciple.interfaces.Mouse;

public class Demo {

    // We are able to create wired and wireless instance for the provided class
    public static void main(String[] args) {
        Keyboard keyboard = new WiredKeyboard("Wired", "Logitech", "K240", "SpaceGray");
        Mouse mouse = new WiredMouse("Wired", "Logitech", "K240 Mouse", "SpaceGray");
        Macbook macbook = new Macbook(keyboard, mouse); // we can pass in the wired mouse herel
        macbook.getKeyboard().getSpecification();
        macbook.getMouse().getSpecification();

        // For bluetooth mouse
        Keyboard wirelessKeyboard = new WiredKeyboard("Wired", "Logitech", "K240 Wireless", "SpaceGray");
        Mouse wirelessMouse = new WiredMouse("Wired", "Logitech", "K240 Wireless Mouse", "SpaceGray");
        Macbook macbook2 = new Macbook(wirelessKeyboard, wirelessMouse); // we can pass in the wired mouse herel
        macbook2.getKeyboard().getSpecification();
        macbook2.getMouse().getSpecification();

    }
}
