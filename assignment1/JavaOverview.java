import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaOverview{
	
	public static void main(String[] args) {
		ex1();
		ex2();
		ex3();
		ex4();
		ex5();
		ex6();
	}
	
	private static void ex1() {
		System.out.println("--- Begin Exercise 1 ---");
		// Exercise 1: loops
		// Compute the sum of all odd numbers between 50 and 100
		// Print the result in the form:
		// "The sum is: XXX" where XXX is the resulting sum

		int sum = 0;
		for(int i = 51; i < 100; i+=2)
			sum += i;
		System.out.println("The sum is: " + sum);
		
		System.out.println("---   End Exercise 1 ---");
	}

	private static String longestFirst(String s1, String s2) {
		return (s1.length() >= s2.length() ? (s1 + s2) : (s2 + s1));
	}
	
	private static void ex2() {
		System.out.println("--- Begin Exercise 2 ---");
		// Exercise 2: strings
		// Write a function named longestFirst 
		// which takes two strings as input and 
		// concatenates them with the longer string always
		// coming first. If the strings have the same length
		// put the first string first.
		
		// Then uncomment the lines below to test your code
		System.out.println(longestFirst("abc", "12"));
		System.out.println(longestFirst("ab", "123"));
		System.out.println(longestFirst("abc", "123"));
		System.out.println(longestFirst("abc", ""));
		System.out.println(longestFirst("", "12"));

		System.out.println("---   End Exercise 2 ---");
	}
	
	private static void shiftLeftTwo(int[] arr) {
		int[] temp = new int[] { arr[0], arr[1] };

		for(int i = 0; i < arr.length - 2; i++)
			arr[i] = arr[i+2];

		arr[arr.length-2] = temp[0];
		arr[arr.length-1] = temp[1];
	}

	private static void ex3() {
		System.out.println("--- Begin Exercise 3 ---");
		// Exercise 3: array
		// Define an array oneToTen with 10 elements and initialize
		// it with values 1, 2, 3, ..., 10.
		// Then implement a function shiftLeftTwo which 
		// shifts the elements of the array to the left by
		// two (and wraps the left most values around).
		// Print the results in the form:
		// The array contains: 3, 4, 5, 6, 7, 8, 10, 1, 2

		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		shiftLeftTwo(arr);

		System.out.print("The array contains: ");

		// Print array elements
		for(int i = 0; i < arr.length; i++) {
			if(i > 0) System.out.print(", ");
			System.out.print(arr[i]);
		}

		System.out.println(); // Newline
		
		System.out.println("---   End Exercise 3 ---");
	}
	
	private static int fib3recursive(int n) {
		if(n < 3) return 1;
		else return (fib3recursive(n-1) + fib3recursive(n-2) + fib3recursive(n-3));
	}
	
	private static int fib3dynamic(int n) {
		int[] fibs = new int[] { 1, 1, 1 };

		for(int i = 2; i < n; i++)
		{
			int e = fibs[0] + fibs[1] + fibs[2];

			fibs[0] = fibs[1];
			fibs[1] = fibs[2];
			fibs[2] = e;
		}

		return fibs[2];
	}
	
	private static void printFib3(int n) {
		System.out.print("The "+n+"-th element in the sequence is ");
		System.out.print(fib3recursive(n));
		System.out.print("(recursive), ");
		System.out.print(fib3dynamic(n));
		System.out.println("(dynamic).");
	}
	
	private static void ex4() {
		System.out.println("--- Begin Exercise 4 ---");
		// Exercise 4: recursion
		// Consider the Fibonaci-like sequence:
		// 1, 1, 1, 3, 5, 9, 17, ...
		// where each element in the sequence is the sum 
		// of the previous three elements.
		// Implement two functions for computing the
		// i-th number in the sequence:
		//   -- fib3recursive: a naive recursive approach
		//   -- fib3dynamic: a dynamic-programming type approach
		//                   where elements of the sequence
		//                   are stored in an array and re-used
		printFib3(6);
		printFib3(8);
		printFib3(10);
		printFib3(15);		
		System.out.println("---   End Exercise 4 ---");
	}
	private static void ex5() {
		System.out.println("--- Begin Exercise 5 ---");
		// Exercise 5: file i/o
		// Write code that reads integers from the file 
		// numbers.txt and prints out the minimum and maximum
		// values in the file. The file contains one integer
		// per line.		
		int min=0;
		int max=0;

		String filename = "numbers.txt";
		Scanner scanner = null;

		try {
			scanner = new Scanner(new File(filename));

			while(scanner.hasNextInt()) {
				int val = scanner.nextInt();

				if(min > val) min = val;
				if(max < val) max = val;
			}

			System.out.println("Minimum value: " + min);
			System.out.println("Maximum value: " + max);

		} catch(FileNotFoundException e) {
			// Robust enough?
			System.out.println(filename + " not found");
		} finally {
			if(scanner != null) scanner.close();
		}

		System.out.println("---   End Exercise 5 ---");
	}
	private static void ex6() {
		System.out.println("--- Begin Exercise 6 ---");
		// Exercise 6: classes
		// Implement a class Car which:
		//  - stores the current speed and position (a single double)
		//      of the car
		//  - provides a constructor that sets the initial position
		//  - provides a method setSpeed(double speed) for setting the speed
		//  - provides a method drive(double time) which sets a new position
		//      of the car to be the old position plus speed*time
		//  - provides a method getPosition() to access the current position

		class Car {

			protected double position = 0d;
			protected double speed = 0d;

			public Car() {
				this(0d);
			}

			public Car(double position) {
				this.position = position;
			}

			public void setSpeed(double speed) {
				this.speed = speed;
			}

			public void drive(double time) {
				this.position += (time * this.speed);
			}

			public double getPosition() {
				return this.position;
			}
		}

		// uncomment the code below to test your class
		Car car1 = new Car(0.0);
		car1.setSpeed(50.0);
		car1.drive(2);
		car1.setSpeed(25.0);
		car1.drive(1);
		System.out.println("The position of car1 is "+ car1.getPosition());

		Car car2 = new Car(0.0);
		car2.setSpeed(30.0);
		car2.drive(.5);
		car2.setSpeed(-25.0);
		car2.drive(1.2);
		System.out.println("The position of car2 is "+ car2.getPosition());
		
		System.out.println("---   End Exercise 6 ---");
	}
}
