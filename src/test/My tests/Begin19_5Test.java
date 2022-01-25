import org.junit.Assert;
import org.junit.Test;

public class Begin19_5Test {

    @Test
    public void TEstUnic(){
        String s = ("qwertew");
        String expected = "Символы w,e, не уникальны";
        Assert.assertEquals(expected, Begin19_5.unic(s));
    }
}
