package com.company;

public class Main {

    public static void main(String[] args) {
        // array numbers
     /*   int [] numbers = new int [5];
        numbers [0] = 1;
        numbers [1] = 11;
        numbers [2] = 15;
        numbers [3] = 20;
        numbers [4] = 21;*/


        String name = "Muhammad Shehu";
        String phoneNumber = "080612345678";

        // Array of Item names
        String [] itemNames = new String[10];
        itemNames[0] = "Sharwarma     ";
        itemNames[1] = "Speedy        ";
        itemNames[2] = "Chin Chin     ";
        itemNames[3] = "Burger        ";
        itemNames[4] = "Coconut Cake  ";
        itemNames[5] = "French fries  ";
        itemNames[6] = "Rice          ";
        itemNames[7] = "Chicken       ";
        itemNames[8] = "Bread         ";
        itemNames[9] = "Water         ";

        // Array of Item prices
        double [] itemPrices = new double[10];
        itemPrices[0] = 1000.50;
        itemPrices[1] = 10.10;
        itemPrices[2] = 50.45;
        itemPrices[3] = 600.50;
        itemPrices[4] = 3000.30;
        itemPrices[5] = 300.60;
        itemPrices[6] = 300.65;
        itemPrices[7] = 800.01;
        itemPrices[8] = 100.65;
        itemPrices[9] = 50.75;

        //Array of Item quantity
        int [] itemQuantity = new int[10];
        itemQuantity[0] = 343;
        itemQuantity[1] = 2;
        itemQuantity[2] = 1;
        itemQuantity[3] = 4;
        itemQuantity[4] = 4;
        itemQuantity[5] = 5;
        itemQuantity[6] = 2;
        itemQuantity[7] = 4;
        itemQuantity[8] = 5;
        itemQuantity[9] = 2;

        //Array of Total Amount
        double [] itemTotalAmount = new double[10];
        double TotalAmount = 0;
        for (int i=0; i <= 9; i++)
        {
            itemTotalAmount[i] = itemPrices[i] * itemQuantity[i];
            itemTotalAmount[i] = itemTotalAmount[i] + 1;
            TotalAmount = TotalAmount + itemTotalAmount[i];
        }

        // Print Array Items with prices
        System.out.println("New Horizon International Supermarket");
        System.out.println("Name of Cashier: " + name + " Phone Number: " + phoneNumber);
        System.out.println("======================================");
        System.out.println("S/N\tItem Name   \tPrice  \tQty\tAmount");
        System.out.println("======================================");

        for (int x = 0; x <= 9; x++)
        {
            System.out.print(x+1 + "\t");
            System.out.print(itemNames[x] + '\t' + itemPrices[x] + '\t' + itemQuantity[x] + '\t' + itemTotalAmount[x]);
            System.out.println();
        }

        System.out.println("======================================");
        System.out.printf("Total Amount:               %.2f", TotalAmount);
        System.out.println();
        System.out.println("Thanks please call again");

        if (TotalAmount >= 10000 && TotalAmount <= 99999)
        {
            System.out.println("Bonanza! Bonanza! Bonanza! 5% discount");
            System.out.printf("New Amount:                 %.2f", TotalAmount*0.95);
            System.out.println();
        }
        else if(TotalAmount >= 100000 && TotalAmount <= 999999)
        {
            System.out.println("Invited for a dinner with the M.D on the 25th Dec 2017");
        }
        else if(TotalAmount >= 1000000 && TotalAmount <= 9999999)
        {
            System.out.println("You're qualified to buy any of our items at 25% discount from today till Dec 25, 2017");
        }
        else if(TotalAmount < 1000 && TotalAmount > 499)
        {
            System.out.println("Buy more next time to qualify for a discount");
        }
        else if(TotalAmount < 500 && TotalAmount > 0)
        {
            System.out.println("You're likely to use a student");
        }
        else
        {
            System.out.println("Gerrara here");
        }
        System.out.println("======================================");
    }
}
