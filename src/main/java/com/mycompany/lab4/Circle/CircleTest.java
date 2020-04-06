/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab4.Circle;

import java.util.Scanner;

/**
 *
 * @author lukec
 */
public class CircleTest {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the circle's radius");
        
        double radius = keyboard.nextDouble();
        
        Circle circle1 = new Circle(radius);
        System.out.println("Radius of the circle is " + circle1.getRadius());
        System.out.println("Area of the cirlce is " + circle1.getArea());
        System.out.println("Diameter of the circle is " + circle1.getDiameter());
        System.out.println("Circumference of the circle is " + circle1.getCircumference());
        
        
        
    }
}
