// Marshmallow.java
public class Marshmallow extends Sweet {
    private String color;

    public Marshmallow(String name, double weight, double price, String color) {
        super(name, weight, price, color);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String getDescription() {
        return "Зефир цвета " + color;
    }
}