package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculationAmountTest {

    @Test
    public void testFindAmount() {
        CalculationAmount calculation = new CalculationAmount();
        double result = calculation.findAmount();

        // Проверяем, что result > 0, так как сумма ряда должна быть положительной
        assertTrue(result > 0);

        // Проверяем, что result < 1, так как члены ряда уменьшаются
        assertTrue(result < 1);
    }
}
