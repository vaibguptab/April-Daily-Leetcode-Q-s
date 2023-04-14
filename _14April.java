package April;

public class _14April {
    public static void main(String[] args) {

    }
    public int longestPalindromeSubseq(String s) {
        int[][] dp = new int[s.length()+1][s.length()+1];

        String t = new StringBuilder(s).reverse().toString();
        for(int i = s.length()-1;i>=0;i--){
            for(int j=t.length()-1;j>=0;j--){
                if (s.charAt(i) == t.charAt(j)) {
                    dp[i][j] = 1 + dp[i+1][j+1];
                } else {
                    dp[i][j] = Math.max(dp[i+1][j], dp[i][j+1]);
                }
            }
        }
        return dp[0][0];
    }
}
