package April;

import java.sql.Array;
import java.util.Arrays;

public class _27April {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(onbulbs(n));
    }

    private static int onbulbs(int n) {
        return (int) Math.sqrt(n);
    }
}
