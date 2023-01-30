package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        StringBuilder ret = new StringBuilder();
        if (1 <= s.length() && s.length() <= Math.pow(10, 4) && s.matches("^[a-zA-Z\s0-9]*$")) {
            String[] lista = s.split("\\s+");

            List<String> list = new ArrayList<>(List.of(lista));
            Collections.reverse(list);

            for (String value : list) {
                ret.append(value).append(" ");
            }
        }
        return ret.toString().trim();
    }

    public static void main(String[] args) {
        String s = "EPY2giL";
        System.out.println(reverseWords(s));
    }
}
