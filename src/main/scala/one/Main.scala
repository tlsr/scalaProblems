package one

import one.Utils.lastElement
import scala.runtime.Nothing$

object Main extends App {

  try {
    println(lastElement(Nil))
  } catch {
    case e: IllegalArgumentException => println("Success")
  }
  println(lastElement(List(1)))
  println(lastElement(List(1, 2, 3, 4, 5, 6, 7, 8)))
}

object Utils {
  def lastElement[A](list: List[A]): A = {
    //    list.last
    list match {
      case e :: Nil => e
      case _ :: tail => lastElement(tail)
      case _ => throw new IllegalArgumentException
    }
  }
}