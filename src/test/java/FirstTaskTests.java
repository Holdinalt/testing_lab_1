import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class FirstTaskTests {

    @Test
    void calcTestMinusOne() {
        double expected = first.calc(-1);
        Assertions.assertEquals(expected, -(Math.PI / 2));
    }

    @Test
    void calcTestZero() {
        double expected = first.calc(0);
        Assertions.assertEquals(expected, 0);
    }

    @Test
    void calcTestGrouped() {
        double[] numbers = {-Math.PI / 2, 0};
        Assertions.assertAll("numbers",
                () -> Assertions.assertEquals(numbers[0], first.calc(-1)),
                () -> Assertions.assertEquals(numbers[1], first.calc(0))
        );
    }
}