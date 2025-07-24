package com.example.sweetbox;

public class SweetBox implements Box {
    private Sweet[] sweets;
    private int size;
    private int capacity;

    public SweetBox(int capacity) {
        this.capacity = capacity;
        this.sweets = new Sweet[capacity];
        this.size = 0;
    }

    @Override
    public void addSweet(Sweet sweet) {
        if (size < capacity) {
            sweets[size] = sweet;
            size++;
        } else {
            System.out.println("Коробка заполнена!");
        }
    }

    @Override
    public void removeSweet(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size - 1; i++) {
                sweets[i] = sweets[i + 1];
            }
            sweets[size - 1] = null;
            size--;
        }
    }

    @Override
    public double getTotalWeight() {
        double totalWeight = 0;
        for (int i = 0; i < size; i++) {
            totalWeight += sweets[i].getWeight();
        }
        return totalWeight;
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < size; i++) {
            totalPrice += sweets[i].getPrice();
        }
        return totalPrice;
    }

    @Override
    public void printAllSweetsInfo() {
        System.out.println("Содержимое коробки:");
        for (int i = 0; i < size; i++) {
            Sweet sweet = sweets[i];
            System.out.println("  " + (i + 1) + ". " + sweet.getName() +
                    ", вес: " + sweet.getWeight() +
                    ", цена: " + sweet.getPrice() +
                    ", параметр: " + sweet.getUniqueParameter());
        }
    }

    @Override
    public void removeLightestSweet() {
        if (size > 0) {
            int lightestIndex = 0;
            for (int i = 1; i < size; i++) {
                if (sweets[i].getWeight() < sweets[lightestIndex].getWeight()) {
                    lightestIndex = i;
                }
            }
            removeSweet(lightestIndex);
        }
    }

    @Override
    public void removeCheapestSweet() {
        if (size > 0) {
            int cheapestIndex = 0;
            for (int i = 1; i < size; i++) {
                if (sweets[i].getPrice() < sweets[cheapestIndex].getPrice()) {
                    cheapestIndex = i;
                }
            }
            removeSweet(cheapestIndex);
        }
    }
}
