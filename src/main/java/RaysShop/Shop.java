package RaysShop;

import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private Shop shop;

    private ArrayList<ISell> stock;

    public Shop(){
        stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addItemToStock(MusicItems item){
        this.stock.add(item);
    }

    public void removeItemFromStock(MusicItems item){
        this.stock.remove(item);
    }
}
