import instruments.AcousticGuitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AcousticGuitarTest {

    AcousticGuitar acousticGuitar;

    @Before
    public void before(){
        acousticGuitar = new AcousticGuitar("Gibson", "Hummingbird", "String", 350.0, 485.0,6);
    }

    @Test
    public void canPlay(){
        assertEquals("Brrrrrinnng", acousticGuitar.play());
    }
}
