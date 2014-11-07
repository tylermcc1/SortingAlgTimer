import java.util.Scanner;

public class SortingTester {
	
public static void main(String[] args){
		SortingTester s = new SortingTester();
		s.start();
		
	}



protected void start(){
	Scanner input = new Scanner(System.in);
	int num;
	do {
	    System.out.println("Enter 1 for testing each individual sorting algorithm\nEnter 2 for compare running time for each of the algorithms\nEnter 0 to quit");
	    num = input.nextInt();
	    if (num==1){
		  SingleTest s = new SingleTest();
		  s.setupTest();
		  input.close();
	     } else if(num==2){
	         TestAll t = new TestAll();
		     t.setupTest();
		     input.close();
	     } else if(num==0){
	    	 input.close();
		     System.exit(0);
	     } else{
		     System.out.println("Not a valid choice\n");
		 }
       } while(num < 0 || num > 2);
     
}


}
