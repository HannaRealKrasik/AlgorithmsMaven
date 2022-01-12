public class Begin19_2 {
    public static String separete(String s) {
        StringBuilder builder = new StringBuilder();
        if (s.length() > 5) {
            builder.append(s.substring((s.length() - 4), (s.length() - 1)));
            builder.append(s.substring(0, 2));
        } else {
            String first = null;
            if (s.length() % 2 == 0) {
                first =((s.substring((s.length()/2-1),(s.length()/2+1))));
            }if(s.length() % 2 != 0){
                 first = (s.substring(s.length()/2));
            }
            for (int i = 0; i < s.length(); i++){
                builder.append(first);
            }
    }return builder.toString();
}
}