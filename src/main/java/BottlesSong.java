public class BottlesSong {
    public static String[] Arrays(int i, String first, String second, String third, String fourth) {

        String[] song = new String[99];

        for (int q = 0; q < song.length; q++){
            song[q] = String.valueOf(i) + first + String.valueOf(i) + second + String.valueOf(i - 1) + third;
            i = i -1;
            if(i == 2)
                ;
                song[q] = String.valueOf(i) + first + String.valueOf(i) + second + String.valueOf(i - 1) + third.replace("bottles", "bottle");

            if (i == 1)


                song[q] = String.valueOf(i) + first.replace("bottles", "bottle") + String.valueOf(i) + second.replace("bottles", "bottle") + "no more" + third.replace("bottles", "bottle");;
            if(i == 0)
                song[q] = fourth;





    }return song;
}
}