package LeetCode;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String ret = "";
        char[] aux = strs[0].toCharArray();
        char[] caracteres;

        for (int i = 1; i < strs.length; i++) {
            caracteres = strs[i].toCharArray();
            for (int j = 0; j < caracteres.length; j++) {
                if (aux[j] == caracteres[j]) {
                    ret += caracteres[j];
                }
            }
        }

        return ret; 
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
