package com.mycompany.practical3q1pt2;

public class encapsulated 
{
    private String name;
    private int age;
    private float salary;
        
    public encapsulated(String name, int age, float salary)
    {
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    
    public void displayDetails()
    {
        System.out.println("Store's name is "+name);
        System.out.println("Employees's age is "+age);
        System.out.println("Employee's salary is "+salary);
    }
}
