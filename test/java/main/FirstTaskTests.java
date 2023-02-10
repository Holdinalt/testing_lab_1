package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static main.first.calc;

class FirstTaskTests {

    @Test
    void calcTestMinusOne() {
        double expected = calc(-1);
        Assertions.assertEquals(expected, -(Math.PI / 2));
    }

    @Test
    void calcTestZero() {
        double expected = calc(0);
        Assertions.assertEquals(expected, 0);
    }
}