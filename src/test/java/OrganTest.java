import instruments.Organ;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrganTest {

    Organ organ;

    @Before
    public void before(){
        organ = new Organ("Hammond", "B3", "Keyboard", 1250.0, 1600.00, true);
    }


    @Test
    public void canPlay(){
        assertEquals("Extremely Ray Charles sound", organ.play());
    }

    @Test
    public void isPACTested(){
        assertEquals(true, organ.getPACTested());
    }

}
