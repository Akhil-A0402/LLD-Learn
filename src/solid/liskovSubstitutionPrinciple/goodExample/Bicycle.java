package solid.liskovSubstitutionPrinciple.goodExample;


// This implementation follows LSP
// subclass of Bike - implements all Bike class behaviour
// as bicycle doesn't have any engine we don't need to implement Engine interface
public class Bicycle extends Bike{

    String company;
    boolean hasGear;
    int speed;

    public Bicycle(String company, boolean hasGear, int speed) {
        this.company = company;
        this.hasGear = hasGear;
        this.speed = speed;
    }

    @Override
    public void accelerate() {
        this.speed+=10;
        System.out.println("Accelearted: " + this.speed);
    }

    @Override
    public void applyBreak() {
        this.speed = this.speed<10?0:this.speed-10;
        System.out.println("Applied break. Current speed: " + this.speed);
    }
}
