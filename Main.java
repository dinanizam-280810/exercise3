
package main;


public class Main {

    
    public static void main(String[] args) {
       System.out.print("Welcome To Starbucks");
              System.out.print("Please remind that you can only enter(1 or 0) and (A or B)");
              starbucks menu=new starbucks();
          
              
          System.out.println(" 1 shot espresso\t\tRM 2.12"+menu.price1);
          System.out.println(" 2 shots espresso\t\tRM 4.24"+menu.price2);
          System.out.println(" Caramel Drizzle\t\tRM  2.12"+menu.newprice1);
          System.out.println(" Upside down Caramel Drizzle\t\tRM 4.24"+menu.newprice2);
            
    }
    
}
