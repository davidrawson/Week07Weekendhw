import instruments.AcousticGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    AcousticGuitar acousticGuitar;

    @Before
    public void before(){
        acousticGuitar = new AcousticGuitar("Gibson", "Hummingbird", "String", 350.0, 485.0,6);
    }

    @Test
    public void hasMake(){
        assertEquals("Gibson", acousticGuitar.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Hummingbird", acousticGuitar.getModel());
    }

    @Test
    public void hasFamily(){
        assertEquals("String", acousticGuitar.getFamily());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(350.0, acousticGuitar.getBuyPrice(), 0.01);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(485.0, acousticGuitar.getSellPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(135.0, acousticGuitar.calculateMarkup(), 0.01);
    }

}
