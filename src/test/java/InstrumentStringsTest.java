import accessories.InstrumentStrings;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentStringsTest {

    InstrumentStrings instrumentStrings;

    @Before
    public void before(){
        instrumentStrings = new InstrumentStrings("Regular Slinky", 3.90, 6.90, "Ernie Ball", 0.010, "electric guitar");
    }

    @Test
    public void hasBrand(){
        assertEquals("Ernie Ball", instrumentStrings.getBrand());
    }

    @Test
    public void hasGuage(){
        assertEquals(0.010, instrumentStrings.getGuage(), 0.0001);
    }

    @Test
    public void hasForInstrument(){
        assertEquals("electric guitar", instrumentStrings.getForInstrument());
    }

}
