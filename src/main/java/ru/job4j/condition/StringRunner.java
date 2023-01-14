package ru.job4j.condition;

public class StringRunner {
    public static void main(String[] args) {
        String idea = "I Like Java! ";
        System.out.println(idea);
        String idea1 = " But I am a newbie. ";
        idea += idea1;
        System.out.println(idea);
        int year = 2023;
        idea += year;
        System.out.println(idea);
    }
}

