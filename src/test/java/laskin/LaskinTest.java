package laskin;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;

import static junit.framework.TestCase.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LaskinTest {

    private Laskin laskin = new Laskin();
    private final double DELTA = 0.001;

    @BeforeEach
    public void clearCalculator() {
        laskin.setZero();
    }

    @Test
    public void testAdd() {
        laskin.add(1);
        laskin.add(2);
        assertEquals(3, laskin.returnResult(), DELTA, "Numbers 1 and 2 summation is wrong"); // Muokattu odotettu tulos
    }

    @Test
    public void testSubtract() {
        laskin.add(10);
        laskin.subtract(2);
        assertEquals(8, laskin.returnResult(), DELTA, "Number 10 and 2 difference is wrong"); // Muokattu odotettu tulos
    }

    @Test
    @DisplayName("test the division 8 / 2")
    public void testDivision() {
        laskin.add(8);
        laskin.divide(2);
        assertEquals(4, laskin.returnResult(), DELTA, "division of  8/2 is wrong"); // Muokattu odotettu tulos
    }

    @Test
    @DisplayName("test the division to zero")
    public void testDivisionZero() {
        IllegalArgumentException poikkeus = assertThrows(IllegalArgumentException.class, () -> laskin.divide(0));
        assertEquals("not possible to divide to zero ", poikkeus.getMessage());
    }


    @Test
    @DisplayName("Test the multiplication 2 times 4")
    public void testMultiplication() {
        laskin.add(2);
        laskin.product(4);
        assertEquals(8, laskin.returnResult(), DELTA, "multiplication of 4*2 is wrong");
    }
}
