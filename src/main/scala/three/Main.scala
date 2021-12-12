package three

object Main extends App{

}

object Util {
  def kthElement[A](k: Int,list: List[A]): A ={
    list.take(k)
  }
}
