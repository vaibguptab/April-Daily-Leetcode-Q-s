package April;

import java.util.Arrays;

public class _4thApril {
    public static void main(String[] args) {
        String s = "abacaba";
        System.out.println(Q2405(s));
    }

    private static int Q2405(String s) {
        if (s.length()==0) return 0;
        int[] lastseen = new int[26];
        Arrays.fill(lastseen,-1);
        int count=1 , substart = 0;
        for (int i=0;i<s.length();i++){
            if (lastseen[s.charAt(i)-'a'] >= substart) {
                substart = i;
                count++;
            }
            lastseen[s.charAt(i)-'a'] = i;
        }
        return count;
    }
}
