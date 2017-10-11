/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_operators;

/**
 *
 * @author MagShehu
 */
public class CourseWork_Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declare variables
        int a, b;
        int addition;
        int multiplication;
        int subtraction;
        int division;
        int modulus;
        int increment;
        int decrement;
        
        //initialise variables
        a = 10;
        b= 5;
        
        //perform calculations
        addition = a + b;
        subtraction = a - b;
        multiplication = a * b;
        division = a / b;
        modulus = a%b;
       
        
        //print results
        System.out.println("Addition : " + a + " + " + b + " = " + addition);
        System.out.println("Subtration : " + a + " - " + b + " = " + subtraction);
        System.out.println("Multiplication : " + a + " x " + b + " = " + multiplication);
        System.out.println("Division : " + a + " / " + b + " = " + division);
        System.out.println("Modulus : " + a + " % " + b + " = " + modulus);
        
        increment = ++a;
        decrement = --b;
        
        System.out.println("Increment : 10 increased by 1 = " + increment);
        System.out.println("Decrement : 5 decreased by 1 = " + decrement);
    }
    
}
