package Items;


public class Eggs extends Dairy{
    private String bestBeforeDate;
    private int packSize;

    public Eggs(String name,double value, int barcode, String bestBeforeDate, int packSize) {
        super(name, value, barcode);
        this.bestBeforeDate = bestBeforeDate;
        this.packSize = packSize;
    }

    public String getBestBeforeDate() {
        return bestBeforeDate;
    }

    public int getPackSize() {
        return packSize;
    }

    @Override
    public void applyDiscount(){
        this.setValue(this.getValue()*0.8);
    }
}
