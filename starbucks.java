package main;

import java.util.Scanner;

public class starbucks {

    Scanner input = new Scanner(System.in);

    char choose;
    int beverage, espresso, drizzle;
    double price1, price2, newprice1, newprice2,totalprice;

    starbucks() {
        System.out.println("This is our Special Bundle Deals:\nA. VIA Columbia(12 Sachets)\t\t\tfrom RM 37.68\nB. VIA Italian Roast(12 Sachets)\t\tfrom RM 37.68");
        System.out.println("Enter choose: ");
        char choose = input.next().charAt(0);
       
        if (choose == 'A' || choose == 'B') {
            System.out.println("Choice of Beverage: \n1. Grande Mocha Frappucino\t\t\t+RM 0.00");
            this.beverage = input.nextInt();
        } else {
            System.out.println("WRONG CODE!\n");
     System.out.println("Choice of Beverage: \n1. Grande Mocha Frappucino\t\t\t+RM 0.00");
            this.beverage = input.nextInt();
        }

        System.out.println("Add-on Espresso\nChoose One");
        System.out.println("1. 1 shot espresso\t\t\t+RM 2.12\n2. 2 shots espresso\t\t\t+RM 4.24");
        int espresso = input.nextInt();
        if (espresso == 1) {
            this.price1 = 37.68 + 2.12;
        } else {

            this.price2 = 37.68 + 4.24;

        }
        System.out.println("Add-on Drizzle\nChoose one");
        System.out.println("1. Caramel Drizzle\t\t\t+RM 2.12\n2. Upside down Caramel Drizzle\t\t+RM 4.24");
        int drizzle = input.nextInt();
        if (drizzle == 1) {
            this.newprice1 = this.price1 + 2.12;
        } else {
            this.newprice2 = this.price2 + 4.24;
        }
        
       
    }

    starbucks(double price1, double price2, double newprice1, double newprice2) {
        
       
        this.price1 = price1;
        this.price2 = price2;
        this.newprice1 = newprice1;
        this.newprice2 = newprice2;
        this.totalprice=totalprice;
    }
}
