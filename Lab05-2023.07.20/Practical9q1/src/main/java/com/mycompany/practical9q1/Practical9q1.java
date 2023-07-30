package com.mycompany.practical9q1;

public class Practical9q1 
{

    public static void main(String[] args) 
    {
        double radius = 5.0;
        double height = 10.0;

        CylindricalContainer cylindricalContainer = new CylindricalContainer(radius, height);
        double volume = cylindricalContainer.volume();

        System.out.println("Cylinder Volume: " + volume);
    }
}
