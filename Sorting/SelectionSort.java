import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,4,100,13,23,2};
        int[] sorted = selectionSort(arr);
        for(int i: sorted){
            System.out.println(i);
        }
    }
    
    static int[] selectionSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j]<arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
        return arr;
    }
}