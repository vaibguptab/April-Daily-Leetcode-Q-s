package April;

public class _5thApril {
    public static void main(String[] args) {
    int[] nums = {3,7,1,6};
        System.out.println(Q2439(nums));
    }

    private static int Q2439(int[] nums) {
        int ans=0,presum=0;
        for (int i=0;i<nums.length;i++){
            presum += nums[i];
            ans = Math.max(ans,(presum+i)/(i+1));
        }
        return (int)ans;
    }
}
