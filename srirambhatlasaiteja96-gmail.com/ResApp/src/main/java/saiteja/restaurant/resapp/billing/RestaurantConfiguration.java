/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saiteja.restaurant.resapp.billing;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import saiteja.restaurant.rastaurantproject.menubeans.Menu;

/**
 *
 * @author saiteja
 */
public class RestaurantConfiguration {
   public Menu dataConfiguration() {
    Menu menuBean=null;
    try {
       /*/ String filepath = System.getProperty("user.dir")+"/config/menu.json";
        Gson gson = new Gson();
        menuBean = gson.fromJson(new FileReader(filepath), Menu.class);/*/
      // String filepath =  System.getProperty("user.dir")+"/classes/config/men.json";
       Gson gson = new Gson();
       InputStream is = getClass().getClassLoader().getResourceAsStream("config/men.json");
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
       StringBuilder sb=new StringBuilder();
        for( String line;(line = reader.readLine()) != null;) {
           sb.append(line);
        }
    //  String filepath = getClass().getClassLoader().getResource("").toString()+"config/men.json";
    //  System.out.println(filepath);
    //   menuBean = gson.fromJson(new FileReader(filepath),Menu.class);
        menuBean = gson.fromJson(sb.toString(),Menu.class);
    }
    catch(IOException fnfe) {
     fnfe.printStackTrace();
    }
    return menuBean;
   }
   
}
