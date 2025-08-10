// Medium Level
import java.util.*;
public class RotateArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        rotate(a, 3);
        System.out.println(Arrays.toString(a));
    }
    public static void rotate(int[] nums, int k)
    {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }
    private static void reverse(int[] a, int i, int j)
    {
        while (i < j) {
            int t = a[i]; a[i] = a[j]; a[j] = t;
            i++; j--;
        }
    }
}
