/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saiteja.restaurant.resapp;

import saiteja.restaurant.resapp.manager.CustomerManager;
import saiteja.restaurant.resapp.watchmen.CustomerWatchmen;

/**
 *
 * @author saiteja
 */
public class Initializer {
     public static void main(String args[]){
       /* Customer Watchmen interaction */
       CustomerWatchmen cwatch=new CustomerWatchmen();
       cwatch.watchmenIntroCustomer();
       /* Manager Customer interaction*/
       CustomerManager managerObj=new CustomerManager();
       managerObj.CustomerArrived();
       
    }
}
