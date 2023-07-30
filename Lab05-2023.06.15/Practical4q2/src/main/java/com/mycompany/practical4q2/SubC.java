package com.mycompany.practical4q2;

class SubC extends SuperB
{
   void triple() 
    {
        x=x+3;
    } // override existing method
    void quadruple() 
    {
        x=x*4;
    } // new method
 
    /*This is the child class named as SubC. This child class has the access to all its own methods while its parents class. 
    To implement inheritance we use the keyword "extends".
    There are two methods. 
    First method is triple method where it has the same name in the SuperB class. 
    We call this as overriding an existing method.
    In this triple method, instead of multiplying the value of x by 3 we are adding 3 to the x.
    Then it has its own method named as quadruple.
    In that we multiply the value of x by 4.
    */
}
