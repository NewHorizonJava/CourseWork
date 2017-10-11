/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework_ifstatement;

/**
 *
 * @author MagShehu
 */
public class CourseWork_IfStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double balance = 1000.00;
        String today = "xmas";
        boolean WifeIsWilling = true;
        
        if (balance == 100000)
        {
            if(today=="xmas")
            {
                if (WifeIsWilling)
                {
                    System.out.println("Let's go to Shoprite");
                }
            }
        }
        
        if (balance == 1000)
        {
            System.out.println("pay him cash");
        }
        
        if (balance == 1000)
        {
            System.out.println("pay him cash");
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }
    
}
