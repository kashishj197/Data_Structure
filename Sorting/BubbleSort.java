import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,4,100,13,23,2};
        int[] sorted = bubbleSort(arr);
        for(int i: sorted){
            System.out.println(i);
        }
    }
    
    static int[] bubbleSort(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length-1; j++) {
                if(arr[j+1]<arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        
        return arr;
    }
}