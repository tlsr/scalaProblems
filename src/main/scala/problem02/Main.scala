package problem02

object Utils {
  def lastButOne[A](list: List[A]): A = list match {
    case Nil => throw new NoSuchElementException
    case _ :: Nil => throw new NoSuchElementException
    case _ :: tail if (tail.size != 1) => lastButOne(list.tail)
    case x => x.head
  }
}