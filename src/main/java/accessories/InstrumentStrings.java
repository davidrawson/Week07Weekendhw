package accessories;


public class InstrumentStrings extends Accessory {

    private String brand;
    private double guage;
    private String forInstrument;

    public InstrumentStrings(String description, double buyPrice, double sellPrice, String brand, double guage, String forInstrument) {
        super(description, buyPrice, sellPrice);
        this.brand = brand;
        this.guage = guage;
        this.forInstrument = forInstrument;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getGuage() {
        return this.guage;
    }

    public String getForInstrument() {
        return this.forInstrument;
    }
}
