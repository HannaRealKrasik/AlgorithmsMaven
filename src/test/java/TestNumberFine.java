import org.junit.Assert;
import org.junit.Test;

public class TestNumberFine {

    @Test
public void numberFiveTest(){
        int [] array = {1, 2, 3, 4, 5};
        int [] array1 = {-3, 0, 155, -39, 1003};
        int [] expected = {5, 1, 3};
        int [] expected1 = {1003, -39, 223};

            NumberFive numberfive = new NumberFive();

        Assert.assertArrayEquals(expected, numberfive.numberFive(array));
        Assert.assertArrayEquals(expected1, numberfive.numberFive(array1));
    }
}
