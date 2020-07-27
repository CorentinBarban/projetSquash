

import org.junit.Assert;
import org.junit.Test;
import org.squashtest.ta.galaxia.squash.tf.galaxia.annotations.TFMetadata;

public class CalculatorTest {

    @Test
    @TFMetadata(key = "linked-TC", value = {"193d7473-0321-4fe4-9c41-75c6be648646"})
    public void addsTwoNumbers() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(2, calculator.add(1, 1));
    }

}
