package com.mycompany.practical2q1;

public class Item 
{
    private int location;
    private String description;
    
    public Item(int location, String description)
    {
        this.location=location;
        this.description=description;
    }
    
    public void setLocation(int l)
    {
        location=l;
    }
    public int getLocation()
    {
        return location;
    }
    
    public void setDescription(String d)
    {
        description=d;
    }
    public String getDescription()
    {
        return description;
    }
}
