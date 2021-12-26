package edu.knoldus

trait Function1[-A, +B] {
  def apply(x: A): B
}

/***
 * Implementation of Functions and Expansions
 */

class Functions {

  val add: Function2[Int,Int,Int] = new Function2[Int, Int, Int] {
    override def apply(x: Int, y: Int): Int = x + y
  }

  val sumOfList: Function1[List[Int],Int]= new Function1[List[Int], Int]{
    override def apply(IntList: List[Int]): Int = IntList.sum
  }

  def higherOrderFunction(f:Int => Int, num : Int) : Int = {
    def apply(n: Int):Int = f(n)
    apply(num)
  }
}

object Run extends App{

  val result = new Functions

    println(result.add.apply(1234,5678))

    println(result.sumOfList.apply(List(88,55,44,66,1)))

    println(result.higherOrderFunction(n => n, 10))


}
