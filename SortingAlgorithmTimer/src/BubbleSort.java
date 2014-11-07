
public class BubbleSort {

	public static void main(String[] args) {
		

	}

	
    private void bubbleSort(int[] array){   
		int n = array.length;
		int tmp,i,j;
		for(i=0;i<n-1;i++){
			for (j=0;j<n-i-1;j++) 
				if (array[j] > array[j+1]) {
					tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
	
	 
	 protected void printArray(int[] array){
	   	 	for( int i=0; i<array.length; i++){
	   	 		System.out.println(array[i]);
	   	    }
	 }
	    
	 protected void time(int[] array){
	    	long startTime = System.nanoTime();
			bubbleSort(array);
			long endTime = System.nanoTime();
			long runTime = endTime - startTime;
	    	
	    	double seconds = (double)runTime/1000000000;
	    	System.out.println("Running Time:" + " " + seconds + " " + "seconds");
	    	

}}

	
	


