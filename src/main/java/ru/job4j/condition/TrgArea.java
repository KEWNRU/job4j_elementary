package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = a + b + c / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public static void main(String[] args) {
        double result = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
        double result1  = TrgArea.area(5, 7, 4);
        System.out.println("area (5, 7, 4) = " + result1);
    }
}
