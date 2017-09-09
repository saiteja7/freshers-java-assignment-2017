package saiteja.restaurant.restaurantapp;
import java.util.Scanner;

public class Restaurant {
    int menuSelect;
    Menu menu = new Menu();
    Starters starters = new Starters();

   
    Scanner scanner = new Scanner(System.in);

    String water[] = {"Cool water","normal water"};
    public void CustomerArrived() throws InterruptedException {
        System.out.println("Manager : Guys ,Customer is comming get ready to serve...");
        Thread.sleep(1000);
        System.out.println("customer has arrived ");
        Thread.sleep(1000);
        System.out.println("Host:Good morning sir Welcome to Novotel ");
        Thread.sleep(1000);
        System.out.println("customer : Thanq");
        Thread.sleep(1000);
        System.out.println("Manager : Hey maid clean that table number 7  ");
        Thread.sleep(1000);
        System.out.println("Maid : Okay sir 2 mints");
        Thread.sleep(1000);
        System.out.println("Manager:Sir just 2 mints");
        Thread.sleep(1000);
        System.out.println("Cutomer : It's okay");
        Thread.sleep(1000);
        System.out.println("Manager : sir you can have your seat");
        Thread.sleep(1000);
        System.out.println("Customer : Thanku");
     
        System.out.println("Manager:Sir,Here is the Menu,What would you like to have first Starters or Maincourse?");
        menu.displayMenu();
        menuSelect = scanner.nextInt();
        switch (menuSelect){
            case 1:
                System.out.println("You have selected Starters");
                break;
            case 2:
                System.out.println("You have selected Soups");
                break;
            case 3:
                System.out.println("You have selected Maincourse");
                break;
            case 4:
                System.out.println("You have selected Curries");
                break;
            case 5:
                System.out.println("You have selected Rotis and naans");
                break;
            case 6:
                System.out.println("You have selected Chinese");
                break;
            case 7:
                System.out.println("You have selected Deserts");
                break;
            case 8:
                System.out.println("You have selected Drinks");
                
                default:
                    System.out.println("Please give the correct input ");
                    menu.displayMenu();

        }





    }

}
