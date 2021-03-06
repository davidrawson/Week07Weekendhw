import accessories.InstrumentStrings;
import accessories.SheetMusic;
import behaviours.ISellable;
import instruments.AcousticGuitar;
import instruments.Organ;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
//    InstrumentStrings instrumentStrings;
//    AcousticGuitar acousticGuitar;
    Organ organ;
    SheetMusic sheetMusic;

    @Before
    public void before(){
        shop = new Shop();
//        instrumentStrings = new InstrumentStrings("Regular Slinky", 3.90, 6.90, "Ernie Ball", 0.010, "electric guitar");
//        acousticGuitar = new AcousticGuitar("Gibson", "Hummingbird", "String", 350.0, 485.0,6);
        organ = new Organ("Hammond", "B3", "Keyboard", 1250.0, 1600.00, true);
        sheetMusic = new SheetMusic("100 Great Guitar Riffs", 6.50, 12.95, "Various", "Boosey and Hawkes");
    }

    @Test
    public void canAddItems(){
        shop.addStockItem(organ);
        shop.addStockItem(organ);
        assertEquals(2, shop.itemCount());
    }

    @Test
    public void canRemoveItem(){
        shop.addStockItem(sheetMusic);
        shop.addStockItem(organ);
        shop.removeItem(sheetMusic);
        assertEquals(1, shop.itemCount());
        assertEquals(organ, shop.stock.get(0));
    }

    @Test
    public void canGetTotalPotentialProfit(){
        shop.addStockItem(organ);
        shop.addStockItem(sheetMusic);
        shop.addStockItem(organ);
        assertEquals(706.45, shop.totalPotentialProfit(), 0.01);
    }

}
