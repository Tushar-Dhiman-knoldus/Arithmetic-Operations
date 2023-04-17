package com.knoldus.arithmeticoperations

import org.scalatest.flatspec.AnyFlatSpec

class ArithmeticOperationsSpec extends AnyFlatSpec {

  val arithmeticOperationsObject = new ArithmeticOperations

  "operationsOnListOfOption" should "return the sum of the elements in List[Option[Int]]" in{

    val expectedValue = 41
    val actualValue = arithmeticOperationsObject.operationsOnListOfOption(List(Some(5), Some(4), Some(11), Some(21)),"Addition")
    assert(actualValue == expectedValue)
  }

  "operationsOnListOfOption" should "return the Difference of all the elements in List[Option[Int]]" in {

    val expectedValue = -31
    val actualValue = arithmeticOperationsObject.operationsOnListOfOption(List(Some(5), Some(4), Some(11), Some(21)), "Subtraction")
    assert(actualValue == expectedValue)
  }

  "operationsOnListOfOption" should "return the Multiplication of all the elements in List[Option[Int]]" in {

    val expectedValue = 4620
    val actualValue = arithmeticOperationsObject.operationsOnListOfOption(List(Some(5), Some(4), Some(11), Some(21)), "Multiplication")
    assert(actualValue == expectedValue)
  }

  "operationsOnListOfOption" should "return exception as the division operation is not defined for List[Option[Int]]" in {
    val invalidArithmeticOperation = "Division"
    val listOfOption = List(Some(1), Some(2), Some(3))
    assertThrows[NoSuchMethodException] (
      arithmeticOperationsObject.operationsOnListOfOption(listOfOption, invalidArithmeticOperation)
      )
  }
}
