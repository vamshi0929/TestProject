package com.sampe;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import com.sample.test.Calculator;
import com.sample.test.Operation;
import com.sample.test.SimpleCalculator;

public class CalculatorTest {

    @Test
    public void testBasicOperations() {
        SimpleCalculator calculator = new SimpleCalculator(0);
        assertEquals(5.0, calculator.calculate(Operation.ADD, 2, 3));
        assertEquals(1.0, calculator.calculate(Operation.SUBTRACT, 3, 2));
        assertEquals(6.0, calculator.calculate(Operation.MULTIPLY, 2, 3));
        assertEquals(2.0, calculator.calculate(Operation.DIVIDE, 6, 3));
    }

    @Test
    public void testChainingOperations() {
        Calculator calculator = new SimpleCalculator(5);
        calculator.chain(Operation.ADD, 3)
                  .chain(Operation.MULTIPLY, 2)
                  .chain(Operation.SUBTRACT, 4);
        
        assertEquals(12.0, calculator.getResult());
    }

    @Test
    public void testDivisionByZero() {
        SimpleCalculator calculator = new SimpleCalculator(0);
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculate(Operation.DIVIDE, 10, 0);
        });
    }

   
}
