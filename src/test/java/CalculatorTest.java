

import org.junit.Assert;
import org.junit.Test;
import org.squashtest.ta.galaxia.squash.tf.galaxia.annotations.TFMetadata;

public class CalculatorTest {

    @Test
    @TFMetadata(key = "linked-TC", value = {"ca20783d-8715-4518-8f58-e0a10ea66277"})
    public void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.add(1, 1));
    }

}
