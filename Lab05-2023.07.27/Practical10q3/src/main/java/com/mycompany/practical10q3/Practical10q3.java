package com.mycompany.practical10q3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Practical10q3 
{

    public static void main(String[] args) 
    {
       try 
       {
            File file = new File("mkguniyangoda.txt"); // Change the file name to a non-existent file
            Scanner scanner = new Scanner(file);
            
            // Read data from the file (not included in this example as the file doesn't exist)
            
            scanner.close();
       } 
       catch (FileNotFoundException e) 
       {
            System.out.println("Error: File not found. Please provide a valid file path.");
       } 
       catch (Exception e) 
       {
            System.out.println("Error: Something went wrong.");
       }
    }
}
