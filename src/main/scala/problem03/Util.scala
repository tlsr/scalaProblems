package problem03

object Util {
  def kthElementTake[A](k: Int, list: List[A]): A =
    if (list.size > k) list.take(k+1).last else throw new NoSuchElementException

  def kthElementRecursive[A](k: Int, list: List[A]): A = {
    k match {
      case _ if(k>= list.size && list == Nil) => throw new NoSuchElementException
      case 0 => list.head
      case _ => kthElementRecursive(k-1,list.tail)
    }
  }
}
