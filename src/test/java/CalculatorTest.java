

import org.junit.Assert;
import org.junit.Test;
import org.squashtest.ta.galaxia.squash.tf.galaxia.annotations.TFMetadata;

public class CalculatorTest {

    @Test
    public void addTwoNumbers() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.add(1, 1));
    }

    @Test
    public void subTwoNumbers() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.sub(3, 1));
    }
}
