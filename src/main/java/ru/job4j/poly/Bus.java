package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Drive on the road");
    }

    @Override
    public void passengersCount(int count) {
        int pass = count;
    }

    @Override
    public double priceOfAddFuel(double fuelCount) {
        double priceFor1l = 45.125;
        return fuelCount * priceFor1l;
    }
}
