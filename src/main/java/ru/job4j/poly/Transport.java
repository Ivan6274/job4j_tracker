package ru.job4j.poly;

public interface Transport {
    void go();

    void passengersCount(int count);

    double priceOfAddFuel(double fuelCount);
}
