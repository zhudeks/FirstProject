package Training;

public class Circle {
	double radius;
	double pi = 22.0 / 7.0;

	void perimeter() {
		System.out.println("Perimeter = " + 2 * pi * radius);
	}

	void area() {
		System.out.println("Area = " + pi * radius * radius);
	}
}
