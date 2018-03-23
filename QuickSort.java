/**
 * The basic theory of quick sort is to find a pivot. Put all numbers less than pivot on its left side, and greater ones on its 
 * right side.
 * There are many ways to choose the pivot(the leftmost one, the rightonet one, the middle one or random one)
 */
 
 class QuickSort {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int l = in.nextInt();
       int[] nums = new int[l];
       
       for(int i=0; i<l; i++){
       nums[i] = in.nextInt();
       }
       System.out.pintln("The order before sorting: ");
       for(int i=0; i<l; i++) {
       System.out.print(nums[i] + " ");
       }
       System.out.println();
       
       QuickSort qs = new QuickSort();
       qs.quickSort(nums, 0, l-1);
       
       System.out.pintln("The order after sorting: ");
       for(int i=0; i<l; i++) {
       System.out.print(nums[i] + " ");
       }
       System.out.println();
       
   }
   
   public void quickSort(int[] nums, int low, int high) {
         if(low<high) {
         int pivot = partition(nums, low, high);
         
         /* Recursively sort the left part and right part */
         partition(nums, low, pivot-1);
         partition(nums, pivot+1, high);       
         }
   }
   
   
   // Put the numbers less than pivot on its left side and greater ones on its right side
   public int partition(int[] nums, int left, int right) {
   
       int pivot = nums[right];
       
       // This index is used to mark the position of the first one who is greater than pivot
       int index = left;        
       
       for(int i=left; i<right; i++) {
            if(nums[left]<=pivot) {
              swap(nums, left, index);
              index++;
            }
       }
       
       swap(nums,index, right);
       return index;
   }
   
   /* Swap the value of two elements */
   public void swap(int[] nums, int i, int j) {
     int temp = nums[i];
     nums[i] = nums[j];
     nums[j] = temp;
   }
}
