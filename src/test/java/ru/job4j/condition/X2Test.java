package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
public class X2Test {

    @Test
    public void whenA10B0C0X2Then40() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
        a = 1;
        b = 1;
        c = 1;
        x = 1;
        expected = 3;
        rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
        a = 0;
        b = 1;
        c = 1;
        x = 1;
        expected = 2;
        rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
        Assert.assertEquals(expected, rsl);
        a = 0;
        b = 1;
        c = 1;
        x = 0;
        expected = 1;
        rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }
}