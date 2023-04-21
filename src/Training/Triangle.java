package Training;

public class Triangle {
	double a;
	double b;
	double c;

	double area() {
		double s = 0.0;
		if (a > b + c || b > a + c || c > a + b) {
			System.out.println("It is not triangle------");
		} else {
			double p = (a + b + c) / 2;
			s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		}
		return s;
	}

	double perimeter() {
		double p = 0.0;
		if (a > b +c || b > a + c || c > a + b) {
			System.out.println("It is not triangle");
		} else {
			p = a + b + c;
		}
		return p;
	}
}