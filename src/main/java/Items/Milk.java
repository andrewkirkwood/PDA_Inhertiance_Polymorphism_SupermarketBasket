package Items;


public class Milk extends Dairy {
    private String useByDate;
    private double litres;

    public Milk(String name, double value, int barcode, String useByDate, double litres) {
        super(name, value, barcode);
        this.useByDate = useByDate;
        this.litres = litres;
    }

    public String getUseByDate() {
        return useByDate;
    }

    public double getLitres() {
        return litres;
    }

}
