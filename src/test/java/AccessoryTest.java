import accessories.Accessory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    Accessory accessory;

    @Before
    public void before(){
        accessory = new Accessory("Tuning Fork", 2.95 ,8.50);
    }

    @Test
    public void hasDescription(){
        assertEquals("Tuning Fork", accessory.getDescription());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(2.95, accessory.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(8.50, accessory.getSellPrice(), 0.01);
    }


}
