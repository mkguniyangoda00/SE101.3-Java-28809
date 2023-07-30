package com.mycompany.practical3q1;

public class Practical3q1 
{

    public static void main(String[] args) 
    {
        encapsulated e1=new encapsulated();
        e1.setStoreName("Nelo Food Corner");
        e1.setAge(45);
        e1.setSalary(30000f);
        
        System.out.println("The store's name is "+e1.getStoreName());
        System.out.println("The employee's age is "+e1.getAge());
        System.out.println("The salary is "+e1.getsalary());
    }
}
