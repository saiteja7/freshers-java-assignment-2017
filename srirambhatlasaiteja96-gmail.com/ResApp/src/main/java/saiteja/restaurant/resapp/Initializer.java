/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saiteja.restaurant.resapp;

import saiteja.restaurant.resapp.billing.CustomerBilling;
import saiteja.restaurant.resapp.billing.RestaurantConfiguration;
import saiteja.restaurant.resapp.cooking.CookingOrder;
import saiteja.restaurant.resapp.manager.Restaurant;
import saiteja.restaurant.resapp.manager.MenuItems;
import saiteja.restaurant.resapp.manager.Takeaway;
import saiteja.restaurant.rastaurantproject.menubeans.ShoppingCart;
import saiteja.restaurant.rastaurantproject.menubeans.Menu;

import saiteja.restaurant.resapp.watchmen.CustomerWatchmen;

/**
 *
 * @author saiteja
 */
public class Initializer {
  
    public Initializer() {
      
    }
   
     public static void main(String args[]) throws InterruptedException{
         Initializer init=new Initializer();
         
       /* Customer Watchmen interaction */
          CustomerWatchmen cwatch = new CustomerWatchmen() ;
           cwatch.watchmenIntroCustomer();
           cwatch.startConversation();
        ShoppingCart shoppingcart=new ShoppingCart();
         RestaurantConfiguration resConfigObj=new RestaurantConfiguration();
         Menu menubean=resConfigObj.dataConfiguration();
         CookingOrder cookObj=new CookingOrder(shoppingcart);
         CustomerBilling cusbill=new CustomerBilling(shoppingcart);
      if(cwatch.Restaurant==true){
       /* Manager Customer interaction*/
       Restaurant managerObj=new Restaurant(menubean, shoppingcart);
       managerObj.CustomerArrived();
       
       
       cookObj.cookingOrderList();
       cookObj.cookserveCustomer();
   
       cusbill.customerBill();
       managerObj.customerRating();
       cwatch.custwatchfinalconv();


      }else if(cwatch.Restaurant==false){
          Takeaway takeaway = new Takeaway(menubean, shoppingcart);
          takeaway.StartConv();
           cookObj.cookingOrderList();
           cookObj.cookserveCustomer();
           cusbill.customerBill();
            takeaway.recieveParcel();
            cwatch.custwatchfinalconv();
         
          
      } 
       
       /*  Getting mENU iTEMS FROM cONFIG File. MenuList Ready, Initializing ShoppingCart */

    }
    
}
