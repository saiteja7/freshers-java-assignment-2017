package saiteja.restaurant.restaurantapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Starters {
    String Manchuria;
    String Babycorn;
    String Fries;
    String veg_spring_roll;
    String Onion_pakora;

    public String getMenuOrder() {
        System.out.println("I have got ordered " + MenuOrder);
        return MenuOrder;
    }

    public void setMenuOrder(String menuOrder) {
        System.out.println("You have ordered " + menuOrder);

        MenuOrder = menuOrder;
    }

    String MenuOrder;
    int menuItemsSelect;

    Scanner scanner = new Scanner(System.in);




    public String getManchuria() {

        return Manchuria;
    }

    public void setManchuria(String manchuria) {
        Manchuria = manchuria;
    }

    public String getBabycorn() {
        return Babycorn;
    }

    public void setBabycorn(String babycorn) {
        Babycorn = babycorn;
    }

    public String getFries() {
        return Fries;
    }

    public void setFries(String fries) {
        Fries = fries;
    }

    public String getVeg_spring_roll() {
        return veg_spring_roll;
    }

    public void setVeg_spring_roll(String veg_spring_roll) {
        this.veg_spring_roll = veg_spring_roll;
    }

    public String getOnion_pakora() {
        return Onion_pakora;
    }
    public void setOnion_pakora(String onion_pakora) {
        Onion_pakora = onion_pakora;
    }

    String menuItems[] = {"1.Manchuria - 100 Rupees \n2.Babycorn -100 Rupees \n3.Fries - 110 Rupees\n4.Veg spring roll - 110 Rupees\n5.Onion pakora - 120 Rupees"};
  public void desplayMenuItems(){
      for (int i=0;i<menuItems.length;i++)
      {
          System.out.println(menuItems[i]+"\n");

      }
  }
  public void selectMenuItems(){
      menuItemsSelect = scanner.nextInt();
      switch (menuItemsSelect){
          case 1:
              setMenuOrder("Manchuria");
            break;
          case 2:
              setMenuOrder("Babycorn");
              break;
          case 3:setMenuOrder("Fries");
          break;
          case 4:
              setMenuOrder("veg spring roll");
              break;
          case 5:
              setMenuOrder("Onion pakora");
              break;

      }
  }
}
