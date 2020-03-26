package Items;

public class Bakery implements IBuyable {
    private String name;
    private double weight;
    private boolean isGlutenFree;
    private double value;

    public Bakery(String name, double weight, boolean isGlutenFree, double value) {
        this.name = name;
        this.weight = weight;
        this.isGlutenFree = isGlutenFree;
        this.value = value;
    }

    public double getValue(){
        return this.value;
    }
}




