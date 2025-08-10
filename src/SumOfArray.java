//Easy Level
import java.util.*;
    public class SumOfArray {
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5};
            System.out.println(sum(arr));
        }
        public static long sum(int[] a)
        {
            long s = 0;
            for(int x: a) s += x;
            return s;
        }
    }


