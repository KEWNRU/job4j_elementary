package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double rsl = height * 1.15;
        return rsl;
    }

    public static double womanWeight(double height) {
        double rsl = height * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 100;
        short height1 = 110;
        double man = Fit.manWeight(height);
        double woman = Fit.womanWeight(height1);
        System.out.println("Man 100 is " + man);
        System.out.println("Woman 110 is " + woman);
    }
}
