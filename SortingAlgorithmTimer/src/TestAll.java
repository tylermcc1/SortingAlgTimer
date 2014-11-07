
import java.util.Random;
import java.util.Scanner;


public class TestAll extends SortingTester {
	private int[] a;
	
	public static void main(String[] args){}
	
	protected void setupTest(){
	   	int type;
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter The Size");
		int size = input.nextInt();
		do{
			System.out.println("Please Enter The Type Of Data\nType -1 for already sorted in decreasing order\nType 0 for all data are the same\n"
				+ "Type 1 for already sorted in ascending order\nType 2 for random order");
		    type = input.nextInt();} while(type < -1 || type > 2);
		BubbleSort b = new BubbleSort();
		a = buildArray(size, type);
		System.out.println("BUBBLESORT\n*******************");
		b.time(a);
		HeapSort h = new HeapSort();
		System.out.println("\nHEAPSORT\n*******************");
		h.time(a);
		InsertionSort i = new InsertionSort();
		System.out.println("\nINSERTIONSORT\n*******************");
		i.time(a);
		MergeSort m = new MergeSort();
		System.out.println("\nMERGESORT\n*******************");
		m.time(a);
		QuickSortRecursive q = new QuickSortRecursive();
		System.out.println("\nQUICKSORT RECURSIVE\n*******************");
		q.time(a);
		QuickSortRecursiveThree qt = new QuickSortRecursiveThree();
		System.out.println("\nQUICKSORT MEDIAN OF THREE\n*******************");
		qt.time(a);
		SelectionSort s = new SelectionSort();
		System.out.println("\nINSERTIONSORT\n*******************");
		s.time(a);
		ShellSort sh = new ShellSort();
		System.out.println("\nSHELLSORT\n*******************");
		sh.time(a);
		runAgain();
		input.close();
					
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
	    System.out.println("\nDo You Want To Run Another Test? y/n");
	    String answer = input.next();
	    if(answer.equals("Y") || answer.equals("y")){
	         start();
	    	 input.close();
	    } else{
	    	   System.exit(0);
	    }
	}
	
	
	
	
}



