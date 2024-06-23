package ec.edu.ups.tdd.calculadora;

import org.junit.*;

import static org.junit.Assert.*;

public class CalculadoraTest {


    Calculadora c = null;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("setUpClass()");
    }

    @Before
    public void setUp(){
        System.out.println("setUp()");
        c = new Calculadora();

    }

    @Test
    public void given_tow_integers_when_addition_then_ok(){
        System.out.println("Test 1");
        Calculadora c = new Calculadora();
        assertEquals(6,c.addition(4,2));

    }

    @Test
    public void give_tow_integers_when_resta_then_ok (){
        System.out.println("Test 2");
        Calculadora c = new Calculadora();
        assertEquals(2,c.resta(4,2));

    }

    @Test(expected = ArithmeticException.class)
    public void given_tow_integers_when_divicion_then_exception(){
        System.out.println("Test 3");
        assertEquals(3,c.divicion(6,0));

    }

    @Test(timeout = 150)
    public void given_tow_integers_when_multiplicacion_then_timeout(){
        System.out.println("Test 4");
        assertEquals(8,c.multiplicacion(4,2));

    }

    @After
    public void tearDown (){
        System.out.println("tearDown");
        c.setAns(0);
        c=null;
    }

    @AfterClass
    public static void tearDownClass (){
        System.out.println("tearDownClass");
    }



}