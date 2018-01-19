package accessories;

import behaviours.ISellable;

public class Accessory implements ISellable{

    protected String description;
    protected double buyPrice;
    protected double sellPrice;

    public Accessory(String description,double buyPrice, double sellPrice){
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return this.description;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public double calculateMarkup() {
        // Am I best to use this.sellPrice or getSellPrice() ?
        // Does it make the slightest difference?
        return this.sellPrice - this.buyPrice;
    }
}
