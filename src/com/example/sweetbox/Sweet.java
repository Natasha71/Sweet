// Sweet.java
import java.util.Objects;

public abstract class Sweet {
    private String name;
    private double weight;
    private double price;
    private Object uniqueParameter; // Object чтобы вместить разные типы
    private double valuePerWeight; // Добавляем поле для хранения "ценности"

    public Sweet(String name, double weight, double price, Object uniqueParameter) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.uniqueParameter = uniqueParameter;
        this.valuePerWeight = 0; // Инициализируем valuePerWeight
    }

    public abstract String getDescription();

    // Геттеры для всех полей
    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public Object getUniqueParameter() {
        return uniqueParameter;
    }

    public double getValuePerWeight() {
        return valuePerWeight;
    }

    public void setValuePerWeight(double valuePerWeight) {
        this.valuePerWeight = valuePerWeight;
    }


    @Override
    public String toString() {
        return name + " (Вес: " + weight + ", Цена: " + price + ", Параметр: " + uniqueParameter + ")";
    }

    // Equals и HashCode (важно для коллекций)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweet sweet = (Sweet) o;
        return Double.compare(sweet.weight, weight) == 0 &&
                Double.compare(sweet.price, price) == 0 &&
                Double.compare(sweet.valuePerWeight, valuePerWeight) == 0 &&
                Objects.equals(name, sweet.name) &&
                Objects.equals(uniqueParameter, sweet.uniqueParameter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, weight, price, uniqueParameter, valuePerWeight);
    }
}