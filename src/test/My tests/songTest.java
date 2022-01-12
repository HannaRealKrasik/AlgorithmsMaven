import org.junit.Test;

public class songTest {

    @Test
    public void testSong(){
        String first = " bottles of beer on the wall, ";
        int i = 99;
        String second = " bottles of beer.\nTake one down and pass it around, ";
        String third = " bottles of beer on the wall.\n" ;
        String fourth = "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.";

        BottlesSong bottlesSong = new BottlesSong();

        String [] array =BottlesSong.Arrays(i,first,second,third,fourth);
        for (int q =0; q<array.length;q++)
        System.out.println(array[q]);
    }
}
