package April;

public class _1stApril {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,7,8,12};
        System.out.println(Binary(arr));
    }

    private static int Binary(int[] nums) {
        int start =0,end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) start = mid+1;
            else if(nums[mid] > target) end = mid-1;
        }
        return -1;
    }

}
