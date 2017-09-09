/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saiteja.restaurant.restaurantapp;

import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author saiteja
 */
public class Test {
    public  void main(String[] args){
        
        ArrayList<String> al=new ArrayList<String>();
        
         String filepath = System.getProperty("user.dir")+"/config/menu.json";
          System.out.println("this is the "+filepath);
     try {
	JsonReader reader = new JsonReader(new FileReader(filepath));

	reader.beginObject();

	while (reader.hasNext()) {

	  String name = reader.nextName();

	  if (name.equals("name")) {

		System.out.println(reader.nextString());

	  } else if (name.equals("age")) {

		System.out.println(reader.nextInt());

	  } else if (name.equals("water")) {

		// read array
		reader.beginArray();

		while (reader.hasNext()) {
			System.out.println(reader.nextString());
		}

		reader.endArray();

	  } else {
		reader.skipValue(); //avoid some unhandle events
	  }
        }

	reader.endObject();
	reader.close();

     } catch (FileNotFoundException e) {
	e.printStackTrace();
     } catch (IOException e) {
	e.printStackTrace();
     }

   
     //System.out.println(itr.hasNext());
     //}

   }
    }
    

