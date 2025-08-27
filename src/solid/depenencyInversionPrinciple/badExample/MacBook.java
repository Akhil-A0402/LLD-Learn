package solid.depenencyInversionPrinciple.badExample;

import solid.depenencyInversionPrinciple.impl.WiredKeyboard;
import solid.depenencyInversionPrinciple.impl.WiredMouse;
import solid.depenencyInversionPrinciple.interfaces.Keyboard;
import solid.depenencyInversionPrinciple.interfaces.Mouse;


// Violation of DIP
// High level module directly depending on low-level module
public class MacBook {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;


    public MacBook(WiredKeyboard keyboard, WiredMouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public Mouse getMouse(){
        return this.mouse;
    }

    public Keyboard getKeyboard() {
        return this.keyboard;
    }
}
