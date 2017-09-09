package sumElements;

public class SummingElementsInArray {

	public static void main(String[] args) {
		
		int josh[] = {9,16,86,25,2};
		int sum=0;
		
		for(int counter=0;counter<josh.length;counter++){
			sum+=josh[counter];    // adds all of the array together
					}
		
		System.out.println("the sum of these numbers is " +sum); 
		
		int joshua[] = {9, 16, 4, 100, 91, 1000, 36};
		int squaredNumber;
		
		for(int counter=0; counter<joshua.length;counter++){
			squaredNumber = joshua[counter];
			System.out.println(Math.sqrt(squaredNumber));
		}
		
	}

}
