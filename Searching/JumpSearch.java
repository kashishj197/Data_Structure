public class MyClass {
    public static void main(String args[]) {
      int x = 12;
      int[] arr = {1, 4, 5, 6, 12, 16, 20, 22};
      int target = jumpSearch(arr, x);
      System.out.println(target);
    }
    public static int jumpSearch(int[] arr, int x) {
        int n = arr.length;
        int step = (int)Math.floor(Math.sqrt(n)); //Find block size
        int prev = 0;
        while(arr[Math.min(step, n)-1] < x) {   //Finding the block where element is present
            prev = step;
            step += (int)Math.floor(Math.sqrt(n)); //increasing step(index) 
            if (prev >= n)
                return -1;
        }
        while(arr[prev] < x) { //linear search
            prev++;
            if(prev == Math.min(step, n))
                return -1;
        }
        if(arr[prev] == x) //return if found
            return prev;
        
        return -1;
    }
}