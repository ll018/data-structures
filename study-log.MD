# Data structure

## Definition

- Organizes and stores data
- Each has strength and weaknesses

## Types of data structures

### Array



## Big-O

### Definition
- A way of comparing two code bits and see which one runs faster
- Help us to write scalable code

- Time complexity
  - Not measured in time but number of ops to be completed
- Space complexity
  - How much memory it takes up when it runs
  - Heap vs Stack

Omega = Best
Theta = Average
Omikron = Worst

Big O is therefore always worst case

### Different types of O

#### O(n)

- Proportional, linear
- Worst case it takes n times to run

#### O(n^2)
 
- Quadratic time
- Loop within a loop
- Worst case it takes n*n times to run

#### O(1)

- Constant
- Worst case it takes 1 time to run
- As n grows the number of operations will stay the same
- O(2) will be called O(1)

#### O(log n)

- Logarithmic
- Divide and conquer
- log2 8 = 3. If you take 8 and divide it by 2 it will take 3 times to get to 1
- Powerful with large numbers
- Very efficient, next best thing

#### O(n * log n)

- Used with some sorting algorithms like quick sort and merge sort

#### O(n!)

- Factorial Time
- Adding a nested loop for every element we iterate over

- Recursive

#### Link
- [Big-O cheat sheet](https://www.bigocheatsheet.com/)

### Concepts

#### Rules of simplification

- Always worst case
- Drop Constants. 
  - There is no O(2n). We always drop the constant
- Drop Non-Dominants. 
  - If we have O(n^2) and O(n) in the same function ee don't care about the non-dominant
since it will be negligible
- O(n^3) gets dropped to O(n^2)

Different terms for input
- Pass two args, two for loops
- Since not the same terms for input it is not O(n)
- O(a)  + O (b) = O (a + b)
- If inside eachother it would be O(a*b)
- We therefore need to use different terms for input

Arraylist example
- myList.add(17) - O(1)
- myList.remove(17) the last - O(1)
- myList.remove(0), myList.add(0,17) reindexing is needed - O(n)
- O(1) on the end of the list but O(n) on the beginning of the list because of reindexing
- If in the middle - O(n) because Drop constants and Big-O is worst case

Finding by value
- O(n)
- Finding by index O(1)


Notes

Drop Contants

#Big O Cheat Sheet:
-Big Os-
O(1) Constant- no loops
O(log N) Logarithmic- usually searching algorithms have log n if they are sorted (Binary Search)
O(n) Linear- for loops, while loops through n items
O(n log(n)) Log Liniear- usually sorting operations
O(n^2) Quadratic- every element in a collection needs to be compared to ever other element. Two
nested loops
O(2^n) Exponential- recursive algorithms that solves a problem of size N
O(n!) Factorial- you are adding a loop for every element
Iterating through half a collection is still O(n)
Two separate collections: O(a * b)
-What can cause time in a function?-
Operations (+, -, *, /)
Comparisons (<, >, ==)
Looping (for, while)
Outside Function call (function())
-Rule Book-
Rule 1: Always worst Case
Rule 2: Remove Constants
Rule 3: Different inputs should have different variables. O(a+b). A and B arrays nested would be
O(a*b)
+ for steps in order
* for nested steps
  Rule 4: Drop Non-dominant terms
  -What causes Space complexity?-
  Variables
  Data Structures
  Function Call
  Allocations