  /* 
   * Questions to ponder:
   * How are comments written in Scala?
   * Are there any semicolons? Could there be?
   * Will you actually read this portion and put appropriate headers/data here?
   * Is your numbers.txt file in the appropriate place?
   */  


import scala.io.Source

object ScalaOverview {

  def main(args: Array[String]) {
    ex1()
    ex2()
    ex3()
    ex4()
    ex5()
    ex6()
  }
  
  def ex1() = {
		println("--- Begin Exercise 1 ---")
		// Exercise 1: loops
		// Compute the sum of all odd numbers between 50 and 100
		// Print the result in the form:
		// "The sum is: XXX" where XXX is the resulting sum
		
    var sum = 0
    for(i <- 51 to 100 by +2) {
      sum += i
    }
    println("The sum is: " + sum)

		println("---   End Exercise 1 ---")
	}

  def longestFirst(s1: String, s2: String): String = {
    if (s1.length >= s2.length) {
      s1 + s2
    } else {
      s2 + s1
    }
  }
    
  def ex2() = {
		println("--- Begin Exercise 2 ---")
		// Exercise 2: strings
		// Write a function named longestFirst 
		// which takes two strings as input and 
		// concatenates them with the longer string always
		// coming first. If the strings have the same length
		// put the first string first.
		
		// Then uncomment the lines below to test your code
		println(longestFirst("abc", "12"))
		println(longestFirst("ab", "123"))
		println(longestFirst("abc", "123"))
		println(longestFirst("abc", ""))
		println(longestFirst("", "12"))

		println("---   End Exercise 2 ---")
  }

  def shiftLeftTwo(arr: Array[Int]) = {
    
  }
  
	def ex3() = {
		System.out.println("--- Begin Exercise 3 ---")
		// Exercise 3: array
		// Define an array oneToTen with 10 elements and initialize
		// it with values 1, 2, 3, ..., 10.
		// Then implement a function shiftLeftTwo which 
		// shifts the elements of the array to the left by
		// two (and wraps the left most values around).
		// Print the results in the form:
		// The array contains: 3, 4, 5, 6, 7, 8, 10, 1, 2
		
		println("---   End Exercise 3 ---")
	}
	
  def fib3recursive(n:Int):Int = {
    return -1
  }

  def fib3dynamic(n:Int):Int = {
    return -1
  }

  def printFib3(n:Int) = {
	  print("The "+n+"-th element in the sequence is ")
	  print(fib3recursive(n))
	  print("(recursive), ")
	  print(fib3dynamic(n))
	  println("(dynamic).")
  }

  def ex4() = {
	  println("--- Begin Exercise 4 ---")
	  // Exercise 4: recursion
	  // Consider the Fibonaci-like sequence:
	  // 1, 1, 1, 3, 5, 9, 17, ...
	  // where each element in the sequence is the sum 
	  // of the previous three elements.
	  // Implement two functions for computing the
	  // i-th number in the sequence:
	  //   -- fib3recursive: a naive recursive approach
	  //   -- fib3dynamic: a dynamic-programming type approach
	  //                   where element of the sequence
	  //                   are stored in an array and re-used
	  printFib3(6)
	  printFib3(8)
	  printFib3(10)
	  printFib3(15)		
	  println("---   End Exercise 4 ---")
  }

	def ex5() = {
		println("--- Begin Exercise 5 ---")
		// Exercise 5: file i/o
		// Write code that reads integers from the file 
		// numbers.txt and prints out the minimum and maximum
		// values in the file. The file contains one integer
		// per line.
		
		var min=0
		var max=0

    scala.io.Source.fromFile("numbers.txt").getLines().foreach({ s: String =>
      val i = s.toInt
      if(min > i) min = i
      if(max < i) max = i
    })

		println("Minimum value: " + min)
		println("Maximum value: " + max)
		
		println("---   End Exercise 5 ---")
	}  

	def ex6() = {
		println("--- Begin Exercise 6 ---")
		// Exercise 6: classes
		// Implement a class Car which:
		//  - stores the current speed and position (a single double)
		//      of the car
		//  - provides a constructor that sets the initial position
		//  - provides a method setSpeed(double speed) for setting the speed
		//  - provides a method drive(double time) which sets a new position
		//      of the car to be the old position plus speed*time
		//  - provides a method getPosition() to access the current position
		class Car(intialPosition:Double) {
		  // implement this
		}			
// uncomment this to test your code
//		var car1 = new Car(0.0)
//		car1.setSpeed(50.0)
//		car1.drive(2)
//		car1.setSpeed(25.0)
//		car1.drive(1)
//		println("The position of car1 is "+ car1.getPosition())
//		
//		var car2 = new Car(0.0)
//		car2.setSpeed(30.0)
//		car2.drive(.5)
//		car2.setSpeed(-25.0)
//		car2.drive(1.2)
//		println("The position of car2 is "+ car2.getPosition())
		
		println("---   End Exercise 6 ---")
	}
}
