import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import org.mockito.Mockito;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;


public class TestStatistique
{
    @Test
    public void testMoyenne()
    {
        mockCalculatrice = mock(Calculatrice.class);
        when(mock.add(10,10)).thenReturn(20);
        when(mock.add(20,2)).thenReturn(10);

        Statistique stat = new Statistique();
        stat.calculatrice = mockCalculatrice;

        float r = stat.moyenne(10, 10);
        assertEquals(10, r);

        verify(mock.add(10,10), 20);
        verify(mock.div(20,2), 10);
    }
}