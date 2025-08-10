// Hard Level
import java.util.*;
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] h = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(h));
    }
    public static int trap(int[] height)
    {
        int n = height.length;
        int l = 0, r = n - 1;
        int leftMax = 0, rightMax = 0, res = 0;
        while (l <= r)
        {
            if (height[l] <= height[r])
            {
                if (height[l] >= leftMax) leftMax = height[l];
                else res += leftMax - height[l];
                l++;
            }
            else
            {
                if (height[r] >= rightMax) rightMax = height[r];
                else res += rightMax - height[r];
                r--;
            }
        }
        return res;
    }
}
