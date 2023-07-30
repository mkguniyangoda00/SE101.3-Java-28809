package com.mycompany.practical2q1;

public class Monster extends Item
{
    private int id;
    private String name;
    
   public void setData(int i, String n)
   {
       id=i;
       name=n;
   }
   
   public void display()
   {
       System.out.println("ID is"+id);
       System.out.println("Name is "+name);
   }
   
}
