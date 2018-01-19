package instruments;

import behaviours.ISellable;

public abstract class Instrument implements ISellable{

    protected String make;
    protected String model;
    protected String family;
    protected double buyPrice;
    protected double sellPrice;

    public Instrument(String make, String model, String family, double buyPrice, double sellPrice){
        this.make = make;
        this.model = model;
        this.family = family;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }


    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getFamily() {
        return this.family;
    }


    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public double calculateMarkup(){
        return this.sellPrice - this.buyPrice;
    }
}
