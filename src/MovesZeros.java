// Medium Level
import java.util.*;
public class MovesZeros {
    public static void main(String[] args) {
        int[] a = {0,1,0,3,12};
        moveZeros(a);
        System.out.println(Arrays.toString(a));
    }
    public static void moveZeros(int[] nums)
    {
        int insertPos = 0;
        for (int num: nums)
            if (num != 0)
                nums[insertPos++] = num;
        while (insertPos < nums.length)
            nums[insertPos++] = 0;
    }
}
