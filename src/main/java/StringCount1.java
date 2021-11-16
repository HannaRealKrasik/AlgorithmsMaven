public class StringCount1 {
    public static int Count(String s, int count){
       StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= count; i++){
            builder.append(s);
        }
        return builder.length();
    }
}
