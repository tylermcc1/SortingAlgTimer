

public class QuickSortRecursiveThree {
	
	
	
	public static void main(String[] args){}
	
	
	 private void quickSort(int[] a,int left,int right){
		int index = partition(a, left, right);
	    if (left < index - 1){
	         quickSort(a, left, index - 1);
	    }
	    if (index < right){
	            quickSort(a, index, right);
	    }
	}
	 
		
	 
	 private int partition(int[] a,int left, int right)
	 {
	       int i = left, j = right;
	       int tmp;
	       int pivot = getMedian(a,left,right);
	       while (i <= j) {
	             while (a[i] < pivot)
	                   i++;
	             while (a[j] > pivot)
	                   j--;
	             if (i <= j) {
	                   tmp = a[i];
	                   a[i] = a[j];
	                   a[j] = tmp;
	                   i++;
	                   j--;
	             }
	       };
	      
	       return i;
	 }
	 
	 
	 private int getMedian(int[] a,int left,int right){
		 int center = (left+right)/2;
		 if(a[left] > a[center]){
			 swap(a,left,center);
		 }
		 if(a[left] > a[right]){
			 swap(a,left, right);
		 }
		 if(a[center] > a[right]){
			 swap(a, center, right);
		  }       
	     swap(a, center, right);
		 return a[right];
		}
	 
	 
	 
	 private void swap(int[] a,int left,int right){
		 int temp = a[left];
		 a[left] = a[right];
		 a[right] = temp;
	 }

	 
	    
	    
	 protected void printArray(int[] array){
	   	 	for( int i=0; i<array.length; i++){
	   	 		System.out.println(array[i]);
	   	    }
	    }
	    
	 protected void time(int[] array){
	    	long startTime = System.nanoTime();
			quickSort(array,0,array.length-1);
			long endTime = System.nanoTime();
			long runTime = endTime - startTime;
			double seconds = (double)runTime/1000000000;
			System.out.println("Running Time:" + " " + seconds + " " + "seconds");
	    	}
	    }


	 
	 































