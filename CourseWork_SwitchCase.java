/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_switchcase;

/**
 *
 * @author MagShehu
 */
public class CourseWork_SwitchCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char grade = 'B';
        switch (grade)
        {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Very Good");
                break;
            case 'C':
                System.out.println("Good");
                break;
            case 'D':
                System.out.println("Passed");
                break;
            case 'F':
                System.out.println("Failed");
                break;
            default:
                System.out.println("Invalid Grade");
                
        }
              int a = 10; int b = 10; int z = 0;
              
              z = (a==b)?20:30;
              System.out.println(z);
    }
    
}
