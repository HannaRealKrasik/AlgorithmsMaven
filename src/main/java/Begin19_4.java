/*Написать метод, который принимает на вход строку букв,
и  возвращает строку, в которой только уникальные буквы

Пример:
method(“abcaczdbdakcazdbaz”)
 Вернуть
“abczdk"
*/


import java.util.ArrayList;
import java.util.List;

public class Begin19_4 {
    public static String unikCount(String s) {
        char[] words = s.toCharArray();
        System.out.println();
        StringBuilder newWord1 = new StringBuilder();
        newWord1.append(words[0]);
       // List<Character> newWord = new ArrayList<>();
      //  newWord.add(words[0]);
        int count = 0;
        int a;
        for (int i = 1; i < words.length; i++) {

            for (a = 0; a < i; a++) {
                if (words[i] != words[a]) {
                    count++;
                }
            }
            if (count == a)
                newWord1.append(words[a]);
            count = 0;
        }

        return newWord1.toString();
    }
}
