import org.junit.Assert;
import org.junit.Test;

public class TestNumberSeven {
    @Test
            public void seven() {
        int n = 555;
        int b = -555;

        NumberSeven numberseven = new NumberSeven();

        Assert.assertFalse(numberseven.numberSeven(b));
        Assert.assertTrue(numberseven.numberSeven(n));
    }
}
