import org.junit.Assert;
import org.junit.Test;


public class NumberForTest {
    @Test
    public void numberForTest(){
        int n = 222;
        NumberFor numberfor = new NumberFor();
        int i = numberfor.Numberfor(n);
        Assert.assertEquals(24753,(i));
    }

    @Test
    public void numberForTest1(){
        int n = -10;
        NumberFor numberfor = new NumberFor();
        int i = numberfor.Numberfor(n);
        Assert.assertEquals(56,(i));
    }
}
