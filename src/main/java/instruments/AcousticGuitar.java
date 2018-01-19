package instruments;

import behaviours.IPlayable;

public class AcousticGuitar extends Guitar implements IPlayable {


    public AcousticGuitar(String make, String model, String family, double buyPrice, double sellPrice, int numberOfStrings) {
        super(make, model, family, buyPrice, sellPrice, numberOfStrings);

    }

    public String play() {
        return "Brrrrrinnng";
    }
}
