package com.piotr.euler

object Task1 {

  def main(args: Array[String]): Unit = {
    val sumOfMultiples = (1 to 1000).collect { case x if x % 3 == 0 || x % 5 == 0 => x }.sum
    println(sumOfMultiples)
  }
}
