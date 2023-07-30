package com.mycompany.practical5q1;

public class InterfaceImplanted implements MyFirstInterface
{
    @Override
    public void display() 
    {
        x = 20; // Error: Cannot assign a value to a final variable x
        System.out.println(x);
    }
}
