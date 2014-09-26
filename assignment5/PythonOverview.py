
print("--- Begin Exercise 1 ---");
# Exercise 1: loops
# Compute the sum of all odd numbers between 50 and 100
# Print the result in the form:
# "The sum is: XXX" where XXX is the resulting sum

sum = 0
for i in range(0, 25):
    sum += (51 + (i*2))
print("The sum is: ", sum)

print("---   End Exercise 1 ---");

print("--- Begin Exercise 2 ---");
# Exercise 2: strings
# Write a function named longestFirst 
# which takes two strings as input and 
# concatenates them with the longer string always
# coming first. If the strings have the same length
# put the first string first.

def longestFirst(s1, s2):
    if(len(s1) >= len(s2)): return s1+s2
    else: return s2+s1

# Then uncomment the lines below to test your code
print(longestFirst("abc", "12"));
print(longestFirst("ab", "123"));
print(longestFirst("abc", "123"));
print(longestFirst("abc", ""));
print(longestFirst("", "12"));
print("---   End Exercise 2 ---");
  
print("--- Begin Exercise 3 ---");
# Exercise 3: array (lists in Python)
# Define a list oneToTen with 10 elements and initialize
# it with values 1, 2, 3, ..., 10.
# Then implement a function shiftLeftTwo which 
# shifts the elements of the list to the left by
# two (and wraps the left most values around).
# Print the results in the form:
# The array contains: [3, 4, 5, 6, 7, 8, 10, 1, 2]
        
print("---   End Exercise 3 ---");

print("--- Begin Exercise 4 ---");
# Exercise 4: recursion
# Consider the Fibonacci-like sequence:
# 1, 1, 1, 3, 5, 9, 17, ...
# where each element in the sequence is the sum 
# of the previous three elements.
# Implement two functions for computing the
# i-th number in the sequence:
#   -- fib3recursive: a naive recursive approach
#   -- fib3dynamic: a dynamic-programming type approach
#                   where element of the sequence
#                   are stored in an array and re-used

def fib3recursive(n):
    return -1;

def fib3dynamic(n):
    return -1;

def printFib3(n):
    print("The "+str(n)+"-th element in the sequence is "+str(fib3recursive(n))+"(recursive), "+str(fib3dynamic(n))+"(dynamic).");
    return;

printFib3(6);
printFib3(8);
printFib3(10);
printFib3(15);        
print("---   End Exercise 4 ---");

print("--- Begin Exercise 5 ---");
# Exercise 5: file i/o
# Write code that reads integers from the file 
# numbers.txt and prints out the minimum and maximum
# values in the file. The file contains one integer
# per line.
        
print("---   End Exercise 5 ---");

print("--- Begin Exercise 6 ---");
# Exercise 6: classes
# Implement a class Car which:
#  - stores the current speed and position (a single double)
#      of the car
#  - provides a constructor that sets the initial position
#  - provides a method setSpeed(double speed) for setting the speed
#  - provides a method drive(double time) which sets a new position
#      of the car to be the old position plus speed*time
#  - provides a method getPosition() to access the current position

# uncomment these lines to test your code            
#car1 = Car(0.0);
#car1.setSpeed(50.0);
#car1.drive(2);
#car1.setSpeed(25.0);
#car1.drive(1);
#print("The position of car1 is "+ str(car1.getPosition()));
        
#car2 = Car(0.0);
#car2.setSpeed(30.0);
#car2.drive(.5);
#car2.setSpeed(-25.0);
#car2.drive(1.2);
#print("The position of car2 is "+ str(car2.getPosition()));
print("---   End Exercise 6 ---");

