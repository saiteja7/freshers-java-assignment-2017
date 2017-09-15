/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saiteja.restaurant.rastaurantproject.menubeans;

import java.util.HashMap;

/**
 *
 * @author saiteja
 */
public class ShoppingCart {
    
    private int quantity;
    
    private HashMap<String, HashMap<Integer,Integer>> shoppingcart; /* ItemName, Quantity, Individual Price */
    
    public ShoppingCart() {
        shoppingcart=new HashMap<String, HashMap<Integer, Integer>>();
        
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public HashMap<String, HashMap<Integer, Integer>> getShoppingcart() {
        return shoppingcart;
    }

    public void setShoppingcart(String itemName, int quantity, int price) {
       HashMap<Integer, Integer> qphmap=new HashMap<Integer, Integer>();
       qphmap.put(quantity, price);
       shoppingcart.put(itemName, qphmap);
    }
    
     
    
}
