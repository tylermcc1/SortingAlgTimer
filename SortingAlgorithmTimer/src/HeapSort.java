
public class HeapSort {

	public static void main(String[] args) {
		

	}
	

	

    private void arraySwap(int[] array, int i, int j){
    	 int tmp = array[i];
         array[i] = array[j];
         array[j] = tmp; 
    }
	
	
	private void heapSort(int[] array){
		 for (int heapsize=0; heapsize<array.length; heapsize++) {
		        int n = heapsize; 
		        while (n > 0) {
		            int p = (n-1)/2; 
		            if (array[n] > array[p]) { 
		                arraySwap(array, n, p); 
		                n = p; 
		            }
		            else{ 
		                break;
		            }
		        }
		    }
		 for (int heapsize=array.length; heapsize>0;) {
		        arraySwap(array, 0, --heapsize); 
		        int n = 0; 
		        while (true) {
		            int left = (n*2)+1;
		            if (left >= heapsize) 
		                break; 
		            int right = left+1;
		            if (right >= heapsize) { 
		                if (array[left] > array[n]) 
		                    arraySwap(array, left, n); 
		                break; 
		            } if (array[left] > array[n]) {
		                if (array[left] > array[right]) { 
		                    arraySwap(array, left, n);
		                    n = left; continue; 
		                } else {
		                    arraySwap(array, right, n);
		                    n = right; continue; 
		                }
		            } else {
		                if (array[right] > array[n]) { 
		                    arraySwap(array, right, n);
		                    n = right; continue; 
		                } else { 
		                    break;
		                }
		              }
		            }
		        }}
	
	
    
    
    protected void printArray(int[] array){
   	 	for( int i=0; i<array.length; i++){
   	 		System.out.println(array[i]);
   	    }
    }
    
    protected void time(int[] array){
    	long startTime = System.nanoTime();
		heapSort(array);
		long endTime = System.nanoTime();
		long runTime = endTime - startTime;
    	
    	double seconds = (double)runTime/1000000000;
    	System.out.println("Running Time:" + " " + seconds + " " + "seconds");
    
    }
}

	





	


