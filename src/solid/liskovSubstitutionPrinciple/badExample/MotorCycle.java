package solid.liskovSubstitutionPrinciple.badExample;

// This sub-class does implement all the methods of its super class.
public class MotorCycle implements BikeInterface{
    private String company;
    private boolean isEngineOn;
    private int speed;

    public MotorCycle(String company, boolean isEngineOn, int speed) {
        this.company = company;
        this.isEngineOn = isEngineOn;
        this.speed = speed;
    }

    @Override
    public void turnOnEngine() {
        this.isEngineOn = true;
        System.out.println("Engine turned On");
    }

    @Override
    public void turnOffEngine() {
        this.isEngineOn = false;
        System.out.println("Engine turned off");
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
