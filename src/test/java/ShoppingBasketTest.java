import Items.Bakery;
import Items.FruitAndVeg;
import Items.IBuyable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShoppingBasketTest {
    private ShoppingBasket shoppingBasket;
    private IBuyable apple;
    private IBuyable bread;

    @Before
    public void before(){
        shoppingBasket = new ShoppingBasket(8980);
        apple = new FruitAndVeg("apple", "variety", 0.85);
        bread = new Bakery("sourdough", 5, false, 1);
    }

    @Test
    public void can_add_multiple_items_to_basket(){
        shoppingBasket.addItem(apple);
        shoppingBasket.addItem(bread);
        shoppingBasket.calculateAndSetValue();
        assertEquals(2, shoppingBasket.getItems().size());
        assertEquals(1.85, shoppingBasket.getValue(), 0.01);
    }

    @Test
    public void can_add_item_to_basket(){
        shoppingBasket.addItem(apple);
        shoppingBasket.calculateAndSetValue();
        assertEquals(1, shoppingBasket.getItems().size());
        assertEquals(0.85, shoppingBasket.getValue(), 0.01);
    }


}

