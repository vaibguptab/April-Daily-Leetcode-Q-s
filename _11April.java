package April;

public class _11April {
    public static void main(String[] args) {
        String str = "leet**cod*e";
        System.out.println(starremoval(str));
    }

    private static String starremoval(String str) {
//        int n = str.length();
//        StringBuilder str1 = new StringBuilder();
//        for (int i=0;i<n;i++){
//            str1.append(str.charAt(i));
//        }
//        int i=0;
//        while (i<str1.length()){
//            if (str1.charAt(i)=='*'){
//                str1.deleteCharAt(i);
//                str1.deleteCharAt(i-1);
//                i=0;
//            }else i++;
//        }
//        return str1.toString();

        StringBuilder ans = new StringBuilder();
        int j=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='*'){
                ans.deleteCharAt(ans.length()-1);
            }else {
                ans.append(str.charAt(i));
            }
        }
        return ans.toString();
    }
}
