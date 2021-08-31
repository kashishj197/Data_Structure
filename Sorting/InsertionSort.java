import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1,4,100,13,23,2};
        int[] sorted = insertionSort(arr);
        for(int i: sorted){
            System.out.println(i);
        }
    }
    
    static int[] insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while(j>=0 && arr[j]>key) {
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
        
        return arr;
    }
}