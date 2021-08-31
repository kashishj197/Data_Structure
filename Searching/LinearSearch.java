public class MyClass {
    public static void main(String args[]) {
      int x = 12;
      int[] arr = {1, 4, 5, 6, 12, 16, 20, 22};
      int target = fasterLinearSearch(arr, x);
      System.out.println(target);
    }
    public static int fasterLinearSearch(int[] arr, int x) {
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left<=right) {
            if(arr[left] == x) {
                return left;
            }
            if(arr[right] == x) {
                return right;
            }
            left++;
            right--;
        }
        
        return -1;
    }
}