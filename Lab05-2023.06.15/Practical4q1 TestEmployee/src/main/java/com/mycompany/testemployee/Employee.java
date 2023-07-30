package com.mycompany.testemployee;

public class Employee 
{
    private int empID;
    private String empName;
    private String empDesignation;
    
    public void setEmpID(int empID)
    {
        this.empID=empID;
    }
     public int getEmpID()
     {
         return empID;
     }
     
     public void setEmpName(String empName)
     {
         this.empName=empName;
     }
     
     public String getEmpName()
     {
         return empName;
     }
     
     public void setEmpDestination(String empDesignation)
     {
         this.empDesignation=empDesignation;
     }
     
     public String getEmpDesignation()
     {
         return empDesignation;
     }
    
}
