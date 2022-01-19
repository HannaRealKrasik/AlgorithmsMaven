import org.junit.Assert;
import org.junit.Test;

public class Befin19_4Test {

   @Test
    public void testUnicCount(){
        String send = "abcaczdbdakcazdbaz";
        String actual = Begin19_4.unikCount(send);
        String expected = "abczdk";
       Assert.assertEquals(expected, actual);
    }
}
