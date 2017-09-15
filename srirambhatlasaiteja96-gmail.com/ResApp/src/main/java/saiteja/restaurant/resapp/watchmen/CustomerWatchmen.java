/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saiteja.restaurant.resapp.watchmen;

import java.awt.Color;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.InputMismatchException;
import javax.swing.JTextArea;
/** 
 *
 * @author saiteja
 */
public class CustomerWatchmen {
private int mode;
 public boolean Restaurant;

    
public static void main(String[] args){
    
    System.out.println("hello");
}
/* Class Description: The conversation between Customer and Watchmen */
    public void watchmenIntroCustomer() throws InterruptedException {

         System.out.println("At the gate of the Restaurant named Spicy hub ");
          Thread.sleep(1000);
        System.out.println("Watch men watches a customer comming in a car and open the gate ");
         Thread.sleep(1000);
        System.out.println("customer to watchmen ");
         Thread.sleep(1000);
        System.out.println("Customer : Is valLet parking available ?");
         Thread.sleep(1000);
        System.out.println("Watchmen : Yes Sir, please tell you name nd mobile number we will register your details");
         Thread.sleep(1000);
        System.out.println("Customer :My name is saiteja and my mobile number is 999999999");
         Thread.sleep(1000);
        System.out.println("Watchmen notes the car number and the details of customer and asks the parking boy to park the vehicle");
         Thread.sleep(1000);
        System.out.println("Watchmen:Sir,Do you need restaurent or Take away ?");
         Thread.sleep(1000);
        System.out.println("Press 1 for Restaurant and 2 for take away".toUpperCase());
       
    }
    public void startConversation() throws InterruptedException   {
        /* Method Description : */
        
        Scanner scanner = new Scanner(System.in);
        try {
       int mode = scanner.nextInt();
          if(mode==1) {
          
              Restaurant = true;
            
                System.out.println("Watchmen :Sir please go Straight you will find the entrance there ");
                 Thread.sleep(1000);
                System.out.println("Customer:Okay Thank you");
           
          }
          else if(mode==2){
      
               Restaurant = false;
           
              System.out.println("Watchmen: Go to Straight and take right you will find there");
               Thread.sleep(1000);
              System.out.println("okay thank you");
        
          }
          else {
             
              System.out.println("Watchmen: I didn't get you Sir.");
               Thread.sleep(1000);
            System.out.println("Watchmen: Please let me know, Do you need restaurent or Take away ?");
             Thread.sleep(1000);
            System.out.println("Press 1 for Restaurant and 2 for take away");
             Thread.sleep(1000);
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

    public void custwatchfinalconv() throws InterruptedException{
         Thread.sleep(1000);
        System.out.println("Customer:Watchmen my car number is AP29BR9251,Get my car ....");
         Thread.sleep(1000);
         System.out.println("Watchmen: Okay sir just 5 mints.");
          Thread.sleep(1000);
          System.out.println("Watchmen tells parking boy to bring the car ");
           Thread.sleep(1000);
           System.out.println("Watchmen: Sir,Here is your car please sign her in the register...");
            Thread.sleep(1000);
            System.out.println("Customer sign in the register and leaves");
             Thread.sleep(1000);
              System.out.println("Watchmen: Thank you sir.");
               Thread.sleep(1000);
                System.out.println("Customer:welcome");
                 Thread.sleep(1000);
                  System.out.println("Customer leaves the restaurant.");
                   Thread.sleep(1000);
                  
    }
       
     public int getMode() {
     System.out.println(mode);
               
     return mode;
    }

    public void setMode(int mode) {
  this.mode = mode;
    }

    
   
}
