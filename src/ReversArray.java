//Easy Level
import java.util.*;
public class ReversArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        reverse(a);
        System.out.println(Arrays.toString(a));
    }
    public static void reverse(int[] a)
    {
        int i = 0, j = a.length - 1;
        while (i < j)
        {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i++;
            j--;
        }
    }
}
