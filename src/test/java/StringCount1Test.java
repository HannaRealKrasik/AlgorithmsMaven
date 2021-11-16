import org.junit.Assert;
import org.junit.Test;

public class StringCount1Test {

    @Test
    public void testCount(){
       // StringCount1.Count("anna",3);
        int expected = 12;
        Assert.assertEquals(expected, StringCount1.Count("anna",3));
    }
}
