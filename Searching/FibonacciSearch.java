import java.util.*;
public class FibonacciSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,9,13,23,34};
        int x = 23;
        System.out.println(search(arr, x));
    }
    
    static int search(int[] arr, int x) {
        int fib1 = 1;
        int fib2 = 0;
        int fib = fib1 + fib2;
        
        while(fib < arr.length) {
            fib2 = fib1;
            fib2 = fib;
            fib = fib1 + fib2;
        }
        
        int offset = -1;
        
        while(fib > 1) {
            int i = Math.min(offset + fib2, arr.length-1);
            
            if (arr[i] < x) {
                fib = fib1;
                fib1 = fib2;
                fib2 = fib - fib1;
                offset = i;
            } else if(arr[i] > x) {
                fib = fib1;
                fib1 = fib1 - fib2;
                fib2 = fib - fib1;
            } else {
                return i;
            }
        }
        
        if (fib1 == 1 && arr[arr.length-1] == x)
            return arr.length-1;
            
        return -1;
    }
}