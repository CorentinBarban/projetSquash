

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.add(1, 1));
    }

}
