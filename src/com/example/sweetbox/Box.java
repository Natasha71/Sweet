package com.example.sweetbox;

public interface Box {
    void addSweet(Sweet sweet);
    void removeSweet(int index);
    double getTotalWeight();
    double getTotalPrice();
    void printAllSweetsInfo();
    void removeLightestSweet();
    void removeCheapestSweet();
}


