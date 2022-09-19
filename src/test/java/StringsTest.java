import RaysShop.Shop;
import RaysShop.StringInstruments.Guitar;
import RaysShop.StringInstruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringsTest {

    Violin violin;
    Guitar guitar;

    @Before
    public void setUp(){
        violin = new Violin("Instrument", 69.99, 119.99, "Violin", "Wood", "Red Ochre", 4, "bow");
    }

    @Test
    public void canPlay(){
        assertEquals(violin.playInstrument(), "This Violin sounds like this...");
    }

    @Test
    public void hasMarkup(){
        assertEquals(50, violin.calculateMarkup(), 0.0);
    }

}
