import java.util.Arrays;
import java.util.Scanner;
import java.util.zip.ZipFile;

public class Main {
	public static void main(String[] args) {
		//Read input from keyboard
//		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//		System.out.print("Enter age: ");
//
//		int num = myObj.nextInt();  // Read user input
//		System.out.println("Factorial of " + num + " is " + fact(num));  // Output user input

		int num = 6;
		//Area calculation
		double area = area("circle", 5, 7);
		if (area != 0) {
			System.out.println("Area is " + area);
		} else {
			System.out.println("It is not possible to calculate area");
		}
		int[] input_array = {3, 3, 1, 1, 1, 1, 2};
		//Sort function
		sort(input_array);

		//Age check
		print_age(num);

		//Age check 2
		System.out.println(print_age1(num));

		//String to array
		string_to_array("sdsd fgfgg ioio");

		//fd
		String s = "fddj uui oppoio+ 54";
		System.out.println(Arrays.toString(sentence_to_array(s)));

		//string concat
		String str1 = "hello";
		String str2 = "world";
		String str3 = str1 + str2;
		System.out.println(str3);

		int[] input_array1 = {3, 1};

		reverse(input_array1);
		second_largest_element(input_array);

		System.out.println("circle - " +  area(4));
		System.out.println("trinagle - " +  area(2, 1, 3));
		System.out.println("rectangle - " + area(4, 5));

		int[] input_array2 = {4, 1, 1, 2, -5, 0, 9, -1, 65, -10};
		int[] input_array3 = {-4, -5};
		System.out.println("Two positive numbers: " + two_positive_numbers(input_array2));
		count_and_product(input_array3);

		task003(input_array2);
	}

	public static int fact(int n) {
		int f = 1;
		if (n <= 1) {
			return f;
		} else {
			for (int i = 1; i <= n; i++) {
				f = f * i;
			}
			return f;
		}
	}

	public static double area(String figure, double... sides) {
		double s = 0;
		if (figure.equals("triangle") && sides.length == 3) {
			double a = sides[0];
			double b = sides[1];
			double c = sides[2];
			double p = (a + b + c) / 2;
			s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
			return s;
		} else {
			if (figure.equals("circle") && sides.length == 1) {
				double r = sides[0];
				return (22 * r * r) / 7;
			} else {
				if (figure.equals("rectangle") && sides.length == 2) {
					double a = sides[0];
					double b = sides[1];
					s = a * b;
				} else {
					if (figure.equals("square") && sides.length == 1) {
						s = sides[0] * sides[0];
					}
				}
				return s;
			}
		}
	}

	public static void sort(int[] a1) {
		for (int i = 0; i<a1.length - 1; i++)
			for(int j = i; j<a1.length; j++)
				{
					int min;
					if(a1[i]< a1[j])
					{
						min = a1[i];
						a1[i] = a1[j];
						a1[j] = min;
					}
				}

		for (int i = 0; i < a1.length; i++) {
			System.out.println("a1 and b1 are:" + a1[i]);
		}
	}

	public static void print_age(int age) {
		if (age > 0 && age < 18) {
			System.out.println("Չափահաս չէ");
		} else if (age >= 18 && age < 63) {
			System.out.println("Չափահաս է");
		} else if (age >= 63) {
			System.out.println("Թոշակառու է");
		} else {
			System.out.println("Այդպիսի մարդ գոյություն չունի");
		}
	}

	public static int print_age1(int age) {
		if (age > 0 && age < 18) {
			return age + 1;
		} else if (age >= 18 && age < 63) {
			return age + 2;
		} else if (age >= 63) {
			return age + 3;
		} else {
			return age + 4;
		}
	}

	public static void string_to_array(String str) {
		int arr_length = str.length();
		char[] char_arr = new char[arr_length];
		for (int i = 0; i < str.length(); i++) {
			char_arr[i] = str.charAt(i);
		}

		for (int i = 0; i < char_arr.length; i++) {
			System.out.println("[" + i + "] = " + char_arr[i]);
		}
	}

	public static String[] sentence_to_array(String str) {
		String[] new_str_arr = new String[str.length()];
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				char elem = str.charAt(i);
				if (elem != ' ') {
					new_str_arr[i] = String.valueOf(elem);
				}
			}
		}

		return new_str_arr;
	}

	public static void reverse(int[] input_arr) {
		int new_arr[] = new int[input_arr.length];
		int index = 0;
		for (int i = input_arr.length -1; i >= 0; i--) {

			new_arr[index] = input_arr[i];
			index ++;
		}
		System.out.println("Reversed ------ ");
		for (int i = 0; i < new_arr.length; i++) {
			System.out.println(new_arr[i]);
		}
	}

	public static void second_largest_element(int[] input_arr) {
		int largest;
		int second_largest;

		if (input_arr[1] > input_arr[0]) {
			largest = input_arr[1];
			second_largest = input_arr[0];
		} else {
			largest = input_arr[0];
			second_largest = input_arr[1];
		}

		for (int i = 0; i < input_arr.length; i++) {
			if (input_arr[i] >= largest) {
				largest = input_arr[i];
			} else if (input_arr[i] <= largest && input_arr[i] >= second_largest) {
				second_largest = input_arr[i];
			}
		}
		System.out.println("Largest - " + largest);
		System.out.println("Second Largest - " + second_largest);
	}

	//for circle
	public static double area(double a) {
		return (22 * a * a)/7;
	}

	//for rectangle
	public static double area(double a, double b) {
		return a * b;
	}

	//for triangle
	public static double area(double a, double b, double c) {
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	//find two positive numbers
	public static int two_positive_numbers(int[] input_arr) {
		int count = 0;
		for (int i = 1; i < input_arr.length; i++) {
			if (input_arr[i] > 0 && input_arr[i-1] > 0) {
				count++;
			}
		}
		return count;
	}

	//test changes
	public static void count_and_product(int[] input_arr){
		int count = 0;
		int product = 1;
		for (int i = 0; i < input_arr.length; i++) {
			if (input_arr[i] > 0) {
				count = count + input_arr[i];
			}
			if (input_arr[i] % 2 == 0 && input_arr[i] > 0) {
				product = product * input_arr[i];
			}
		}
		System.out.println("Count - " + count);
		System.out.println("Product - " + product);
	}

	//task 003
	public static void task003(int[] input_arr) {
		boolean flag = false;
		for (int i = 0; i < input_arr.length; i++) {
			if (input_arr[i] < -2) {
				flag = true;
				break;
			}
		}
		for (int i = 0; i < input_arr.length; i++) {
			if (input_arr[i] < 0) {
				input_arr[i] = input_arr[i] * input_arr[i];
			}
		}
		for (int i = 0; i < input_arr.length; i++) {
			System.out.println("input_arr[" + i + "] = " + input_arr[i]);
		}
	}
}