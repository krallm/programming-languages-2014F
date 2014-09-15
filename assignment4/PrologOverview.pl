?- write('--- Begin Exercise 1 ---'),nl.

% Exercise 1: loops
% Compute the sum of all odd numbers between 50 and 100
% Print the result in the form:
% "The sum is: XXX" where XXX is the resulting sum
% Note: there are no iterative loops in Prolog, use
%       a recursive approach

?- write('---   End Exercise 1 ---'),nl.

?- write('--- Begin Exercise 2 ---'),nl.
% Exercise 2: strings
% Write a predicate named longestFirst 
% which takes two strings as input and 
% concatenates them with the longer string always
% coming first. If the strings have the same length
% put the first string first.

%longestFirst(S1, S2, X) :- % ... <Implement this>

% Then uncomment the lines below to test your code
%?- longestFirst('abc', '12', X), write(X),nl.
%?- longestFirst('ab', '123', X), write(X),nl.
%?- longestFirst('abc', '123', X), write(X),nl.
%?- longestFirst('abc', '', X), write(X),nl.
%?- longestFirst('', '12', X), write(X),nl.

?- write('---   End Exercise 2 ---'),nl.

?- write('--- Begin Exercise 3 ---'),nl.

% Exercise 3: array/list
% Create a predicate which creates a list containing
% values 1, 2, 3, ..., 10 (without typing the numbers
% manually).
% Then implement a predicate shiftLeftTwo which 
% shifts the elements of the list to the left by
% two (and wraps the left most values around).
% Print the results in the form:
% The list contains: [3, 4, 5, 6, 7, 8, 10, 1, 2]


?- write('---   End Exercise 3 ---'),nl.

?- write('--- Begin Exercise 4 ---'),nl.

% Exercise 4: recursion
% Consider the Fibonaci-like sequence:
% 1, 1, 1, 3, 5, 9, 17, ...
% where each element in the sequence is the sum 
% of the previous three elements.
% Implement two predicates for computing the
% i-th number in the sequence:
%   -- fib3recursive: a naive recursive approach
%   -- fib3dynamic: a dynamic-programming type approach
%                   where element of the sequence
%                   are stored in a list and re-used

fib3recursive(N, F) :- F is 1. % <implement this>
	
fib3dynamic(N, F) :- F is 1. % <implement this>

printFib3(N) :- 
	write('The '), 
	write(N),
	write('-th element in the sequence is '),
	fib3recursive(N, Frecur),
	write(Frecur),
	write('(recursive), '),
	fib3dynamic(N, Fdynam),
	write(Fdynam),
	write('(dynamic).'),
	nl.
	
?- printFib3(6).
?- printFib3(8).
?- printFib3(10).
?- printFib3(15).
	  
?- write('---   End Exercise 4 ---'),nl.

?- write('--- Begin Exercise 5 ---'),nl.

% Exercise 5: file i/o
% The predicate fileToList below reads a file contains
% a number of prolog terms and puts them in a list.
% Use this predicate to read the numbers in the file
% numbersProlog.txt into a list, compute the min and max
% values in the list (using built in prolog functions)
% and print the results.

fileToList(File,L) :- 
   see(File), 
   inquire([],R),
   reverse(R,L),
   seen.

inquire(In,Out):-
   read(Data), 
   (Data == end_of_file -> 
      Out = In ;
      inquire([Data|In],Out) ) . 

?- write('---   End Exercise 5 ---'),nl.

?- write('--- Begin Exercise 6 ---'),nl.
?- write('No Exercise 6 for Prolog: Prolog is not object oriented.'),nl.
?- write('---   End Exercise 6 ---'),nl.