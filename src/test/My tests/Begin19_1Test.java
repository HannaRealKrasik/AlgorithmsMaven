import org.junit.Assert;
import org.junit.Test;

public class Begin19_1Test {

    @Test
    public void testCount(){
       // StringCount1.Count("anna",3);
        int expected = 12;
        Assert.assertEquals(expected, Begin19_1.Count("anna",3));
    }
}
