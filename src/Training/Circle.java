package Training;

public class Circle {
	double radius;
	double pi = Math.PI;

	double perimeter() {
		return 2 * pi * radius;
	}

	double area() {
		return pi * radius * radius;
	}
}
