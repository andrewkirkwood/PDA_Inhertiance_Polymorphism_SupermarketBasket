import Items.Eggs;
import Items.Milk;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DairyTest {
    private Milk fullFatMilk;
    private Eggs freeRangeEggs;

    @Before
    public void before(){
        fullFatMilk = new Milk("full fat", 1.0, 4703472, "30/03/2020", 10);
        freeRangeEggs = new Eggs("free range", 2.00, 8098770, "05/04/2020", 6);
    }

    @Test
    public void can_get_milk_name() { assertEquals("full fat", fullFatMilk.getName()); }
    @Test
    public void can_get_milk_value() { assertEquals(1.0, fullFatMilk.getValue(), 0.01); }
    @Test
    public void can_apply_discount_to_milk(){
        fullFatMilk.applyDiscount();
        assertEquals(0.9, fullFatMilk.getValue(),0.01);
    }
    @Test
    public void can_get_milk_barcode() { assertEquals(4703472, fullFatMilk.getBarcode()); }
    @Test
    public void can_get_milk_use_by_date() { assertEquals("30/03/2020", fullFatMilk.getUseByDate()); }
    @Test
    public void can_get_milk_litres_amount() { assertEquals(10, fullFatMilk.getLitres(), 0.01); }

    @Test
    public void can_get_eggs_name() { assertEquals("free range", freeRangeEggs.getName()); }

    @Test
    public void can_get_eggs_value() { assertEquals(2.0, freeRangeEggs.getValue(), 0.01); }

    @Test
    public void can_apply_discount_to_eggs(){
        freeRangeEggs.applyDiscount();
        assertEquals(1.60, freeRangeEggs.getValue(), 0.01);
    }

    @Test
    public void can_get_eggs_barcode() { assertEquals(8098770, freeRangeEggs.getBarcode()); }

    @Test
    public void can_get_eggs_best_before_date() { assertEquals("05/04/2020", freeRangeEggs.getBestBeforeDate()); }

    @Test
    public void can_get_eggs_pack_size() { assertEquals(6, freeRangeEggs.getPackSize()); }
}
