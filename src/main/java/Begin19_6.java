/*Даны две строки. Определите, можно ли из некоторых символов первой строки составить вторую строку.

      Пример:
method( “QAForEveryone”, “Verona”) -> true
method( “QAForEveryone”, “frog”) -> false
*/

import java.util.Locale;

public class Begin19_6 {
    public static boolean consist(String a, String b){
        char [] first = a.toLowerCase().toCharArray();
        char [] second = b.toLowerCase().toCharArray();
      // int count = 0;
        for(int i = 0; i < second.length; i++){
            int count = 0;
            for (int q = 0; q < first.length; q++) {
                if (first[q] == second[i]) {
                    count++;
                    break;
                }
            }     if (count == 0)
                return false;
            }return true;

    }
}
