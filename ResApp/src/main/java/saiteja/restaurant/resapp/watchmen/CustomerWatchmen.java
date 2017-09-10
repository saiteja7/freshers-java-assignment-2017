/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saiteja.restaurant.resapp.watchmen;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.InputMismatchException;
/**
 *
 * @author saiteja
 */
public class CustomerWatchmen {

/* Class Description: The conversation between Customer and Watchmen */
    public void watchmenIntroCustomer() {
       
         System.out.println("At the gate of the Restaurant named Novotel ");
        System.out.println("Watch men watches a customer comming in a car and open the gate ");
        System.out.println("customer to watchmen ");
        System.out.println("Customer : Is valet parking available ?");
        System.out.println("Watchmen : Yes Sir, please tell you name nd mobile number we will register your details");
        System.out.println("Customer :My name is saiteja and my mobile number is 999999999");
        System.out.println("Watchmen notes the car number and the details of customer and asks the parking boy to park the vehicle");
        System.out.println("Watchmen:Sir,Do you need restaurent or Take away ?");
        System.out.println("Press 1 for Restaurant and 2 for take away");
        new CustomerWatchmen().startConversation();
    }
    public void startConversation()   {
        /* Method Description : */
        
        Scanner scanner = new Scanner(System.in);
        try {
        int mode = scanner.nextInt();
          if(mode==1) {
              System.out.println("Watchmen :Sir please go Straight you will find the entrance there ");
                System.out.println("Customer:Okay Thanku");
          }
          else if(mode==2){
              System.out.println("Watchmen: Go to Takeover");
          }
          else {
              System.out.println("Watchmen: I didn't get you Sir.");
            System.out.println("Watchmen: Please let me know, Do you need restaurent or Take away ?");
            System.out.println("Press 1 for Restaurant and 2 for take away");
            new CustomerWatchmen().startConversation();
          }
        }
        catch(InputMismatchException me){
            System.out.println("Watchmen: I didn't get you Sir.");
            System.out.println("Watchmen: Please let me know, Do you need restaurent or Take away ?");
            System.out.println("Press 1 for Restaurant and 2 for take away");
            new CustomerWatchmen().startConversation();
        }
        
    }
    
   
}
