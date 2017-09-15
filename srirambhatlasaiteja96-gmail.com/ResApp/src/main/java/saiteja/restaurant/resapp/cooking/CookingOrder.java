/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saiteja.restaurant.resapp.cooking;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import saiteja.restaurant.rastaurantproject.menubeans.ShoppingCart;

/**
 *
 * @author saiteja
 */
public class CookingOrder {
    private ShoppingCart shoppingcart;
    
    public CookingOrder(ShoppingCart shoppingcart) {
        this.shoppingcart=shoppingcart;
    }
    
    public void cookingOrderList() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Manager: We got an Order from Customer. Here is the List:");
        HashMap<String, HashMap<Integer, Integer>> hmap=shoppingcart.getShoppingcart();
         
         System.out.println("Item            Quantity ");
         
    for(Iterator it1 = hmap.entrySet().iterator();it1.hasNext();){
        Map.Entry pair1 = (Map.Entry)it1.next();
        String item=pair1.getKey().toString();
        HashMap<Integer, Integer> qpmap=(HashMap<Integer, Integer>) pair1.getValue();
         for(Iterator it2 = qpmap.entrySet().iterator();it2.hasNext();){
            Map.Entry pair2 = (Map.Entry)it2.next();
           int quantity=Integer.parseInt(pair2.getKey().toString());
           
           System.out.println(item+"  "+quantity);
           
        }
        
    }
     Thread.sleep(1000);
         System.out.println("Cook recieves the order ");
        
    }
    
    public void cookserveCustomer() throws InterruptedException {
         Thread.sleep(1000);
        System.out.println("Cook completes cooking and sends the food ask barer to take the food to customer.");
         Thread.sleep(1000);
        System.out.println("{Customer had his Food}");
    }
}
