package com.knoldus.arithmeticoperations

import scala.util.{Failure, Success, Try}

object ArithmeticOperationsDriver extends App {

  private val arithmeticOperationsObject = new ArithmeticOperations
  private val inputList = List(Some(1), Some(2), Some(3), Some(4))
  private val operation = "Addition"
  private val result = Try {
    arithmeticOperationsObject.operationsOnListOfOption(inputList, operation)
  }
  result match {
    case Success(value) => print(value)
    case Failure(_) => print("Operation not defined")

  }
}

