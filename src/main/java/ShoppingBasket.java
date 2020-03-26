import Items.IBuyable;
import java.util.ArrayList;

public class ShoppingBasket {
    private double customerId;
    private ArrayList<IBuyable> items;
    private double value;
    private boolean isPaidFor;

    public ShoppingBasket(double customerId) {
        this.customerId = customerId;
        this.items = new ArrayList<IBuyable>();
        this.value = 0;
        this.isPaidFor = false;
    }

    public ArrayList<IBuyable> getItems() { return items; }

    public void addItem(IBuyable item) { this.items.add(item); }

    public void calculateAndSetValue(){
        double newValue = 0;
        for (IBuyable item : this.items){
            newValue += item.getValue();
        }
        this.value = newValue;
    }
    public double getValue() {
        return this.value;
    }

    public boolean isPaidFor() {
        return isPaidFor;
    }

    public void setPaidFor(boolean paidFor) {
        isPaidFor = paidFor;
    }

    public double getCustomerId() {
        return this.customerId;
    }


}


