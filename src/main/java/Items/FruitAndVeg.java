package Items;

public class FruitAndVeg implements IBuyable{
    private String name;
    private String variety;
    private double value;

    public FruitAndVeg(String name, String variety, double value) {
        this.name = name;
        this.variety = variety;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
