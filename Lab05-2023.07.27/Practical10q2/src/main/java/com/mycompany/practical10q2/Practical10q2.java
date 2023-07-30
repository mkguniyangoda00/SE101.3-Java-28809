package com.mycompany.practical10q2;
import java.util.Scanner;

public class Practical10q2 
{

    public static void main(String[] args) 
    {
        int[] array = { 10, 20, 30, 40, 50 };
        
        try 
        {
            int index = 6; // Change this index to see different outcomes

            int value = array[index];
            System.out.println("Value at index " + index + ": " + value);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Error: Invalid index. The array has " + array.length + " elements.");
        } 
        catch (Exception e) 
        {
            System.out.println("Error: Something went wrong.");
        }
    }
}
