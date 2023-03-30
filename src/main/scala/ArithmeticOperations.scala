package com.knoldus.arithmeticoperations

class ArithmeticOperations {
  
  // Function to perform the arithmetic operation on the  List[Option[Int]]. 
  def operationsOnListOfOption(listOfOption: List[Option[Int]], arithmeticOperation: String): Int = {

    val listOfIntegers = for {
      optionOfInt <- listOfOption
      integers <- optionOfInt

    } yield integers
    
    arithmeticOperation match {
      case "Addition" => listOfIntegers.sum
      case "Subtraction" => listOfIntegers.reduce(_ - _)
      case "Multiplication" => listOfIntegers.product
      case _ => throw new NoSuchMethodException()
    }
  }
}
