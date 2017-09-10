/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saiteja.restaurant.resapp.manager;

import saiteja.restaurant.resapp.billing.RestaurantConfiguration;
import java.util.InputMismatchException;
import java.util.Scanner;
import saiteja.restaurant.resapp.menubean.Menu;

/**
 *
 * @author saiteja
 */
public class CustomerManager {
    
    public void CustomerArrived()  {
        try {
        System.out.println("Manager : Guys ,Customer is coming get ready to serve...");
        Thread.sleep(1000);
        System.out.println("customer has arrived ");
        Thread.sleep(1000);
        System.out.println("Host:Good morning sir Welcome to Novotel ");
        Thread.sleep(1000);
        System.out.println("customer : Thanq");
        Thread.sleep(1000);
        System.out.println("Manager : Hey maid clean that table number 7  ");
        Thread.sleep(1000);
        System.out.println("Maid : Okay sir 2 mints");
        Thread.sleep(1000);
        System.out.println("Manager:Sir just 2 mints");
        Thread.sleep(1000);
        System.out.println("Cutomer : It's okay");
        Thread.sleep(1000);
        System.out.println("Manager : sir you can have your seat");
        Thread.sleep(1000);
        System.out.println("Customer : Thanku");
        Thread.sleep(1000);
        System.out.println("Manager:Sir,Here is the Menu.");
        displayMenuArray();
        }
        catch(InterruptedException ie) {
         ie.printStackTrace();
        }
        
  
        }
    public int displayMenuArray(){
         
        RestaurantConfiguration resConfigObj=new RestaurantConfiguration();
        Menu menubean=resConfigObj.dataConfiguration();
        /* Getting mENU iTEMS FROM cONFIG File */
        MenuItems menuObj=new MenuItems(menubean);
        
        int menuSelect=0;
        try{
            Scanner scanner = new Scanner(System.in);
            menuSelect = scanner.nextInt();
            switch(menuSelect){
                case 0: {
                    System.out.println("Manager : Sorry sir i did not get you please select the right option");
                    displayMenuArray();
                    break;
                }
                case 1: { 
                    menuObj.starter(menubean);
                    break;
                }
                case 2: {
                    menuObj.maincourse(menubean);
                    break;
                }
                case 3: {
                    menuObj.curry(menubean);
                    break;
                }
                case 4: {
                    menuObj.roti(menubean);
                    break;
                }
                case 5:
                    menuObj.chinesse(menubean);
                    break;
                case 6:
                    menuObj.dessert(menubean);
                    break;
                case 7:
                    menuObj.drinks(menubean);
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
   
            
        
            
        
   
    
}
