package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight((short) 175);
        double woman = Fit.womanWeight((short) 165);
        System.out.println("Man 175 is " + man);
        System.out.println("Woman 165 is " + woman);
    }
}
