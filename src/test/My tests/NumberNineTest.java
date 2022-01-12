import org.junit.Assert;
import org.junit.Test;

public class NumberNineTest {
    @Test
            public void testNine() {
        NumberNine numberNine = new NumberNine();
        numberNine.nine(15);
        Assert.assertEquals("Good Number",numberNine.nine(15));
        Assert.assertEquals("Poor Number",numberNine.nine(40));
    }
}
