package saiteja.restaurant.restaurantapp;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CustomerWatchmen {



    TakeAway takeAway = new TakeAway();
    Restaurant restaurant = new Restaurant();
    int mode;
   String displayWalkinMode[] = {"1.Restaurant, 2.Take away"};
   Scanner scanner = new Scanner(System.in);
    public void startConv()   {
        System.out.println("At the gate of the Restaurant named Novotel ");
        System.out.println("Watch men watches a customer comming in a car and open the gate ");
        System.out.println("customer to watchmen ");
        System.out.println("Customer : Is valet parking available ?");
        System.out.println("Watchmen : Yes Sir, please tell you name nd mobile number we will register your details");
        System.out.println("Customer :My name is saiteja and my mobile number is 999999999");
        System.out.println("Watchmen notes the car number and the details of customer and asks the parking boy to park the vehicle");
        System.out.println("Watchmen:Sir,Do you need restaurent or Take away ?");
        for (int i=0;i<displayWalkinMode.length;i++){
            System.out.println(displayWalkinMode[i]);
        }
        System.out.println("Press 1 for Restaurant and 2 for take away");
        mode = scanner.nextInt();
        
        switch (mode){
            case 1:
                System.out.println("Watchmen :Sir please go Straight you will find the entrance there ");
                System.out.println("Customer:Okay Thanku");
        {
            try {
                restaurant.CustomerArrived();
            } catch (InterruptedException ex) {
                Logger.getLogger(CustomerWatchmen.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Please press correct input");
            }
        }
       
              break;
            case 2:
                System.out.println("Watchmen :Sir please go Straight and take left there");
                System.out.println("Customer:Okay Thanku");
                takeAway.customerArraived();
                break;
                default:
                    System.out.println("Select right option ");
                    for (int i=0;i<displayWalkinMode.length;i++){
                        System.out.println(displayWalkinMode[i]);
                    }

        }
      
    }
}
