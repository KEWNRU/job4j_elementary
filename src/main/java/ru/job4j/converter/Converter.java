package ru.job4j.converter;

public class Converter {

    public static float euroToRuble(float value) {
        float rsl = 70 / value;
        return rsl;
    }

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
                return rsl;
    }

    public static float dollarToRuble(float value) {
        float rsl = 60 / value;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.euroToRuble(1);
        float euro1 = Converter.rubleToEuro(70);
        float dollar = Converter.dollarToRuble(1);
        float dollar1 = Converter.rubleToDollar(60);
        System.out.println("1 euro are " + euro + " ruble.");
        System.out.println("1 dollar are " + dollar + " ruble");
        System.out.println("70 ruble " + euro1 + " euro");
        System.out.println("60 rubles " + dollar1 + " dollar");
    }
}