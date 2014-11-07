
public class SelectionSort{
	
	private void selectionSort(int[] array){   
		int n = array.length;
		int min,tmp,i,j,min_id;
		
		for(i=0; i< n-1; i++){
			min = array[i];
			min_id = i;
			for (j = i+1; j<n; j++) 
				if(array[j] < min) {
					min = array[j];
					min_id = j;
				}
			tmp = array[i];
			array[i] = array[min_id];
			array[min_id] = tmp;
			}
		}
	
	
    
    
    protected void printArray(int[] array){
   	 	for( int i=0; i<array.length; i++){
   	 		System.out.println(array[i]);
   	    }
    }
    
    protected void time(int[] array){
    	long startTime = System.nanoTime();
		selectionSort(array);
		long endTime = System.nanoTime();
		long runTime = endTime - startTime;
    	
    	double seconds = (double)runTime/1000000000;
    	System.out.println("Running Time:" + " " + seconds + " " + "seconds");
    	
    }

}
