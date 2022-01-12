import org.junit.Assert;
import org.junit.Test;



public class Begin19_3Test {

    @Test
    public void testCountWords(){
        String s = "at a wona day!";
       String [] exp  =  {"a", "wona", "0"};
        String[] actual = Begin19_3.countWords(s);
       Assert.assertArrayEquals(exp, actual);
    }
}
