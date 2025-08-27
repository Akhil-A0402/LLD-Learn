package solid.depenencyInversionPrinciple.goodExample;

import solid.depenencyInversionPrinciple.interfaces.Keyboard;
import solid.depenencyInversionPrinciple.interfaces.Mouse;

// Following DIP
// High-level module uses abstraction
public class Macbook {
    private final Keyboard keyboard;
    private final Mouse mouse;

    // Abstraction: define contact
    // Dependency injection through the constructor
    public Macbook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }
}
