package rng;
import java.util.Random; //imports random number generator


public class RandomNumberGenerator {

	public static void main(String[] args) {
		
		Random dice = new Random();
		int number;
		
		for(int counter=1; counter<=10; counter++){ // counter sets your loop to 1, counter<=10 makes it go till its 10, counter++ makes it add by 1 per loop
			number = 1+dice.nextInt(6); //creates random number -- the 1+ makes it do 1-6 instead of 0-5
			System.out.println(number + " "); // prints random number
		}
		

	}

}
