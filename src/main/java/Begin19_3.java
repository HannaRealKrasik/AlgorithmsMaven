public class Begin19_3 {
    public static String[] countWords(String s) {
        String[] massive = s.split("\\W+");
        String max = massive[0];
        String min = massive[0];
        int count = 0;

        for (int i = 0; i < massive.length; i++) {
            if (massive[i].length() < min.length())
                min = massive[i];
            if (massive[i].length() > max.length())
                max = massive[i];
        }

        StringBuilder ma = new StringBuilder();
        ma.append(max);

        do {
            for (int i = 0; i < massive.length; i++) {
                if (ma.length() == massive[i].length())
                    count++;
            }
            if (count == 1) {
                ma.deleteCharAt(0);
                count = 0;
            }
        }while ( count == 0 && ma.length() > 0 );

        String [] m = {min , max ,String.valueOf(count) };
        return m;
    }
}

