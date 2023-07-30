package com.mycompany.practical3q2;

public class Employee 
{
    private String empName;
    private float salary, bonus, bonusAmount;
    
    public void setEmpName(String empName)
    {
        this.empName=empName;
    }
    
    public String getEmpName()
    {
        return empName;
    }
    
    public void setSalary(float salary)
    {
        this.salary=salary;
    }
    
    public float getSalary()
    {
        return salary;
    }
    
    public Employee(float bonus)
    {
        this.bonus=bonus;
    }
    
    public float CalculateBonusAmount()
    {
        bonusAmount=salary+bonus;
        return bonusAmount;
    }
    
    public void displayDetails()
    {
        System.out.println("Employee's name is "+getEmpName());
        System.out.println("Basic Salary is "+getSalary());
        System.out.println("Total bonus is "+bonus);
        System.out.println("Bonus Amount is "+CalculateBonusAmount());
       
    }
}
