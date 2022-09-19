package RaysShop.StringInstruments;

import RaysShop.Instruments;

public abstract class Strings extends Instruments {

    protected int numOfString;

    public Strings(String typeOfItem, double priceBought, double priceSell, String typeOfInstrument, String material, String colour, int numOfString) {
        super(typeOfItem, priceBought, priceSell, typeOfInstrument, material, colour);
        this.numOfString = numOfString;
    }


}
