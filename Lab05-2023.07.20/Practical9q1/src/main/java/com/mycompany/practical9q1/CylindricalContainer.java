package com.mycompany.practical9q1;

public class CylindricalContainer extends Container
{
    private double radius;
    private double height;

    public CylindricalContainer(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
