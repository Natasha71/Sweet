// SweetBox.java
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SweetBox {
    private List<Sweet> sweets = new ArrayList<>();

    public void addSweet(Sweet sweet) {
        sweets.add(sweet);
    }

    public void removeSweetByIndex(int index) {
        if (index >= 0 && index < sweets.size()) {
            sweets.remove(index);
        } else {
            System.out.println("Некорректный индекс!");
        }
    }

    public void removeLastSweet() {
        if (!sweets.isEmpty()) {
            sweets.remove(sweets.size() - 1);
        } else {
            System.out.println("Коробка пуста!");
        }
    }

    public double getTotalWeight() {
        double totalWeight = 0;
        for (Sweet sweet : sweets) {
            totalWeight += sweet.getWeight();
        }
        return totalWeight;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Sweet sweet : sweets) {
            totalPrice += sweet.getPrice();
        }
        return totalPrice;
    }

    public void printAllSweets() {
        for (Sweet sweet : sweets) {
            System.out.println(sweet);
        }
    }

    public void optimize(double maxWeight) {
        // 1. Сначала рассчитываем "ценность" каждой сладости и сохраняем её
        for (Sweet sweet : sweets) {
            sweet.setValuePerWeight(sweet.getPrice() / sweet.getWeight()); // Добавим метод setValuePerWeight в класс Sweet
        }

        // 2. Сортируем сладости по убыванию "ценности"
        sweets.sort(Comparator.comparingDouble(Sweet::getValuePerWeight).reversed());

        // 3. Удаляем сладости до тех пор, пока не достигнем максимального веса
        double totalWeight = getTotalWeight();
        while (totalWeight > maxWeight && !sweets.isEmpty()) {
            Sweet removedSweet = sweets.remove(0); // Удаляем первую (самую "бесполезную")
            totalWeight = getTotalWeight();
            System.out.println("Удалена сладость (ценность): " + removedSweet.getName() +
                    ", вес: " + removedSweet.getWeight() +
                    ", цена: " + removedSweet.getPrice() +
                    ", ценность: " + removedSweet.getValuePerWeight());
        }
    }


    public static void main(String[] args) {
        Candy candy1 = new Candy("Twix", 50, 30, "карамель");
        Chocolate chocolate1 = new Chocolate("Alpen Gold", 100, 80, 70);
        Marshmallow marshmallow1 = new Marshmallow("Bon Pari", 30, 25, "розовый");

        SweetBox box = new SweetBox();
        box.addSweet(candy1);
        box.addSweet(chocolate1);
        box.addSweet(marshmallow1);

        System.out.println("Начальный вес: " + box.getTotalWeight());
        System.out.println("Начальная цена: " + box.getTotalPrice());
        box.printAllSweets();

        box.optimize(120);

        System.out.println("Оптимизированный вес: " + box.getTotalWeight());
        box.printAllSweets();
    }
}
