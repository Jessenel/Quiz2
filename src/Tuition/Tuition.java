package Tuition;
import java.util.Scanner; 
public class Tuition {
	
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		
		double initialTuition = 12342;
		
		double Rate = 1.05;
		
		double FullTuition = 0;
		
		for (int i = 0; i < 4; i++){
			
			
			double newTuition = 0;
			newTuition = FullTuition * Rate;
			FullTuition = newTuition + initialTuition;
			
			
			
			
		
			
		}
		

		System.out.printf("The total cost of a 4 year tuition is: $%.2f", FullTuition);
		
		
	}
}
