/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saiteja.restaurant.resapp.billing;

import com.google.gson.Gson;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import saiteja.restaurant.resapp.menubean.Menu;

/**
 *
 * @author saiteja
 */
public class RestaurantConfiguration {
   public Menu dataConfiguration() {
    Menu menuBean=null;
    try {
        String filepath = System.getProperty("user.dir")+"/config/menu.json";
        Gson gson = new Gson();
        menuBean = gson.fromJson(new FileReader(filepath), Menu.class);

    }
    catch(FileNotFoundException fnfe) {
     fnfe.printStackTrace();
    }
    return menuBean;
   }
   
}
