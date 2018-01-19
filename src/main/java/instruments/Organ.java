package instruments;

import behaviours.IPlayable;

public class Organ extends Instrument implements IPlayable {

    private boolean pacTested;

    public Organ(String make, String model, String family, double buyPrice, double sellPrice, boolean pacTested) {
        super(make, model, family, buyPrice, sellPrice);
        this.pacTested = pacTested;
    }

    public String play() {
        return "Extremely Ray Charles sound";
    }
}
