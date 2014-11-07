


public class QuickSortRecursive {
	
	
	public static void main(String[] args){}
	
	
	private int partition(int arr[], int left, int right){
	      int i = left, j = right;
	      int tmp;
	      int pivot = arr[(left + right) / 2];
	      while (i <= j) {
	        while (arr[i] < pivot)
	          i++;
	        while (arr[j] > pivot)
	          j--;
	        if (i <= j) {
	          tmp = arr[i];
	          arr[i] = arr[j];
	          arr[j] = tmp;
	          i++;
	          j--;
	            }
	      };
	     
	      return i;
	}
	 
	private void quickSortRecursive(int arr[], int left, int right) {
	      int index = partition(arr, left, right);
	      if (left < index - 1){
	            quickSortRecursive(arr, left, index - 1);
	      }
	      if (index < right){
	            quickSortRecursive(arr, index, right);
	      }
	}
     
     
     
     protected void printArray(int[] array){
    	 	for( int i=0; i<array.length; i++){
    	 		System.out.println(array[i]);
    	    }
     }
     
     protected void time(int[] array){
     	long startTime = System.nanoTime();
 		quickSortRecursive(array,0,array.length-1);
 		long endTime = System.nanoTime();
 		long runTime = endTime - startTime;
     	
     	double seconds = (double)runTime/1000000000;
     	System.out.println("Running Time:" + " " + seconds + " " + "seconds");
     	
     }

 
  

}
