package two

import two.Utils.lustButOne

object Main extends App {
  println(List(1) ::: List(2) ::: List(3))
  println(lustButOne(List(1, 2)))
  println(lustButOne(List(1, 2, 3, 4, 5, 6)))
  try {
    lustButOne(Nil)
  } catch {
    case e: IllegalArgumentException => println("success")
  }
  try {
    lustButOne(List(1))
  } catch {
    case e: IllegalArgumentException => println("success")
  }
}

object Utils {
  def lustButOne[A](list: List[A]): A = list match {
    case Nil => throw new IllegalArgumentException
    case h :: Nil => throw new IllegalArgumentException
    case _ :: tail if (tail.size != 1) => lustButOne(list.tail)
    case x => x.head
  }
}