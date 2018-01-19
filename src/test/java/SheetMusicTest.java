import accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic("100 Great Guitar Riffs", 6.50, 12.95, "Various", "Boosey and Hawkes");
    }

    @Test
    public void hasComposer(){
        assertEquals("Various", sheetMusic.getComposer());
    }

    @Test
    public void hasPublisher(){
        assertEquals("Boosey and Hawkes", sheetMusic.getPublisher());
    }
}
