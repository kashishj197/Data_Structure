import java.util.*;
public class MergeSort {
    static int[] arr = {1,4,100,13,23,2};
    public static void main(String[] args) {
        sort(arr, 0, arr.length-1);
        int[] sorted = arr;
        for(int i: sorted){
            System.out.println(i);
        }
    }
    
    static void merge(int[] arr, int l, int m, int r) {
        int p1 = m - l + 1;
        int p2 = r - m;
        int L[] = new int[p1];
        int R[] = new int[p2];
        for (int i = 0; i<p1; i++) {
            L[i] = arr[l+i];
        }
        for (int i = 0; i<p2; i++) {
            R[i] = arr[m+i+1];
        }
        
        int i = 0, j = 0, k = l;
        while (i < p1 && j < p2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < p1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < p2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    static void sort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            sort(arr, l, m - 1);
            sort(arr, m + 1, r);
            
            merge(arr, l, m, r);
        }
    }
}