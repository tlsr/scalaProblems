package problem01

object Utils {
  def lastElement[A](list: List[A]): A = {
    list match {
      case e :: Nil => e
      case _ :: tail => lastElement(tail)
      case _ => throw new NoSuchElementException
    }
  }
}