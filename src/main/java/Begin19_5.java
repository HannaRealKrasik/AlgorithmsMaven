/*Написать метод, который проверяет строку на уникальность символов в ней.
*/

import java.util.ArrayList;
import java.util.List;

public class Begin19_5 {
    public static String unic(String s) {
        char[] a = s.toCharArray();
       StringBuilder notUnic = new StringBuilder();
        for (int i = 0; i < a.length - 1; i++)
            for (int n = i + 1; n < a.length; n++) {
                if (a[i] == a[n])
                   notUnic.append(a[n] + ",");
            }
        if (notUnic.length() != 0) {
                return  "Символы " + notUnic.toString() + " не уникальны";
        } else
            return  "Символы строки уникальны";
    }
}
