package com.mycompany.lab4;


import com.mycompany.lab4.Car;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lukec
 */
public class CarMove {
    public static void main(String[] args) {
        Car test = new Car( 2020, "Tesla");
        
        for( int i = 0; i<5; ++i ){
        test.accelerate();
        System.out.println("Speed of the car is " + test.getSpeed());
    }
        for( int i = 0; i<5; ++i){
            test.brake();
            System.out.println("Speed of the car is " + test.getSpeed());
        }
            
}
}