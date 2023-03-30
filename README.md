# Arithmetic-Operations

### Problem Statement

Write a function that takes a list of Option of numbers and performs some arithmetic operation ("Addition", "Subtraction", "Multiplication") passed to the function by the user.
Hint: First convert List[Option[T]] to List[T] (use for expressions for this) and then perform the arithmetic function over it (make use of Pattern Matching for this). 

Sample Input: methodName((List(Some(1), Some(2), Some(3), Some(4)), "Addition").
Sample Output: 10

#### This project contains three files (ArithmeticOperations.scala, ArithmeticOperationsSpec.scala, ArithmeticOperationsDriver.scala)

* **ArithmeticOperations.scala** => This File contains a function (operationsOnListOfOption) which Performs Arithmetic Operations (Addition, Subtraction, Multiplication) on the List[Option[Int]].
* **ArithmeticOperationsSpec.scala** => This File contains the test cases for the (operationsOnListOfOption) function.
* **ArithmeticOperationsDriver.scala** => This file contains the driver code to run and check the output on the console.   
