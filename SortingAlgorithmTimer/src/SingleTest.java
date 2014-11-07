import java.util.Random;
import java.util.Scanner;
//Set up and conduct tests by creating sorting objects

public class SingleTest extends SortingTester{
	
	private int[] a;

	
	public static void main(String[] args){};
	
	
	protected void setupTest(){
		Scanner input = new Scanner(System.in);
		int choice;
		int type;
		int size;
		do{
			System.out.println("1 : BubbleSort\n2 : SelectionSort\n3 : InsertionSort\n"
				+ "4 : ShellSort\n5 : HeapSort\n6 : MergeSort\n7 : QuickSort -recursive\n"
				+ "8 : QuickSort - recursive, median of three\n\n\n\nPlease Enter Your Choice: ");
			choice = input.nextInt(); } while(choice < 1 || choice > 8);
		
		System.out.println("Please Enter The Size");
		size = input.nextInt();
		do{
			System.out.println("Please Enter The Type Of Data\nType -1 for already sorted in decreasing order\nType 0 for all data are the same\n"
				+ "Type 1 for already sorted in ascending order\nType 2 for random order");
		    type = input.nextInt();} while(type < -1 || type > 2);

		switch (choice){
		case 1: BubbleSort b = new BubbleSort();
			    a = buildArray(size, type);
			    b.time(a);
			    System.out.println("\n\n\nDo You Want To See The Sorted Array? y/n");
		    	String answer = input.next();
		    	if(answer.equals("Y") || answer.equals("y")){  
		    		b.printArray(a);
		    	}
		    	runAgain();
		
		
		case 2: SelectionSort s = new SelectionSort();
	    		a = buildArray(size, type);
	    		s.time(a);
	    		System.out.println("\n\n\nDo You Want To See The Sorted Array? y/n");
		    	answer = input.next();
		    	if(answer.equals("Y") || answer.equals("y")){  
		    		s.printArray(a);
		    	}
		    	runAgain();
		
		case 3: InsertionSort i = new InsertionSort();
				a = buildArray(size, type);
				i.time(a);
				System.out.println("\n\n\nDo You Want To See The Sorted Array? y/n");
		    	answer = input.next();
		    	if(answer.equals("Y") || answer.equals("y")){  
		    		i.printArray(a);
		    	}
		    	runAgain();
		
		
		case 4: ShellSort sh = new ShellSort();
				a = buildArray(size, type);
				sh.time(a);
				System.out.println("\n\n\nDo You Want To See The Sorted Array? y/n");
		    	answer = input.next();
		    	if(answer.equals("Y") || answer.equals("y")){  
		    		sh.printArray(a);
		    	}
		    	runAgain();
		
		
		case 5: HeapSort h = new HeapSort();
				a = buildArray(size, type);
				h.time(a);
				System.out.println("\n\n\nDo You Want To See The Sorted Array? y/n");
		    	answer = input.next();
		    	if(answer.equals("Y") || answer.equals("y")){  
		    		h.printArray(a);
		    	}
		    	runAgain();
		
				
		case 6: MergeSort m = new MergeSort();
				a= buildArray(size, type);
				m.time(a);
				System.out.println("\n\n\nDo You Want To See The Sorted Array? y/n");
		    	answer = input.next();
		    	if(answer.equals("Y") || answer.equals("y")){  
		    		m.printArray(a);
		    	}
		    	runAgain();
				
		case 7: QuickSortRecursive qr = new QuickSortRecursive();
				a= buildArray(size, type);
				qr.time(a);
				System.out.println("\n\n\nDo You Want To See The Sorted Array? y/n");
				answer = input.next();
				if(answer.equals("Y") || answer.equals("y")){  
					qr.printArray(a);
				}
				runAgain();
				
		case 8: QuickSortRecursiveThree q = new QuickSortRecursiveThree();
				a= buildArray(size, type);
				q.time(a);
				System.out.println("\n\n\nDo You Want To See The Sorted Array? y/n");
				answer = input.next();
				if(answer.equals("Y") || answer.equals("y")){  
					q.printArray(a);
				}
				runAgain();
				input.close();
				
		}
	}
	
	
	protected int[] buildArray(int size, int type){
		   int [] a = new int [size];
		   int count = 0;
		   int max = 9999;
		   int upper = size;
		   if (type == -1){
		       for (int i =0; i< size; i++){
		    	   a[i] = upper;
		    	   upper--;
		       }        
		   } else if(type == 0){
				for (int i = 0; i < size; i++){
					a[i] = 5;
				}
		   } else if(type ==1 ){
				for(int i=0; i< size; i++){
					a[i] = count;
					count++;
				}
		   } else if(type == 2){
				Random generator = new Random();
				for(int i=0; i< size; i++){
					a[i] = generator.nextInt(max);
			    }
		   }
			
		   return a;
	 }
	
	
	private void runAgain(){
	   Scanner input = new Scanner(System.in);
       System.out.println("Do You Want To Run Another Test? y/n");
       String answer = input.next();
       if(answer.equals("Y") || answer.equals("y")){
         start();
         input.close();
       } else{
    	   System.exit(0);
       }
     }
   

} 
	 
		



