package com.mycompany.practical10q1;
import java.util.Scanner;
public class Practical10q1 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        try 
        {
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            double result = divideNumbers(numerator, denominator);
            System.out.println("Result of division: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Cannot divide by zero. Please enter a non-zero denominator.");
        } 
        catch (Exception e) 
        {
            System.out.println("Error: Invalid input. Please enter valid integers.");
        } 
        finally 
        {
            scanner.close();
        }
    }

    public static double divideNumbers(int numerator, int denominator) {
        if (denominator == 0) {
            throw new ArithmeticException("Divide by zero is not allowed.");
        }

        return (double) numerator / denominator;
    
    }
}
