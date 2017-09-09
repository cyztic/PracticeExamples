package arraysInMethods;

public class ArraysInMethods {

	public static void main(String[] args) {
		
		int josh[] = {3,4,5,6,7};
		change(josh);
		
		for(int y:josh)
			System.out.println(y);
		
	}

	public static void change(int x[]){
		for(int counter = 0; counter <x .length; counter++)
			x[counter]+=5;
	}
	
}
