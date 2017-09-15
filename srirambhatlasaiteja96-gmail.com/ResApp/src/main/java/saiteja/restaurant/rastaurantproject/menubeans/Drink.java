
package saiteja.restaurant.rastaurantproject.menubeans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Drink {

@SerializedName("item")
@Expose
private String item;
@SerializedName("itemprice")
@Expose
private Integer itemprice;
@SerializedName("itemcurrency")
@Expose
private String itemcurrency;

public String getItem() {
return item;
}

public void setItem(String item) {
this.item = item;
}

public Integer getItemprice() {
return itemprice;
}

public void setItemprice(Integer itemprice) {
this.itemprice = itemprice;
}

public String getItemcurrency() {
return itemcurrency;
}

public void setItemcurrency(String itemcurrency) {
this.itemcurrency = itemcurrency;
}

}
