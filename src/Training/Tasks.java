package Training;

//change name
public class Tasks {
	public static int fact(int n) {
		int f = 1;
		if (n > 1) {
			for (int i = 1; i <= n; i++) {
				f = f * i;
			}
		}
		return f;
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

		for (int j : a1) {
			System.out.println("a1 and b1 are:" + j);
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

	public static void reverse(int[] input_arr) {
		int[] new_arr = new int[input_arr.length];
		int index = 0;
		for (int i = input_arr.length -1; i >= 0; i--) {

			new_arr[index] = input_arr[i];
			index ++;
		}
		System.out.println("Reversed ------ ");
		for (int j : new_arr) {
			System.out.println(j);
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

		for (int j : input_arr) {
			if (j >= largest) {
				largest = j;
			} else if (j >= second_largest) {
				second_largest = j;
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
		for (int j : input_arr) {
			if (j > 0) {
				count = count + j;
			}
			if (j % 2 == 0 && j > 0) {
				product = product * j;
			}
		}
		System.out.println("Count - " + count);
		System.out.println("Product - " + product);
	}

	//task 003
	public static void task003(int[] input_arr) {
		for (int j : input_arr) {
			if (j < -2) {
				return;
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

	public static void task004(int[] input_arr) {
		int count_even = 0;
		int count_odd = 0;
		for (int j : input_arr) {
			if (j > 0 && j % 2 == 0) {
				count_even = count_even + j * j;
			} else if (j % 2 == 1) {
				count_odd = count_odd + j * j;
			}
		}
		System.out.println("Zuyg - " + count_even);
		System.out.println("Kent - " + count_odd);
	}

	public static void task005(double[] temp) {
		double min = temp[0];
		double max = temp[0];
		double count = 0;
		for (int i = 0; i < 23; i++) {
			if (temp[i] > max) {
				max = temp[i];
			} else if (temp[i] < min) {
				min = temp[i];
			}
			count = count + temp[i];
		}
		System.out.println("Min - " + min);
		System.out.println("Max - " + max);
		System.out.println("Median - " + count / 24 );
	}

	public static void task006(int[] input_arr) {
		for (int i = 0; i < input_arr.length; i++) {
			if (input_arr[i] % 2 == -1) {
				System.out.println("input_array[" + i + "]: " + input_arr[i]);
				return;
			}
		}
	}

	public static void task007(int[] input_arr) {
		int count = 0;
		int sum = 0;
		for (int j : input_arr) {
			if (j % 5 == 0 && j % 7 != 0) {
				count++;
				sum += j;
			}
		}
		System.out.println("Count - " + count);
		System.out.println("Sum - " + sum);
	}

	public static void task008(int[] input_arr) {
		int count = 0;
		int product = 1;
		for (int i : input_arr) {
			if (i < 0) {
				count++;
			}
			if (i >= 5 && i <= 15) {
				product *= i;
			}
		}
		System.out.println("Count - " + count);
		System.out.println("Product - " + product);
	}

	public static void task009(int[] input_arr) {
		int count = 0;
		for (int i = 0; i < input_arr.length - 1; i++) {
			if (input_arr[i] <= 3 && input_arr[i+1] < 0) {
				System.out.println("a[" + i + "] - " + input_arr[i]);
				System.out.println("a[" + (i + 1) + "] - " + input_arr[i+1]);
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Նման զույգ չկա");
		}
	}

	public static void task010(int[] input) {
		for (int i = 0; i < input.length; i++) {
			if (input[i] == 0 && input[i+1] % 2 == 0 && input[i+1] > 0) {
				System.out.println("a[" + i + "] - " + input[i]);
				System.out.println("a[" + (i + 1) + "] - " + input[i+1]);
			}
		}
	}

	public static void task011(int[] input) {
		int[] second_array = new int[input.length / 2];
		for (int i = 0; i < input.length / 2; i++) {
			second_array[i] = input[i] + input[input.length - i - 1];
		}
		int max = second_array[0];
		for (int i : second_array) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println(max);
	}

	public static void task012(int[] input) {
		int min = input[0];
		int index = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] < min) {
				min = input[i];
				index = i;
			}
		}
		for (int i = 0; i < index; i++) {
			input[i] = input[i] * min;
		}
		System.out.println("min " + min);
		System.out.println("index " + index);
		for (int i : input) {
			System.out.println("test - " + i);
		}
	}

	public static void task013(char[] input) {
		int count = 0;
		for (char i : input) {
			if (i == 'K') {
				count++;
			}
		}
		System.out.println("count - " + count);
	}

	public static void task014(char[] input) {
		int count_of_a = 0;
		int count_of_b = 0;
		for (int i : input) {
			if (i == 'a') {
				count_of_a++;
			}
			if (i == 'b') {
				count_of_b++;
			}
		}
		System.out.println(count_of_a > count_of_b);
	}

	public static void task015(int[] input) {
		int[] second_array = new int[input.length / 2];
		for (int i = 0; i < input.length / 2; i++) {
			second_array[i] = input[i] * input[input.length - i -1];
		}
		int min = second_array[0];
		for (int i : second_array) {
			if (i < min) {
				min = i;
			}
		}
		System.out.println("min - " + min);
	}

	public static void task016(double[] input) {
		double max = input[0];
		for (double i : input) {
			if (i > max) {
				max = i;
			}
		}
		System.out.println("max abs - " + Math.abs(max));
		System.out.println(Math.abs(max) > 1);
	}

	public static void task017(int[] input, int a, int b) {
		int min = input[a+1];
		for (int i = a + 1 ; i < b; i++) {
			if (input[i] < min) {
				min = input[i];
			}
		}
		System.out.println("Interval min - " + min);

		for (int i : input) {
			System.out.println("First array - " + i);
		}

		for (int i = a + 1 ; i < b; i++) {
			 input[i] = min;
		}

		for (int i : input) {
			System.out.println("Second array - " + i);
		}
	}

	public static void task018(int[] input) {
		int index = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i] > 100) {
				index = i;
				break;
			}
		}

		System.out.println("i = " + index);

		for (int i : input) {
			System.out.println("Test first array - " + i);
		}

		for (int i = index; i < input.length; i++) {
			input[i] = input[i] / 100;
		}

		for (int i : input) {
			System.out.println("Test second array - " + i);
		}
	}

	public static void task019(int[] input) {
		for (int i = 0; i < input.length - 1; i++) {
			if (input[i] > 0 && input[i + 1] > 0 && input[i] * input[i + 1] % 10 == 0) {
				System.out.println("test test");
				System.out.println(i + " " + (i + 1));
			}
		}
	}

	public static void task020(int[] input) {
		int[] new_array = new int[input.length / 2];
		for (int i = 0; i < input.length / 2; i++) {
			new_array[i] = input[i] + input[input.length - i - 1];
		}

		for (int i : new_array) {
			System.out.println("test - " + i);
		}
	}

	public static void task021(int[][] input, int a, int b) {
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				if (input[i][j] >= a && input[i][j] <= b) {
					System.out.println("input[" + i + "][" + j + "] = " + input[i][j]);
					count++;
				}
			}
		}
		System.out.println("Count - " + count);
	}

	public static void task022(int[][] input) {
		int count = 0;
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				if (j > i) {
					count++;
					sum += input[i][j];
				}
			}
		}
		System.out.println("Count - " + count);
		System.out.println("Sum - " + sum);
	}

	public static void task023(int[][] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println(" ");
		}
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				if (i > j && input[i][j] < 0) {
					input[i][j] = 0;
				}
			}
		}

		System.out.println("after");
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	public static void task024(int[][] input, int p) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println(" ");
		}
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				if (j < input[i].length - i - 1) {
					input[i][j] = p;
				}
			}
		}
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	public static void task025(int[][] input) {
		int max = input[0][0];
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				if (input[i][j] > max) {
					max = input[i][j];
				}
			}
		}
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				if (input[i][j] == max) {
					System.out.println("i = " + i + " , " + "j = " + j);
				}
			}
		}
	}

	public static void task026(int[][] input) {
		int min = input[0][0];
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				if (input[i][j] < min) {
					min = input[i][j];
				}
			}
		}

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println(" ");
		}

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				if (input[i][j] > 0) {
					input[i][j] = min;
				}
			}
		}

		System.out.println("test test");
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println(" ");
		}
	}

	public static void task027(int[][] input) {
		int max_abs = 0;
		for (int[] ints : input) {
			for (int anInt : ints) {
				if (Math.abs(anInt) > max_abs) {
					max_abs = Math.abs(anInt);
				}
			}
		}
		System.out.println(max_abs);

		for (int[] i : input) {
			for (int j : i) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
		}

		for (int[] i : input) {
			for (int j : i) {
				if (j < 0) {
					j = max_abs;
				}
			}
		}

		for (int[] i : input) {
		    for (int j : i) {
			    System.out.print(j + " ");
		    }
			System.out.println(" ");
		}
	}

	public static void task028(int[][] input) {
		int count_general = 0;
		int count_second = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[i].length; j++) {
				if (i == j && input[i][j] % 2 == 0) {
					count_general++;
				}
				if (i == input[i].length - j - 1 && input[i][j] % 2 == 0) {
					count_second++;
				}
			}
		}
		System.out.println("gen - " + count_general);
		System.out.println("sec - " + count_second);
	}
}