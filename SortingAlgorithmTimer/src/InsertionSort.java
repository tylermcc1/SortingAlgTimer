
public class InsertionSort {

	public static void main(String[] args){};

	private void insertionSort(int[] array){	
        int n = array.length;
        int tmp,i,j;
        for (j=1; j<n; j++){
    	  i = j-1;
    	  tmp = array[j];
    	  while((i>=0) && (tmp < array[i])){
    		array[i+1] = array[i];
    		i--;
    	  }
    	array[i+1] = tmp;
    	}
	}

    
    
    protected void printArray(int[] array){
   	 	for( int i=0; i<array.length; i++){
   	 		System.out.println(array[i]);
   	 }
    }
    
    protected void time(int[] array){
    	long startTime = System.nanoTime();
		insertionSort(array);
		long endTime = System.nanoTime();
		long runTime = endTime - startTime;
    	
    	double seconds = (double)runTime/1000000000;
    	System.out.println("Running Time:" + " " + seconds + " " + "seconds");
    
}}
