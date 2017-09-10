/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saiteja.restaurant.resapp.manager;

import java.util.InputMismatchException;
import java.util.Scanner;
import saiteja.restaurant.resapp.billing.RestaurantConfiguration;
import saiteja.restaurant.resapp.menubean.Menu;

/**
 *
 * @author saiteja
 */
public class MenuItems {
    public MenuItems(Menu menubean) {
        for(int index=0;index<menubean.getMenu().size();index++) {
          System.out.println((index+1)+". "+menubean.getMenu().get(index));
        }
        
    }
    
    public void chinesse(Menu menubean) {
       
       for(int index=0;index<menubean.getChinese().size();index++) {
           System.out.println((index+1)+". "+menubean.getChinese().get(index).getItem());
       }
             int menuSelect=0;
        try{
            Scanner scanner = new Scanner(System.in);
            menuSelect = scanner.nextInt();
            switch(menuSelect){
                case 0: {
                    System.out.println("Manager : Sorry sir i did not get you please select the right option");
               chinesse( menubean);
                    break;
                }
                case 1: { 
                   String item =  menubean.getChinese().get(menuSelect-1).getItem();
                   System.out.println(item);
         
                 
                    break;
                }
                case 2: {
                    String item =  menubean.getChinese().get(menuSelect-1).getItem();
                   System.out.println(item);
   
                    break;
                }
                case 3: {
                      String item =  menubean.getChinese().get(menuSelect-1).getItem();
                   System.out.println(item);
            
                    break;
                }
                case 4: {
                      String item =  menubean.getChinese().get(menuSelect-1).getItem();
                   System.out.println(item);
              
                    break;
                }
                case 5:{
                      String item =  menubean.getChinese().get(menuSelect-1).getItem();
                   System.out.println(item);
                   
                    break;
                }
                case 6:{
                     String item =  menubean.getChinese().get(menuSelect-1).getItem();
                   System.out.println(item);
         
                    break;
                }
                case 7:{
                       String item =  menubean.getChinese().get(menuSelect-1).getItem();
                   System.out.println(item);
                   break;
                }
            
                default: {
                    System.out.println("Manager : Sorry sir i did not get you please select the right option");
             chinesse(menubean);
                    break;
                }
                    
            }
        }
        catch(InputMismatchException me){
            System.out.println("Manager : Sorry sir i did not get you please select the right option");
            chinesse(menubean);
          
         
        }
    }
    
    public void curry(Menu menubean){
             for(int index=0;index<menubean.getCurries().size();index++) {
           System.out.println((index+1)+". "+menubean.getCurries().get(index).getItem());
       }
                      int menuSelect=0;
        try{
            Scanner scanner = new Scanner(System.in);
            menuSelect = scanner.nextInt();
            switch(menuSelect){
                case 0: {
                    System.out.println("Manager : Sorry sir i did not get you please select the right option");
               curry( menubean);
                    break;
                }
                case 1: { 
                   String item =  menubean.getCurries().get(menuSelect-1).getItem();
                   System.out.println(item);
         
                 
                    break;
                }
                case 2: {
                    String item =  menubean.getCurries().get(menuSelect-1).getItem();
                   System.out.println(item);
   
                    break;
                }
                case 3: {
                      String item =  menubean.getCurries().get(menuSelect-1).getItem();
                   System.out.println(item);
            
                    break;
                }
                case 4: {
                      String item =  menubean.getCurries().get(menuSelect-1).getItem();
                   System.out.println(item);
              
                    break;
                }
                case 5:{
                      String item =  menubean.getCurries().get(menuSelect-1).getItem();
                   System.out.println(item);
                   
                    break;
                }
                case 6:{
                     String item =  menubean.getCurries().get(menuSelect-1).getItem();
                   System.out.println(item);
         
                    break;
                }
                case 7:{
                       String item =  menubean.getCurries().get(menuSelect-1).getItem();
                   System.out.println(item);
                   break;
                }
            
                default: {
                    System.out.println("Manager : Sorry sir i did not get you please select the right option");
                curry( menubean);
                    break;
                }
                    
            }
        }
        catch(InputMismatchException me){
            System.out.println("Manager : Sorry sir i did not get you please select the right option");
            curry(menubean);
          
         
        }
             
        
    }
    public void dessert(Menu menubean){
              for(int index=0;index<menubean.getDeserts().size();index++) {
           System.out.println((index+1)+". "+menubean.getDeserts().get(index).getItem());
       }
        int menuSelect=0;
        try{
            Scanner scanner = new Scanner(System.in);
            menuSelect = scanner.nextInt();
            switch(menuSelect){
                case 0: {
                    System.out.println("Manager : Sorry sir i did not get you please select the right option");
               dessert( menubean);
                    break;
                }
                case 1: { 
                   String item =  menubean.getDeserts().get(menuSelect-1).getItem();
                   System.out.println(item);
         
                 
                    break;
                }
                case 2: {
                    String item =  menubean.getDeserts().get(menuSelect-1).getItem();
                   System.out.println(item);
   
                    break;
                }
                case 3: {
                      String item =  menubean.getDeserts().get(menuSelect-1).getItem();
                   System.out.println(item);
            
                    break;
                }
                case 4: {
                      String item =  menubean.getDeserts().get(menuSelect-1).getItem();
                   System.out.println(item);
              
                    break;
                }
                case 5:{
                      String item =  menubean.getDeserts().get(menuSelect-1).getItem();
                   System.out.println(item);
                   
                    break;
                }
                case 6:{
                     String item =  menubean.getDeserts().get(menuSelect-1).getItem();
                   System.out.println(item);
         
                    break;
                }
                case 7:{
                       String item =  menubean.getDeserts().get(menuSelect-1).getItem();
                   System.out.println(item);
                   break;
                }
            
                default: {
                    System.out.println("Manager : Sorry sir i did not get you please select the right option");
             dessert( menubean);
                    break;
                }
                    
            }
        }
        catch(InputMismatchException me){
            System.out.println("Manager : Sorry sir i did not get you please select the right option");
           dessert( menubean);
          
         
        }
             
        
        
    }
    public void drinks(Menu menubean){
              for(int index=0;index<menubean.getDrinks().size();index++) {
           System.out.println((index+1)+". "+menubean.getDrinks().get(index).getItem());
       }
                   int menuSelect=0;
        try{
            Scanner scanner = new Scanner(System.in);
            menuSelect = scanner.nextInt();
            switch(menuSelect){
                case 0: {
                    System.out.println("Manager : Sorry sir i did not get you please select the right option");
               drinks( menubean);
                    break;
                }
                case 1: { 
                   String item =  menubean.getDrinks().get(menuSelect-1).getItem();
                   System.out.println(item);
         
                    break;
                }
                case 2: {
                    String item =  menubean.getDrinks().get(menuSelect-1).getItem();
                   System.out.println(item);
   
                    break;
                }
                case 3: {
                      String item =  menubean.getCurries().get(menuSelect-1).getItem();
                   System.out.println(item);
            
                    break;
                }
                case 4: {
                      String item =  menubean.getDrinks().get(menuSelect-1).getItem();
                   System.out.println(item);
              
                    break;
                }
                case 5:{
                      String item =  menubean.getDrinks().get(menuSelect-1).getItem();
                   System.out.println(item);
                   
                    break;
                }
                case 6:{
                     String item =  menubean.getDrinks().get(menuSelect-1).getItem();
                   System.out.println(item);
         
                    break;
                }
                case 7:{
                       String item =  menubean.getDrinks().get(menuSelect-1).getItem();
                   System.out.println(item);
                   break;
                }
            
                default: {
                    System.out.println("Manager : Sorry sir i did not get you please select the right option");
             drinks(menubean);
                    break;
                }
                    
            }
        }
        catch(InputMismatchException me){
            System.out.println("Manager : Sorry sir i did not get you please select the right option");
            curry(menubean);
          
         
        }
        
    }
    public void maincourse(Menu menubean){
              for(int index=0;index<menubean.getMaincourse().size();index++) {
           System.out.println((index+1)+". "+menubean.getMaincourse().get(index).getItem());
       }
              int menuSelect=0;
        try{
            Scanner scanner = new Scanner(System.in);
            menuSelect = scanner.nextInt();
            switch(menuSelect){
                case 0: {
                    System.out.println("Manager : Sorry sir i did not get you please select the right option");
               maincourse( menubean);
                    break;
                }
                case 1: { 
                   String item =  menubean.getMaincourse().get(menuSelect-1).getItem();
                   System.out.println(item);
         
                 
                    break;
                }
                case 2: {
                    String item =  menubean.getMaincourse().get(menuSelect-1).getItem();
                   System.out.println(item);
   
                    break;
                }
                case 3: {
                      String item =  menubean.getMaincourse().get(menuSelect-1).getItem();
                   System.out.println(item);
            
                    break;
                }
                case 4: {
                      String item =  menubean.getCurries().get(menuSelect-1).getItem();
                   System.out.println(item);
              
                    break;
                }
                case 5:{
                      String item =  menubean.getMaincourse().get(menuSelect-1).getItem();
                   System.out.println(item);
                   
                    break;
                }
                case 6:{
                     String item =  menubean.getMaincourse().get(menuSelect-1).getItem();
                   System.out.println(item);
         
                    break;
                }
                case 7:{
                       String item =  menubean.getMaincourse().get(menuSelect-1).getItem();
                   System.out.println(item);
                   break;
                }
            
                default: {
                    System.out.println("Manager : Sorry sir i did not get you please select the right option");
                maincourse( menubean);
                    break;
                }
                    
            }
        }
        catch(InputMismatchException me){
            System.out.println("Manager : Sorry sir i did not get you please select the right option");
           maincourse( menubean);
          
         
        }
             
        
        
    }
    public void roti(Menu menubean){
              for(int index=0;index<menubean.getRotis().size();index++) {
           System.out.println((index+1)+". "+menubean.getRotis().get(index).getItem());
       }
              int menuSelect=0;
        try{
            Scanner scanner = new Scanner(System.in);
            menuSelect = scanner.nextInt();
            switch(menuSelect){
                case 0: {
                    System.out.println("Manager : Sorry sir i did not get you please select the right option");
               roti( menubean);
                    break;
                }
                case 1: { 
                   String item =  menubean.getRotis().get(menuSelect-1).getItem();
                   System.out.println(item);
         
                 
                    break;
                }
                case 2: {
                    String item =  menubean.getRotis().get(menuSelect-1).getItem();
                   System.out.println(item);
   
                    break;
                }
                case 3: {
                      String item =  menubean.getRotis().get(menuSelect-1).getItem();
                   System.out.println(item);
            
                    break;
                }
                case 4: {
                      String item =  menubean.getRotis().get(menuSelect-1).getItem();
                   System.out.println(item);
              
                    break;
                }
                case 5:{
                      String item =  menubean.getRotis().get(menuSelect-1).getItem();
                   System.out.println(item);
                   
                    break;
                }
                case 6:{
                     String item =  menubean.getRotis().get(menuSelect-1).getItem();
                   System.out.println(item);
         
                    break;
                }
                case 7:{
                       String item =  menubean.getRotis().get(menuSelect-1).getItem();
                   System.out.println(item);
                   break;
                }
            
                default: {
                    System.out.println("Manager : Sorry sir i did not get you please select the right option");
             roti( menubean);
                    break;
                }
                    
            }
        }
        catch(InputMismatchException me){
            System.out.println("Manager : Sorry sir i did not get you please select the right option");
            roti( menubean);
          
         
        }
             
        
        
    }
    public void starter(Menu menubean){
              for(int index=0;index<menubean.getStarters().size();index++) {
           System.out.println((index+1)+". "+menubean.getStarters().get(index).getItem());
       }
              int menuSelect=0;
        try{
            Scanner scanner = new Scanner(System.in);
            menuSelect = scanner.nextInt();
            switch(menuSelect){
                case 0: {
                    System.out.println("Manager : Sorry sir i did not get you please select the right option");
               starter(menubean);
                    break;
                }
                case 1: { 
                   String item =  menubean.getStarters().get(menuSelect-1).getItem();
                   System.out.println(item);
         
                 
                    break;
                }
                case 2: {
                    String item =  menubean.getStarters().get(menuSelect-1).getItem();
                   System.out.println(item);
   
                    break;
                }
                case 3: {
                      String item =  menubean.getStarters().get(menuSelect-1).getItem();
                   System.out.println(item);
            
                    break;
                }
                case 4: {
                      String item =  menubean.getStarters().get(menuSelect-1).getItem();
                   System.out.println(item);
              
                    break;
                }
                case 5:{
                      String item =  menubean.getStarters().get(menuSelect-1).getItem();
                   System.out.println(item);
                   
                    break;
                }
                case 6:{
                     String item =  menubean.getStarters().get(menuSelect-1).getItem();
                   System.out.println(item);
         
                    break;
                }
                case 7:{
                       String item =  menubean.getStarters().get(menuSelect-1).getItem();
                   System.out.println(item);
                   break;
                }
            
                default: {
                    System.out.println("Manager : Sorry sir i did not get you please select the right option");
              starter(menubean);
                    break;
                }
                    
            }
        }
        catch(InputMismatchException me){
            System.out.println("Manager : Sorry sir i did not get you please select the right option");
             starter(menubean);;
          
         
        }
             
        
        
    }
}
