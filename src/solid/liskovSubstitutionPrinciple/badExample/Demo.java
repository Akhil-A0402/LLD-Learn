package solid.liskovSubstitutionPrinciple.badExample;

public class Demo {
    public static void main(String[] args) {
        MotorCycle motorCycle = new MotorCycle("Hero", false, 0);
        motorCycle.turnOnEngine();
        motorCycle.accelerate();
        motorCycle.applyBreak();
        motorCycle.turnOffEngine();

        Bicycle bicycle = new Bicycle("Hero", true, 0);
        bicycle.accelerate();
        bicycle.applyBreak();
        bicycle.turnOffEngine(); // fails to implement the Bike interface behaviour
        bicycle.turnOffEngine(); // fails to implement the Bike interface behaviour
    }
}
