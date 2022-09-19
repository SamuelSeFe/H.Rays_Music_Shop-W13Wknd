package RaysShop.StringInstruments;

public abstract class BowedStrings extends Strings{

    protected String bow;

    public BowedStrings(String typeOfItem, double priceBought, double priceSell, String typeOfInstrument, String material, String colour, int numOfString, String bow) {
        super(typeOfItem, priceBought, priceSell, typeOfInstrument, material, colour, numOfString);
        this.bow = bow;
    }
}
