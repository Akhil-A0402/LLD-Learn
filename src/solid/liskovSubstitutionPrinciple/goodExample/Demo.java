package solid.liskovSubstitutionPrinciple.goodExample;

public class Demo {
    public static void main(String[] args) {
        MotorCycle motorCycle = new MotorCycle("Hero", 0, false);
        motorCycle.turnOnEngine();
        motorCycle.accelerate();
        motorCycle.applyBreak();
        motorCycle.turnOffEngine();

        Bicycle bicycle = new Bicycle("Hero", true, 0);
        bicycle.accelerate();
        bicycle.applyBreak();
    }
}
