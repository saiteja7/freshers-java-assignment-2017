
package saiteja.restaurant.rastaurantproject.menubeans;

import java.util.List;


public class Menu {


private List<String> menu = null;

private List<Starter> starters = null;

private List<Primarydish> primarydish = null;

private List<Curry> curries = null;

private List<Roti> rotis = null;

private List<Desert> deserts = null;

private List<Drink> drink = null;

public List<String> getMenu() {
return menu;
}

public void setMenu(List<String> menu) {
this.menu = menu;
}

public List<Starter> getStarters() {
return starters;
}

public void setStarters(List<Starter> starters) {
this.starters = starters;
}

public List<Primarydish> getPrimarydish() {
return primarydish;
}

public void setPrimarydish(List<Primarydish> primarydish) {
this.primarydish = primarydish;
}

public List<Curry> getCurries() {
return curries;
}

public void setCurries(List<Curry> curries) {
this.curries = curries;
}

public List<Roti> getRotis() {
return rotis;
}

public void setRotis(List<Roti> rotis) {
this.rotis = rotis;
}

public List<Desert> getDeserts() {
return deserts;
}

public void setDeserts(List<Desert> deserts) {
this.deserts = deserts;
}

public List<Drink> getDrink() {
return drink;
}

public void setDrink(List<Drink> drink) {
this.drink = drink;
}

}