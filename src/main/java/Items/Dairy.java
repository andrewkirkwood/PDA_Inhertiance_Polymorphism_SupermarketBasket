package Items;

public abstract class Dairy {
    private String name;
    private double value;
    private int barcode;

    public Dairy(String name, double value, int barcode) {
        this.name = name;
        this.value = value;
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public int getBarcode() {
        return barcode;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void applyDiscount(){
        this.value = this.value * 0.9;
    }
}
