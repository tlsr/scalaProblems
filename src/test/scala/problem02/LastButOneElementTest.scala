package problem02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test
import problem02.Utils.lastButOne

class LastButOneElementTest {

  val LONG_VALID_LIST = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
  val NIL = Nil
  val ONE_ELEMENT_LIST = List(1)
  val TWO_ELEMENT_LIST = List(1,2)

  @Test
  def validListTest(): Unit = {
    assertEquals(8, lastButOne(LONG_VALID_LIST))
    assertEquals(1, lastButOne(TWO_ELEMENT_LIST))
  }

  @Test
  def nilTest(): Unit = {
    assertThrows(classOf[NoSuchElementException], () => lastButOne(NIL))
  }

  @Test
  def oneElementListTest(): Unit = {
    assertThrows(classOf[NoSuchElementException], ()=> lastButOne(ONE_ELEMENT_LIST))
  }
}
