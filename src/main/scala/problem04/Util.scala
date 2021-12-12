package problem04

object Util {

  def buildinNumberOfElements[A](list: List[A]): Int = {
    list.size
  }

  def recursiveNumberOfElements[A](list: List[A]): Int = list match {
    case Nil => 0
    case h :: tail => 1+ recursiveNumberOfElements(tail)
  }

  def foldNumberOfElements[A](list: List[A]): Int = list.foldLeft(0) { (c, _) => c + 1 }
}
