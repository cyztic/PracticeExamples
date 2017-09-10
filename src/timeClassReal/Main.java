package timeClassReal;

public class Main {

	public static void main(String[] args) {

		TimeClass object = new TimeClass();
		System.out.println(object.toMilitary());
		System.out.println(object.toNormal());
		
		object.setTime(13, 27, 6);
		
		System.out.println(object.toMilitary());
		System.out.println(object.toNormal());
	}

}
