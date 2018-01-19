package instruments;

public abstract class Guitar extends Instrument {

    protected int numberOfStrings;

    public Guitar(String make, String model, String family, double buyPrice, double sellPrice, int numberOfStrings) {
        super(make, model, family, buyPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return this.numberOfStrings;
    }
}
