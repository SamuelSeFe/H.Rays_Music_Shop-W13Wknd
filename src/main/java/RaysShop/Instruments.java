package RaysShop;

import Behaviours.IPlay;

public abstract class Instruments extends MusicItems implements IPlay {

    protected String typeOfInstrument;
    protected String material;
    protected String colour;

    public Instruments(String typeOfItem, double priceBought, double priceSell, String typeOfInstrument, String material, String colour) {
        super(typeOfItem, priceBought, priceSell);
        this.typeOfInstrument = typeOfInstrument;
        this.material = material;
        this.colour = colour;
    }

    public String playInstrument(){
        return String.format("This %s sounds like this...", this.typeOfInstrument);
    }
}
