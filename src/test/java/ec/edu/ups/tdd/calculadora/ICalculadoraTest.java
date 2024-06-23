package ec.edu.ups.tdd.calculadora;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class ICalculadoraTest {

    @Test
    public void give_tow_integer_when_addition_then_ok() {
        ICalculadora c = Mockito.mock(ICalculadora.class);
        Mockito.when(c.addition(2,3)).thenReturn(5);
        assertEquals(5,c.addition(2,3));
    }
}