package com.mycompany.testemployee;

public class TestEmployee 
{

    public static void main(String[] args) 
    {
        Employee MrBogdan=new Employee();
        Employee MrBird=new Employee();
        
        MrBogdan.setEmpID(001);
        MrBogdan.setEmpName("Mr. Bogdan");
        MrBogdan.setEmpDestination("Manager");
        
        MrBird.setEmpID(002);
        MrBird.setEmpName("Mr.Bird");
        MrBird.setEmpDestination("General Manager");
        
        System.out.println("Employer's ID "+MrBogdan.getEmpID());
        System.out.println("Employer's Name "+MrBogdan.getEmpName());
        System.out.println("Employer's Designation "+MrBogdan.getEmpDesignation());
        
        System.out.println("Employer's ID "+MrBird.getEmpID());
        System.out.println("Employer's Name "+MrBird.getEmpName());
        System.out.println("Employer's Designation "+MrBird.getEmpDesignation());
    }
}
