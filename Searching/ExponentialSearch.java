import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        int arr[] = {1, 5, 6, 8, 20, 21, 22};
        int x = 20;
        System.out.println(exponentialSearch(arr, x));
    }
    
    public static int exponentialSearch(int[] arr, int x) {
        int i = 1;
        
        while(i<arr.length && arr[i]<=x) {
            i = i*2;
        }
        
        return Arrays.binarySearch(arr, i/2, Math.min(arr.length-1, i), x);
    }
}