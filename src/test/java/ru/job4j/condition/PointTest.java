package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when54to27then4dot24() {
        double expected = 4.24;
        int x1 = 5;
        int y1 = 4;
        int x2 = 2;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when79to158then8dot06() {
        double expected = 8.06;
        int x1 = 7;
        int y1 = 9;
        int x2 = 15;
        int y2 = 8;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

}
