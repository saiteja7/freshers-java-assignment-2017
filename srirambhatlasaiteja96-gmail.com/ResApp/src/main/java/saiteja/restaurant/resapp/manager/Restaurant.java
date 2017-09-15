/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saiteja.restaurant.resapp.manager;

import saiteja.restaurant.resapp.billing.RestaurantConfiguration;
import java.util.InputMismatchException;
import java.util.Scanner;
import saiteja.restaurant.rastaurantproject.menubeans.ShoppingCart;

import saiteja.restaurant.rastaurantproject.menubeans.Menu;

import saiteja.restaurant.resapp.watchmen.CustomerWatchmen;

/**
 *
 * @author saiteja
 */
public class Restaurant {
    private ShoppingCart shoppingcart;
    private Menu menubean;
    public Restaurant(Menu menubean, ShoppingCart shoppingcart){
        this.menubean=menubean;
        this.shoppingcart=shoppingcart;
    }
    CustomerWatchmen cwatch;
    // 
    public void CustomerArrived()  {
        try {
        System.out.println("Manager : Guys,Customer is coming get ready to serve...");
        Thread.sleep(1000);
        System.out.println("customer has arrived.");
        Thread.sleep(1000);
        System.out.println("Host:Good morning sir Welcome to Novotel.");
        Thread.sleep(1000);
        System.out.println("customer : Thank you");
        Thread.sleep(1000);
        System.out.println("Manager : server, clean that table number 7. ");
        Thread.sleep(1000);
        System.out.println("Server: Okay sir 2 mints");
        Thread.sleep(1000);
        System.out.println("Manager:Sir just 2 mints");
        Thread.sleep(1000);
        System.out.println("Cutomer : It's okay");
        Thread.sleep(1000);
        System.out.println("Manager : sir you can have your seat");
        Thread.sleep(1000);
        System.out.println("Customer : Thank you");
        Thread.sleep(1000);
        System.out.println("Manager:Sir,Here is the Menu.");
        displayMenuArray();
        }
        catch(InterruptedException ie) {
         ie.printStackTrace();
        }
        
  
        }
    public int displayMenuArray(){
        MenuItems menuObj=new MenuItems(menubean, shoppingcart);
        int menuSelect=0;
      
        try{
            Scanner scanner = new Scanner(System.in);
            menuSelect = scanner.nextInt();
            switch(menuSelect){
                case 0: {
                    if(shoppingcart.getShoppingcart().isEmpty()){
                         System.out.println("Manager : sir you did not order any items,Please exit the menu after ordering".toUpperCase());
                         displayMenuArray();
                        
                    }else {
                    
                        System.out.println("Manager : Thank you Sir, We  will serve the Items of your Order in a while");
                    }
                    break;
                }
                case 1: { 
                    menuObj.starter(menubean);
                    displayMenuArray();
                 
                    break;
                }
                case 2: {
               menuObj.primarydish(menubean);
                    displayMenuArray();
                    break;
                }
                case 3: {
                    menuObj.curry(menubean);
                    displayMenuArray();
                    break;
                }
                case 4: {
                   menuObj.dessert(menubean);
                    displayMenuArray();
                    break;
                }
                case 5:
                    menuObj.drinks(menubean);
                   
                  System.out.println("Press 0 to finish your Order.");
                    
                    displayMenuArray();
                    break;
                case 6:
                     menuObj.roti(menubean);
                   
                   
                    displayMenuArray();
                    break;
     
                default: {
                    System.out.println("Manager : Sorry sir i did not get you please select the right option");
                    displayMenuArray();
                    break;
                }
                   
            }
          
        }
        catch(InputMismatchException me){
            System.out.println("Manager : Sorry sir i did not get you please select the right option");
            displayMenuArray();
         
        }
        return menuSelect;
    }
public void customerRating() throws InterruptedException{

    System.out.println("Manager:Sir please rate our service out of 10 ");
    try{
           Scanner sc = new Scanner(System.in);
            System.out.println("Give your rating between 1 and 10 ");
            int rating = sc.nextInt();
            if(rating == 0 || rating > 10){
        System.out.println("Manager:Sir i did not get you please select right option ");
        customerRating();
                
            }else if(rating>9 && rating<=10){
                System.out.println("Manager:Thats great! You have given us "+rating +" rating, I think you are very much satisfied with the service sir.Thanqu sir.");
            }else if(rating>6 && rating<=8){
                System.out.println("Manager: You have given us "+rating +" rating, I think you are not very much satisfied with the service sir.We willtry to improve sir Thanqu.");
            }
            else if(rating>0 && rating<=5){
                System.out.println("Manager: You have given us "+rating +" rating, I think you are extremely dissapointed  with our service sir.Sorry for the inconvinience sir,We will try to improve  Thanqu.");
            }
            customerLeaves();
           
            
    }catch(InputMismatchException me){
          System.out.println("Manager:Sir i did not get you please select right option");
         
             
          customerRating();
        
    }
    
}
public void customerLeaves() throws InterruptedException{
     Thread.sleep(1000);
    System.out.println("Customer pays the bill ");
     Thread.sleep(1000);
     System.out.println("Manager:Thanks for visiting our restaurant sir ");
      Thread.sleep(1000);
      System.out.println("Customer: Thanqu had a nice time.");
}

    
}
