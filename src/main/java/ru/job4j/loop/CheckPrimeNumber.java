package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        int num = 0;
        boolean prime = true;
        for (int i = 1; i <= number; i++) {
            if ((number % i) == 0) {
                num++;
                if (num > 2) {
                    break;
                }
            }
        }
        return num == 2;
    }
}