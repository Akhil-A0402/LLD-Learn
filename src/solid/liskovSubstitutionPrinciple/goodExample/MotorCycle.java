package solid.liskovSubstitutionPrinciple.goodExample;

public class MotorCycle extends Bike implements EngineInterface{
    String company;
    int speed;
    boolean isEngineOn;

    public MotorCycle(String company, int speed, boolean isEngineOn) {
        this.company = company;
        this.speed = speed;
        this.isEngineOn = isEngineOn;
    }

    @Override
    public void accelerate() {
        this.speed+=10;
        System.out.println("Current speed:" + this.speed);
    }

    @Override
    public void applyBreak() {
        this.speed = this.speed<10?0:this.speed-10;
        System.out.println("Applied Break. Current speed:" + this.speed);
    }

    @Override
    public void turnOnEngine() {
        this.isEngineOn = true;
        System.out.println("Engine started");
    }

    @Override
    public void turnOffEngine() {
        this.isEngineOn = false;
        System.out.println("Engine stopped");
    }
}
