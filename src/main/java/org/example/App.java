package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Yussef Abdelbary
 */
public class App 
{
    public static void main( String[] args )
    {
    System.out.println("What is the length of the room in feet?");
        Scanner scan = new Scanner(System.in);
        int length = Integer.parseInt(scan.nextLine());
        System.out.println("What is the width of the room in feet?");
        int width = Integer.parseInt(scan.nextLine());
        System.out.println("You entered dimensions of " + length+ " feet by "+ width+ " feet.");
        System.out.println("The area is");
        int area = length * width;
        System.out.println(area+ " square feet");
        //a double is required rather then a float since decimals extend pass 6
        double area_metricsystem = (area * 0.09290304);
                System.out.println(area_metricsystem+ " square meters");
    }
}
