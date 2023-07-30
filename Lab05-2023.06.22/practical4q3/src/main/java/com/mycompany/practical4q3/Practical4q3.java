package com.mycompany.practical4q3;

public class Practical4q3 
{

    public static void main(String[] args) 
    {
        Student s1=new Student();
        s1.setName("Malithi Guniyangoda");
        s1.setID(28809);
        s1.setCourse("Software Engineering");
        
        Lecturer l1=new Lecturer();
        l1.setName("Nethmi Weerasinghe");
        l1.setID(30460);
        l1.setProg("Mathematics For Computing");
        
        System.out.println("Student Details:");
        System.out.println("Student's name "+s1.getName());
        System.out.println("Student's ID "+s1.getID());
        System.out.println("Course Name "+s1.getCourse());
        
        System.out.println("Lecturer's Details:");
        System.out.println("Lecturer's name "+l1.getName());
        System.out.println("Lecturer's ID "+l1.getID());
        System.out.println("Lecturer's Programme "+l1.getProg());
        
    }
}
