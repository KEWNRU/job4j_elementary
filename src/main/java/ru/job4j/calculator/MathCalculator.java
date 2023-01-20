package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;
public class MathCalculator {

    public static double sumAndMinus(double first, double second) {
        return sum(first, second)
                + minus(first, second);
    }

    public static double shareAndMinus(double first, double second) {
        return share(first, second)
                + sum(first, second);
    }

    public static double all(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + share(first, second)
                + minus(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMinus(25, 43));
        System.out.println("Результат расчета равен: " + shareAndMinus(11, 32));
        System.out.println("Результат расчета равен: " + all(32, 10));
    }
}