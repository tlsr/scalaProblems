package problem05

object Util {
  def reverseListNative[A](list: List[A]): List[A] = {
    list.reverse
  }

  def reverseList[A](list: List[A]): List[A] = list match {
    case Nil => Nil
    case h :: tail => reverseList(tail) ::: List(h)
  }

  def foldReverseList[A](list: List[A]): List[A] = list.foldLeft(List[A]()) { (r, h) => h :: r }
}
