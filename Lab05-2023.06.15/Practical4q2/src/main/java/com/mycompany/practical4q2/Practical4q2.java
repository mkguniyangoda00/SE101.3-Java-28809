package com.mycompany.practical4q2;

public class Practical4q2 
{

    public static void main(String[] args) 
    {
        SuperB b = new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println( b.returnIt() ); 
        SubC c = new SubC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println( c.returnIt() ); 
    }
    /*
    This is the main method and we create objects in here and call the methods through objects.
    In here we make two different objects.
    First, we make an object from SuperB class and we named it as b.
    Through we we call the methods. 
    First we set the value of x to 2.
    Then we increase the value of x by 1.So now the value of x is 3.
    Lastly we multiply x's value by 3.If we multiply 3*3 the current value of x is 9
    Using a print statement we print the value of x.So we print 9.
    
    Then we create an object form the child class SubC. 
    The speciality is that we can even access methods from the parent class by using this object that created from the child class.
    The object is named as c.
    Through c we access two parent class's methods.
    First we set a value to x. We set x's value to 2.
    Then we increse the value of x by 1. So now the x value is 3.
    Then we call its own method triple. Instead of multiplying the x value by 3, in here we have to add 3 to x. 
    So 3+3 is 6 and the value of x currently is 6.
    Then we print the value of x by using a print statement. we print 6 as x value.
    */
}


