package com.mycompany.practical4q4_dog;

public class Practical4q4_Dog extends Mammal
{

    public static void main(String[] args) 
    {
      Animal a = new Animal();
      Mammal m = new Mammal();
      Practical4q4_Dog d = new Practical4q4_Dog();
      System.out.println(m instanceof Animal);//true
      System.out.println(d instanceof Mammal);//true
      System.out.println(d instanceof Animal);//true
   
    /*
    In the given code, the instanceof operator is used to check the relationships between classes and their instances.
    m instanceof Animal checks if the object m is an instance of the Animal class. 
    Since Mammal is a subclass of Animal, the output is true.
    d instanceof Mammal checks if the object d is an instance of the Mammal class. 
    Since Dog is a subclass of Mammal, the output is true.
    d instanceof Animal checks if the object d is an instance of the Animal class. 
    Since Dog is a subclass of Mammal, which in turn is a subclass of Animal, the output is true.
    */
    }
}
