import RaysShop.Shop;
import RaysShop.StringInstruments.Violin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Violin violin;

    Shop shop;

    @Before
    public void setUp(){
        violin = new Violin("Instrument", 69.99, 119.99, "Violin", "Wood", "Red Ochre", 4, "bow");
        shop = new Shop();
        shop.addItemToStock(violin);
    }

    @Test
    public void canAddItemToStock(){
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.removeItemFromStock(violin);
        assertEquals(0, shop.getStock().size());
    }

}
