package org.sergiolozanoprofe;

import org.junit.jupiter.api.Test;
import org.sergiolozanoprofe.service.CalculatorService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTest {

    @Test
    void suma() {
        CalculatorService calculatorService = new CalculatorService();

        double result = calculatorService.add(2, 3);

        assertEquals(5, result);
    }
    @Test
    void resta() {
        CalculatorService calculatorService = new CalculatorService();

        double result = calculatorService.subtract(10, 4);

        assertEquals(6, result);
    }
    @Test
    void multiplicacion() {
        CalculatorService calculatorService = new CalculatorService();

        double result = calculatorService.multiply(3, 5);

        assertEquals(15, result);
    }
    @Test
    void division() {
        CalculatorService calculatorService = new CalculatorService();

        double result = calculatorService.divide(10, 2);

        assertEquals(5, result);
    }

}
