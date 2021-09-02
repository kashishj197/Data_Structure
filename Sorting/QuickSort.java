public class QuickSort {
    public static void main(String args[]) {
      int[] arr = {10, 20, 30, 9, 5, 8, 6};
      int[] sorted = sort(arr, 0, arr.length-1);
      for(int i: sorted) {
          System.out.println(i);
      }
    }
    
    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        
        int i = low - 1;
        for(int j = low; j < high; j++)
        {
            if (arr[j] < pivot) 
            {
                i++; 
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    
    static int[] sort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
        
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);   
        }
        
        return arr;
    }
}