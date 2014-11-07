

public class MergeSort{
	
	
	public static void main (String[] args){}
	
	 private void mergeSort(int[] array) {
	        if (array.length > 1) {
	          int[] left = leftHalf(array);
	          int[] right = rightHalf(array);
	          mergeSort(left);
	          mergeSort(right);
	          merge(array, left, right);
	        }
	    }
	 
	
	   private int[] leftHalf(int[] array) {
	        int size1 = array.length / 2;
	        int[] left = new int[size1];
	        for (int i = 0; i < size1; i++) {
	            left[i] = array[i];
	        }
	        return left;
	    }
	    
	  
	    private int[] rightHalf(int[] array) {
	        int size1 = array.length / 2;
	        int size2 = array.length - size1;
	        int[] right = new int[size2];
	        for (int i = 0; i < size2; i++) {
	            right[i] = array[i + size1];
	        }
	        return right;
	    }
	    
	 
	    protected void merge(int[] result, int[] left, int[] right) {
	        int i1 = 0;   
	        int i2 = 0;  
	        for (int i = 0; i < result.length; i++) {
	            if (i2 >= right.length || (i1 < left.length && 
	                    left[i1] <= right[i2])) {
	                result[i] = left[i1];    
	                i1++;
	            } else {
	                result[i] = right[i2];   
	                i2++;
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
			mergeSort(array);
			long endTime = System.nanoTime();
			long runTime = endTime - startTime;
	    	
	    	double seconds = (double)runTime/1000000000;
	    	System.out.println("Running Time:" + " " + seconds + " " + "seconds");
	    	
	    }




}

