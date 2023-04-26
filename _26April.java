package April;

public class _26April {
    public static void main(String[] args) {
        int num = 38;
        System.out.println(adddigits(num));
    }

    private static int adddigits(int num) {
        if(num<10) return num;
        int res=0;
        while(num>0) {
            int rem = num%10;
            num = num/10;
            res += rem;
        }
        if(res>9) return adddigits(res);
        else return res;
    }
}
