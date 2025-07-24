package com.example.sweetbox;

public class Main {
    public static void main(String[] args) {
        // Создаем коробку, вмещающую 3 сладости
        SweetBox box = new SweetBox(3);

        // Создаем сладости
        Sweet sweet1 = new Sweet("Шоколадка", 100, 50, 1);
        Sweet sweet2 = new Sweet("Конфета", 50, 25, 2);
        Sweet sweet3 = new Sweet("Печенье", 75, 30, 3);

        // Добавляем сладости в коробку
        box.addSweet(sweet1);
        box.addSweet(sweet2);
        box.addSweet(sweet3);

        // Выводим информацию о коробке
        System.out.println("Общий вес коробки: " + box.getTotalWeight());
        System.out.println("Общая стоимость коробки: " + box.getTotalPrice());
        box.printAllSweetsInfo();

        // Удаляем самую легкую сладость
        System.out.println("\nУдаляем самую легкую сладость:");
        box.removeLightestSweet();
        System.out.println("Общий вес коробки: " + box.getTotalWeight());
        System.out.println("Общая стоимость коробки: " + box.getTotalPrice());
        box.printAllSweetsInfo();

        // Удаляем самую дешевую сладость
        System.out.println("\nУдаляем самую дешевую сладость:");
        box.removeCheapestSweet();
        System.out.println("Общий вес коробки: " + box.getTotalWeight());
        System.out.println("Общая стоимость коробки: " + box.getTotalPrice());
        box.printAllSweetsInfo();
    }
}
