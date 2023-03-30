package com.knoldus.arithmeticoperations

class ArithmeticOperations {

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
