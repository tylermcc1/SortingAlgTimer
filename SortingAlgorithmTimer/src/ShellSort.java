


public class ShellSort{
	
	
	public static void main(String[] args){};
	
	private void shellSort(int[] array){
	    int h = 1;
        while (h < array.length) h = 3*h + 1;
        while (h > 0){
            h = h/3;
            for (int k = 0; k < h; k++){
                for (int i = h+k; i < array.length; i+=h){
                    int key = array[i];
                    int j = i-h;
                    while (j>=0 && array[j] > key){
                        array[j+h] = array[j];
                        j-=h;
                    }
                    array[j+h] = key;
                   
                }
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
		shellSort(array);
		long endTime = System.nanoTime();
		long runTime = endTime - startTime;
    	
    	double seconds = (double)runTime/1000000000;
    	System.out.println("Running Time:" + " " + seconds + " " + "seconds");
    }
}

	












