public class MyClass {
    public static void main(String args[]) {
        int arr[] = {1, 5, 6, 8, 20, 21, 22};
        int x = 20;
        System.out.println(interpolationSearch(0, arr.length-1, arr, x));
    }
    
    public static int interpolationSearch(int lo, int hi, int[] arr, int x) {
        int pos;
        if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {
            pos = lo + (((hi-lo) / (arr[hi] - arr[lo])) * (x-arr[lo]));
            
            if (arr[pos] == x) {
                return pos;
            }
            
            if (arr[pos] < x) {
                return interpolationSearch(pos + 1, hi, arr, x);
            }
            
            if(arr[pos] > x) {
                return interpolationSearch(lo, pos - 1, arr, x);
            }
        }
        
        return -1;
    }
}