package saiteja.restaurant.restaurantapp;

import com.google.gson.stream.JsonReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Menu {

   String items[] = {"1.Starters \n 2.Maincourse \n 3.Deserts \n 4.Drinks"};
   String Starters;
   String Maincourse;
   String Deserts;
   String Drinks;
   Starters startersClass = new Starters();

    public String getStarters() {
        return Starters;
    }

    public void setStarters(String starters) {
        startersClass.displayMenuItems();
        this.Starters = starters;
    }

    public String getMaincourse() {
        return Maincourse;
    }

    public void setMaincourse(String maincourse) {
        this.Maincourse = maincourse;
    }

    public String getDeserts() {
        return Deserts;
    }

    public void setDeserts(String deserts) {
       this.Deserts = deserts;
    }

    public String getDrinks() {
        return Drinks;
    }

    public void setDrinks(String drinks) {
       this.Drinks = drinks;
    }

    public void displayMenu(){
        String filepath = System.getProperty("user.dir")+"/config/menu.json";
          System.out.println("this is the "+filepath);
     try {
	JsonReader reader = new JsonReader(new FileReader(filepath));

	reader.beginObject();

	while (reader.hasNext()) {

	  String name = reader.nextName();

             if (name.equals("menu")) {

		
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



