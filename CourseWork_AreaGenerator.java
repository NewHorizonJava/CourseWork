/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areagenerator;

/**
 *
 * @author MagShehu
 */
public class AreaGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // declare triangle variables
        double TriangleBase;
        double trianlgeHeight;
        double TriangleArea;

    // declare numbers variables
        double half;
        double pi;
        double fiveNumbers;

    // declare cone variables
        double coneRadius;
        double coneHeight;
        double coneArea;
        double coneVolume;

    // declare square variables
        double squareArea;
        double squareLength;

    // declare money variables
        double nairaValue;
        double dollarValue;
        double dollarToNaira;
        float dollarFinalValue;
        float nairaFinalValue;
        double nairaToDollar;
        double conversionRate;

    // initialise variables
        TriangleBase = 34.5;
        trianlgeHeight = 43.5;
        half = 0.5;
        coneRadius = 5.20;
        coneHeight = 20.45;
        squareLength = 4.54;
        pi = 3.142;
        conversionRate = 354.50;
        nairaValue = 30000;
        dollarValue = 50;

    // perform calculations
        TriangleArea = half * trianlgeHeight * TriangleBase;
        coneArea = pi * coneRadius * (coneRadius + Math.sqrt((coneHeight*coneHeight) + (coneRadius * coneRadius)));
        coneVolume = pi * (coneRadius * coneRadius) * coneHeight/3;
        squareArea = squareLength * squareLength;
        dollarToNaira = dollarValue * conversionRate;
        nairaFinalValue = (float)dollarToNaira;
        nairaToDollar = nairaValue / conversionRate;
        dollarFinalValue = (float)nairaToDollar;
        fiveNumbers = TriangleBase + trianlgeHeight + coneHeight + coneRadius + squareLength;

    // display information
        System.out.print("\nThe Area of the Triangle is "+ TriangleArea + "\n");
        System.out.print("\nThe Area of the Cone is "+coneArea);
        System.out.print("\nThe Volume of the Cone is "+coneVolume + "\n");
        System.out.print("\nThe Area of the Square is "+squareArea + "\n");
        System.out.print("\nThe Value of " + nairaValue + "Naira in Dollars is " + dollarFinalValue + " Dollars");
        System.out.print("\nThe Value of " + dollarValue + "Dollars in Naira is " + nairaFinalValue + " Naira\n");
        System.out.print("\nThe Addition of Five Numbers "+fiveNumbers + "\n");
    }
    
}
