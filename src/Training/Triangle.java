package Training;

public class Triangle {
	double side1;
	double side2;
	double side3;

	double area() {
		double s = 0.0;
		if (side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2) {
			System.out.println("It is not triangle------");
		} else {
			double p = (side1 + side2 + side3) / 2;
			s = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		}
		return s;
	}

	double perimeter() {
		double p = 0.0;
		if (side1 > side2 + side3 || side2 > side1 + side3 || side3 > side1 + side2) {
			System.out.println("It is not triangle");
		} else {
			p = side1 + side2 + side3;
		}
		return p;
	}
}