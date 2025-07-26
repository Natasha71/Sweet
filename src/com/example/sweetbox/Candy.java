// Candy.java
public class Candy extends Sweet {
    private String flavor;

    public Candy(String name, double weight, double price, String flavor) {
        super(name, weight, price, flavor);
        this.flavor = flavor;
    }

    public String getFlavor() {
        return flavor;
    }

    @Override
    public String getDescription() {
        return "Конфета со вкусом " + flavor;
    }
}


