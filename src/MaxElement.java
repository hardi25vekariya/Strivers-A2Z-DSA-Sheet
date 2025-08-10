//Easy Level
import java.util.*;
public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {3,1,7,4};
        System.out.println(max(arr));
    }
    public static int max(int[] a)
    {
        int m = a[0];
        for (int x: a)
            if (x > m)
                m = x;
        return m;
    }
}
