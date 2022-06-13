import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle bottle;

    @Before
    public void before() {
        bottle = new WaterBottle;
    }

    @Test
    public void hasVolume() {
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canLowerVolumeIfDrink() {
        bottle.drink();
        bottle.drink();
        assertEquals(80, bottle.getVolume());
    }

    @Test
    public void canBeEmptied() {
        bottle.empty();
        assertEquals(0, bottle.volume());
    }

    @Test
    public void canBeFiller() {
        botte.fill();
        assertEquals(100, bottle.getVolume());
    }
}
