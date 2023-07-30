package com.mycompany.practical2q1;

public class Practical2q1 
{

    public static void main(String[] args) 
    {  
        Item i1= new Item(111,"Galle");
        
        Monster m1=new Monster();
        m1.setLocation(111);
        m1.setDescription("Name");
        
        System.out.println("ID is "+m1.getLocation());
        System.out.println("Name is "+m1.getDescription());
        m1.display();
        
        
    }
}
