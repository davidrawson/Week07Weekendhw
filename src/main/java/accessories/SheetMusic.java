package accessories;

public class SheetMusic extends Accessory{

    private String composer;
    private String publisher;

    public SheetMusic(String description, double buyPrice, double sellPrice, String composer, String publisher) {
        super(description, buyPrice, sellPrice);
        this.composer = composer;
        this.publisher = publisher;
    }

    public String getComposer() {
        return this.composer;
    }


    public String getPublisher() {
        return this.publisher;
    }
}
