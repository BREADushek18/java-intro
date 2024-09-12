package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EquationRootsTest {

    @Test
    public void testTwoRealRoots() {
        String result = EquationRoots.findRoots(1, -3, 2);
        assertEquals("Корни уравнения: x1=2.0 x2=1.0", result);
    }

    @Test
    public void testOneRealRoot() {
        String result = EquationRoots.findRoots(1, 2, 1);
        assertEquals("Корень уравнения: x1=-1.0", result);
    }

    @Test
    public void testNoRealRoots() {
        String result = EquationRoots.findRoots(1, 0, 1);
        assertEquals("Нет вещественных корней", result);
    }

    @Test
    public void testNegativeDiscriminant() {
        String result = EquationRoots.findRoots(1, 1, 1);
        assertEquals("Нет вещественных корней", result);
    }
}
