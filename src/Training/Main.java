package Training;

public class Main {
	public static void main(String[] args) {
		Triangle myTriangle = new Triangle();

		myTriangle.a = 3;
		myTriangle.b = 4;
		myTriangle.c = 5;
		System.out.println(myTriangle.area());
		System.out.println(myTriangle.perimeter());
	}
}