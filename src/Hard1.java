// Hard Level
import java.util.*;
public class Hard1 {
    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(a));
    }
    public static int maxSubArray(int[] nums)
    {
        int maxSoFar = nums[0], maxEnding = nums[0];
        for (int i = 1; i < nums.length; i++)
        {
            maxEnding = Math.max(nums[i], maxEnding + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEnding);
        }
        return maxSoFar;
    }
}
