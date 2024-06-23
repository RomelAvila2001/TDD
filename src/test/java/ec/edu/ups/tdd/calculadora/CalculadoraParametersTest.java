package ec.edu.ups.tdd.calculadora;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class CalculadoraParametersTest {

    private int a,b,expected;

    @Parameterized.Parameters
    public static  Iterable<Object[]> parameters(){
        List<Object[]> objects = new LinkedList<Object[]>();
        objects.add(new Object[]{2,4,6});
        objects.add(new Object[]{1,8,9});
        objects.add(new Object[]{2,5,7});
        objects.add(new Object[]{7,3,10});
        objects.add(new Object[]{22,4,26});
        objects.add(new Object[]{12,14,26});
        return objects;
    }

    public CalculadoraParametersTest(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }

    @Test
    public void given_tow_integers_when_addition_then_ok(){
        System.out.println("Test 1");
        Calculadora c = new Calculadora();
        assertEquals(expected,c.addition(a,b));
    }


}