package RaysShop;

import Behaviours.ISell;

public abstract class MusicItems implements ISell {

    protected String typeOfItem;
    protected double priceBought;
    protected double priceSell;

    public MusicItems(String typeOfItem, double priceBought, double priceSell) {
        this.typeOfItem = typeOfItem;
        this.priceBought = priceBought;
        this.priceSell = priceSell;
    }

    public String getTypeOfItem() {
        return typeOfItem;
    }

    public double getPriceBought() {
        return priceBought;
    }

    public double getPriceSell() {
        return priceSell;
    }

    public double calculateMarkup() {
        double markup = this.priceSell - this.priceBought;
        return markup;
    }
}
