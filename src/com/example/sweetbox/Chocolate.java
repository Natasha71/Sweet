// Chocolate.java
public class Chocolate extends Sweet {
    private int cocoaPercentage;

    public Chocolate(String name, double weight, double price, int cocoaPercentage) {
        super(name, weight, price, cocoaPercentage);
        this.cocoaPercentage = cocoaPercentage;
    }

    public int getCocoaPercentage() {
        return cocoaPercentage;
    }

    @Override
    public String getDescription() {
        return "Шоколад с содержанием какао " + cocoaPercentage + "%";
    }
}
