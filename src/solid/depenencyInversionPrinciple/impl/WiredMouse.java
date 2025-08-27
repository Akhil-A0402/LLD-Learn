package solid.depenencyInversionPrinciple.impl;

import solid.depenencyInversionPrinciple.interfaces.Mouse;

public class WiredMouse implements Mouse {

    private final String connectionType;
    private final String company;
    private final String modelVersion;
    private final String color;

    public WiredMouse(String connectionType, String company, String modelVersion, String color) {
        this.connectionType = connectionType;
        this.company = company;
        this.modelVersion = modelVersion;
        this.color = color;
    }

    @Override
    public void getSpecification() {
        System.out.println("Connection type:" +connectionType);
        System.out.println("Company:" +company);
        System.out.println("Model Version:" +modelVersion);
        System.out.println("Color:" +color);
    }
}
