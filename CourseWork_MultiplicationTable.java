/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_multiplicationtable;

/**
 *
 * @author MagShehu
 */
public class CourseWork_MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int x =1 ; x <=12; x++){
            System.out.println("Table for " + x);
            for (int y = 1; y <=12; y++)
            {
                System.out.println(x+"x"+y+"="+(x*y));
            }
        }
    }
    
}
