import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class TestCalculatrice
{
    private static Calculatrice calculatrice;

    @BeforeAll
    public static void setup()
    {
        calculatrice = new Calculatrice();
    }

    @Test
    public void testAdition()
    {
        assertEquals(calculatrice.add(5,5), 10);
        assertEquals(calculatrice.add(-3,10), 7);
    }

    @Test
    public void testDivision()
    {
        assertEquals(calculatrice.div(10, 2), 5);
    }

    @Test
    public void testMultiplication()
    {
        assertEquals(calculatrice.mult(10, 2), 20);
    }

    @Test
    public void testMinus()
    {
        assertEquals(calculatrice.minus(10,5), 5);
        assertEquals(calculatrice.minus(0,10), -10);
    }
}