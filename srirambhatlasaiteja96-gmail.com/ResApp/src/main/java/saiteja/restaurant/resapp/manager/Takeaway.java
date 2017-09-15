/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saiteja.restaurant.resapp.manager;

import java.util.InputMismatchException;
import java.util.Scanner;
import saiteja.restaurant.rastaurantproject.menubeans.ShoppingCart;

import saiteja.restaurant.rastaurantproject.menubeans.Menu;

/**
 *
 * @author saiteja
 */
public class Takeaway {
      private ShoppingCart shoppingcart;
    private Menu menubean;
  public Takeaway(Menu menubean, ShoppingCart shoppingcart){
        this.menubean=menubean;
        this.shoppingcart= shoppingcart;
    }
    public void StartConv() throws InterruptedException{
        
        System.out.println("Counter boy:Hello sir welcome to our restaurant");
         Thread.sleep(1000);
        System.out.println("Customer:Thanqu ");
         Thread.sleep(1000);
        System.out.println("Counter boy:Here is the menu sir please select your items ");
        displayMenuArray();
        
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
                         System.out.println("Manager: sir you did no order any items ,Please exit the menu after ordering");
                         displayMenuArray();
                        
                    }else{
                    
                        System.out.println("Manager : Thank you Sir, We serve you Items of your Order in a while");
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
                    displayMenuArray();
                    break;
                case 6:
                     
                    menuObj.roti(menubean);
                    displayMenuArray();
                    break;
             
                
                default: {
                    System.out.println("Counter boy : Sorry sir i did not get you please select the right option");
                    displayMenuArray();
                    break;
                }
                   
            }
          
        }
        catch(InputMismatchException me){
            System.out.println("Counterboy : Sorry sir i did not get you please select the right option");
            displayMenuArray();
         
        }
        return menuSelect;
    }
      public void recieveParcel() throws InterruptedException{
           Thread.sleep(1000);
          System.out.println("Customer pays the bill");
           Thread.sleep(1000);
          System.out.println("Customer recieves the parcel from the barer");
           Thread.sleep(1000);
          System.out.println("Manager: Thanks for visting our restaurant sir,hope you had a nice time");
           Thread.sleep(1000);
          System.out.println("Customer:Thanqu");
           Thread.sleep(1000);
          System.out.println("Customer leaves the parcel counter");
          
      }   
        
}
