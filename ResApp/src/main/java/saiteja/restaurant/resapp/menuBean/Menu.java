/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saiteja.restaurant.resapp.menubean;

import java.util.List;

public class Menu {


private List<String> menu = null;

private List<Starter> starters = null;

private List<Maincourse> maincourse = null;

private List<Curry> curries = null;

private List<Roti> rotis = null;

private List<Chinese> chinese = null;

private List<Desert> deserts = null;

private List<Drinks> drinks = null;

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

public List<Maincourse> getMaincourse() {
return maincourse;
}

public void setMaincourse(List<Maincourse> maincourse) {
this.maincourse = maincourse;
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

public List<Chinese> getChinese() {
return chinese;
}

public void setChinese(List<Chinese> chinese) {
this.chinese = chinese;
}

public List<Desert> getDeserts() {
return deserts;
}

public void setDeserts(List<Desert> deserts) {
this.deserts = deserts;
}

public List<Drinks> getDrinks() {
return drinks;
}

public void setDrinks(List<Drinks> drinks) {
this.drinks = drinks;
}

}







