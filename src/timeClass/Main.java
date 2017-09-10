package timeClass;

public class Main {

	public static void main(String[] args) {

		TimeClass object = new TimeClass();
		System.out.println(object.toMilitary());
		object.setTime(13, 27, 6);
		System.out.println(object.toMilitary());
	}

}
