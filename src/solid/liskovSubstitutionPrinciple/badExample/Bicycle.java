package solid.liskovSubstitutionPrinciple.badExample;

// This class violates the LSP as the engine functions are narrowed down
public class Bicycle implements BikeInterface{
    String brand;
    Boolean hasGears;
    int speed;

    public Bicycle(String brand, Boolean hasGears, int speed) {
        this.brand = brand;
        this.hasGears = hasGears;
        this.speed = speed;
    }

    @Override
    public void turnOnEngine() {
        throw new AssertionError("No engine found");
    }

    @Override
    public void turnOffEngine() {
        throw new AssertionError("No engine found");
    }

    @Override
    public void accelerate() {
        this.speed+=10;
        System.out.println("Increasing speed");
    }

    @Override
    public void applyBreak() {
        this.speed = this.speed<10?0:this.speed+10;
        System.out.println("Break applied");
    }
}
