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
public class MenuItems {

    private ShoppingCart shoppingcart;
     int quantitySelect=0;
    public int quantitySelection() {
         System.out.println(" How many Quantity, do you want?");
            
      
                    try {
                   Scanner scanner = new Scanner(System.in);
          
                      quantitySelect = scanner.nextInt();
           
                        
                    }
                  
                      catch(InputMismatchException me){
                              System.out.println("Sorry sir i did not get please select the right quantity");
                            quantitySelection() ;
                          
                          }
                      
                  if(quantitySelect==0){
                            System.out.println("Sorry sir i did not get please select the right quantity");
                            
                            quantitySelection() ;
                        }
                  
                    
       return quantitySelect;        
    }

public MenuItems(Menu menubean, ShoppingCart shoppingcart) {
       
         this.shoppingcart=shoppingcart;
         if(shoppingcart.getShoppingcart().isEmpty()==false){
                  System.out.println("PRESS 0 TO EXIT MENU AND CONFIRM YOUR ORDER ");
             }
         
    
        for(int index=0;index<menubean.getMenu().size();index++) {
          System.out.println((index+1)+". "+menubean.getMenu().get(index));
        }
        
   }

    
    
    
    public boolean curry(Menu menubean){
        boolean done = false;
       int starterlength=menubean.getCurries().size();
        
        System.out.println("Press 0 to finish your Order on curry".toUpperCase());
       for(int index=0;index<menubean.getCurries().size();index++) {
           String item=menubean.getCurries().get(index).getItem();
           int itemPrice = menubean.getCurries().get(index).getItemprice();
           String currency= menubean.getCurries().get(index).getItemcurrency();
           System.out.println((index+1)+". "+item+"  "+itemPrice+" "+currency);
       }

       int menuSelect=0;
       
        try {
            Scanner scanner = new Scanner(System.in);
            menuSelect = scanner.nextInt();
            
            
            if(menuSelect==0) {
               System.out.println("Thank you for visiting Our Starters Menu");
               done=true;
            }
            
            else  if(menuSelect>=1 && menuSelect<=starterlength) {
                
                  /* Number of Quantity */
                 int quantity = quantitySelection();
                  
                 String item =  menubean.getCurries().get(menuSelect-1).getItem();
                 int itemPrice = menubean.getCurries().get(menuSelect-1).getItemprice();
                 String currency= menubean.getCurries().get(menuSelect-1).getItemcurrency();
                 shoppingcart.setShoppingcart(item, quantity, itemPrice);
                curry(menubean);
                 
            } else {
                System.out.println(" Sorry sir i did not get you please select the right option".toUpperCase());
                 curry(menubean);
            }
        }
                catch(InputMismatchException me){
            System.out.println(" Sorry sir i did not get you please select the right option".toUpperCase());
              curry(menubean);
          
}
     return done;
    }
    public boolean dessert(Menu menubean){
        boolean done = false;
        
         int starterlength=menubean.getDeserts().size();
        
        System.out.println("Press 0 to finish your Order on dessert.".toUpperCase());
       for(int index=0;index<menubean.getDeserts().size();index++) {
           String item=menubean.getDeserts().get(index).getItem();
           int itemPrice = menubean.getDeserts().get(index).getItemprice();
           String currency= menubean.getDeserts().get(index).getItemcurrency();
           System.out.println((index+1)+". "+item+"  "+itemPrice+" "+currency);
       }

       int menuSelect=0;
       
        try {
            Scanner scanner = new Scanner(System.in);
            menuSelect = scanner.nextInt();
            
            
            if(menuSelect==0) {
               System.out.println("Thank you for visiting Our Starters Menu");
               done=true;
            }
            
            else  if(menuSelect>=1 && menuSelect<=starterlength) {
        int quantity = quantitySelection();
                  
                 String item =  menubean.getDeserts().get(menuSelect-1).getItem();
                 int itemPrice = menubean.getDeserts().get(menuSelect-1).getItemprice();
                 String currency= menubean.getDeserts().get(menuSelect-1).getItemcurrency();
                 shoppingcart.setShoppingcart(item, quantity, itemPrice);
                 dessert(menubean);
                 
            } else {
                System.out.println(" Sorry sir i did not get you please select the right option".toUpperCase());
                 dessert(menubean);
            }
        }
                catch(InputMismatchException me){
            System.out.println(" Sorry sir i did not get you please select the right option".toUpperCase());
              dessert(menubean);
          
}
     return done;
    }
    public boolean drinks(Menu menubean){
          boolean done=false;
         int starterlength=menubean.getDrink().size();
        
        System.out.println("Press 0 to finish your Order on drinks.".toUpperCase());
       for(int index=0;index<menubean.getDrink().size();index++) {
           String item=menubean.getDrink().get(index).getItem();
           int itemPrice = menubean.getDrink().get(index).getItemprice();
           String currency= menubean.getDrink().get(index).getItemcurrency();
           System.out.println((index+1)+". "+item+"  "+itemPrice+" "+currency);
       }

       int menuSelect=0;
       
        try {
            Scanner scanner = new Scanner(System.in);
            menuSelect = scanner.nextInt();
            
            
            if(menuSelect==0) {
               System.out.println("Thank you for visiting Our Starters Menu");
               done=true;
            }
            
            else  if(menuSelect>=1 && menuSelect<=starterlength) {
                
                  /* Number of Quantity */
                 int quantity = quantitySelection();
                 String item =  menubean.getDrink().get(menuSelect-1).getItem();
                 int itemPrice = menubean.getDrink().get(menuSelect-1).getItemprice();
                 String currency= menubean.getDrink().get(menuSelect-1).getItemcurrency();
                 shoppingcart.setShoppingcart(item, quantity, itemPrice);
                drinks(menubean);
                 
            } else {
                System.out.println(" Sorry sir i did not get you please select the right option".toUpperCase());
                 drinks(menubean);
            }
        }
                catch(InputMismatchException me){
            System.out.println(" Sorry sir i did not get you please select the right option".toUpperCase());
            drinks(menubean);
          
}
     return done;
             
        
        
    }
    public boolean roti(Menu menubean){
              boolean done=false;
         int starterlength=menubean.getRotis().size();
        
        System.out.println("Press 0 to finish your Order onRoti.".toUpperCase());
       for(int index=0;index<menubean.getRotis().size();index++) {
           String item=menubean.getRotis().get(index).getItem();
           int itemPrice = menubean.getRotis().get(index).getItemprice();
           String currency= menubean.getRotis().get(index).getItemcurrency();
           System.out.println((index+1)+". "+item+"  "+itemPrice+" "+currency);
       }

       int menuSelect=0;
       
        try {
            Scanner scanner = new Scanner(System.in);
            menuSelect = scanner.nextInt();
            
            
            if(menuSelect==0) {
               System.out.println("Thank you for visiting Our Starters Menu");
               done=true;
            }
            
            else  if(menuSelect>=1 && menuSelect<=starterlength) {
                
                  /* Number of Quantity */
                 int quantity = quantitySelection();
                  
                 String item =  menubean.getRotis().get(menuSelect-1).getItem();
                 int itemPrice = menubean.getRotis().get(menuSelect-1).getItemprice();
                 String currency= menubean.getRotis().get(menuSelect-1).getItemcurrency();
                 shoppingcart.setShoppingcart(item, quantity, itemPrice);
                roti(menubean);
                 
            } else {
                System.out.println(" Sorry sir i did not get you please select the right option".toUpperCase());
                 roti(menubean);
            }
        }
                catch(InputMismatchException me){
            System.out.println(" Sorry sir i did not get you please select the right option".toUpperCase());
              roti(menubean);
          
}
     return done;
        }
             
        
        
    

    public boolean starter(Menu menubean){
         boolean done=false;
         int starterlength=menubean.getStarters().size();
        
        System.out.println("Press 0 to finish your Order on starter.".toUpperCase());
       for(int index=0;index<menubean.getStarters().size();index++) {
           String item=menubean.getStarters().get(index).getItem();
           int itemPrice = menubean.getStarters().get(index).getItemprice();
           String currency= menubean.getStarters().get(index).getItemcurrency();
           System.out.println((index+1)+". "+item+"  "+itemPrice+" "+currency);
       }

       int menuSelect=0;
       
        try {
            Scanner scanner = new Scanner(System.in);
            menuSelect = scanner.nextInt();
            
            
            if(menuSelect==0) {
               System.out.println("Thank you for visiting Our Starters Menu");
               done=true;
            }
            
            else  if(menuSelect>=1 && menuSelect<=starterlength) {
                
                  /* Number of Quantity */
                 int quantity = quantitySelection();
                  
                 String item =  menubean.getStarters().get(menuSelect-1).getItem();
                 int itemPrice = menubean.getStarters().get(menuSelect-1).getItemprice();
                 String currency= menubean.getStarters().get(menuSelect-1).getItemcurrency();
                 shoppingcart.setShoppingcart(item, quantity, itemPrice);
                 starter(menubean);
                 
            } else {
                System.out.println(" Sorry sir i did not get you please select the right option".toUpperCase());
                 starter(menubean);
            }
        }
                catch(InputMismatchException me){
            System.out.println(" Sorry sir i did not get you please select the right option".toUpperCase());
              starter(menubean);
          
}
     return done;
            
} 
     public boolean primarydish(Menu menubean){
        boolean done = false;
       int starterlength=menubean.getPrimarydish().size();
        
        System.out.println("Press 0 to finish your Order on primary dish.".toUpperCase());
       for(int index=0;index<menubean.getPrimarydish().size();index++) {
           String item=menubean.getPrimarydish().get(index).getItem();
           int itemPrice = menubean.getPrimarydish().get(index).getItemprice();
           String currency= menubean.getPrimarydish().get(index).getItemcurrency();
           System.out.println((index+1)+". "+item+"  "+itemPrice+" "+currency);
       }

       int menuSelect=0;
       
        try {
            Scanner scanner = new Scanner(System.in);
            menuSelect = scanner.nextInt();
            
            
            if(menuSelect==0) {
               System.out.println("Thank you for visiting Ourprimary dish");
               done=true;
            }
            
            else  if(menuSelect>=1 && menuSelect<=starterlength) {
                
                  /* Number of Quantity */
                 int quantity = quantitySelection();
                  
                 String item =  menubean.getPrimarydish().get(menuSelect-1).getItem();
                 int itemPrice = menubean.getPrimarydish().get(menuSelect-1).getItemprice();
                 String currency= menubean.getPrimarydish().get(menuSelect-1).getItemcurrency();
                 shoppingcart.setShoppingcart(item, quantity, itemPrice);
                primarydish(menubean);
                 
            } else {
                System.out.println(" Sorry sir i did not get you please select the right option".toUpperCase());
                 primarydish(menubean);
            }
        }
                catch(InputMismatchException me){
            System.out.println(" Sorry sir i did not get you please select the right option".toUpperCase());
              primarydish(menubean);
          
}
     return done;
    }
    
    


 
}
        
    
