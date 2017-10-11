/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_mathcalculations;

/**
 *
 * @author MagShehu
 */
public class CourseWork_MathCalculations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // declare variables
        double firstQuestion;
        double X, Y;
        double secondQuestion1, finalSecondQuestion1, secondQuestion2, finalSecondQuestion2;
        double b, A, C;
        double thirdQuestion;
        double P, R, T;
        double fourthQuestion, finalFourthQuestion;
        double fifthQuestion;
        double X1;

    // initialise variables;
        X = Math.pow(5, 0.5);
        Y = Math.pow(3, 2);
        b = Math.pow(2, 2);
        A = Math.pow(1, 2);
        C = 5;
        P = 1000000;
        R = 0.1;
        T = 5;
        X1 = 90;

    // perform calculations
        //first question
        firstQuestion = X + Y - Math.sqrt(5-1)/200;

        // second question
        secondQuestion1 = Math.pow(b, 2) + (Math.sqrt(Math.pow(b, 2) - 4 * A * C) / 2 * A);
        
        secondQuestion2 = Math.pow(b, 2) - (Math.sqrt(Math.pow(b, 2) - 4 * A * C) / 2 * A);

        // third question
        thirdQuestion = (P * R * T)/100;

        // fourth question
        fourthQuestion = Math.pow(X, 2) + Math.pow(Y, 2) + Math.sqrt(X - Y)/Math.sqrt(X + Y) / 100;
        
        // fifth question
        fifthQuestion = Math.cos(X1) + Math.tan(X1) + Math.sin(X1);

    // print statement
        System.out.println("The answer to the first question is " + firstQuestion);
        System.out.println("The answer to the second question is " + secondQuestion1 + " and " + secondQuestion2);
        System.out.println("The answer to the third question is " + thirdQuestion);
        System.out.println("The answer to the fourth question is " + fourthQuestion);
        System.out.println("The answer to the fifth question is " + fifthQuestion);
    }
    
}
