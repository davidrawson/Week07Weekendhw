package accessories;

public class Accessory {

    protected double buyPrice;
    protected double sellPrice;
    protected String description;

    public Accessory(double buyPrice, double sellPrice, String description){
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.description = description;
    }

}
