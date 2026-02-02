package org.sergiolozanoprofe;

import org.junit.jupiter.api.Test;
import org.sergiolozanoprofe.model.OperationType;
import org.sergiolozanoprofe.util.InputParser;

import static org.junit.jupiter.api.Assertions.*;

class InputParserTest {

    @Test
    void parseInt_conNumeroValido_devuelveEntero() {
        int result = InputParser.parseInt("42");
        assertEquals(42, result);
    }

    @Test
    void parseInt_conEspacios_devuelveEntero() {
        int result = InputParser.parseInt("  7  ");
        assertEquals(7, result);
    }

    @Test
    void parseInt_conNull_lanzaExcepcion() {
        NumberFormatException ex = assertThrows(
                NumberFormatException.class,
                () -> InputParser.parseInt(null)
        );
        assertEquals("Entrada nula", ex.getMessage());
    }

    @Test
    void parseInt_conTextoNoNumerico_lanzaExcepcion() {
        NumberFormatException ex = assertThrows(
                NumberFormatException.class,
                () -> InputParser.parseInt("abc")
        );
        assertEquals("No es un entero válido: 'abc'", ex.getMessage());
    }

    @Test
    void parseOperation_conSuma_devuelveADD() {
        OperationType op = InputParser.parseOperation("+");
        assertEquals(OperationType.ADD, op);
    }

    @Test
    void parseOperation_conResta_devuelveSUBTRACT() {
        OperationType op = InputParser.parseOperation("-");
        assertEquals(OperationType.SUBTRACT, op);
    }
}
