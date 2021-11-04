import java.util.ArrayList;
import java.util.List;

public class FizzBuzzWoof {
    public List<String> ten(int n){
        List<String> list = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        String M ;
        for(int i = 1 ; i <= n; i++){
            if(i % 3 == 0)
                builder.append("Fizz");
            if(i%10 == 3 || i/10 == 3)
                builder.append("Fizz");
            if(i % 5 == 0)
                builder.append("Buzz");
            if(i%10 == 5 || i/10 == 5)
                builder.append("Buzz");
            if(i % 7 == 0)
                builder.append("Woof");
            if(i%10 == 7 || i/10 == 7)
                builder.append("Woof");
            if(builder.length() != 0)
            list.add(builder.toString());
            builder.setLength(0);
        }
        return list;
    }
}
