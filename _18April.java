package April;

public class _18April {
    public static void main(String[] args) {
        String str1 = "abc" , str2 = "pqrstuv";
        System.out.println(mergestrings(str1,str2));
    }

    private static String mergestrings(String word1, String word2) {
        if (word2.length()==0) return word1;
        if (word1.length()==0) return word2;

        int m = word1.length() , n = word2.length();
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        while (i < m || j < n) {
            if (i < m) {
                result.append(word1.charAt(i++));
            }
            if (j < n) {
                result.append(word2.charAt(j++));
            }
        }

        return result.toString();
    }
}
