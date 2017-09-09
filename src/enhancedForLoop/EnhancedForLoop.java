package enhancedForLoop;

public class EnhancedForLoop {

	public static void main(String[] args) {
		
		int josh[] = {4, 5, 6, 2};
		int total = 0;
		
		for(int x: josh){
			total+=x;
		}
			
		System.out.println(total);
		
	}

}
