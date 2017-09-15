/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saiteja.restaurant.resapp.billing;

import saiteja.restaurant.resapp.cooking.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import saiteja.restaurant.rastaurantproject.menubeans.ShoppingCart;

/**
 *
 * @author saiteja
 */
public class CustomerBilling {
    private ShoppingCart shoppingcart;
    
    public CustomerBilling(ShoppingCart shoppingcart) {
        this.shoppingcart=shoppingcart;
    }
    
    public void customerBill() throws InterruptedException {
        System.out.println("Manager: Here is your Bill Sir:");
        HashMap<String, HashMap<Integer, Integer>> hmap=shoppingcart.getShoppingcart();
         
         System.out.println("Item Quantity Price Total    ");

         
         int totalamount=0;
         float totalBill = 0;
         float IntrestAmount=0; 
    for(Iterator it1 = hmap.entrySet().iterator();it1.hasNext();){
        Map.Entry pair1 = (Map.Entry)it1.next();
        String item=pair1.getKey().toString();
        HashMap<Integer, Integer> qpmap=(HashMap<Integer, Integer>) pair1.getValue();
         for(Iterator it2 = qpmap.entrySet().iterator();it2.hasNext();){
            Map.Entry pair2 = (Map.Entry)it2.next();
           int quantity=Integer.parseInt(pair2.getKey().toString());
           int price=Integer.parseInt(pair2.getValue().toString());
           int q_total=quantity*price;
          totalamount=totalamount+q_total;
          
        IntrestAmount = (float) (totalamount*0.18);
           totalBill = (float)(IntrestAmount+  totalamount);
           System.out.println(item+"   "+quantity+"   "+price+"   "+q_total);
           
        }
       
    }
    Thread.sleep(1000);
    System.out.println("=============================================================");
     System.out.println("TOTAL: Your total items charge is " + totalamount + " Service charge is 10% CGST is 9% SGST is 9% \n "+totalamount+"+"+ IntrestAmount +" = "+ totalBill );

    System.out.println("=============================================================");
    }
}
